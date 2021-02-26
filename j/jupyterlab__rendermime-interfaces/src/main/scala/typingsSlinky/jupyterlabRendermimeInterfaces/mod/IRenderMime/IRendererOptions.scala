package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to create a renderer.
  */
@js.native
trait IRendererOptions extends StObject {
  
  /**
    * The LaTeX typesetter.
    */
  var latexTypesetter: ILatexTypesetter | Null = js.native
  
  /**
    * An optional link handler.
    */
  var linkHandler: ILinkHandler | Null = js.native
  
  /**
    * The preferred mimeType to render.
    */
  var mimeType: String = js.native
  
  /**
    * An optional url resolver.
    */
  var resolver: IResolver | Null = js.native
  
  /**
    * The html sanitizer.
    */
  var sanitizer: ISanitizer = js.native
}
object IRendererOptions {
  
  @scala.inline
  def apply(mimeType: String, sanitizer: ISanitizer): IRendererOptions = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRendererOptions]
  }
  
  @scala.inline
  implicit class IRendererOptionsMutableBuilder[Self <: IRendererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatexTypesetter(value: ILatexTypesetter): Self = StObject.set(x, "latexTypesetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatexTypesetterNull: Self = StObject.set(x, "latexTypesetter", null)
    
    @scala.inline
    def setLinkHandler(value: ILinkHandler): Self = StObject.set(x, "linkHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkHandlerNull: Self = StObject.set(x, "linkHandler", null)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolver(value: IResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverNull: Self = StObject.set(x, "resolver", null)
    
    @scala.inline
    def setSanitizer(value: ISanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
  }
}
