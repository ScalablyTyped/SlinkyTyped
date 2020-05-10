package typingsSlinky.rcTreeSelect

import slinky.core.TagMod
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.SimpleModeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetLabelProp extends js.Object {
  var simpleMode: Boolean | SimpleModeConfig = js.native
  def getLabelProp(node: DataNode): TagMod[Any] = js.native
}

object AnonGetLabelProp {
  @scala.inline
  def apply(getLabelProp: DataNode => TagMod[Any], simpleMode: Boolean | SimpleModeConfig): AnonGetLabelProp = {
    val __obj = js.Dynamic.literal(getLabelProp = js.Any.fromFunction1(getLabelProp), simpleMode = simpleMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetLabelProp]
  }
  @scala.inline
  implicit class AnonGetLabelPropOps[Self <: AnonGetLabelProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLabelProp(value: DataNode => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelProp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSimpleMode(value: Boolean | SimpleModeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

