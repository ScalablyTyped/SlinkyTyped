package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antDesignProLayout.anon.PageHeaderPropschildrenRe
import typingsSlinky.antDesignProLayout.anon.TabPanePropskeyReactTextu
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.antd.affixMod.AffixProps
import typingsSlinky.antd.avatarAvatarMod.AvatarProps
import typingsSlinky.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.antd.tabsMod.TabsProps
import typingsSlinky.rcTabs.interfaceMod.TabBarExtraContent
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageContainerMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/PageContainer", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PageContainerProps] = js.native
  
  /* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/lib/PageContainer.PageHeaderTabConfig */
  /* Inlined parent std.Omit<antd.antd/lib/page-header.PageHeaderProps, 'title'> */
  @js.native
  trait PageContainerProps extends StObject {
    
    /**
      * @name 固钉的配置
      * @description 与 antd 完全相同
      */
    var affixProps: js.UndefOr[AffixProps] = js.native
    
    var avatar: js.UndefOr[AvatarProps] = js.native
    
    var backIcon: js.UndefOr[ReactElement] = js.native
    
    var breadcrumb: js.UndefOr[BreadcrumbProps] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[ReactElement] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var extraContent: js.UndefOr[ReactElement] = js.native
    
    /**
      * @name 固定 PageHeader 到页面顶部
      * @deprecated 请使用 fixedHeader
      */
    var fixHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * @name 固定 PageHeader 到页面顶部
      */
    var fixedHeader: js.UndefOr[Boolean] = js.native
    
    var footer: js.UndefOr[js.Array[ReactElement]] = js.native
    
    /**
      * @name 是否显示背景色
      */
    var ghost: js.UndefOr[Boolean] = js.native
    
    /**
      * @name PageHeader 的配置
      * @description 与 antd 完全相同
      */
    var header: js.UndefOr[PageHeaderPropschildrenRe] = js.native
    
    /**
      * @name 是否加载
      * @description 只加载内容区域
      */
    var loading: js.UndefOr[Boolean] = js.native
    
    var onBack: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
    
    /**
      * @name tab 修改时触发
      */
    var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.native
    
    /**
      * @name 自定义 pageHeader
      */
    var pageHeaderRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactElement]]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subTitle: js.UndefOr[ReactElement] = js.native
    
    /**
      * @name 当前选中 tab 的 key
      */
    var tabActiveKey: js.UndefOr[String] = js.native
    
    /**
      * @name tab 上多余的区域
      */
    var tabBarExtraContent: js.UndefOr[TabBarExtraContent] = js.native
    
    /**
      * @name tabs 的列表
      */
    var tabList: js.UndefOr[js.Array[TabPanePropskeyReactTextu]] = js.native
    
    /**
      * @name tabs 的其他配置
      */
    var tabProps: js.UndefOr[TabsProps] = js.native
    
    var tags: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
    
    var title: js.UndefOr[ReactElement | `false`] = js.native
  }
  object PageContainerProps {
    
    @scala.inline
    def apply(): PageContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageContainerProps]
    }
    
    @scala.inline
    implicit class PageContainerPropsMutableBuilder[Self <: PageContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffixProps(value: AffixProps): Self = StObject.set(x, "affixProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixPropsUndefined: Self = StObject.set(x, "affixProps", js.undefined)
      
      @scala.inline
      def setAvatar(value: AvatarProps): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setBackIcon(value: ReactElement): Self = StObject.set(x, "backIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackIconReactElement(value: ReactElement): Self = StObject.set(x, "backIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackIconUndefined: Self = StObject.set(x, "backIcon", js.undefined)
      
      @scala.inline
      def setBreadcrumb(value: BreadcrumbProps): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraContent(value: ReactElement): Self = StObject.set(x, "extraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraContentReactElement(value: ReactElement): Self = StObject.set(x, "extraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraContentUndefined: Self = StObject.set(x, "extraContent", js.undefined)
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixHeaderUndefined: Self = StObject.set(x, "fixHeader", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Array[ReactElement]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFooterVarargs(value: ReactElement*): Self = StObject.set(x, "footer", js.Array(value :_*))
      
      @scala.inline
      def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      @scala.inline
      def setHeader(value: PageHeaderPropschildrenRe): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnBack(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
      
      @scala.inline
      def setOnTabChange(value: /* activeKey */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      @scala.inline
      def setPageHeaderRender(value: WithFalse[js.Function1[PageContainerProps, ReactElement]]): Self = StObject.set(x, "pageHeaderRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeaderRenderFunction1(value: PageContainerProps => ReactElement): Self = StObject.set(x, "pageHeaderRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageHeaderRenderUndefined: Self = StObject.set(x, "pageHeaderRender", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubTitle(value: ReactElement): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleReactElement(value: ReactElement): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setTabActiveKey(value: String): Self = StObject.set(x, "tabActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabActiveKeyUndefined: Self = StObject.set(x, "tabActiveKey", js.undefined)
      
      @scala.inline
      def setTabBarExtraContent(value: TabBarExtraContent): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarExtraContentReactElement(value: ReactElement): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
      
      @scala.inline
      def setTabList(value: js.Array[TabPanePropskeyReactTextu]): Self = StObject.set(x, "tabList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabListUndefined: Self = StObject.set(x, "tabList", js.undefined)
      
      @scala.inline
      def setTabListVarargs(value: TabPanePropskeyReactTextu*): Self = StObject.set(x, "tabList", js.Array(value :_*))
      
      @scala.inline
      def setTabProps(value: TabsProps): Self = StObject.set(x, "tabProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPropsUndefined: Self = StObject.set(x, "tabProps", js.undefined)
      
      @scala.inline
      def setTags(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsReactElement(value: ReactElement): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: ReactElement*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: ReactElement | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait PageHeaderTabConfig extends StObject {
    
    /**
      * @name 固定 PageHeader 到页面顶部
      * @deprecated 请使用 fixedHeader
      */
    var fixHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * @name 固定 PageHeader 到页面顶部
      */
    var fixedHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * @name tab 修改时触发
      */
    var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.native
    
    /**
      * @name 当前选中 tab 的 key
      */
    var tabActiveKey: js.UndefOr[String] = js.native
    
    /**
      * @name tab 上多余的区域
      */
    var tabBarExtraContent: js.UndefOr[TabBarExtraContent] = js.native
    
    /**
      * @name tabs 的列表
      */
    var tabList: js.UndefOr[js.Array[TabPanePropskeyReactTextu]] = js.native
    
    /**
      * @name tabs 的其他配置
      */
    var tabProps: js.UndefOr[TabsProps] = js.native
  }
  object PageHeaderTabConfig {
    
    @scala.inline
    def apply(): PageHeaderTabConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderTabConfig]
    }
    
    @scala.inline
    implicit class PageHeaderTabConfigMutableBuilder[Self <: PageHeaderTabConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixHeaderUndefined: Self = StObject.set(x, "fixHeader", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setOnTabChange(value: /* activeKey */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      @scala.inline
      def setTabActiveKey(value: String): Self = StObject.set(x, "tabActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabActiveKeyUndefined: Self = StObject.set(x, "tabActiveKey", js.undefined)
      
      @scala.inline
      def setTabBarExtraContent(value: TabBarExtraContent): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarExtraContentReactElement(value: ReactElement): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
      
      @scala.inline
      def setTabList(value: js.Array[TabPanePropskeyReactTextu]): Self = StObject.set(x, "tabList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabListUndefined: Self = StObject.set(x, "tabList", js.undefined)
      
      @scala.inline
      def setTabListVarargs(value: TabPanePropskeyReactTextu*): Self = StObject.set(x, "tabList", js.Array(value :_*))
      
      @scala.inline
      def setTabProps(value: TabsProps): Self = StObject.set(x, "tabProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPropsUndefined: Self = StObject.set(x, "tabProps", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PageContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `pageContainerMod.foo` */
  override def _to: ReactComponentClass[PageContainerProps] = default
}
