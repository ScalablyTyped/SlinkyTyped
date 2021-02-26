package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.all_
import typingsSlinky.reactNative.reactNativeStrings.balanced
import typingsSlinky.reactNative.reactNativeStrings.email
import typingsSlinky.reactNative.reactNativeStrings.highQuality
import typingsSlinky.reactNative.reactNativeStrings.link
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.phoneNumber
import typingsSlinky.reactNative.reactNativeStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextPropsAndroid extends StObject {
  
  /**
    * Determines the types of data converted to clickable URLs in the text element.
    * By default no data types are detected.
    */
  var dataDetectorType: js.UndefOr[Null | phoneNumber | link | email | none | all_] = js.native
  
  /**
    * Lets the user select text, to use the native copy and paste functionality.
    */
  var selectable: js.UndefOr[Boolean] = js.native
  
  /**
    * The highlight color of the text.
    */
  var selectionColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Set text break strategy on Android API Level 23+
    * default is `highQuality`.
    */
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.native
}
object TextPropsAndroid {
  
  @scala.inline
  def apply(): TextPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPropsAndroid]
  }
  
  @scala.inline
  implicit class TextPropsAndroidMutableBuilder[Self <: TextPropsAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataDetectorType(value: phoneNumber | link | email | none | all_): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
    
    @scala.inline
    def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    @scala.inline
    def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
  }
}
