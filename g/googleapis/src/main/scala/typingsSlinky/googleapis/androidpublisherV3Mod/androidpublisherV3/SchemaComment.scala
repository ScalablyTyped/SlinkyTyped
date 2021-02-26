package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaComment extends StObject {
  
  /**
    * A comment from a developer.
    */
  var developerComment: js.UndefOr[SchemaDeveloperComment] = js.native
  
  /**
    * A comment from a user.
    */
  var userComment: js.UndefOr[SchemaUserComment] = js.native
}
object SchemaComment {
  
  @scala.inline
  def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  @scala.inline
  implicit class SchemaCommentMutableBuilder[Self <: SchemaComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperComment(value: SchemaDeveloperComment): Self = StObject.set(x, "developerComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperCommentUndefined: Self = StObject.set(x, "developerComment", js.undefined)
    
    @scala.inline
    def setUserComment(value: SchemaUserComment): Self = StObject.set(x, "userComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCommentUndefined: Self = StObject.set(x, "userComment", js.undefined)
  }
}
