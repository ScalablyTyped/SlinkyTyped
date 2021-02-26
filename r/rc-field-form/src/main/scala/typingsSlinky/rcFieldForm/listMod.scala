package typingsSlinky.rcFieldForm

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcFieldForm.interfaceMod.Meta
import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.interfaceMod.StoreValue
import typingsSlinky.rcFieldForm.interfaceMod.ValidatorRule
import typingsSlinky.rcFieldForm.rcFieldFormBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod extends Shortcut {
  
  @JSImport("rc-field-form/es/List", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ListProps] = js.native
  
  @js.native
  trait ListField extends StObject {
    
    var isListField: Boolean = js.native
    
    var key: Double = js.native
    
    var name: Double = js.native
  }
  object ListField {
    
    @scala.inline
    def apply(isListField: Boolean, key: Double, name: Double): ListField = {
      val __obj = js.Dynamic.literal(isListField = isListField.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListField]
    }
    
    @scala.inline
    implicit class ListFieldMutableBuilder[Self <: ListField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsListField(value: Boolean): Self = StObject.set(x, "isListField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListOperations extends StObject {
    
    def add(): Unit = js.native
    def add(defaultValue: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
    def add(defaultValue: StoreValue): Unit = js.native
    def add(defaultValue: StoreValue, index: Double): Unit = js.native
    
    def move(from: Double, to: Double): Unit = js.native
    
    def remove(index: js.Array[Double]): Unit = js.native
    def remove(index: Double): Unit = js.native
  }
  
  @js.native
  trait ListProps extends StObject {
    
    var children: js.UndefOr[
        js.Function3[
          /* fields */ js.Array[ListField], 
          /* operations */ ListOperations, 
          /* meta */ Meta, 
          ReactElement
        ]
      ] = js.native
    
    var initialValue: js.UndefOr[js.Array[_]] = js.native
    
    var name: NamePath = js.native
    
    var rules: js.UndefOr[js.Array[ValidatorRule]] = js.native
    
    var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
  }
  object ListProps {
    
    @scala.inline
    def apply(name: NamePath): ListProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(
        value: (/* fields */ js.Array[ListField], /* operations */ ListOperations, /* meta */ Meta) => ReactElement
      ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialValue(value: js.Array[_]): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setInitialValueVarargs(value: js.Any*): Self = StObject.set(x, "initialValue", js.Array(value :_*))
      
      @scala.inline
      def setName(value: NamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setRules(value: js.Array[ValidatorRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: ValidatorRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setValidateTrigger(value: String | js.Array[String] | `false`): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
      
      @scala.inline
      def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value :_*))
    }
  }
  
  type _To = ReactComponentClass[ListProps]
  
  /* This means you don't have to write `default`, but can instead just say `listMod.foo` */
  override def _to: ReactComponentClass[ListProps] = default
}
