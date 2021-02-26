package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHumanTaskUiRequest extends StObject {
  
  /**
    * The name of the user interface you are creating.
    */
  var HumanTaskUiName: typingsSlinky.awsSdk.sagemakerMod.HumanTaskUiName = js.native
  
  /**
    * An array of key-value pairs that contain metadata to help you categorize and organize a human review workflow user interface. Each tag consists of a key and a value, both of which you define.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  var UiTemplate: typingsSlinky.awsSdk.sagemakerMod.UiTemplate = js.native
}
object CreateHumanTaskUiRequest {
  
  @scala.inline
  def apply(HumanTaskUiName: HumanTaskUiName, UiTemplate: UiTemplate): CreateHumanTaskUiRequest = {
    val __obj = js.Dynamic.literal(HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any], UiTemplate = UiTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHumanTaskUiRequest]
  }
  
  @scala.inline
  implicit class CreateHumanTaskUiRequestMutableBuilder[Self <: CreateHumanTaskUiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanTaskUiName(value: HumanTaskUiName): Self = StObject.set(x, "HumanTaskUiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUiTemplate(value: UiTemplate): Self = StObject.set(x, "UiTemplate", value.asInstanceOf[js.Any])
  }
}
