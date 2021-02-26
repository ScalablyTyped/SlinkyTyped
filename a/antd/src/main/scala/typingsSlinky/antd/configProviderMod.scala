package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.AutoComplete
import typingsSlinky.antd.anon.Ghost
import typingsSlinky.antd.anon.PartialConfigProviderProp
import typingsSlinky.antd.anon.Size
import typingsSlinky.antd.anon.ValidateMessages
import typingsSlinky.antd.anon.WeakValidationMapConfigPr
import typingsSlinky.antd.configProviderContextMod.CSPConfig
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.configProviderContextMod.DirectionType
import typingsSlinky.antd.configProviderSizeContextMod.SizeType
import typingsSlinky.antd.localeProviderMod.Locale
import typingsSlinky.antd.renderEmptyMod.RenderEmptyHandler
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configProviderMod {
  
  /* Inlined react.react.FC<antd.antd/lib/config-provider.ConfigProviderProps> & {  ConfigContext :react.react.Context<antd.antd/lib/config-provider/context.ConfigConsumerProps>} */
  object default {
    
    @JSImport("antd/lib/config-provider", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[ConfigProviderProps]): ReactElement | Null = js.native
    @JSImport("antd/lib/config-provider", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[ConfigProviderProps], context: js.Any): ReactElement | Null = js.native
    @JSImport("antd/lib/config-provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/config-provider", "default.ConfigContext")
    @js.native
    def ConfigContext: Context[ConfigConsumerProps] = js.native
    @scala.inline
    def ConfigContext_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConfigContext")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/config-provider", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/config-provider", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialConfigProviderProp] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialConfigProviderProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/config-provider", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/config-provider", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapConfigPr] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapConfigPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd/lib/config-provider", "ConfigConsumer")
  @js.native
  val ConfigConsumer: ReactComponentClass[ConsumerProps[ConfigConsumerProps]] = js.native
  
  @JSImport("antd/lib/config-provider", "ConfigContext")
  @js.native
  val ConfigContext: Context[ConfigConsumerProps] = js.native
  
  @JSImport("antd/lib/config-provider", "configConsumerProps")
  @js.native
  val configConsumerProps: js.Array[String] = js.native
  
  @js.native
  trait ConfigProviderProps extends StObject {
    
    var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var componentSize: js.UndefOr[SizeType] = js.native
    
    var csp: js.UndefOr[CSPConfig] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.native
    
    var form: js.UndefOr[ValidateMessages] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    
    var getTargetContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var input: js.UndefOr[AutoComplete] = js.native
    
    var locale: js.UndefOr[Locale] = js.native
    
    var pageHeader: js.UndefOr[Ghost] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.native
    
    var space: js.UndefOr[Size] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object ConfigProviderProps {
    
    @scala.inline
    def apply(): ConfigProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigProviderProps]
    }
    
    @scala.inline
    implicit class ConfigProviderPropsMutableBuilder[Self <: ConfigProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoInsertSpaceInButton(value: Boolean): Self = StObject.set(x, "autoInsertSpaceInButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoInsertSpaceInButtonUndefined: Self = StObject.set(x, "autoInsertSpaceInButton", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponentSize(value: SizeType): Self = StObject.set(x, "componentSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentSizeUndefined: Self = StObject.set(x, "componentSize", js.undefined)
      
      @scala.inline
      def setCsp(value: CSPConfig): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDropdownMatchSelectWidth(value: Boolean): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
      
      @scala.inline
      def setForm(value: ValidateMessages): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setGetTargetContainer(value: () => HTMLElement): Self = StObject.set(x, "getTargetContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTargetContainerUndefined: Self = StObject.set(x, "getTargetContainer", js.undefined)
      
      @scala.inline
      def setInput(value: AutoComplete): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPageHeader(value: Ghost): Self = StObject.set(x, "pageHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeaderUndefined: Self = StObject.set(x, "pageHeader", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderEmpty(value: /* componentName */ js.UndefOr[String] => ReactElement): Self = StObject.set(x, "renderEmpty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderEmptyUndefined: Self = StObject.set(x, "renderEmpty", js.undefined)
      
      @scala.inline
      def setSpace(value: Size): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
}
