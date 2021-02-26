package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.avatarAvatarMod.AvatarProps
import typingsSlinky.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageHeaderMod extends Shortcut {
  
  @JSImport("antd/lib/page-header", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PageHeaderProps] = js.native
  
  @js.native
  trait PageHeaderProps extends StObject {
    
    var avatar: js.UndefOr[AvatarProps] = js.native
    
    var backIcon: js.UndefOr[ReactElement] = js.native
    
    var breadcrumb: js.UndefOr[BreadcrumbProps] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var footer: js.UndefOr[ReactElement] = js.native
    
    var ghost: js.UndefOr[Boolean] = js.native
    
    var onBack: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subTitle: js.UndefOr[ReactElement] = js.native
    
    var tags: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
    
    var title: ReactElement = js.native
  }
  object PageHeaderProps {
    
    @scala.inline
    def apply(): PageHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    @scala.inline
    implicit class PageHeaderPropsMutableBuilder[Self <: PageHeaderProps] (val x: Self) extends AnyVal {
      
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
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFooter(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterReactElement(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      @scala.inline
      def setOnBack(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
      
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
      def setTags(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsReactElement(value: ReactElement): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: ReactElement*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PageHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `pageHeaderMod.foo` */
  override def _to: ReactComponentClass[PageHeaderProps] = default
}
