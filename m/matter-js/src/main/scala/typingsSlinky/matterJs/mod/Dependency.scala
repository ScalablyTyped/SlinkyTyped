package typingsSlinky.matterJs.mod

import typingsSlinky.matterJs.anon.Name
import typingsSlinky.matterJs.anon.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.matterJs.anon.Name
  - typingsSlinky.matterJs.anon.Version
  - java.lang.String
*/
trait Dependency extends js.Object

object Dependency {
  @scala.inline
  implicit def apply(value: Name): Dependency = value.asInstanceOf[Dependency]
  @scala.inline
  implicit def apply(value: String): Dependency = value.asInstanceOf[Dependency]
  @scala.inline
  implicit def apply(value: Version): Dependency = value.asInstanceOf[Dependency]
}

