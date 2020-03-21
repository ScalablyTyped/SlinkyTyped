package typingsSlinky.reactHelmet.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactHelmet.mod.BodyProps
import typingsSlinky.reactHelmet.mod.HelmetProps
import typingsSlinky.reactHelmet.mod.HelmetTags
import typingsSlinky.reactHelmet.mod.HtmlProps
import typingsSlinky.reactHelmet.mod.LinkProps
import typingsSlinky.reactHelmet.mod.MetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_HelmetProps607835572[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: async, defer, title */
  def apply(
    base: js.Any = null,
    bodyAttributes: BodyProps = null,
    defaultTitle: String = null,
    encodeSpecialCharacters: js.UndefOr[Boolean] = js.undefined,
    htmlAttributes: HtmlProps = null,
    link: js.Array[LinkProps] = null,
    meta: js.Array[MetaProps] = null,
    noscript: js.Array[_] = null,
    onChangeClientState: (/* newState */ js.Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags) => Unit = null,
    script: js.Array[_] = null,
    style: js.Array[_] = null,
    titleAttributes: js.Object = null,
    titleTemplate: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (bodyAttributes != null) __obj.updateDynamic("bodyAttributes")(bodyAttributes.asInstanceOf[js.Any])
    if (defaultTitle != null) __obj.updateDynamic("defaultTitle")(defaultTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeSpecialCharacters)) __obj.updateDynamic("encodeSpecialCharacters")(encodeSpecialCharacters.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (noscript != null) __obj.updateDynamic("noscript")(noscript.asInstanceOf[js.Any])
    if (onChangeClientState != null) __obj.updateDynamic("onChangeClientState")(js.Any.fromFunction3(onChangeClientState))
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (titleAttributes != null) __obj.updateDynamic("titleAttributes")(titleAttributes.asInstanceOf[js.Any])
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HelmetProps
}

