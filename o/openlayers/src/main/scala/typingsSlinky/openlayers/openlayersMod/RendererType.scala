package typingsSlinky.openlayers.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.canvas
  - typings.openlayers.openlayersStrings.dom
  - typings.openlayers.openlayersStrings.webgl
*/
trait RendererType extends js.Object

object RendererType {
  @scala.inline
  def canvas: typingsSlinky.openlayers.openlayersStrings.canvas = this.cast("canvas")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dom: typingsSlinky.openlayers.openlayersStrings.dom = this.cast("dom")
  @scala.inline
  def webgl: typingsSlinky.openlayers.openlayersStrings.webgl = this.cast("webgl")
}

