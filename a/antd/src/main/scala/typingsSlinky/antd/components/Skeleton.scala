package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esSkeletonAvatarMod.SkeletonAvatarProps
import typingsSlinky.antd.esSkeletonMod.SkeletonProps
import typingsSlinky.antd.esSkeletonMod.default
import typingsSlinky.antd.esSkeletonParagraphMod.SkeletonParagraphProps
import typingsSlinky.antd.esSkeletonTitleMod.SkeletonTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className */
object Skeleton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esSkeletonMod.default].asInstanceOf[String | js.Object]
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    avatar: SkeletonAvatarProps | Boolean = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    paragraph: SkeletonParagraphProps | Boolean = null,
    prefixCls: String = null,
    title: SkeletonTitleProps | Boolean = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SkeletonProps
}

