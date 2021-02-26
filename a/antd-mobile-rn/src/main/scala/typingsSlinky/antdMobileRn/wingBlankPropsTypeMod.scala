package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.antdMobileRnStrings.lg
import typingsSlinky.antdMobileRn.antdMobileRnStrings.md
import typingsSlinky.antdMobileRn.antdMobileRnStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wingBlankPropsTypeMod {
  
  @js.native
  trait WingBlankPropsType extends StObject {
    
    var size: js.UndefOr[sm | md | lg] = js.native
  }
  object WingBlankPropsType {
    
    @scala.inline
    def apply(): WingBlankPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WingBlankPropsType]
    }
    
    @scala.inline
    implicit class WingBlankPropsTypeMutableBuilder[Self <: WingBlankPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
