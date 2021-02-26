package typingsSlinky.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentExportResult extends StObject {
  
  /**
    * The template content.
    */
  var template: js.UndefOr[js.Any] = js.native
}
object DeploymentExportResult {
  
  @scala.inline
  def apply(): DeploymentExportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentExportResult]
  }
  
  @scala.inline
  implicit class DeploymentExportResultMutableBuilder[Self <: DeploymentExportResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: js.Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
