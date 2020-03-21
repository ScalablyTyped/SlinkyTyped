package typingsSlinky.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aframe.aframeStrings.`enter-vr`
  - typingsSlinky.aframe.aframeStrings.`exit-vr`
  - typingsSlinky.aframe.aframeStrings.loaded
  - typingsSlinky.aframe.aframeStrings.renderstart
*/
trait SceneEvents extends js.Object

object SceneEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `enter-vr`: typingsSlinky.aframe.aframeStrings.`enter-vr` = this.cast("enter-vr")
  @scala.inline
  def `exit-vr`: typingsSlinky.aframe.aframeStrings.`exit-vr` = this.cast("exit-vr")
  @scala.inline
  def loaded: typingsSlinky.aframe.aframeStrings.loaded = this.cast("loaded")
  @scala.inline
  def renderstart: typingsSlinky.aframe.aframeStrings.renderstart = this.cast("renderstart")
}

