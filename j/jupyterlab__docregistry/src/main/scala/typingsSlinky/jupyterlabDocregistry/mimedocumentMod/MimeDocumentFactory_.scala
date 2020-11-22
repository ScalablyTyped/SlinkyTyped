package typingsSlinky.jupyterlabDocregistry.mimedocumentMod

import typingsSlinky.jupyterlabDocregistry.defaultMod.ABCWidgetFactory
import typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/docregistry/lib/mimedocument", "MimeDocumentFactory")
@js.native
class MimeDocumentFactory_ protected () extends ABCWidgetFactory[MimeDocument, IModel] {
  /**
    * Construct a new mimetype widget factory.
    */
  def this(options: IOptions[MimeDocument]) = this()
  
  var _dataType: js.Any = js.native
  
  var _fileType: js.Any = js.native
  
  var _renderTimeout: js.Any = js.native
  
  var _rendermime: js.Any = js.native
}
