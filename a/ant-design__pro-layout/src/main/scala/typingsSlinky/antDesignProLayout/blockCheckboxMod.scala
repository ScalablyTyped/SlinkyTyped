package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antDesignProLayout.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockCheckboxMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/BlockCheckbox", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BlockCheckboxProps] = js.native
  
  @js.native
  trait BlockCheckboxProps extends StObject {
    
    var configType: String = js.native
    
    var list: js.UndefOr[js.Array[Key]] = js.native
    
    def onChange(key: String): Unit = js.native
    
    var prefixCls: String = js.native
    
    var value: String = js.native
  }
  object BlockCheckboxProps {
    
    @scala.inline
    def apply(configType: String, onChange: String => Unit, prefixCls: String, value: String): BlockCheckboxProps = {
      val __obj = js.Dynamic.literal(configType = configType.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockCheckboxProps]
    }
    
    @scala.inline
    implicit class BlockCheckboxPropsMutableBuilder[Self <: BlockCheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigType(value: String): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList(value: js.Array[Key]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setListVarargs(value: Key*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[BlockCheckboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `blockCheckboxMod.foo` */
  override def _to: ReactComponentClass[BlockCheckboxProps] = default
}
