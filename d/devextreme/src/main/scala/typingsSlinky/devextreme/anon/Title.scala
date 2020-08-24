package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.bold
import typingsSlinky.devextreme.devextremeStrings.bringToFront
import typingsSlinky.devextreme.devextremeStrings.connectorLineEnd
import typingsSlinky.devextreme.devextremeStrings.connectorLineStart
import typingsSlinky.devextreme.devextremeStrings.connectorLineType
import typingsSlinky.devextreme.devextremeStrings.copy
import typingsSlinky.devextreme.devextremeStrings.cut
import typingsSlinky.devextreme.devextremeStrings.delete
import typingsSlinky.devextreme.devextremeStrings.deleteShapeImage
import typingsSlinky.devextreme.devextremeStrings.editShapeImage
import typingsSlinky.devextreme.devextremeStrings.exportJpg
import typingsSlinky.devextreme.devextremeStrings.exportPng
import typingsSlinky.devextreme.devextremeStrings.exportSvg
import typingsSlinky.devextreme.devextremeStrings.fillColor
import typingsSlinky.devextreme.devextremeStrings.fontColor
import typingsSlinky.devextreme.devextremeStrings.fontName
import typingsSlinky.devextreme.devextremeStrings.fontSize
import typingsSlinky.devextreme.devextremeStrings.fullScreen
import typingsSlinky.devextreme.devextremeStrings.gridSize
import typingsSlinky.devextreme.devextremeStrings.insertShapeImage
import typingsSlinky.devextreme.devextremeStrings.italic
import typingsSlinky.devextreme.devextremeStrings.layoutLayeredBottomToTop
import typingsSlinky.devextreme.devextremeStrings.layoutLayeredLeftToRight
import typingsSlinky.devextreme.devextremeStrings.layoutLayeredRightToLeft
import typingsSlinky.devextreme.devextremeStrings.layoutLayeredTopToBottom
import typingsSlinky.devextreme.devextremeStrings.layoutTreeBottomToTop
import typingsSlinky.devextreme.devextremeStrings.layoutTreeLeftToRight
import typingsSlinky.devextreme.devextremeStrings.layoutTreeRightToLeft
import typingsSlinky.devextreme.devextremeStrings.layoutTreeTopToBottom
import typingsSlinky.devextreme.devextremeStrings.lineColor
import typingsSlinky.devextreme.devextremeStrings.lock
import typingsSlinky.devextreme.devextremeStrings.pageColor
import typingsSlinky.devextreme.devextremeStrings.pageOrientation
import typingsSlinky.devextreme.devextremeStrings.pageSize
import typingsSlinky.devextreme.devextremeStrings.paste
import typingsSlinky.devextreme.devextremeStrings.redo
import typingsSlinky.devextreme.devextremeStrings.selectAll
import typingsSlinky.devextreme.devextremeStrings.sendToBack
import typingsSlinky.devextreme.devextremeStrings.separator
import typingsSlinky.devextreme.devextremeStrings.showGrid
import typingsSlinky.devextreme.devextremeStrings.snapToGrid
import typingsSlinky.devextreme.devextremeStrings.textAlignCenter
import typingsSlinky.devextreme.devextremeStrings.textAlignLeft
import typingsSlinky.devextreme.devextremeStrings.textAlignRight
import typingsSlinky.devextreme.devextremeStrings.underline
import typingsSlinky.devextreme.devextremeStrings.undo
import typingsSlinky.devextreme.devextremeStrings.units
import typingsSlinky.devextreme.devextremeStrings.unlock
import typingsSlinky.devextreme.devextremeStrings.zoomLevel
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramCustomCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Title extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      separator | exportSvg | exportPng | exportJpg | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | layoutTreeTopToBottom | layoutTreeBottomToTop | layoutTreeLeftToRight | layoutTreeRightToLeft | layoutLayeredTopToBottom | layoutLayeredBottomToTop | layoutLayeredLeftToRight | layoutLayeredRightToLeft | fullScreen | zoomLevel | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor | dxDiagramCustomCommand
    ]
  ] = js.native
  var title: js.UndefOr[String] = js.native
}

object Title {
  @scala.inline
  def apply(): Title = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Title]
  }
  @scala.inline
  implicit class TitleOps[Self <: Title] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandsVarargs(
      value: (separator | exportSvg | exportPng | exportJpg | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | layoutTreeTopToBottom | layoutTreeBottomToTop | layoutTreeLeftToRight | layoutTreeRightToLeft | layoutLayeredTopToBottom | layoutLayeredBottomToTop | layoutLayeredLeftToRight | layoutLayeredRightToLeft | fullScreen | zoomLevel | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor | dxDiagramCustomCommand)*
    ): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(
      value: js.Array[
          separator | exportSvg | exportPng | exportJpg | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | layoutTreeTopToBottom | layoutTreeBottomToTop | layoutTreeLeftToRight | layoutTreeRightToLeft | layoutLayeredTopToBottom | layoutLayeredBottomToTop | layoutLayeredLeftToRight | layoutLayeredRightToLeft | fullScreen | zoomLevel | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor | dxDiagramCustomCommand
        ]
    ): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

