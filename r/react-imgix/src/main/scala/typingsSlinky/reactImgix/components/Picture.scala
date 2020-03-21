package typingsSlinky.reactImgix.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLSourceElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.html.img.tag
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactImgix.mod.CommonProps
import typingsSlinky.reactImgix.mod.ImgixHTMLAttributes
import typingsSlinky.std.HTMLPictureElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Picture
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactImgix.mod.Picture] {
  @JSImport("react-imgix", "Picture")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    htmlAttributes: ImgixHTMLAttributes = null,
    onMounted: /* ref */ js.UndefOr[ReactRef[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactImgix.mod.Picture] = {
    val __obj = js.Dynamic.literal()
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (onMounted != null) __obj.updateDynamic("onMounted")(js.Any.fromFunction1(onMounted))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactImgix.mod.Picture] = new slinky.core.BuildingComponent[slinky.web.html.img.tag.type, typingsSlinky.reactImgix.mod.Picture](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PropsWithChildren[CommonProps]
}

