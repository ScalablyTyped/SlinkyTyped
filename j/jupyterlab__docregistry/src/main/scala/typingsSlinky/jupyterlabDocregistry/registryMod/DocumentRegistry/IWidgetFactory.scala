package typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry

import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a widget factory.
  */
@js.native
trait IWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */]
  extends IDisposable
     with IWidgetFactoryOptions[Widget] {
  
  /**
    * Create a new widget given a context.
    *
    * @param source - A widget to clone
    *
    * #### Notes
    * It should emit the [widgetCreated] signal with the new widget.
    */
  def createNew(context: IContext[U]): T = js.native
  def createNew(context: IContext[U], source: T): T = js.native
  
  /**
    * A signal emitted when a new widget is created.
    */
  var widgetCreated: ISignal[IWidgetFactory[T, U], T] = js.native
}
