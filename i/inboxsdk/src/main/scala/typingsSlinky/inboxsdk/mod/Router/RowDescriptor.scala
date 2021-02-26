package typingsSlinky.inboxsdk.mod.Router

import typingsSlinky.inboxsdk.mod.Lists.LabelDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowDescriptor extends StObject {
  
  var body: String = js.native
  
  var iconClass: js.UndefOr[String] = js.native
  
  var iconHtml: js.UndefOr[String] = js.native
  
  var iconUrl: js.UndefOr[String] = js.native
  
  var isRead: String = js.native
  
  var labels: js.Array[LabelDescriptor] = js.native
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var routeID: js.UndefOr[String] = js.native
  
  var routeParams: js.UndefOr[js.Array[String]] = js.native
  
  var shortDetailText: String = js.native
  
  var title: String = js.native
}
object RowDescriptor {
  
  @scala.inline
  def apply(
    body: String,
    isRead: String,
    labels: js.Array[LabelDescriptor],
    shortDetailText: String,
    title: String
  ): RowDescriptor = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isRead = isRead.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], shortDetailText = shortDetailText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDescriptor]
  }
  
  @scala.inline
  implicit class RowDescriptorMutableBuilder[Self <: RowDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setIconHtml(value: String): Self = StObject.set(x, "iconHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconHtmlUndefined: Self = StObject.set(x, "iconHtml", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setIsRead(value: String): Self = StObject.set(x, "isRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Array[LabelDescriptor]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: LabelDescriptor*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setRouteID(value: String): Self = StObject.set(x, "routeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteIDUndefined: Self = StObject.set(x, "routeID", js.undefined)
    
    @scala.inline
    def setRouteParams(value: js.Array[String]): Self = StObject.set(x, "routeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteParamsUndefined: Self = StObject.set(x, "routeParams", js.undefined)
    
    @scala.inline
    def setRouteParamsVarargs(value: String*): Self = StObject.set(x, "routeParams", js.Array(value :_*))
    
    @scala.inline
    def setShortDetailText(value: String): Self = StObject.set(x, "shortDetailText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
