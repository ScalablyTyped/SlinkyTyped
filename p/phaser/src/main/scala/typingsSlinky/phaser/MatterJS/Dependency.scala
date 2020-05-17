package typingsSlinky.phaser.MatterJS

import typingsSlinky.phaser.anon.Name
import typingsSlinky.phaser.anon.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phaser.anon.Name
  - typingsSlinky.phaser.anon.Version
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

