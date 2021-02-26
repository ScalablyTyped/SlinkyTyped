package typingsSlinky.rcSelect

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.rcSelect.generatorMod.Key
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optGroupMod extends Shortcut {
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select/lib/OptGroup", JSImport.Default)
  @js.native
  val default: OptionGroupFC = js.native
  
  /* Inlined parent std.Omit<rc-select.rc-select/lib/interface.OptionGroupData, 'options'> */
  @js.native
  trait OptGroupProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object OptGroupProps {
    
    @scala.inline
    def apply(): OptGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptGroupProps]
    }
    
    @scala.inline
    implicit class OptGroupPropsMutableBuilder[Self <: OptGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait OptionGroupFC extends FunctionComponent[OptGroupProps] {
    
    /** Legacy for check if is a Option Group */
    var isSelectOptGroup: Boolean = js.native
  }
  
  type _To = OptionGroupFC
  
  /* This means you don't have to write `default`, but can instead just say `optGroupMod.foo` */
  override def _to: OptionGroupFC = default
}
