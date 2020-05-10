package typingsSlinky.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWrapper extends js.Object {
  /** From object converter */
  var fromObject: js.UndefOr[WrapperFromObjectConverter] = js.native
  /** To object converter */
  var toObject: js.UndefOr[WrapperToObjectConverter] = js.native
}

object IWrapper {
  @scala.inline
  def apply(): IWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWrapper]
  }
  @scala.inline
  implicit class IWrapperOps[Self <: IWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromObject(value: WrapperFromObjectConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromObject")(js.undefined)
        ret
    }
    @scala.inline
    def withToObject(value: WrapperToObjectConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toObject")(js.undefined)
        ret
    }
  }
  
}

