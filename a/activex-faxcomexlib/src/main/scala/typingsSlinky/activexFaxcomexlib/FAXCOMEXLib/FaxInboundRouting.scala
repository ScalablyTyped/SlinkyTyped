package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRouting Class */
@js.native
trait FaxInboundRouting extends js.Object {
  @JSName("FAXCOMEXLib.FaxInboundRouting_typekey")
  var FAXCOMEXLibDotFaxInboundRouting_typekey: FaxInboundRouting = js.native
  /** Registered inbound routing extensions collection */
  def GetExtensions(): FaxInboundRoutingExtensions = js.native
  /** Ordered collection of all the registered methods */
  def GetMethods(): FaxInboundRoutingMethods = js.native
}

object FaxInboundRouting {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxInboundRouting_typekey: FaxInboundRouting,
    GetExtensions: () => FaxInboundRoutingExtensions,
    GetMethods: () => FaxInboundRoutingMethods
  ): FaxInboundRouting = {
    val __obj = js.Dynamic.literal(GetExtensions = js.Any.fromFunction0(GetExtensions), GetMethods = js.Any.fromFunction0(GetMethods))
    __obj.updateDynamic("FAXCOMEXLib.FaxInboundRouting_typekey")(FAXCOMEXLibDotFaxInboundRouting_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxInboundRouting]
  }
  @scala.inline
  implicit class FaxInboundRoutingOps[Self <: FaxInboundRouting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAXCOMEXLibDotFaxInboundRouting_typekey(value: FaxInboundRouting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxInboundRouting_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetExtensions(value: () => FaxInboundRoutingExtensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetExtensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMethods(value: () => FaxInboundRoutingMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMethods")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

