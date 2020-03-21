package typingsSlinky.gaeaModel.FitGaea

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.gaeaModel.AnonMapUniqueKey
import typingsSlinky.gaeaModel.AnonSource
import typingsSlinky.gaeaModel.AnonUniqueKey
import typingsSlinky.gaeaModel.gaeaModelStrings.`new`
import typingsSlinky.gaeaModel.gaeaModelStrings.combo
import typingsSlinky.gaeaModel.gaeaModelStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentDragComponentInfo extends js.Object {
  var comboInfo: js.UndefOr[AnonSource] = js.undefined
  // 开始拖拽在父级中的位置
  var dragStartIndex: Double
  // 开始拖拽父级的 dom
  var dragStartParentElement: HTMLElement
  var newInfo: js.UndefOr[AnonUniqueKey] = js.undefined
  // 类型
  var `type`: `new` | combo | viewport
  var viewportInfo: js.UndefOr[AnonMapUniqueKey] = js.undefined
}

object CurrentDragComponentInfo {
  @scala.inline
  def apply(
    dragStartIndex: Double,
    dragStartParentElement: HTMLElement,
    `type`: `new` | combo | viewport,
    comboInfo: AnonSource = null,
    newInfo: AnonUniqueKey = null,
    viewportInfo: AnonMapUniqueKey = null
  ): CurrentDragComponentInfo = {
    val __obj = js.Dynamic.literal(dragStartIndex = dragStartIndex.asInstanceOf[js.Any], dragStartParentElement = dragStartParentElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comboInfo != null) __obj.updateDynamic("comboInfo")(comboInfo.asInstanceOf[js.Any])
    if (newInfo != null) __obj.updateDynamic("newInfo")(newInfo.asInstanceOf[js.Any])
    if (viewportInfo != null) __obj.updateDynamic("viewportInfo")(viewportInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentDragComponentInfo]
  }
}

