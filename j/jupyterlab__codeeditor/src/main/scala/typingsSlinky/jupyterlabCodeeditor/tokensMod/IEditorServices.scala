package typingsSlinky.jupyterlabCodeeditor.tokensMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabCodeeditor.factoryMod.IEditorFactoryService
import typingsSlinky.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorServices extends js.Object {
  /**
    * The code editor factory.
    */
  val factoryService: IEditorFactoryService = js.native
  /**
    * The editor mime type service.
    */
  val mimeTypeService: IEditorMimeTypeService = js.native
}

@JSImport("@jupyterlab/codeeditor/lib/tokens", "IEditorServices")
@js.native
object IEditorServices extends TopLevel[Token[IEditorServices]]

