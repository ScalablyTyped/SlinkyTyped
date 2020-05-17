package typingsSlinky.oauthJs.OAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oauthJs.OAuth.ParameterList
  - typingsSlinky.oauthJs.OAuth.ParameterMap
*/
trait ParameterListOrMap extends js.Object

object ParameterListOrMap {
  @scala.inline
  implicit def apply(value: ParameterList): ParameterListOrMap = value.asInstanceOf[ParameterListOrMap]
  @scala.inline
  implicit def apply(value: ParameterMap): ParameterListOrMap = value.asInstanceOf[ParameterListOrMap]
}

