package typingsSlinky.hexo.mod.Router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[/ * err * / js.Any, / * result * / java.lang.String, scala.Unit]
  - js.Function0[js.Promise[java.lang.String]]
*/
trait Callback extends js.Object

object Callback {
  @scala.inline
  implicit def apply(value: js.Function0[js.Promise[String]]): Callback = value.asInstanceOf[Callback]
  @scala.inline
  implicit def apply(value: js.Function2[/* err */ js.Any, /* result */ String, Unit]): Callback = value.asInstanceOf[Callback]
}

