package typingsSlinky.devextreme

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

trait AnonVisible extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      separator | export | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | autoLayout | fullScreen
    ]
  ] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonVisible {
  @scala.inline
  def apply(
    commands: js.Array[
      separator | export | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | autoLayout | fullScreen
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonVisible = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVisible]
  }
}

