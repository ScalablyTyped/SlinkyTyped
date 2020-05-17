package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Effect extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Behaviors: AnimationBehaviors = js.native
  val DisplayName: String = js.native
  val EffectInformation: typingsSlinky.activexPowerpoint.PowerPoint.EffectInformation = js.native
  val EffectParameters: typingsSlinky.activexPowerpoint.PowerPoint.EffectParameters = js.native
  var EffectType: MsoAnimEffect = js.native
  var Exit: MsoTriState = js.native
  val Index: Double = js.native
  var Paragraph: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Effect_typekey")
  var PowerPointDotEffect_typekey: Effect = js.native
  var Shape: typingsSlinky.activexPowerpoint.PowerPoint.Shape = js.native
  val TextRangeLength: Double = js.native
  val TextRangeStart: Double = js.native
  val Timing: typingsSlinky.activexPowerpoint.PowerPoint.Timing = js.native
  def Delete(): Unit = js.native
  def MoveAfter(Effect: Effect): Unit = js.native
  def MoveBefore(Effect: Effect): Unit = js.native
  def MoveTo(toPos: Double): Unit = js.native
}

object Effect {
  @scala.inline
  def apply(
    Application: Application,
    Behaviors: AnimationBehaviors,
    Delete: () => Unit,
    DisplayName: String,
    EffectInformation: EffectInformation,
    EffectParameters: EffectParameters,
    EffectType: MsoAnimEffect,
    Exit: MsoTriState,
    Index: Double,
    MoveAfter: Effect => Unit,
    MoveBefore: Effect => Unit,
    MoveTo: Double => Unit,
    Paragraph: Double,
    Parent: js.Any,
    PowerPointDotEffect_typekey: Effect,
    Shape: Shape,
    TextRangeLength: Double,
    TextRangeStart: Double,
    Timing: Timing
  ): Effect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Behaviors = Behaviors.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayName = DisplayName.asInstanceOf[js.Any], EffectInformation = EffectInformation.asInstanceOf[js.Any], EffectParameters = EffectParameters.asInstanceOf[js.Any], EffectType = EffectType.asInstanceOf[js.Any], Exit = Exit.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MoveAfter = js.Any.fromFunction1(MoveAfter), MoveBefore = js.Any.fromFunction1(MoveBefore), MoveTo = js.Any.fromFunction1(MoveTo), Paragraph = Paragraph.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], TextRangeLength = TextRangeLength.asInstanceOf[js.Any], TextRangeStart = TextRangeStart.asInstanceOf[js.Any], Timing = Timing.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Effect_typekey")(PowerPointDotEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
  @scala.inline
  implicit class EffectOps[Self <: Effect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBehaviors(value: AnimationBehaviors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Behaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectInformation(value: EffectInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectParameters(value: EffectParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectType(value: MsoAnimEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveAfter(value: Effect => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveAfter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveBefore(value: Effect => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveBefore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveTo(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParagraph(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Paragraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotEffect_typekey(value: Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Effect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextRangeLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextRangeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextRangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextRangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiming(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

