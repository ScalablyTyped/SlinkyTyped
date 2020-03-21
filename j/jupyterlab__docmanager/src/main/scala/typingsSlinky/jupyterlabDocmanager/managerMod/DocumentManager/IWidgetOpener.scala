package typingsSlinky.jupyterlabDocmanager.managerMod.DocumentManager

import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IOpenOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a widget opener.
  */
@js.native
trait IWidgetOpener extends js.Object {
  /**
    * Open the given widget.
    */
  def open(widget: IDocumentWidget[Widget, IModel]): Unit = js.native
  def open(widget: IDocumentWidget[Widget, IModel], options: IOpenOptions): Unit = js.native
}

