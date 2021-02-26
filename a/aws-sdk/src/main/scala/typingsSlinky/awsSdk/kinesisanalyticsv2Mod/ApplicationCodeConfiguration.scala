package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCodeConfiguration extends StObject {
  
  /**
    * The location and type of the application code.
    */
  var CodeContent: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CodeContent] = js.native
  
  /**
    * Specifies whether the code content is in text or zip format.
    */
  var CodeContentType: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CodeContentType = js.native
}
object ApplicationCodeConfiguration {
  
  @scala.inline
  def apply(CodeContentType: CodeContentType): ApplicationCodeConfiguration = {
    val __obj = js.Dynamic.literal(CodeContentType = CodeContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCodeConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationCodeConfigurationMutableBuilder[Self <: ApplicationCodeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeContent(value: CodeContent): Self = StObject.set(x, "CodeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeContentType(value: CodeContentType): Self = StObject.set(x, "CodeContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeContentUndefined: Self = StObject.set(x, "CodeContent", js.undefined)
  }
}
