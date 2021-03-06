package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageAsset extends StObject {
  
  /** The height of the asset. */
  var height: js.UndefOr[Double] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#imageAsset`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The name of the asset. */
  var name: js.UndefOr[String] = js.native
  
  /** The URL of the asset. */
  var url: js.UndefOr[String] = js.native
  
  /** The width of the asset. */
  var width: js.UndefOr[Double] = js.native
}
object ImageAsset {
  
  @scala.inline
  def apply(): ImageAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAsset]
  }
  
  @scala.inline
  implicit class ImageAssetMutableBuilder[Self <: ImageAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
