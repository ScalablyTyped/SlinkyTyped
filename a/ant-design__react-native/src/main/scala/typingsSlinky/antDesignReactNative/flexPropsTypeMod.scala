package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`column-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`row-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`wrap-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.around
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.baseline
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.between
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.center
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.column
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.end
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.nowrap
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.row
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.start
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.stretch
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexPropsTypeMod {
  
  @js.native
  trait FlexItemPropsType extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
  }
  object FlexItemPropsType {
    
    @scala.inline
    def apply(): FlexItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexItemPropsType]
    }
    
    @scala.inline
    implicit class FlexItemPropsTypeMutableBuilder[Self <: FlexItemPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  @js.native
  trait FlexPropsType extends StObject {
    
    var align: js.UndefOr[start | center | end | baseline | stretch] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var justify: js.UndefOr[start | end | center | between | around] = js.native
    
    var wrap: js.UndefOr[
        nowrap | typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.wrap | `wrap-reverse`
      ] = js.native
  }
  object FlexPropsType {
    
    @scala.inline
    def apply(): FlexPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexPropsType]
    }
    
    @scala.inline
    implicit class FlexPropsTypeMutableBuilder[Self <: FlexPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: start | center | end | baseline | stretch): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDirection(value: row | `row-reverse` | column | `column-reverse`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setJustify(value: start | end | center | between | around): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      @scala.inline
      def setWrap(value: nowrap | wrap | `wrap-reverse`): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
