package typingsSlinky.azdata.mod

import typingsSlinky.azdata.mod.window.ModelViewPanel
import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.mod.Event
import typingsSlinky.vscode.mod.ViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "workspace")
@js.native
object workspace extends js.Object {
  
  def createModelViewEditor(title: String): ModelViewEditor = js.native
  def createModelViewEditor(title: String, options: ModelViewEditorOptions): ModelViewEditor = js.native
  
  val onDidChangeToDashboard: Event[DashboardDocument] = js.native
  
  val onDidOpenDashboard: Event[DashboardDocument] = js.native
  
  @js.native
  trait ModelViewEditor extends ModelViewPanel {
    
    /**
      * `true` if there are unpersisted changes.
      * This is editable to support extensions updating the dirty status.
      */
    var isDirty: Boolean = js.native
    
    /**
      * Opens the editor
      */
    def openEditor(): Thenable[Unit] = js.native
    def openEditor(position: ViewColumn): Thenable[Unit] = js.native
    
    /**
      * Registers a save handler for this editor. This will be called if [supportsSave](#ModelViewEditorOptions.supportsSave)
      * is set to true and the editor is marked as dirty
      */
    def registerSaveHandler(handler: js.Function0[Thenable[Boolean]]): Unit = js.native
  }
}
