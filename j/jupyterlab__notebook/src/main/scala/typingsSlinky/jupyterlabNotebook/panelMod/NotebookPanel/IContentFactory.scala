package typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabNotebook.widgetMod.Notebook
import typingsSlinky.jupyterlabNotebook.widgetMod.Notebook.IOptions
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A content factory interface for NotebookPanel.
  */
@js.native
trait IContentFactory
  extends typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.IContentFactory {
  /**
    * Create a new content area for the panel.
    */
  def createNotebook(options: IOptions): Notebook = js.native
}

/**
  * The notebook renderer token.
  */
@JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel.IContentFactory")
@js.native
object IContentFactory extends TopLevel[Token[IContentFactory]]

