package typingsSlinky.babelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreserveComments extends StObject {
  
  var preserveComments: Boolean = js.native
}
object PreserveComments {
  
  @scala.inline
  def apply(preserveComments: Boolean): PreserveComments = {
    val __obj = js.Dynamic.literal(preserveComments = preserveComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveComments]
  }
  
  @scala.inline
  implicit class PreserveCommentsMutableBuilder[Self <: PreserveComments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreserveComments(value: Boolean): Self = StObject.set(x, "preserveComments", value.asInstanceOf[js.Any])
  }
}
