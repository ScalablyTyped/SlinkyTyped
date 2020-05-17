package typingsSlinky.cssJss.mod

import typingsSlinky.jss.mod.JssStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jss.mod.JssStyle
  - js.Array[typingsSlinky.jss.mod.JssStyle]
*/
trait StyleArg extends js.Object

object StyleArg {
  @scala.inline
  implicit def apply(value: js.Array[JssStyle]): StyleArg = value.asInstanceOf[StyleArg]
  @scala.inline
  implicit def apply(value: JssStyle): StyleArg = value.asInstanceOf[StyleArg]
}

