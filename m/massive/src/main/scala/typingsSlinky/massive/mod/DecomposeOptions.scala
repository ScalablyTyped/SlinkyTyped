package typingsSlinky.massive.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecomposeOptions
  extends /* foreignTable */ StringDictionary[DecomposeOptions | js.Any] {
  var columns: js.UndefOr[js.Array[String] | AnyObject[String]] = js.native
  var pk: String = js.native
}

object DecomposeOptions {
  @scala.inline
  def apply(pk: String): DecomposeOptions = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecomposeOptions]
  }
  @scala.inline
  implicit class DecomposeOptionsOps[Self <: DecomposeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[String] | AnyObject[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
  }
  
}

