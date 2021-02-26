package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The quick replies response message.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies extends StObject {
  
  /**
    * Optional. The collection of quick replies.
    */
  var quickReplies: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The title of the collection of quick replies.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageQuickRepliesMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuickReplies(value: js.Array[String]): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
    
    @scala.inline
    def setQuickRepliesVarargs(value: String*): Self = StObject.set(x, "quickReplies", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
