package typingsSlinky.ionic.configBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.configBaseMod.GlobalConfigContext
  - typingsSlinky.ionic.configBaseMod.ProjectConfigContext
*/
trait ConfigContext extends js.Object

object ConfigContext {
  @scala.inline
  implicit def apply(value: GlobalConfigContext): ConfigContext = value.asInstanceOf[ConfigContext]
  @scala.inline
  implicit def apply(value: ProjectConfigContext): ConfigContext = value.asInstanceOf[ConfigContext]
}

