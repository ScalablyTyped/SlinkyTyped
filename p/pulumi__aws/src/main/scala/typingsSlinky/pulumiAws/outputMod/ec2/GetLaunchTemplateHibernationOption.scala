package typingsSlinky.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchTemplateHibernationOption extends StObject {
  
  var configured: Boolean = js.native
}
object GetLaunchTemplateHibernationOption {
  
  @scala.inline
  def apply(configured: Boolean): GetLaunchTemplateHibernationOption = {
    val __obj = js.Dynamic.literal(configured = configured.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateHibernationOption]
  }
  
  @scala.inline
  implicit class GetLaunchTemplateHibernationOptionMutableBuilder[Self <: GetLaunchTemplateHibernationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigured(value: Boolean): Self = StObject.set(x, "configured", value.asInstanceOf[js.Any])
  }
}
