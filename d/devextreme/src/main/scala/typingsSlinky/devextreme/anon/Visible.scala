package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.autoLayout
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
import typingsSlinky.devextreme.devextremeStrings.export
import typingsSlinky.devextreme.devextremeStrings.fillColor
import typingsSlinky.devextreme.devextremeStrings.fontColor
import typingsSlinky.devextreme.devextremeStrings.fontName
import typingsSlinky.devextreme.devextremeStrings.fontSize
import typingsSlinky.devextreme.devextremeStrings.fullScreen
import typingsSlinky.devextreme.devextremeStrings.insertShapeImage
import typingsSlinky.devextreme.devextremeStrings.italic
import typingsSlinky.devextreme.devextremeStrings.lineColor
import typingsSlinky.devextreme.devextremeStrings.lock
import typingsSlinky.devextreme.devextremeStrings.paste
import typingsSlinky.devextreme.devextremeStrings.redo
import typingsSlinky.devextreme.devextremeStrings.selectAll
import typingsSlinky.devextreme.devextremeStrings.sendToBack
import typingsSlinky.devextreme.devextremeStrings.separator
import typingsSlinky.devextreme.devextremeStrings.textAlignCenter
import typingsSlinky.devextreme.devextremeStrings.textAlignLeft
import typingsSlinky.devextreme.devextremeStrings.textAlignRight
import typingsSlinky.devextreme.devextremeStrings.underline
import typingsSlinky.devextreme.devextremeStrings.undo
import typingsSlinky.devextreme.devextremeStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visible extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      separator | export | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | autoLayout | fullScreen
    ]
  ] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object Visible {
  @scala.inline
  def apply(): Visible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visible]
  }
  @scala.inline
  implicit class VisibleOps[Self <: Visible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(
      value: js.Array[
          separator | export | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | autoLayout | fullScreen
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

