package typingsSlinky.alex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is either an array of words to ignore or custom Alex' config
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.alex.mod.AlexOptions
  - js.Array[java.lang.String]
*/
trait Config extends js.Object

object Config {
  @scala.inline
  implicit def apply(value: AlexOptions): Config = value.asInstanceOf[Config]
  @scala.inline
  implicit def apply(value: js.Array[String]): Config = value.asInstanceOf[Config]
}

