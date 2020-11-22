package typingsSlinky.jupyterlabNotebook.mod

import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.IContentFactory
import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook", "StaticNotebook")
@js.native
class StaticNotebook protected ()
  extends typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook {
  /**
    * Construct a notebook widget.
    */
  def this(options: IOptions) = this()
}
@JSImport("@jupyterlab/notebook", "StaticNotebook")
@js.native
object StaticNotebook extends js.Object {
  
  /**
    * Default content factory for the static notebook widget.
    */
  val defaultContentFactory: IContentFactory = js.native
  
  /**
    * Default configuration options for cell editors.
    */
  val defaultEditorConfig: IEditorConfig = js.native
  
  /**
    * Default configuration options for notebooks.
    */
  val defaultNotebookConfig: INotebookConfig = js.native
  
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.ContentFactory
  /**
    * A namespace for the staic notebook content factory.
    */
  @js.native
  object ContentFactory extends js.Object
}
