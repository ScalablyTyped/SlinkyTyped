package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashSymbolInstance extends js.Object {
  var accName: String = js.native
  var actionScript: String = js.native
  var backgroundColor: String = js.native
  var bitmapRenderMode: String = js.native
  var blendMode: String = js.native
  var buttonTracking: String = js.native
  var cacheAsBitmap: Boolean = js.native
  var colorAlphaAmount: Double = js.native
  var colorAlphaPercent: Double = js.native
  var colorBlueAmount: Double = js.native
  var colorBluePercent: Double = js.native
  var colorGreenAmount: Double = js.native
  var colorGreenPercent: Double = js.native
  var colorMode: String = js.native
  var colorRedAmount: Double = js.native
  var colorRedPercent: Double = js.native
  var description: String = js.native
  var filters: js.Array[FlashFilter] = js.native
  var firstFrame: Double = js.native
  var forceSimple: Boolean = js.native
  var loop: String = js.native
  var shortcut: String = js.native
  var silent: Boolean = js.native
  var symbolType: String = js.native
  var tabIndex: Double = js.native
  var useBackgroundColor: Boolean = js.native
  var visible: Boolean = js.native
}

object FlashSymbolInstance {
  @scala.inline
  def apply(
    accName: String,
    actionScript: String,
    backgroundColor: String,
    bitmapRenderMode: String,
    blendMode: String,
    buttonTracking: String,
    cacheAsBitmap: Boolean,
    colorAlphaAmount: Double,
    colorAlphaPercent: Double,
    colorBlueAmount: Double,
    colorBluePercent: Double,
    colorGreenAmount: Double,
    colorGreenPercent: Double,
    colorMode: String,
    colorRedAmount: Double,
    colorRedPercent: Double,
    description: String,
    filters: js.Array[FlashFilter],
    firstFrame: Double,
    forceSimple: Boolean,
    loop: String,
    shortcut: String,
    silent: Boolean,
    symbolType: String,
    tabIndex: Double,
    useBackgroundColor: Boolean,
    visible: Boolean
  ): FlashSymbolInstance = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], actionScript = actionScript.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bitmapRenderMode = bitmapRenderMode.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], buttonTracking = buttonTracking.asInstanceOf[js.Any], cacheAsBitmap = cacheAsBitmap.asInstanceOf[js.Any], colorAlphaAmount = colorAlphaAmount.asInstanceOf[js.Any], colorAlphaPercent = colorAlphaPercent.asInstanceOf[js.Any], colorBlueAmount = colorBlueAmount.asInstanceOf[js.Any], colorBluePercent = colorBluePercent.asInstanceOf[js.Any], colorGreenAmount = colorGreenAmount.asInstanceOf[js.Any], colorGreenPercent = colorGreenPercent.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], colorRedAmount = colorRedAmount.asInstanceOf[js.Any], colorRedPercent = colorRedPercent.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], firstFrame = firstFrame.asInstanceOf[js.Any], forceSimple = forceSimple.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], useBackgroundColor = useBackgroundColor.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashSymbolInstance]
  }
  @scala.inline
  implicit class FlashSymbolInstanceOps[Self <: FlashSymbolInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitmapRenderMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmapRenderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTracking(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheAsBitmap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheAsBitmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorAlphaAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAlphaAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorAlphaPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAlphaPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorBlueAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBlueAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorBluePercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBluePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorGreenAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorGreenAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorGreenPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorGreenPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorRedAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRedAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorRedPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRedPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[FlashFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstFrame(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceSimple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSimple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseBackgroundColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

