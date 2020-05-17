package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frameset extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val ChildFramesetCount: Double = js.native
  val Creator: Double = js.native
  var FrameDefaultURL: String = js.native
  var FrameDisplayBorders: Boolean = js.native
  var FrameLinkToFile: Boolean = js.native
  var FrameName: String = js.native
  var FrameResizable: Boolean = js.native
  var FrameScrollbarType: WdScrollbarType = js.native
  var FramesetBorderColor: WdColor = js.native
  var FramesetBorderWidth: Double = js.native
  var Height: Double = js.native
  var HeightType: WdFramesetSizeType = js.native
  val Parent: js.Any = js.native
  val ParentFrameset: Frameset = js.native
  val Type: WdFramesetType = js.native
  var Width: Double = js.native
  var WidthType: WdFramesetSizeType = js.native
  @JSName("Word.Frameset_typekey")
  var WordDotFrameset_typekey: Frameset = js.native
  def AddNewFrame(Where: WdFramesetNewFrameLocation): Frameset = js.native
  def ChildFramesetItem(Index: Double): Frameset = js.native
  def Delete(): Unit = js.native
}

object Frameset {
  @scala.inline
  def apply(
    AddNewFrame: WdFramesetNewFrameLocation => Frameset,
    Application: Application,
    ChildFramesetCount: Double,
    ChildFramesetItem: Double => Frameset,
    Creator: Double,
    Delete: () => Unit,
    FrameDefaultURL: String,
    FrameDisplayBorders: Boolean,
    FrameLinkToFile: Boolean,
    FrameName: String,
    FrameResizable: Boolean,
    FrameScrollbarType: WdScrollbarType,
    FramesetBorderColor: WdColor,
    FramesetBorderWidth: Double,
    Height: Double,
    HeightType: WdFramesetSizeType,
    Parent: js.Any,
    ParentFrameset: Frameset,
    Type: WdFramesetType,
    Width: Double,
    WidthType: WdFramesetSizeType,
    WordDotFrameset_typekey: Frameset
  ): Frameset = {
    val __obj = js.Dynamic.literal(AddNewFrame = js.Any.fromFunction1(AddNewFrame), Application = Application.asInstanceOf[js.Any], ChildFramesetCount = ChildFramesetCount.asInstanceOf[js.Any], ChildFramesetItem = js.Any.fromFunction1(ChildFramesetItem), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), FrameDefaultURL = FrameDefaultURL.asInstanceOf[js.Any], FrameDisplayBorders = FrameDisplayBorders.asInstanceOf[js.Any], FrameLinkToFile = FrameLinkToFile.asInstanceOf[js.Any], FrameName = FrameName.asInstanceOf[js.Any], FrameResizable = FrameResizable.asInstanceOf[js.Any], FrameScrollbarType = FrameScrollbarType.asInstanceOf[js.Any], FramesetBorderColor = FramesetBorderColor.asInstanceOf[js.Any], FramesetBorderWidth = FramesetBorderWidth.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HeightType = HeightType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ParentFrameset = ParentFrameset.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WidthType = WidthType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Frameset_typekey")(WordDotFrameset_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frameset]
  }
  @scala.inline
  implicit class FramesetOps[Self <: Frameset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddNewFrame(value: WdFramesetNewFrameLocation => Frameset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddNewFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildFramesetCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChildFramesetCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildFramesetItem(value: Double => Frameset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChildFramesetItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFrameDefaultURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameDefaultURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameDisplayBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameDisplayBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameLinkToFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameLinkToFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameScrollbarType(value: WdScrollbarType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameScrollbarType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramesetBorderColor(value: WdColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramesetBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramesetBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FramesetBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightType(value: WdFramesetSizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeightType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentFrameset(value: Frameset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentFrameset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WdFramesetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidthType(value: WdFramesetSizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidthType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotFrameset_typekey(value: Frameset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Frameset_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

