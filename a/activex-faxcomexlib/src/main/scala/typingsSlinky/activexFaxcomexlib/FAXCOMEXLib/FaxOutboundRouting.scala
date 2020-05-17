package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRouting Class */
@js.native
trait FaxOutboundRouting extends js.Object {
  @JSName("FAXCOMEXLib.FaxOutboundRouting_typekey")
  var FAXCOMEXLibDotFaxOutboundRouting_typekey: FaxOutboundRouting = js.native
  /** Configuration of the outbound routing groups */
  def GetGroups(): FaxOutboundRoutingGroups = js.native
  /** Configuration of the outbound routing rules */
  def GetRules(): FaxOutboundRoutingRules = js.native
}

object FaxOutboundRouting {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxOutboundRouting_typekey: FaxOutboundRouting,
    GetGroups: () => FaxOutboundRoutingGroups,
    GetRules: () => FaxOutboundRoutingRules
  ): FaxOutboundRouting = {
    val __obj = js.Dynamic.literal(GetGroups = js.Any.fromFunction0(GetGroups), GetRules = js.Any.fromFunction0(GetRules))
    __obj.updateDynamic("FAXCOMEXLib.FaxOutboundRouting_typekey")(FAXCOMEXLibDotFaxOutboundRouting_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutboundRouting]
  }
  @scala.inline
  implicit class FaxOutboundRoutingOps[Self <: FaxOutboundRouting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAXCOMEXLibDotFaxOutboundRouting_typekey(value: FaxOutboundRouting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxOutboundRouting_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetGroups(value: () => FaxOutboundRoutingGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRules(value: () => FaxOutboundRoutingRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetRules")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

