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

@js.native
trait CurrentDragComponentInfo extends js.Object {
  var comboInfo: js.UndefOr[AnonSource] = js.native
  // 开始拖拽在父级中的位置
  var dragStartIndex: Double = js.native
  // 开始拖拽父级的 dom
  var dragStartParentElement: HTMLElement = js.native
  var newInfo: js.UndefOr[AnonUniqueKey] = js.native
  // 类型
  var `type`: `new` | combo | viewport = js.native
  var viewportInfo: js.UndefOr[AnonMapUniqueKey] = js.native
}

object CurrentDragComponentInfo {
  @scala.inline
  def apply(dragStartIndex: Double, dragStartParentElement: HTMLElement, `type`: `new` | combo | viewport): CurrentDragComponentInfo = {
    val __obj = js.Dynamic.literal(dragStartIndex = dragStartIndex.asInstanceOf[js.Any], dragStartParentElement = dragStartParentElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentDragComponentInfo]
  }
  @scala.inline
  implicit class CurrentDragComponentInfoOps[Self <: CurrentDragComponentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragStartParentElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStartParentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `new` | combo | viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComboInfo(value: AnonSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comboInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComboInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comboInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withNewInfo(value: AnonUniqueKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportInfo(value: AnonMapUniqueKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportInfo")(js.undefined)
        ret
    }
  }
  
}

