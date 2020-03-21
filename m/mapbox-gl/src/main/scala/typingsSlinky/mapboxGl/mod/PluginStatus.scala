package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mapboxGlStrings.unavailable
  - typingsSlinky.mapboxGl.mapboxGlStrings.loading
  - typingsSlinky.mapboxGl.mapboxGlStrings.loaded
  - typingsSlinky.mapboxGl.mapboxGlStrings.error
*/
trait PluginStatus extends js.Object

object PluginStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.mapboxGl.mapboxGlStrings.error = this.cast("error")
  @scala.inline
  def loaded: typingsSlinky.mapboxGl.mapboxGlStrings.loaded = this.cast("loaded")
  @scala.inline
  def loading: typingsSlinky.mapboxGl.mapboxGlStrings.loading = this.cast("loading")
  @scala.inline
  def unavailable: typingsSlinky.mapboxGl.mapboxGlStrings.unavailable = this.cast("unavailable")
}

