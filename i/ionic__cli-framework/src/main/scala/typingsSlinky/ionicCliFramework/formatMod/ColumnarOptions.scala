package typingsSlinky.ionicCliFramework.formatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnarOptions extends js.Object {
  var headers: js.UndefOr[js.Array[String]] = js.native
  var hsep: js.UndefOr[String] = js.native
  var vsep: js.UndefOr[String] = js.native
}

object ColumnarOptions {
  @scala.inline
  def apply(): ColumnarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnarOptions]
  }
  @scala.inline
  implicit class ColumnarOptionsOps[Self <: ColumnarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHsep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsep")(js.undefined)
        ret
    }
    @scala.inline
    def withVsep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVsep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsep")(js.undefined)
        ret
    }
  }
  
}

