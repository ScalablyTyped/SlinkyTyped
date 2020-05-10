package typingsSlinky.camo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOneOptions extends js.Object {
  /**
  		 * Find all or no references.
  		 * Pass an array of field names to only populate the specified references.
  		 *
  		 * @type {(boolean | string[])}
  		 */
  var populate: js.UndefOr[Boolean | js.Array[String]] = js.native
}

object FindOneOptions {
  @scala.inline
  def apply(): FindOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneOptions]
  }
  @scala.inline
  implicit class FindOneOptionsOps[Self <: FindOneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopulate(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populate")(js.undefined)
        ret
    }
  }
  
}

