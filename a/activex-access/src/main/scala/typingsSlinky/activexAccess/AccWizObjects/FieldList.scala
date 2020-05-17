package typingsSlinky.activexAccess.AccWizObjects

import typingsSlinky.activexStdole.stdole.IPictureDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Field List Control */
@js.native
trait FieldList extends js.Object {
  @JSName("AccWizObjects.FieldList_typekey")
  var AccWizObjectsDotFieldList_typekey: FieldList = js.native
  val FieldListCount: Double = js.native
  var HScrollPos: Double = js.native
  val JoinLineCount: Double = js.native
  var PersistentHighlight: Boolean = js.native
  var Picture: IPictureDisp = js.native
  var PictureCols: Double = js.native
  var PictureRows: Double = js.native
  var ScrollBars: Double = js.native
  var SelectedFieldListIndex: Double = js.native
  var VScrollPos: Double = js.native
  def AddFieldList(
    bstrCaption: String,
    nLeft: Double,
    nTop: Double,
    nWidth: Double,
    nHeight: Double,
    nMultiSelectType: Double,
    cCols: Double,
    fShowPictures: Boolean
  ): Unit = js.native
  def AddJoinLine(
    IFieldList: Double,
    iField: Double,
    iForeignFieldList: Double,
    iForeignField: Double,
    lAttribs: Double
  ): Unit = js.native
  def DeleteFieldList(IFieldList: Double): Unit = js.native
  def DeleteJoinLine(IJoinLine: Double): Unit = js.native
  def FieldLists(IFieldList: Double): js.Any = js.native
  def JoinLines(IJoinLine: Double): js.Any = js.native
  def SetCursor(nCursorID: Double): Unit = js.native
}

object FieldList {
  @scala.inline
  def apply(
    AccWizObjectsDotFieldList_typekey: FieldList,
    AddFieldList: (String, Double, Double, Double, Double, Double, Double, Boolean) => Unit,
    AddJoinLine: (Double, Double, Double, Double, Double) => Unit,
    DeleteFieldList: Double => Unit,
    DeleteJoinLine: Double => Unit,
    FieldListCount: Double,
    FieldLists: Double => js.Any,
    HScrollPos: Double,
    JoinLineCount: Double,
    JoinLines: Double => js.Any,
    PersistentHighlight: Boolean,
    Picture: IPictureDisp,
    PictureCols: Double,
    PictureRows: Double,
    ScrollBars: Double,
    SelectedFieldListIndex: Double,
    SetCursor: Double => Unit,
    VScrollPos: Double
  ): FieldList = {
    val __obj = js.Dynamic.literal(AddFieldList = js.Any.fromFunction8(AddFieldList), AddJoinLine = js.Any.fromFunction5(AddJoinLine), DeleteFieldList = js.Any.fromFunction1(DeleteFieldList), DeleteJoinLine = js.Any.fromFunction1(DeleteJoinLine), FieldListCount = FieldListCount.asInstanceOf[js.Any], FieldLists = js.Any.fromFunction1(FieldLists), HScrollPos = HScrollPos.asInstanceOf[js.Any], JoinLineCount = JoinLineCount.asInstanceOf[js.Any], JoinLines = js.Any.fromFunction1(JoinLines), PersistentHighlight = PersistentHighlight.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureCols = PictureCols.asInstanceOf[js.Any], PictureRows = PictureRows.asInstanceOf[js.Any], ScrollBars = ScrollBars.asInstanceOf[js.Any], SelectedFieldListIndex = SelectedFieldListIndex.asInstanceOf[js.Any], SetCursor = js.Any.fromFunction1(SetCursor), VScrollPos = VScrollPos.asInstanceOf[js.Any])
    __obj.updateDynamic("AccWizObjects.FieldList_typekey")(AccWizObjectsDotFieldList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldList]
  }
  @scala.inline
  implicit class FieldListOps[Self <: FieldList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccWizObjectsDotFieldList_typekey(value: FieldList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccWizObjects.FieldList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddFieldList(value: (String, Double, Double, Double, Double, Double, Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddFieldList")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withAddJoinLine(value: (Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddJoinLine")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withDeleteFieldList(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteFieldList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteJoinLine(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteJoinLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFieldListCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldListCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldLists(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldLists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHScrollPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HScrollPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJoinLineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JoinLineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJoinLines(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JoinLines")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPersistentHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersistentHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicture(value: IPictureDisp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollBars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScrollBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedFieldListIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedFieldListIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCursor(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetCursor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVScrollPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VScrollPos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

