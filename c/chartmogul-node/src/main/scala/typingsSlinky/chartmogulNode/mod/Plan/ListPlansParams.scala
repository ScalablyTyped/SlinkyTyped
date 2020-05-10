package typingsSlinky.chartmogulNode.mod.Plan

import typingsSlinky.chartmogulNode.commonMod.CursorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlansParams extends CursorParams {
  var data_source_uuid: js.UndefOr[String] = js.native
  var external_id: js.UndefOr[String] = js.native
  var system: js.UndefOr[String] = js.native
}

object ListPlansParams {
  @scala.inline
  def apply(): ListPlansParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlansParams]
  }
  @scala.inline
  implicit class ListPlansParamsOps[Self <: ListPlansParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData_source_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_source_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData_source_uuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_source_uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(js.undefined)
        ret
    }
  }
  
}

