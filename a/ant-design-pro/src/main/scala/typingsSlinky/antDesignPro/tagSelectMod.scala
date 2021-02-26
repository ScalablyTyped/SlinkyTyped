package typingsSlinky.antDesignPro

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.anon.CollapseText
import typingsSlinky.antDesignPro.anon.TypeofTagSelectOption
import typingsSlinky.antDesignPro.tagSelectOptionMod.TagSelectOptionProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagSelectMod {
  
  @JSImport("ant-design-pro/lib/TagSelect", JSImport.Default)
  @js.native
  class default () extends TagSelect
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/TagSelect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/TagSelect", "default.Option")
    @js.native
    def Option: TypeofTagSelectOption = js.native
    @scala.inline
    def Option_=(x: TypeofTagSelectOption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TagSelect
    extends Component[TagSelectProps, js.Any, js.Any] {
    
    var children: ReactElement | js.Array[ReactElement] = js.native
  }
  
  @js.native
  trait TagSelectProps extends StObject {
    
    var Option: TagSelectOptionProps = js.native
    
    var actionsText: js.UndefOr[CollapseText] = js.native
    
    var children: ReactElement | js.Array[ReactElement] = js.native
    
    var className: String = js.native
    
    var expandable: js.UndefOr[Boolean] = js.native
    
    var hideCheckAll: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Array[String], Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var value: js.UndefOr[js.Array[Double | String]] = js.native
  }
  object TagSelectProps {
    
    @scala.inline
    def apply(Option: TagSelectOptionProps, children: ReactElement | js.Array[ReactElement], className: String): TagSelectProps = {
      val __obj = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagSelectProps]
    }
    
    @scala.inline
    implicit class TagSelectPropsMutableBuilder[Self <: TagSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionsText(value: CollapseText): Self = StObject.set(x, "actionsText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsTextUndefined: Self = StObject.set(x, "actionsText", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setHideCheckAll(value: Boolean): Self = StObject.set(x, "hideCheckAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideCheckAllUndefined: Self = StObject.set(x, "hideCheckAll", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.Array[String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOption(value: TagSelectOptionProps): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[Double | String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
