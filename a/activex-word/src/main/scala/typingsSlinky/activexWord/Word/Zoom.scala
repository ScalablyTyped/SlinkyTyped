package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zoom extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var PageColumns: Double = js.native
  var PageFit: WdPageFit = js.native
  var PageRows: Double = js.native
  val Parent: js.Any = js.native
  var Percentage: Double = js.native
  @JSName("Word.Zoom_typekey")
  var WordDotZoom_typekey: Zoom = js.native
}

object Zoom {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    PageColumns: Double,
    PageFit: WdPageFit,
    PageRows: Double,
    Parent: js.Any,
    Percentage: Double,
    WordDotZoom_typekey: Zoom
  ): Zoom = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], PageColumns = PageColumns.asInstanceOf[js.Any], PageFit = PageFit.asInstanceOf[js.Any], PageRows = PageRows.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Percentage = Percentage.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Zoom_typekey")(WordDotZoom_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zoom]
  }
  @scala.inline
  implicit class ZoomOps[Self <: Zoom] (val x: Self) extends AnyVal {
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
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageFit(value: WdPageFit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotZoom_typekey(value: Zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Zoom_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

