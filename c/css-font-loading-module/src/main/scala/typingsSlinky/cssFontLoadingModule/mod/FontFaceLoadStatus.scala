package typingsSlinky.cssFontLoadingModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded
  - typingsSlinky.cssFontLoadingModule.cssFontLoadingModuleStrings.loading
  - typingsSlinky.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded
  - typingsSlinky.cssFontLoadingModule.cssFontLoadingModuleStrings.error
*/
trait FontFaceLoadStatus extends js.Object

object FontFaceLoadStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.cssFontLoadingModule.cssFontLoadingModuleStrings.error = this.cast("error")
  @scala.inline
  def loaded: typingsSlinky.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded = this.cast("loaded")
  @scala.inline
  def loading: typingsSlinky.cssFontLoadingModule.cssFontLoadingModuleStrings.loading = this.cast("loading")
  @scala.inline
  def unloaded: typingsSlinky.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded = this.cast("unloaded")
}

