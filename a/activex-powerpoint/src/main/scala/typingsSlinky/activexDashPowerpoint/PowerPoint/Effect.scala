package typingsSlinky.activexDashPowerpoint.PowerPoint

import typingsSlinky.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Effect")
@js.native
class Effect protected () extends js.Object {
  val Application: typingsSlinky.activexDashPowerpoint.PowerPoint.Application = js.native
  val Behaviors: AnimationBehaviors = js.native
  val DisplayName: String = js.native
  val EffectInformation: typingsSlinky.activexDashPowerpoint.PowerPoint.EffectInformation = js.native
  val EffectParameters: typingsSlinky.activexDashPowerpoint.PowerPoint.EffectParameters = js.native
  var EffectType: MsoAnimEffect = js.native
  var Exit: MsoTriState = js.native
  val Index: Double = js.native
  var Paragraph: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Effect_typekey")
  var PowerPointDotEffect_typekey: Effect = js.native
  var Shape: typingsSlinky.activexDashPowerpoint.PowerPoint.Shape = js.native
  val TextRangeLength: Double = js.native
  val TextRangeStart: Double = js.native
  val Timing: typingsSlinky.activexDashPowerpoint.PowerPoint.Timing = js.native
  def Delete(): Unit = js.native
  def MoveAfter(Effect: Effect): Unit = js.native
  def MoveBefore(Effect: Effect): Unit = js.native
  def MoveTo(toPos: Double): Unit = js.native
}

