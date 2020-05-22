package typingsSlinky.activexFaxcomexlib.global.FAXCOMEXLib

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRoutingExtensions
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRoutingMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRouting Class */
@JSGlobal("FAXCOMEXLib.FaxInboundRouting")
@js.native
class FaxInboundRouting protected ()
  extends typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRouting {
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxInboundRouting_typekey")
  override var FAXCOMEXLibDotFaxInboundRouting_typekey: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRouting = js.native
  /** Registered inbound routing extensions collection */
  /* CompleteClass */
  override def GetExtensions(): FaxInboundRoutingExtensions = js.native
  /** Ordered collection of all the registered methods */
  /* CompleteClass */
  override def GetMethods(): FaxInboundRoutingMethods = js.native
}

