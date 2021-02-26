package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typingsSlinky.jupyterlabRendermimeInterfaces.jupyterlabRendermimeInterfacesStrings.json
import typingsSlinky.jupyterlabRendermimeInterfaces.jupyterlabRendermimeInterfacesStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for using a RenderMime.IRenderer for output and read-only documents.
  */
@js.native
trait IExtension extends StObject {
  
  /**
    * Preferred data type from the model.  Defaults to `string`.
    */
  val dataType: js.UndefOr[string | json] = js.native
  
  /**
    * The options used to open a document with the renderer factory.
    */
  val documentWidgetFactoryOptions: js.UndefOr[IDocumentWidgetFactoryOptions | js.Array[IDocumentWidgetFactoryOptions]] = js.native
  
  /**
    * The optional file type associated with the extension.
    */
  val fileTypes: js.UndefOr[js.Array[IFileType]] = js.native
  
  /**
    * The ID of the extension.
    *
    * #### Notes
    * The convention for extension IDs in JupyterLab is the full NPM package
    * name followed by a colon and a unique string token, e.g.
    * `'@jupyterlab/apputils-extension:settings'` or `'foo-extension:bar'`.
    */
  val id: String = js.native
  
  /**
    * The rank passed to `RenderMime.addFactory`.  If not given,
    * defaults to the `defaultRank` of the factory.
    */
  val rank: js.UndefOr[Double] = js.native
  
  /**
    * The timeout after user activity to re-render the data.
    */
  val renderTimeout: js.UndefOr[Double] = js.native
  
  /**
    * A renderer factory to be registered to render the MIME type.
    */
  val rendererFactory: IRendererFactory = js.native
}
object IExtension {
  
  @scala.inline
  def apply(id: String, rendererFactory: IRendererFactory): IExtension = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rendererFactory = rendererFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtension]
  }
  
  @scala.inline
  implicit class IExtensionMutableBuilder[Self <: IExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: string | json): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDocumentWidgetFactoryOptions(value: IDocumentWidgetFactoryOptions | js.Array[IDocumentWidgetFactoryOptions]): Self = StObject.set(x, "documentWidgetFactoryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentWidgetFactoryOptionsUndefined: Self = StObject.set(x, "documentWidgetFactoryOptions", js.undefined)
    
    @scala.inline
    def setDocumentWidgetFactoryOptionsVarargs(value: IDocumentWidgetFactoryOptions*): Self = StObject.set(x, "documentWidgetFactoryOptions", js.Array(value :_*))
    
    @scala.inline
    def setFileTypes(value: js.Array[IFileType]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    @scala.inline
    def setFileTypesVarargs(value: IFileType*): Self = StObject.set(x, "fileTypes", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    @scala.inline
    def setRenderTimeout(value: Double): Self = StObject.set(x, "renderTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTimeoutUndefined: Self = StObject.set(x, "renderTimeout", js.undefined)
    
    @scala.inline
    def setRendererFactory(value: IRendererFactory): Self = StObject.set(x, "rendererFactory", value.asInstanceOf[js.Any])
  }
}
