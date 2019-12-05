package typingsSlinky.gaeaDashModel.FitGaea

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.gaeaDashModel.Anon_MapUniqueKey
import typingsSlinky.gaeaDashModel.Anon_Source
import typingsSlinky.gaeaDashModel.Anon_UniqueKey
import typingsSlinky.gaeaDashModel.gaeaDashModelStrings.`new`
import typingsSlinky.gaeaDashModel.gaeaDashModelStrings.combo
import typingsSlinky.gaeaDashModel.gaeaDashModelStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentDragComponentInfo extends js.Object {
  var comboInfo: js.UndefOr[Anon_Source] = js.undefined
  // 开始拖拽在父级中的位置
  var dragStartIndex: Double
  // 开始拖拽父级的 dom
  var dragStartParentElement: HTMLElement
  var newInfo: js.UndefOr[Anon_UniqueKey] = js.undefined
  // 类型
  var `type`: `new` | combo | viewport
  var viewportInfo: js.UndefOr[Anon_MapUniqueKey] = js.undefined
}

object CurrentDragComponentInfo {
  @scala.inline
  def apply(
    dragStartIndex: Double,
    dragStartParentElement: HTMLElement,
    `type`: `new` | combo | viewport,
    comboInfo: Anon_Source = null,
    newInfo: Anon_UniqueKey = null,
    viewportInfo: Anon_MapUniqueKey = null
  ): CurrentDragComponentInfo = {
    val __obj = js.Dynamic.literal(dragStartIndex = dragStartIndex.asInstanceOf[js.Any], dragStartParentElement = dragStartParentElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comboInfo != null) __obj.updateDynamic("comboInfo")(comboInfo.asInstanceOf[js.Any])
    if (newInfo != null) __obj.updateDynamic("newInfo")(newInfo.asInstanceOf[js.Any])
    if (viewportInfo != null) __obj.updateDynamic("viewportInfo")(viewportInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentDragComponentInfo]
  }
}

