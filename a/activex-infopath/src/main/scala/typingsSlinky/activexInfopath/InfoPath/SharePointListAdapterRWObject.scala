package typingsSlinky.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharePointListAdapterRWObject extends StObject {
  
  var ContentTypeId: String = js.native
  
  @JSName("InfoPath.SharePointListAdapterRWObject_typekey")
  var InfoPathDotSharePointListAdapterRWObject_typekey: SharePointListAdapterRWObject = js.native
  
  var ListId: String = js.native
  
  val Name: String = js.native
  
  def Query(): Unit = js.native
  
  val QueryAllowed: Boolean = js.native
  
  var SiteUrl: String = js.native
  
  def Submit(): Unit = js.native
  
  val SubmitAllowed: Boolean = js.native
}
object SharePointListAdapterRWObject {
  
  @scala.inline
  def apply(
    ContentTypeId: String,
    InfoPathDotSharePointListAdapterRWObject_typekey: SharePointListAdapterRWObject,
    ListId: String,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    SiteUrl: String,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): SharePointListAdapterRWObject = {
    val __obj = js.Dynamic.literal(ContentTypeId = ContentTypeId.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], SiteUrl = SiteUrl.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SharePointListAdapterRWObject_typekey")(InfoPathDotSharePointListAdapterRWObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePointListAdapterRWObject]
  }
  
  @scala.inline
  implicit class SharePointListAdapterRWObjectMutableBuilder[Self <: SharePointListAdapterRWObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentTypeId(value: String): Self = StObject.set(x, "ContentTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSharePointListAdapterRWObject_typekey(value: SharePointListAdapterRWObject): Self = StObject.set(x, "InfoPath.SharePointListAdapterRWObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUrl(value: String): Self = StObject.set(x, "SiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
  }
}
