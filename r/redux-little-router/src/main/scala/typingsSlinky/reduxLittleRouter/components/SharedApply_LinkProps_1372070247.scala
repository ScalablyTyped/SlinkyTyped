package typingsSlinky.reduxLittleRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.reduxLittleRouter.AnonPayload
import typingsSlinky.reduxLittleRouter.mod.Href
import typingsSlinky.reduxLittleRouter.mod.LinkProps
import typingsSlinky.reduxLittleRouter.mod.Location
import typingsSlinky.reduxLittleRouter.mod.LocationOptions
import typingsSlinky.reduxLittleRouter.mod.ObjectLiteral
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_LinkProps_1372070247[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, target */
  def apply(
    href: Href,
    activeProps: ObjectLiteral[_] = null,
    location: Location = null,
    onClick: /* event */ Event_ => _ = null,
    persistQuery: js.UndefOr[Boolean] = js.undefined,
    push: (/* href */ Href, /* options */ LocationOptions) => AnonPayload = null,
    replace: (/* href */ Href, /* options */ LocationOptions) => AnonPayload = null,
    replaceState: js.UndefOr[Boolean] = js.undefined,
    style: ObjectLiteral[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (activeProps != null) __obj.updateDynamic("activeProps")(activeProps.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(persistQuery)) __obj.updateDynamic("persistQuery")(persistQuery.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction2(push))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction2(replace))
    if (!js.isUndefined(replaceState)) __obj.updateDynamic("replaceState")(replaceState.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LinkProps
}

