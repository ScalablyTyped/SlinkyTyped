package typingsSlinky.reactImgpro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactImgpro.AnonBlue
import typingsSlinky.reactImgpro.AnonDegree
import typingsSlinky.reactImgpro.AnonHeight
import typingsSlinky.reactImgpro.AnonHorizontal
import typingsSlinky.reactImgpro.mod.ReactImgpro.ProcessImageProps
import typingsSlinky.reactImgpro.mod.ReactImgpro.Shape
import typingsSlinky.reactImgpro.mod.ReactImgpro.Size
import typingsSlinky.reactImgpro.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImgpro
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-imgpro", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    image: String,
    onProcessFinish: () => Unit,
    blur: Int | Double = null,
    brightness: Int | Double = null,
    colors: AnonBlue = null,
    contain: Size = null,
    contrast: Int | Double = null,
    cover: Size = null,
    customCdn: String = null,
    disableRerender: js.UndefOr[Boolean] = js.undefined,
    disableWebWorker: js.UndefOr[Boolean] = js.undefined,
    dither565: js.UndefOr[Boolean] = js.undefined,
    fade: Int | Double = null,
    flip: AnonHorizontal = null,
    greyscale: js.UndefOr[Boolean] = js.undefined,
    invert: js.UndefOr[Boolean] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    opaque: js.UndefOr[Boolean] = js.undefined,
    posterize: Int | Double = null,
    quality: Int | Double = null,
    resize: Shape = null,
    rotate: AnonDegree = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    scaleToFitImage: AnonHeight = null,
    sepia: js.UndefOr[Boolean] = js.undefined,
    storage: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], onProcessFinish = js.Any.fromFunction0(onProcessFinish))
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (contain != null) __obj.updateDynamic("contain")(contain.asInstanceOf[js.Any])
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (cover != null) __obj.updateDynamic("cover")(cover.asInstanceOf[js.Any])
    if (customCdn != null) __obj.updateDynamic("customCdn")(customCdn.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRerender)) __obj.updateDynamic("disableRerender")(disableRerender.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWebWorker)) __obj.updateDynamic("disableWebWorker")(disableWebWorker.asInstanceOf[js.Any])
    if (!js.isUndefined(dither565)) __obj.updateDynamic("dither565")(dither565.asInstanceOf[js.Any])
    if (fade != null) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(greyscale)) __obj.updateDynamic("greyscale")(greyscale.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque.asInstanceOf[js.Any])
    if (posterize != null) __obj.updateDynamic("posterize")(posterize.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleToFitImage != null) __obj.updateDynamic("scaleToFitImage")(scaleToFitImage.asInstanceOf[js.Any])
    if (!js.isUndefined(sepia)) __obj.updateDynamic("sepia")(sepia.asInstanceOf[js.Any])
    if (!js.isUndefined(storage)) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ProcessImageProps
}

