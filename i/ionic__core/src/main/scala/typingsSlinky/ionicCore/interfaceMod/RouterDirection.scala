package typingsSlinky.ionicCore.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCore.ionicCoreStrings.forward
  - typingsSlinky.ionicCore.ionicCoreStrings.back
  - typingsSlinky.ionicCore.ionicCoreStrings.root
*/
trait RouterDirection extends js.Object

object RouterDirection {
  @scala.inline
  def back: typingsSlinky.ionicCore.ionicCoreStrings.back = this.cast("back")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forward: typingsSlinky.ionicCore.ionicCoreStrings.forward = this.cast("forward")
  @scala.inline
  def root: typingsSlinky.ionicCore.ionicCoreStrings.root = this.cast("root")
}

