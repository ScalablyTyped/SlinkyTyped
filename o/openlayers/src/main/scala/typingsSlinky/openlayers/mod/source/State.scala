package typingsSlinky.openlayers.mod.source

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * State of the source, one of 'undefined', 'loading', 'ready' or 'error'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openlayers.openlayersStrings.undefined
  - typingsSlinky.openlayers.openlayersStrings.loading
  - typingsSlinky.openlayers.openlayersStrings.ready
  - typingsSlinky.openlayers.openlayersStrings.error
*/
trait State extends js.Object

object State {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.openlayers.openlayersStrings.error = this.cast("error")
  @scala.inline
  def loading: typingsSlinky.openlayers.openlayersStrings.loading = this.cast("loading")
  @scala.inline
  def ready: typingsSlinky.openlayers.openlayersStrings.ready = this.cast("ready")
  @scala.inline
  def undefined: typingsSlinky.openlayers.openlayersStrings.undefined = this.cast("undefined")
}

