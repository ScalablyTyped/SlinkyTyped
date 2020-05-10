package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashSymbolItem extends js.Object {
  var scalingGrid: Boolean = js.native
  var scalingGridRect: FlashRectangle = js.native
  var sourceAutoUpdate: Boolean = js.native
  var sourceFilePath: String = js.native
  var sourceLibraryName: String = js.native
  var symbolType: String = js.native
  var timeline: FlashTimeline = js.native
  def convertToCompiledClip(): Unit = js.native
  def exportSWC(outputURI: String): Unit = js.native
  def exportSWF(outputURI: String): Unit = js.native
}

object FlashSymbolItem {
  @scala.inline
  def apply(
    convertToCompiledClip: () => Unit,
    exportSWC: String => Unit,
    exportSWF: String => Unit,
    scalingGrid: Boolean,
    scalingGridRect: FlashRectangle,
    sourceAutoUpdate: Boolean,
    sourceFilePath: String,
    sourceLibraryName: String,
    symbolType: String,
    timeline: FlashTimeline
  ): FlashSymbolItem = {
    val __obj = js.Dynamic.literal(convertToCompiledClip = js.Any.fromFunction0(convertToCompiledClip), exportSWC = js.Any.fromFunction1(exportSWC), exportSWF = js.Any.fromFunction1(exportSWF), scalingGrid = scalingGrid.asInstanceOf[js.Any], scalingGridRect = scalingGridRect.asInstanceOf[js.Any], sourceAutoUpdate = sourceAutoUpdate.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashSymbolItem]
  }
  @scala.inline
  implicit class FlashSymbolItemOps[Self <: FlashSymbolItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertToCompiledClip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertToCompiledClip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExportSWC(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSWC")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExportSWF(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSWF")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScalingGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalingGridRect(value: FlashRectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingGridRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceAutoUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAutoUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLibraryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLibraryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeline(value: FlashTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

