package typingsSlinky.gulpSort.mod

import typingsSlinky.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  /** Whether to sort in ascending order, default is true */
  var asc: js.UndefOr[Boolean] = js.native
  /**
    * A function to compare two files.
    * Returns:
    * -1 if file1 should be before file2,
    * 0 if file1 is equivalent to file2, and
    * 1 if file1 should be after file2
    */
  var comparator: js.UndefOr[IComparatorFunction] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asc")(js.undefined)
        ret
    }
    @scala.inline
    def withComparator(value: (/* file1 */ File, /* file2 */ File) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
  }
  
}

