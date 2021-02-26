package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplacementTemplate extends StObject {
  
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var ReplacementTemplateData: js.UndefOr[EmailTemplateData] = js.native
}
object ReplacementTemplate {
  
  @scala.inline
  def apply(): ReplacementTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplacementTemplate]
  }
  
  @scala.inline
  implicit class ReplacementTemplateMutableBuilder[Self <: ReplacementTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplacementTemplateData(value: EmailTemplateData): Self = StObject.set(x, "ReplacementTemplateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementTemplateDataUndefined: Self = StObject.set(x, "ReplacementTemplateData", js.undefined)
  }
}
