package typingsSlinky.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxDashGl.mapboxDashGlStrings.unavailable
  - typings.mapboxDashGl.mapboxDashGlStrings.loading
  - typings.mapboxDashGl.mapboxDashGlStrings.loaded
  - typings.mapboxDashGl.mapboxDashGlStrings.error
*/
trait PluginStatus extends js.Object

object PluginStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.mapboxDashGl.mapboxDashGlStrings.error = this.cast("error")
  @scala.inline
  def loaded: typingsSlinky.mapboxDashGl.mapboxDashGlStrings.loaded = this.cast("loaded")
  @scala.inline
  def loading: typingsSlinky.mapboxDashGl.mapboxDashGlStrings.loading = this.cast("loading")
  @scala.inline
  def unavailable: typingsSlinky.mapboxDashGl.mapboxDashGlStrings.unavailable = this.cast("unavailable")
}

