package typingsSlinky.pulumiAws.inputMod.kinesisanalyticsv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationApplicationCodeConfiguration extends StObject {
  
  /**
    * The location and type of the application code.
    */
  var codeContent: js.UndefOr[
    Input[ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent]
  ] = js.native
  
  /**
    * Specifies whether the code content is in text or zip format. Valid values: `PLAINTEXT`, `ZIPFILE`.
    */
  var codeContentType: Input[String] = js.native
}
object ApplicationApplicationConfigurationApplicationCodeConfiguration {
  
  @scala.inline
  def apply(codeContentType: Input[String]): ApplicationApplicationConfigurationApplicationCodeConfiguration = {
    val __obj = js.Dynamic.literal(codeContentType = codeContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationApplicationCodeConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationApplicationCodeConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationApplicationCodeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeContent(value: Input[ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent]): Self = StObject.set(x, "codeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeContentType(value: Input[String]): Self = StObject.set(x, "codeContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeContentUndefined: Self = StObject.set(x, "codeContent", js.undefined)
  }
}
