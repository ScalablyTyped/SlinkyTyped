package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMPictureStroke
  extends CIMStroke
     with CIMSymbolLayerType {
  
  /**
    * The color substitutions for the picture.
    */
  var colorSubstitutions: js.UndefOr[js.Array[CIMColorSubstitution]] = js.native
  
  /**
    * How the image is resampled.
    */
  var textureFilter: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextureFilter * / any */ String
  ] = js.native
  
  /**
    * The color that is applied as a tint to the image. The color is applied to the whole image. When the tint is set to white the image appears with its native colors.
    */
  var tintColor: js.UndefOr[js.Array[Double]] = js.native
  
  @JSName("type")
  var type_CIMPictureStroke: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMPictureStroke = js.native
  
  /**
    * The image that is used in the symbol layer. Typically a base64 encoded image.
    */
  var url: js.UndefOr[String] = js.native
}
object CIMPictureStroke {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMPictureStroke): CIMPictureStroke = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMPictureStroke]
  }
  
  @scala.inline
  implicit class CIMPictureStrokeMutableBuilder[Self <: CIMPictureStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorSubstitutions(value: js.Array[CIMColorSubstitution]): Self = StObject.set(x, "colorSubstitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSubstitutionsUndefined: Self = StObject.set(x, "colorSubstitutions", js.undefined)
    
    @scala.inline
    def setColorSubstitutionsVarargs(value: CIMColorSubstitution*): Self = StObject.set(x, "colorSubstitutions", js.Array(value :_*))
    
    @scala.inline
    def setTextureFilter(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextureFilter * / any */ String
    ): Self = StObject.set(x, "textureFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureFilterUndefined: Self = StObject.set(x, "textureFilter", js.undefined)
    
    @scala.inline
    def setTintColor(value: js.Array[Double]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setTintColorVarargs(value: Double*): Self = StObject.set(x, "tintColor", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMPictureStroke): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
