package typingsSlinky.reactNativeElements.mod

import typingsSlinky.reactNativeElements.reactNativeElementsStrings.android
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.default
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.ios
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBarWrapper extends StObject {
  
  /**
    * What style of search bar to display
    *
    * @default is 'default
    */
  var platform: js.UndefOr[default | ios | android] = js.native
}
object SearchBarWrapper {
  
  @scala.inline
  def apply(): SearchBarWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarWrapper]
  }
  
  @scala.inline
  implicit class SearchBarWrapperMutableBuilder[Self <: SearchBarWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatform(value: default | ios | android): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
