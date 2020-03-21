package typingsSlinky.reactImgix.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactImgix.mod.BackgroundProps
import typingsSlinky.reactImgix.mod.ImgixHTMLAttributes
import typingsSlinky.reactImgix.mod.ImigixParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Background
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-imgix", "Background")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    src: String,
    disableLibraryParam: js.UndefOr[Boolean] = js.undefined,
    htmlAttributes: ImgixHTMLAttributes = null,
    imgixParams: ImigixParams = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLibraryParam)) __obj.updateDynamic("disableLibraryParam")(disableLibraryParam.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (imgixParams != null) __obj.updateDynamic("imgixParams")(imgixParams.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PropsWithChildren[BackgroundProps]
}

