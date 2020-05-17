package typingsSlinky.activexWord.Word

import typingsSlinky.activexWord.activexWordNumbers.`9999999`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Borders extends js.Object {
  var AlwaysInFront: Boolean = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var DistanceFrom: WdBorderDistanceFrom = js.native
  var DistanceFromBottom: Double = js.native
  var DistanceFromLeft: Double = js.native
  var DistanceFromRight: Double = js.native
  var DistanceFromTop: Double = js.native
  var Enable: Boolean | `9999999` | WdLineStyle = js.native
  var EnableFirstPageInSection: Boolean = js.native
  var EnableOtherPagesInSection: Boolean = js.native
  val HasHorizontal: Boolean = js.native
  val HasVertical: Boolean = js.native
  var InsideColor: WdColor = js.native
  var InsideColorIndex: WdColorIndex = js.native
  var InsideLineStyle: WdLineStyle = js.native
  var InsideLineWidth: WdLineWidth = js.native
  var JoinBorders: Boolean = js.native
  var OutsideColor: WdColor = js.native
  var OutsideColorIndex: WdColorIndex = js.native
  var OutsideLineStyle: WdLineStyle = js.native
  var OutsideLineWidth: WdLineWidth = js.native
  val Parent: js.Any = js.native
  var Shadow: Boolean = js.native
  var SurroundFooter: Boolean = js.native
  var SurroundHeader: Boolean = js.native
  @JSName("Word.Borders_typekey")
  var WordDotBorders_typekey: Borders = js.native
  def ApplyPageBordersToAllSections(): Unit = js.native
  def Item(Index: WdBorderType): Border = js.native
}

object Borders {
  @scala.inline
  def apply(
    AlwaysInFront: Boolean,
    Application: Application,
    ApplyPageBordersToAllSections: () => Unit,
    Count: Double,
    Creator: Double,
    DistanceFrom: WdBorderDistanceFrom,
    DistanceFromBottom: Double,
    DistanceFromLeft: Double,
    DistanceFromRight: Double,
    DistanceFromTop: Double,
    Enable: Boolean | `9999999` | WdLineStyle,
    EnableFirstPageInSection: Boolean,
    EnableOtherPagesInSection: Boolean,
    HasHorizontal: Boolean,
    HasVertical: Boolean,
    InsideColor: WdColor,
    InsideColorIndex: WdColorIndex,
    InsideLineStyle: WdLineStyle,
    InsideLineWidth: WdLineWidth,
    Item: WdBorderType => Border,
    JoinBorders: Boolean,
    OutsideColor: WdColor,
    OutsideColorIndex: WdColorIndex,
    OutsideLineStyle: WdLineStyle,
    OutsideLineWidth: WdLineWidth,
    Parent: js.Any,
    Shadow: Boolean,
    SurroundFooter: Boolean,
    SurroundHeader: Boolean,
    WordDotBorders_typekey: Borders
  ): Borders = {
    val __obj = js.Dynamic.literal(AlwaysInFront = AlwaysInFront.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ApplyPageBordersToAllSections = js.Any.fromFunction0(ApplyPageBordersToAllSections), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DistanceFrom = DistanceFrom.asInstanceOf[js.Any], DistanceFromBottom = DistanceFromBottom.asInstanceOf[js.Any], DistanceFromLeft = DistanceFromLeft.asInstanceOf[js.Any], DistanceFromRight = DistanceFromRight.asInstanceOf[js.Any], DistanceFromTop = DistanceFromTop.asInstanceOf[js.Any], Enable = Enable.asInstanceOf[js.Any], EnableFirstPageInSection = EnableFirstPageInSection.asInstanceOf[js.Any], EnableOtherPagesInSection = EnableOtherPagesInSection.asInstanceOf[js.Any], HasHorizontal = HasHorizontal.asInstanceOf[js.Any], HasVertical = HasVertical.asInstanceOf[js.Any], InsideColor = InsideColor.asInstanceOf[js.Any], InsideColorIndex = InsideColorIndex.asInstanceOf[js.Any], InsideLineStyle = InsideLineStyle.asInstanceOf[js.Any], InsideLineWidth = InsideLineWidth.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), JoinBorders = JoinBorders.asInstanceOf[js.Any], OutsideColor = OutsideColor.asInstanceOf[js.Any], OutsideColorIndex = OutsideColorIndex.asInstanceOf[js.Any], OutsideLineStyle = OutsideLineStyle.asInstanceOf[js.Any], OutsideLineWidth = OutsideLineWidth.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], SurroundFooter = SurroundFooter.asInstanceOf[js.Any], SurroundHeader = SurroundHeader.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Borders_typekey")(WordDotBorders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
  @scala.inline
  implicit class BordersOps[Self <: Borders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysInFront(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlwaysInFront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyPageBordersToAllSections(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyPageBordersToAllSections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceFrom(value: WdBorderDistanceFrom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceFromBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceFromBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceFromLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceFromLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceFromRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceFromRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceFromTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceFromTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: Boolean | `9999999` | WdLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableFirstPageInSection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableFirstPageInSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableOtherPagesInSection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableOtherPagesInSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideColor(value: WdColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsideColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideColorIndex(value: WdColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsideColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideLineStyle(value: WdLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsideLineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideLineWidth(value: WdLineWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsideLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: WdBorderType => Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJoinBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JoinBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutsideColor(value: WdColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutsideColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutsideColorIndex(value: WdColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutsideColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutsideLineStyle(value: WdLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutsideLineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutsideLineWidth(value: WdLineWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutsideLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurroundFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SurroundFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurroundHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SurroundHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotBorders_typekey(value: Borders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Borders_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

