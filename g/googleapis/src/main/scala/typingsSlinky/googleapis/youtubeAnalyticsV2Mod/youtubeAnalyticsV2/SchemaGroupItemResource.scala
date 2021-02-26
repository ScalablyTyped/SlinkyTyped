package typingsSlinky.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGroupItemResource extends StObject {
  
  /**
    * The channel, video, playlist, or asset ID that YouTube uses to uniquely
    * identify the item that is being added to the group.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies the type of resource being added to the group.  Valid values
    * for this property are:  * `youtube#channel`  * `youtube#playlist`  *
    * `youtube#video`  * `youtubePartner#asset`
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaGroupItemResource {
  
  @scala.inline
  def apply(): SchemaGroupItemResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupItemResource]
  }
  
  @scala.inline
  implicit class SchemaGroupItemResourceMutableBuilder[Self <: SchemaGroupItemResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
