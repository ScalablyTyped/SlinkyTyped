package typingsSlinky.reactNavigationStack.vendorTypesMod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.Animated.WithAnimatedValue
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackHeaderTitleProps extends StObject {
  
  /**
    * Whether title font should scale to respect Text Size accessibility settings.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  
  /**
    * Content of the title element. Usually the title string.
    */
  var children: js.UndefOr[String] = js.native
  
  /**
    * Callback to trigger when the size of the title element changes.
    */
  def onLayout(e: SyntheticEvent[NodeHandle, typingsSlinky.reactNative.anon.Layout]): Unit = js.native
  
  /**
    * Style object for the title element.
    */
  var style: js.UndefOr[WithAnimatedValue[StyleProp[TextStyle]]] = js.native
  
  /**
    * Tint color for the header.
    */
  var tintColor: js.UndefOr[String] = js.native
}
object StackHeaderTitleProps {
  
  @scala.inline
  def apply(onLayout: SyntheticEvent[NodeHandle, typingsSlinky.reactNative.anon.Layout] => Unit): StackHeaderTitleProps = {
    val __obj = js.Dynamic.literal(onLayout = js.Any.fromFunction1(onLayout))
    __obj.asInstanceOf[StackHeaderTitleProps]
  }
  
  @scala.inline
  implicit class StackHeaderTitlePropsMutableBuilder[Self <: StackHeaderTitleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    @scala.inline
    def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setOnLayout(value: SyntheticEvent[NodeHandle, typingsSlinky.reactNative.anon.Layout] => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
  }
}
