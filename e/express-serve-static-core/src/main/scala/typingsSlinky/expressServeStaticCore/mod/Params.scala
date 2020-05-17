package typingsSlinky.expressServeStaticCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
  - typingsSlinky.expressServeStaticCore.mod.ParamsArray
*/
trait Params extends js.Object

object Params {
  @scala.inline
  implicit def apply(value: ParamsArray): Params = value.asInstanceOf[Params]
  @scala.inline
  implicit def apply(value: ParamsDictionary): Params = value.asInstanceOf[Params]
}

