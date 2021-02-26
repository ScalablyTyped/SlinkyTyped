package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a renderer factory.
  */
@js.native
trait IRendererFactory extends StObject {
  
  /**
    * Create a renderer which displays the mime data.
    *
    * @param options - The options used to render the data.
    */
  def createRenderer(options: IRendererOptions): IRenderer = js.native
  
  /**
    * The default rank of the factory.  If not given, defaults to 100.
    */
  val defaultRank: js.UndefOr[Double] = js.native
  
  /**
    * The mime types handled by this factory.
    */
  val mimeTypes: js.Array[String] = js.native
  
  /**
    * Whether the factory is a "safe" factory.
    *
    * #### Notes
    * A "safe" factory produces renderer widgets which can render
    * untrusted model data in a usable way. *All* renderers must
    * handle untrusted data safely, but some may simply failover
    * with a "Run cell to view output" message. A "safe" renderer
    * is an indication that its sanitized output will be useful.
    */
  val safe: Boolean = js.native
}
object IRendererFactory {
  
  @scala.inline
  def apply(createRenderer: IRendererOptions => IRenderer, mimeTypes: js.Array[String], safe: Boolean): IRendererFactory = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer), mimeTypes = mimeTypes.asInstanceOf[js.Any], safe = safe.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRendererFactory]
  }
  
  @scala.inline
  implicit class IRendererFactoryMutableBuilder[Self <: IRendererFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateRenderer(value: IRendererOptions => IRenderer): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultRank(value: Double): Self = StObject.set(x, "defaultRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRankUndefined: Self = StObject.set(x, "defaultRank", js.undefined)
    
    @scala.inline
    def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value :_*))
    
    @scala.inline
    def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
  }
}
