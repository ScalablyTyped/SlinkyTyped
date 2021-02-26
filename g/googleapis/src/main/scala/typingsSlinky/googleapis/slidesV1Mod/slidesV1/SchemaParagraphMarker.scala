package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextElement kind that represents the beginning of a new paragraph.
  */
@js.native
trait SchemaParagraphMarker extends StObject {
  
  /**
    * The bullet for this paragraph. If not present, the paragraph does not
    * belong to a list.
    */
  var bullet: js.UndefOr[SchemaBullet] = js.native
  
  /**
    * The paragraph&#39;s style
    */
  var style: js.UndefOr[SchemaParagraphStyle] = js.native
}
object SchemaParagraphMarker {
  
  @scala.inline
  def apply(): SchemaParagraphMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraphMarker]
  }
  
  @scala.inline
  implicit class SchemaParagraphMarkerMutableBuilder[Self <: SchemaParagraphMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBullet(value: SchemaBullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
    
    @scala.inline
    def setStyle(value: SchemaParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
