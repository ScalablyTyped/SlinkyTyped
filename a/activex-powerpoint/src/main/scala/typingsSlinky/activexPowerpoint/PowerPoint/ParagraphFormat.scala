package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphFormat extends js.Object {
  var Alignment: PpParagraphAlignment = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var BaseLineAlignment: PpBaselineAlignment = js.native
  val Bullet: BulletFormat = js.native
  var FarEastLineBreakControl: MsoTriState = js.native
  var HangingPunctuation: MsoTriState = js.native
  var LineRuleAfter: MsoTriState = js.native
  var LineRuleBefore: MsoTriState = js.native
  var LineRuleWithin: MsoTriState = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ParagraphFormat_typekey")
  var PowerPointDotParagraphFormat_typekey: ParagraphFormat = js.native
  var SpaceAfter: Double = js.native
  var SpaceBefore: Double = js.native
  var SpaceWithin: Double = js.native
  var TextDirection: PpDirection = js.native
  var WordWrap: MsoTriState = js.native
}

object ParagraphFormat {
  @scala.inline
  def apply(
    Alignment: PpParagraphAlignment,
    Application: Application,
    BaseLineAlignment: PpBaselineAlignment,
    Bullet: BulletFormat,
    FarEastLineBreakControl: MsoTriState,
    HangingPunctuation: MsoTriState,
    LineRuleAfter: MsoTriState,
    LineRuleBefore: MsoTriState,
    LineRuleWithin: MsoTriState,
    Parent: js.Any,
    PowerPointDotParagraphFormat_typekey: ParagraphFormat,
    SpaceAfter: Double,
    SpaceBefore: Double,
    SpaceWithin: Double,
    TextDirection: PpDirection,
    WordWrap: MsoTriState
  ): ParagraphFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BaseLineAlignment = BaseLineAlignment.asInstanceOf[js.Any], Bullet = Bullet.asInstanceOf[js.Any], FarEastLineBreakControl = FarEastLineBreakControl.asInstanceOf[js.Any], HangingPunctuation = HangingPunctuation.asInstanceOf[js.Any], LineRuleAfter = LineRuleAfter.asInstanceOf[js.Any], LineRuleBefore = LineRuleBefore.asInstanceOf[js.Any], LineRuleWithin = LineRuleWithin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SpaceAfter = SpaceAfter.asInstanceOf[js.Any], SpaceBefore = SpaceBefore.asInstanceOf[js.Any], SpaceWithin = SpaceWithin.asInstanceOf[js.Any], TextDirection = TextDirection.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ParagraphFormat_typekey")(PowerPointDotParagraphFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphFormat]
  }
  @scala.inline
  implicit class ParagraphFormatOps[Self <: ParagraphFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: PpParagraphAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseLineAlignment(value: PpBaselineAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseLineAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBullet(value: BulletFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bullet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFarEastLineBreakControl(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FarEastLineBreakControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHangingPunctuation(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HangingPunctuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineRuleAfter(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineRuleAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineRuleBefore(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineRuleBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineRuleWithin(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineRuleWithin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotParagraphFormat_typekey(value: ParagraphFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.ParagraphFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceWithin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceWithin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDirection(value: PpDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrap(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

