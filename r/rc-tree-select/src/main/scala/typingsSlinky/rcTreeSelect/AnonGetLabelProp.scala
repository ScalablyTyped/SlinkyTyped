package typingsSlinky.rcTreeSelect

import slinky.core.TagMod
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.SimpleModeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetLabelProp extends js.Object {
  var simpleMode: Boolean | SimpleModeConfig
  def getLabelProp(node: DataNode): TagMod[Any]
}

object AnonGetLabelProp {
  @scala.inline
  def apply(getLabelProp: DataNode => TagMod[Any], simpleMode: Boolean | SimpleModeConfig): AnonGetLabelProp = {
    val __obj = js.Dynamic.literal(getLabelProp = js.Any.fromFunction1(getLabelProp), simpleMode = simpleMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGetLabelProp]
  }
}

