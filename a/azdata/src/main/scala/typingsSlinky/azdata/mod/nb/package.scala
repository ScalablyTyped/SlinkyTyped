package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object nb {
  
  type MultilineString = java.lang.String | js.Array[java.lang.String]
  
  @scala.inline
  def activeNotebookEditor: js.UndefOr[typingsSlinky.azdata.mod.nb.NotebookEditor] = typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].selectDynamic("activeNotebookEditor").asInstanceOf[js.UndefOr[typingsSlinky.azdata.mod.nb.NotebookEditor]]
  @scala.inline
  def activeNotebookEditor_=(x: js.UndefOr[typingsSlinky.azdata.mod.nb.NotebookEditor]): scala.Unit = typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].updateDynamic("activeNotebookEditor")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def notebookDocuments: js.Array[typingsSlinky.azdata.mod.nb.NotebookDocument] = typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].selectDynamic("notebookDocuments").asInstanceOf[js.Array[typingsSlinky.azdata.mod.nb.NotebookDocument]]
  @scala.inline
  def notebookDocuments_=(x: js.Array[typingsSlinky.azdata.mod.nb.NotebookDocument]): scala.Unit = typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].updateDynamic("notebookDocuments")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def onDidChangeNotebookCell: typingsSlinky.vscode.mod.Event[typingsSlinky.azdata.mod.nb.NotebookCellChangeEvent] = typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].selectDynamic("onDidChangeNotebookCell").asInstanceOf[typingsSlinky.vscode.mod.Event[typingsSlinky.azdata.mod.nb.NotebookCellChangeEvent]]
  
  @scala.inline
  def onDidOpenNotebookDocument: typingsSlinky.vscode.mod.Event[typingsSlinky.azdata.mod.nb.NotebookDocument] = typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].selectDynamic("onDidOpenNotebookDocument").asInstanceOf[typingsSlinky.vscode.mod.Event[typingsSlinky.azdata.mod.nb.NotebookDocument]]
  
  @scala.inline
  def registerNavigationProvider(provider: typingsSlinky.azdata.mod.nb.NavigationProvider): typingsSlinky.vscode.mod.Disposable = typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].applyDynamic("registerNavigationProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vscode.mod.Disposable]
  
  @scala.inline
  def registerNotebookProvider(provider: typingsSlinky.azdata.mod.nb.NotebookProvider): typingsSlinky.vscode.mod.Disposable = typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].applyDynamic("registerNotebookProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vscode.mod.Disposable]
  
  @scala.inline
  def showNotebookDocument(uri: typingsSlinky.vscode.mod.Uri): typingsSlinky.vscode.Thenable[typingsSlinky.azdata.mod.nb.NotebookEditor] = typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].applyDynamic("showNotebookDocument")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vscode.Thenable[typingsSlinky.azdata.mod.nb.NotebookEditor]]
  @scala.inline
  def showNotebookDocument(uri: typingsSlinky.vscode.mod.Uri, showOptions: typingsSlinky.azdata.mod.nb.NotebookShowOptions): typingsSlinky.vscode.Thenable[typingsSlinky.azdata.mod.nb.NotebookEditor] = (typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].applyDynamic("showNotebookDocument")(uri.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscode.Thenable[typingsSlinky.azdata.mod.nb.NotebookEditor]]
  
  @scala.inline
  def visibleNotebookEditors: js.Array[typingsSlinky.azdata.mod.nb.NotebookEditor] = typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].selectDynamic("visibleNotebookEditors").asInstanceOf[js.Array[typingsSlinky.azdata.mod.nb.NotebookEditor]]
  @scala.inline
  def visibleNotebookEditors_=(x: js.Array[typingsSlinky.azdata.mod.nb.NotebookEditor]): scala.Unit = typingsSlinky.azdata.mod.nb.^.asInstanceOf[js.Dynamic].updateDynamic("visibleNotebookEditors")(x.asInstanceOf[js.Any])
}
