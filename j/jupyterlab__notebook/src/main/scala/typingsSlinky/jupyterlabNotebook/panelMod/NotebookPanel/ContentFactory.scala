package typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel.ContentFactory")
@js.native
class ContentFactory ()
  extends typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.ContentFactory
     with IContentFactory {
  
  /**
    * The readonly editor factory that create code editors
    */
  /* InferMemberOverrides */
  @JSName("editorFactory")
  override def editorFactory_MContentFactory_ : Factory = js.native
}
