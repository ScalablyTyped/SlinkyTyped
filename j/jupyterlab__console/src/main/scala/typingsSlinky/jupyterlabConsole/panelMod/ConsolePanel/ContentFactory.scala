package typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Default implementation of `IContentFactory`.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
@js.native
class ContentFactory ()
  extends typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory
     with IContentFactory {
  
  /**
    * The readonly editor factory that create code editors
    */
  /* InferMemberOverrides */
  @JSName("editorFactory")
  override def editorFactory_MContentFactory_ : Factory = js.native
}
/**
  * A namespace for the console panel content factory.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  
  /**
    * Options for the code console content factory.
    */
  type IOptions = typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory.IOptions
}
