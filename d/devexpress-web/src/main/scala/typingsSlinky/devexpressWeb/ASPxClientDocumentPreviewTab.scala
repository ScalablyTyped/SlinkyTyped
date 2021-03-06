package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxClientDocumentPreviewTab extends StObject {
  
  var active: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  
  var model: js.Any = js.native
  
  var template: String = js.native
  
  var text: String = js.native
  
  var visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
}
object ASPxClientDocumentPreviewTab {
  
  @scala.inline
  def apply(
    active: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    model: js.Any,
    template: String,
    text: String,
    visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  ): ASPxClientDocumentPreviewTab = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDocumentPreviewTab]
  }
  
  @scala.inline
  implicit class ASPxClientDocumentPreviewTabMutableBuilder[Self <: ASPxClientDocumentPreviewTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
