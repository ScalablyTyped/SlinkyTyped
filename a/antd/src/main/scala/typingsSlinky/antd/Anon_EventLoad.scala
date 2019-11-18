package typingsSlinky.antd

import slinky.core.ReactComponentClass
import typingsSlinky.antd.antdStrings.load
import typingsSlinky.antd.libTreeTreeMod.AntTreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventLoad extends js.Object {
  var event: load
  var node: ReactComponentClass[AntTreeNodeProps]
}

object Anon_EventLoad {
  @scala.inline
  def apply(event: load, node: ReactComponentClass[AntTreeNodeProps]): Anon_EventLoad = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventLoad]
  }
}

