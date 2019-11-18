package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esAvatarMod.AvatarProps
import typingsSlinky.antd.esBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.antd.esPageDashHeaderMod.PageHeaderProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_PageHeaderProps_538936525 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  def apply(
    title: TagMod[Any],
    avatar: AvatarProps = null,
    backIcon: TagMod[Any] = null,
    breadcrumb: BreadcrumbProps = null,
    extra: TagMod[Any] = null,
    footer: TagMod[Any] = null,
    ghost: js.UndefOr[Boolean] = js.undefined,
    onBack: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    subTitle: TagMod[Any] = null,
    tags: ReactElement | js.Array[ReactElement] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (backIcon != null) __obj.updateDynamic("backIcon")(backIcon.asInstanceOf[js.Any])
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost.asInstanceOf[js.Any])
    if (onBack != null) __obj.updateDynamic("onBack")(js.Any.fromFunction1(onBack))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PageHeaderProps
}

