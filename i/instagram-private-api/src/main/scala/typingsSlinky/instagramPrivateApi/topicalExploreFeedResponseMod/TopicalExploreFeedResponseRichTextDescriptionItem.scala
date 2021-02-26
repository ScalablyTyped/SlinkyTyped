package typingsSlinky.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseRichTextDescriptionItem extends StObject {
  
  var block_type: String = js.native
  
  var depth: Double = js.native
  
  var text_with_entities: TopicalExploreFeedResponseTextWithEntities = js.native
}
object TopicalExploreFeedResponseRichTextDescriptionItem {
  
  @scala.inline
  def apply(block_type: String, depth: Double, text_with_entities: TopicalExploreFeedResponseTextWithEntities): TopicalExploreFeedResponseRichTextDescriptionItem = {
    val __obj = js.Dynamic.literal(block_type = block_type.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], text_with_entities = text_with_entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseRichTextDescriptionItem]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseRichTextDescriptionItemMutableBuilder[Self <: TopicalExploreFeedResponseRichTextDescriptionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock_type(value: String): Self = StObject.set(x, "block_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_with_entities(value: TopicalExploreFeedResponseTextWithEntities): Self = StObject.set(x, "text_with_entities", value.asInstanceOf[js.Any])
  }
}
