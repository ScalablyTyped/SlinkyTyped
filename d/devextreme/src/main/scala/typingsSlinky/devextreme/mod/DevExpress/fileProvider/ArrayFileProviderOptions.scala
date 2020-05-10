package typingsSlinky.devextreme.mod.DevExpress.fileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayFileProviderOptions extends FileProviderOptions[ArrayFileProvider] {
  /** Specifies an array of data objects that represent files and directories. */
  var data: js.UndefOr[js.Array[_]] = js.native
  /** Specifies which data field provides information about nested files and directories. */
  var itemsExpr: js.UndefOr[String | js.Function] = js.native
}

object ArrayFileProviderOptions {
  @scala.inline
  def apply(): ArrayFileProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayFileProviderOptions]
  }
  @scala.inline
  implicit class ArrayFileProviderOptionsOps[Self <: ArrayFileProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsExpr")(js.undefined)
        ret
    }
  }
  
}

