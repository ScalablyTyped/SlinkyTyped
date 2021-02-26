package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagListMessage extends StObject {
  
  /**
    * A list of cost allocation tags as key-value pairs.
    */
  var TagList: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.TagList] = js.native
}
object TagListMessage {
  
  @scala.inline
  def apply(): TagListMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagListMessage]
  }
  
  @scala.inline
  implicit class TagListMessageMutableBuilder[Self <: TagListMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
