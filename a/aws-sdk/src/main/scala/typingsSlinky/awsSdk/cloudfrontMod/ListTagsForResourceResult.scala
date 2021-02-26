package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceResult extends StObject {
  
  /**
    *  A complex type that contains zero or more Tag elements.
    */
  var Tags: typingsSlinky.awsSdk.cloudfrontMod.Tags = js.native
}
object ListTagsForResourceResult {
  
  @scala.inline
  def apply(Tags: Tags): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
  
  @scala.inline
  implicit class ListTagsForResourceResultMutableBuilder[Self <: ListTagsForResourceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
