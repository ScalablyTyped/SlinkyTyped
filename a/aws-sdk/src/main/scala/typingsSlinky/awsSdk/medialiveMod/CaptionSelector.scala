package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionSelector extends StObject {
  
  /**
    * When specified this field indicates the three letter language code of the caption track to extract from the source.
    */
  var LanguageCode: js.UndefOr[string] = js.native
  
  /**
    * Name identifier for a caption selector.  This name is used to associate this caption selector with one or more caption descriptions.  Names must be unique within an event.
    */
  var Name: stringMin1 = js.native
  
  /**
    * Caption selector settings.
    */
  var SelectorSettings: js.UndefOr[CaptionSelectorSettings] = js.native
}
object CaptionSelector {
  
  @scala.inline
  def apply(Name: stringMin1): CaptionSelector = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSelector]
  }
  
  @scala.inline
  implicit class CaptionSelectorMutableBuilder[Self <: CaptionSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: string): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setName(value: stringMin1): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSettings(value: CaptionSelectorSettings): Self = StObject.set(x, "SelectorSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSettingsUndefined: Self = StObject.set(x, "SelectorSettings", js.undefined)
  }
}
