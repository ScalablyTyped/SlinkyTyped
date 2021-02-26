package typingsSlinky.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialTabProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapTabProps
import typingsSlinky.fundamentalReact.fundamentalReactStrings.Tab
import typingsSlinky.fundamentalReact.iconMod.IconGlyph
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Tabs/Tab.TabProps> & {  displayName :'Tab'} */
  object default {
    
    @JSImport("fundamental-react/lib/Tabs/Tab", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[TabProps]): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/Tabs/Tab", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[TabProps], context: js.Any): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/Tabs/Tab", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Tabs/Tab", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tabs/Tab", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTabProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tabs/Tab", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String | Tab] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String | Tab]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tabs/Tab", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTabProps] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TabProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var glyph: js.UndefOr[IconGlyph] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var linkProps: js.UndefOr[js.Any] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var tabContentProps: js.UndefOr[js.Any] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object TabProps {
    
    @scala.inline
    def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setGlyph(value: IconGlyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLinkProps(value: js.Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTabContentProps(value: js.Any): Self = StObject.set(x, "tabContentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabContentPropsUndefined: Self = StObject.set(x, "tabContentProps", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
