package typingsSlinky.rcTreeSelect.anon

import slinky.core.facade.ReactElement
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.SimpleModeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLabelProp extends js.Object {
  var simpleMode: Boolean | SimpleModeConfig
  def getLabelProp(node: DataNode): ReactElement
}

object GetLabelProp {
  @scala.inline
  def apply(getLabelProp: DataNode => ReactElement, simpleMode: Boolean | SimpleModeConfig): GetLabelProp = {
    val __obj = js.Dynamic.literal(getLabelProp = js.Any.fromFunction1(getLabelProp), simpleMode = simpleMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLabelProp]
  }
  @scala.inline
  implicit class GetLabelPropOps[Self <: GetLabelProp] (val x: Self) extends AnyVal {
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
    def setGetLabelProp(value: DataNode => ReactElement): Self = this.set("getLabelProp", js.Any.fromFunction1(value))
    @scala.inline
    def setSimpleMode(value: Boolean | SimpleModeConfig): Self = this.set("simpleMode", value.asInstanceOf[js.Any])
  }
  
}

