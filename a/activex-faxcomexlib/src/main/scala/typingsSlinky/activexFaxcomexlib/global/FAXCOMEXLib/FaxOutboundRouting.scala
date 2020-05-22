package typingsSlinky.activexFaxcomexlib.global.FAXCOMEXLib

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingGroups
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRouting Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRouting")
@js.native
class FaxOutboundRouting protected ()
  extends typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRouting {
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutboundRouting_typekey")
  override var FAXCOMEXLibDotFaxOutboundRouting_typekey: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRouting = js.native
  /** Configuration of the outbound routing groups */
  /* CompleteClass */
  override def GetGroups(): FaxOutboundRoutingGroups = js.native
  /** Configuration of the outbound routing rules */
  /* CompleteClass */
  override def GetRules(): FaxOutboundRoutingRules = js.native
}

