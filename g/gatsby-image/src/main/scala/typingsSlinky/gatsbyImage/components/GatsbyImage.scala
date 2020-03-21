package typingsSlinky.gatsbyImage.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.gatsbyImage.AnonWasCached
import typingsSlinky.gatsbyImage.gatsbyImageStrings.`lazy`
import typingsSlinky.gatsbyImage.gatsbyImageStrings.auto
import typingsSlinky.gatsbyImage.gatsbyImageStrings.eager
import typingsSlinky.gatsbyImage.mod.FixedObject
import typingsSlinky.gatsbyImage.mod.FluidObject
import typingsSlinky.gatsbyImage.mod.GatsbyImageProps
import typingsSlinky.gatsbyImage.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GatsbyImage
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("gatsby-image", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: alt, draggable, title */
  def apply(
    Tag: String = null,
    backgroundColor: String | Boolean = null,
    className: String | js.Object = null,
    critical: js.UndefOr[Boolean] = js.undefined,
    crossOrigin: String | Boolean = null,
    durationFadeIn: Int | Double = null,
    fadeIn: js.UndefOr[Boolean] = js.undefined,
    fixed: FixedObject | js.Array[FixedObject] = null,
    fluid: FluidObject | js.Array[FluidObject] = null,
    imgStyle: js.Object = null,
    itemProp: String = null,
    loading: auto | `lazy` | eager = null,
    onError: /* event */ js.Any => Unit = null,
    onLoad: () => Unit = null,
    onStartLoad: /* param */ AnonWasCached => Unit = null,
    placeholderClassName: String = null,
    placeholderStyle: js.Object = null,
    resolutions: FixedObject = null,
    sizes: FluidObject = null,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(critical)) __obj.updateDynamic("critical")(critical.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (durationFadeIn != null) __obj.updateDynamic("durationFadeIn")(durationFadeIn.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeIn)) __obj.updateDynamic("fadeIn")(fadeIn.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (fluid != null) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (imgStyle != null) __obj.updateDynamic("imgStyle")(imgStyle.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onStartLoad != null) __obj.updateDynamic("onStartLoad")(js.Any.fromFunction1(onStartLoad))
    if (placeholderClassName != null) __obj.updateDynamic("placeholderClassName")(placeholderClassName.asInstanceOf[js.Any])
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.gatsbyImage.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = GatsbyImageProps
}

