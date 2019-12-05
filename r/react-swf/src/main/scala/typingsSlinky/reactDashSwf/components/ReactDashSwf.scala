package typingsSlinky.reactDashSwf.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSwf.reactDashSwfMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashSwf
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-swf", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id, loop, src */
  def apply(
    align: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    base: String = null,
    bgcolor: String = null,
    flashVars: js.Object | String = null,
    fullScreenAspectRatio: String = null,
    height: Int | Double = null,
    menu: js.UndefOr[Boolean] = js.undefined,
    play: js.UndefOr[Boolean] = js.undefined,
    pluginspage: String = null,
    quality: String = null,
    salign: String = null,
    scale: String = null,
    width: Int | Double = null,
    wmode: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (flashVars != null) __obj.updateDynamic("flashVars")(flashVars.asInstanceOf[js.Any])
    if (fullScreenAspectRatio != null) __obj.updateDynamic("fullScreenAspectRatio")(fullScreenAspectRatio.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(menu)) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play.asInstanceOf[js.Any])
    if (pluginspage != null) __obj.updateDynamic("pluginspage")(pluginspage.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (salign != null) __obj.updateDynamic("salign")(salign.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wmode != null) __obj.updateDynamic("wmode")(wmode.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashSwf.reactDashSwfMod.rswf.Props
}

