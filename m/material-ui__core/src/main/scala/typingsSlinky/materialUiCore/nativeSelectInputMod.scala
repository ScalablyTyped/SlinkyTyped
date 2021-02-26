package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.materialUiCore.anon.Node
import typingsSlinky.materialUiCore.materialUiCoreStrings.filled
import typingsSlinky.materialUiCore.materialUiCoreStrings.outlined
import typingsSlinky.materialUiCore.materialUiCoreStrings.standard
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSelectInputMod extends Shortcut {
  
  @JSImport("@material-ui/core/NativeSelect/NativeSelectInput", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NativeSelectInputProps] = js.native
  
  @js.native
  trait NativeSelectInputProps extends StObject {
    
    var IconComponent: js.UndefOr[ReactType[_]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | Node, Unit]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactElement, Unit]
      ] = js.native
    
    var value: js.UndefOr[(js.Array[String | Double | Boolean]) | String | Double | Boolean] = js.native
    
    var variant: js.UndefOr[standard | outlined | filled] = js.native
  }
  object NativeSelectInputProps {
    
    @scala.inline
    def apply(): NativeSelectInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeSelectInputProps]
    }
    
    @scala.inline
    implicit class NativeSelectInputPropsMutableBuilder[Self <: NativeSelectInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIconComponent(value: ReactType[_]): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconComponentUndefined: Self = StObject.set(x, "IconComponent", js.undefined)
      
      @scala.inline
      def setInputRef(value: /* ref */ HTMLSelectElement | Node => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactElement) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setValue(value: (js.Array[String | Double | Boolean]) | String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[NativeSelectInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `nativeSelectInputMod.foo` */
  override def _to: ReactComponentClass[NativeSelectInputProps] = default
}
