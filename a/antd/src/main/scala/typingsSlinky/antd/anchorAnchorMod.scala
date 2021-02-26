package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anon.ActiveLink
import typingsSlinky.antd.anon.Affix
import typingsSlinky.antd.anon.Href
import typingsSlinky.antd.anon.TypeofAnchorLink
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorAnchorMod {
  
  @JSImport("antd/lib/anchor/Anchor", JSImport.Default)
  @js.native
  class default () extends Anchor
  /* static members */
  object default {
    
    @JSImport("antd/lib/anchor/Anchor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/anchor/Anchor", "default.Link")
    @js.native
    def Link: Instantiable0[typingsSlinky.antd.anchorLinkMod.default] with TypeofAnchorLink = js.native
    @scala.inline
    def Link_=(x: Instantiable0[typingsSlinky.antd.anchorLinkMod.default] with TypeofAnchorLink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/anchor/Anchor", "default.contextType")
    @js.native
    def contextType: Context[ConfigConsumerProps] = js.native
    @scala.inline
    def contextType_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/anchor/Anchor", "default.defaultProps")
    @js.native
    def defaultProps: Affix = js.native
    @scala.inline
    def defaultProps_=(x: Affix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Anchor extends Component[AnchorProps, AnchorState, ConfigConsumerProps] {
    
    var animating: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAnchor(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAnchor(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAnchor(): Unit = js.native
    
    var content: ConfigConsumerProps = js.native
    
    def getContainer(): js.Any = js.native
    
    def getCurrentAnchor(): String = js.native
    def getCurrentAnchor(offsetTop: js.UndefOr[scala.Nothing], bounds: Double): String = js.native
    def getCurrentAnchor(offsetTop: Double): String = js.native
    def getCurrentAnchor(offsetTop: Double, bounds: Double): String = js.native
    
    def handleScroll(): Unit = js.native
    
    def handleScrollTo(link: String): Unit = js.native
    
    var inkNode: js.Any = js.native
    
    var links: js.Any = js.native
    
    var prefixCls: js.Any = js.native
    
    def registerLink(link: String): Unit = js.native
    
    def saveInkNode(node: HTMLSpanElement): Unit = js.native
    
    var scrollContainer: js.Any = js.native
    
    var scrollEvent: js.Any = js.native
    
    def setCurrentActiveLink(link: String): Unit = js.native
    
    @JSName("state")
    var state_Anchor: ActiveLink = js.native
    
    def unregisterLink(link: String): Unit = js.native
    
    def updateInk(): Unit = js.native
    
    var wrapperRef: js.Any = js.native
  }
  
  type AnchorContainer = HTMLElement | Window
  
  @js.native
  trait AnchorDefaultProps extends AnchorProps {
    
    @JSName("affix")
    var affix_AnchorDefaultProps: Boolean = js.native
    
    @JSName("getContainer")
    def getContainer_MAnchorDefaultProps(): AnchorContainer = js.native
    
    @JSName("prefixCls")
    var prefixCls_AnchorDefaultProps: String = js.native
    
    @JSName("showInkInFixed")
    var showInkInFixed_AnchorDefaultProps: Boolean = js.native
  }
  object AnchorDefaultProps {
    
    @scala.inline
    def apply(affix: Boolean, getContainer: () => AnchorContainer, prefixCls: String, showInkInFixed: Boolean): AnchorDefaultProps = {
      val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], getContainer = js.Any.fromFunction0(getContainer), prefixCls = prefixCls.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorDefaultProps]
    }
    
    @scala.inline
    implicit class AnchorDefaultPropsMutableBuilder[Self <: AnchorDefaultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffix(value: Boolean): Self = StObject.set(x, "affix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainer(value: () => AnchorContainer): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInkInFixed(value: Boolean): Self = StObject.set(x, "showInkInFixed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnchorProps extends StObject {
    
    var affix: js.UndefOr[Boolean] = js.native
    
    var bounds: js.UndefOr[Double] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var getContainer: js.UndefOr[js.Function0[AnchorContainer]] = js.native
    
    /** Return customize highlight anchor */
    var getCurrentAnchor: js.UndefOr[js.Function0[String]] = js.native
    
    var offsetTop: js.UndefOr[Double] = js.native
    
    /** Listening event when scrolling change active link */
    var onChange: js.UndefOr[js.Function1[/* currentActiveLink */ String, Unit]] = js.native
    
    var onClick: js.UndefOr[js.Function2[/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Href, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var showInkInFixed: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /** Scroll to target offset value, if none, it's offsetTop prop value or 0. */
    var targetOffset: js.UndefOr[Double] = js.native
  }
  object AnchorProps {
    
    @scala.inline
    def apply(): AnchorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorProps]
    }
    
    @scala.inline
    implicit class AnchorPropsMutableBuilder[Self <: AnchorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffix(value: Boolean): Self = StObject.set(x, "affix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixUndefined: Self = StObject.set(x, "affix", js.undefined)
      
      @scala.inline
      def setBounds(value: Double): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
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
      def setGetContainer(value: () => AnchorContainer): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setGetCurrentAnchor(value: () => String): Self = StObject.set(x, "getCurrentAnchor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentAnchorUndefined: Self = StObject.set(x, "getCurrentAnchor", js.undefined)
      
      @scala.inline
      def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* currentActiveLink */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Href) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShowInkInFixed(value: Boolean): Self = StObject.set(x, "showInkInFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInkInFixedUndefined: Self = StObject.set(x, "showInkInFixed", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTargetOffset(value: Double): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
    }
  }
  
  @js.native
  trait AnchorState extends StObject {
    
    var activeLink: Null | String = js.native
  }
  object AnchorState {
    
    @scala.inline
    def apply(): AnchorState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorState]
    }
    
    @scala.inline
    implicit class AnchorStateMutableBuilder[Self <: AnchorState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveLink(value: String): Self = StObject.set(x, "activeLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveLinkNull: Self = StObject.set(x, "activeLink", null)
    }
  }
  
  @js.native
  trait AntAnchor extends StObject {
    
    var activeLink: String | Null = js.native
    
    var onClick: js.UndefOr[js.Function2[/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Href, Unit]] = js.native
    
    def registerLink(link: String): Unit = js.native
    
    def scrollTo(link: String): Unit = js.native
    
    def unregisterLink(link: String): Unit = js.native
  }
  object AntAnchor {
    
    @scala.inline
    def apply(registerLink: String => Unit, scrollTo: String => Unit, unregisterLink: String => Unit): AntAnchor = {
      val __obj = js.Dynamic.literal(registerLink = js.Any.fromFunction1(registerLink), scrollTo = js.Any.fromFunction1(scrollTo), unregisterLink = js.Any.fromFunction1(unregisterLink))
      __obj.asInstanceOf[AntAnchor]
    }
    
    @scala.inline
    implicit class AntAnchorMutableBuilder[Self <: AntAnchor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveLink(value: String): Self = StObject.set(x, "activeLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveLinkNull: Self = StObject.set(x, "activeLink", null)
      
      @scala.inline
      def setOnClick(value: (/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Href) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRegisterLink(value: String => Unit): Self = StObject.set(x, "registerLink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollTo(value: String => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnregisterLink(value: String => Unit): Self = StObject.set(x, "unregisterLink", js.Any.fromFunction1(value))
    }
  }
}
