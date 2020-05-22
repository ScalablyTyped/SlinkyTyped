package typingsSlinky.activexPowerpoint.global.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexPowerpoint.PowerPoint.MsoAnimEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Effect")
@js.native
class Effect protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.Effect {
  /* CompleteClass */
  override val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Behaviors: typingsSlinky.activexPowerpoint.PowerPoint.AnimationBehaviors = js.native
  /* CompleteClass */
  override val DisplayName: String = js.native
  /* CompleteClass */
  override val EffectInformation: typingsSlinky.activexPowerpoint.PowerPoint.EffectInformation = js.native
  /* CompleteClass */
  override val EffectParameters: typingsSlinky.activexPowerpoint.PowerPoint.EffectParameters = js.native
  /* CompleteClass */
  override var EffectType: MsoAnimEffect = js.native
  /* CompleteClass */
  override var Exit: MsoTriState = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override var Paragraph: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Effect_typekey")
  override var PowerPointDotEffect_typekey: typingsSlinky.activexPowerpoint.PowerPoint.Effect = js.native
  /* CompleteClass */
  override var Shape: typingsSlinky.activexPowerpoint.PowerPoint.Shape = js.native
  /* CompleteClass */
  override val TextRangeLength: Double = js.native
  /* CompleteClass */
  override val TextRangeStart: Double = js.native
  /* CompleteClass */
  override val Timing: typingsSlinky.activexPowerpoint.PowerPoint.Timing = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def MoveAfter(Effect: typingsSlinky.activexPowerpoint.PowerPoint.Effect): Unit = js.native
  /* CompleteClass */
  override def MoveBefore(Effect: typingsSlinky.activexPowerpoint.PowerPoint.Effect): Unit = js.native
  /* CompleteClass */
  override def MoveTo(toPos: Double): Unit = js.native
}

