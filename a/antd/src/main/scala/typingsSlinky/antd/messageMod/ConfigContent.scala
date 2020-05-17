package typingsSlinky.antd.messageMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactNode
  - java.lang.String
*/
trait ConfigContent extends JointContent

object ConfigContent {
  @scala.inline
  implicit def apply(value: TagMod[Any]): ConfigContent = value.asInstanceOf[ConfigContent]
  @scala.inline
  implicit def apply(value: String): ConfigContent = value.asInstanceOf[ConfigContent]
}

