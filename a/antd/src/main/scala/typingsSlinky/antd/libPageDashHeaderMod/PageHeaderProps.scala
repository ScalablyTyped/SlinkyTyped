package typingsSlinky.antd.libPageDashHeaderMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.libAvatarMod.AvatarProps
import typingsSlinky.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHeaderProps extends js.Object {
  var avatar: js.UndefOr[AvatarProps] = js.undefined
  var backIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var breadcrumb: js.UndefOr[BreadcrumbProps] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var extra: js.UndefOr[TagMod[Any]] = js.undefined
  var footer: js.UndefOr[TagMod[Any]] = js.undefined
  var ghost: js.UndefOr[Boolean] = js.undefined
  var onBack: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subTitle: js.UndefOr[TagMod[Any]] = js.undefined
  var tags: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
  var title: TagMod[Any]
}

object PageHeaderProps {
  @scala.inline
  def apply(
    title: TagMod[Any],
    avatar: AvatarProps = null,
    backIcon: TagMod[Any] = null,
    breadcrumb: BreadcrumbProps = null,
    className: String = null,
    extra: TagMod[Any] = null,
    footer: TagMod[Any] = null,
    ghost: js.UndefOr[Boolean] = js.undefined,
    onBack: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    subTitle: TagMod[Any] = null,
    tags: ReactElement | js.Array[ReactElement] = null
  ): PageHeaderProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (backIcon != null) __obj.updateDynamic("backIcon")(backIcon.asInstanceOf[js.Any])
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost.asInstanceOf[js.Any])
    if (onBack != null) __obj.updateDynamic("onBack")(js.Any.fromFunction1(onBack))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderProps]
  }
}

