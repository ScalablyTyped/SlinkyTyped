package typingsSlinky.jupyterlabExtensionmanager.modelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.install
  - typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.uninstall
  - typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.enable
  - typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.disable
*/
trait Action extends js.Object

object Action {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disable: typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.disable = this.cast("disable")
  @scala.inline
  def enable: typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.enable = this.cast("enable")
  @scala.inline
  def install: typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.install = this.cast("install")
  @scala.inline
  def uninstall: typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.uninstall = this.cast("uninstall")
}

