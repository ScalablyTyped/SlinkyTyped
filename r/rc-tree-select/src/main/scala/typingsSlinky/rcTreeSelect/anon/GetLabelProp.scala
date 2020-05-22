package typingsSlinky.rcTreeSelect.anon

import slinky.core.TagMod
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.SimpleModeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLabelProp extends js.Object {
  var simpleMode: Boolean | SimpleModeConfig
  def getLabelProp(node: DataNode): TagMod[Any]
}

object GetLabelProp {
  @scala.inline
  def apply(getLabelProp: DataNode => TagMod[Any], simpleMode: Boolean | SimpleModeConfig): GetLabelProp = {
    val __obj = js.Dynamic.literal(getLabelProp = js.Any.fromFunction1(getLabelProp), simpleMode = simpleMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLabelProp]
  }
}

