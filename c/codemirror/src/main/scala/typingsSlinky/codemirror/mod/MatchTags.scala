package typingsSlinky.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchTags extends StObject {
  
  /**
    * Highlight both matching tags.
    */
  var bothTags: js.UndefOr[Boolean] = js.native
}
object MatchTags {
  
  @scala.inline
  def apply(): MatchTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchTags]
  }
  
  @scala.inline
  implicit class MatchTagsMutableBuilder[Self <: MatchTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBothTags(value: Boolean): Self = StObject.set(x, "bothTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBothTagsUndefined: Self = StObject.set(x, "bothTags", js.undefined)
  }
}
