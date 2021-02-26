package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotImage extends StObject {
  
  /** The height of the image. */
  var height: js.UndefOr[Double] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#snapshotImage`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The MIME type of the image. */
  var mime_type: js.UndefOr[String] = js.native
  
  /** The URL of the image. This URL may be invalidated at any time and should not be cached. */
  var url: js.UndefOr[String] = js.native
  
  /** The width of the image. */
  var width: js.UndefOr[Double] = js.native
}
object SnapshotImage {
  
  @scala.inline
  def apply(): SnapshotImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotImage]
  }
  
  @scala.inline
  implicit class SnapshotImageMutableBuilder[Self <: SnapshotImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMime_typeUndefined: Self = StObject.set(x, "mime_type", js.undefined)
    
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
