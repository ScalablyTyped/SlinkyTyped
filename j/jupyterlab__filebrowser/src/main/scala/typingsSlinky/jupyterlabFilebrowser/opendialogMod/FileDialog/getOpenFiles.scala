package typingsSlinky.jupyterlabFilebrowser.opendialogMod.FileDialog

import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IResult
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/filebrowser/lib/opendialog", "FileDialog.getOpenFiles")
@js.native
object getOpenFiles extends js.Object {
  
  /**
    * Create and show a open files dialog.
    *
    * Note: if nothing is selected when `getValue` will return the browser
    * model current path.
    *
    * @param options - The dialog setup options.
    *
    * @returns A promise that resolves with whether the dialog was accepted.
    */
  def apply(options: IFileOptions): js.Promise[IResult[js.Array[IModel]]] = js.native
}
