package typingsSlinky.polymer.mod.global.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var hasNativeCSSProperties: Boolean = js.native
  var hasNativeImports: Boolean = js.native
  var hasShadow: Boolean = js.native
  var nativeShadow: Boolean = js.native
  var useNativeCSSProperties: Boolean = js.native
  var useNativeCustomElements: Boolean = js.native
  var useNativeImports: Boolean = js.native
  var useNativeShadow: Boolean = js.native
  var usePolyfillProto: Boolean = js.native
  var useShadow: Boolean = js.native
  var wantShadow: Boolean = js.native
}

object Settings {
  @scala.inline
  def apply(
    hasNativeCSSProperties: Boolean,
    hasNativeImports: Boolean,
    hasShadow: Boolean,
    nativeShadow: Boolean,
    useNativeCSSProperties: Boolean,
    useNativeCustomElements: Boolean,
    useNativeImports: Boolean,
    useNativeShadow: Boolean,
    usePolyfillProto: Boolean,
    useShadow: Boolean,
    wantShadow: Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(hasNativeCSSProperties = hasNativeCSSProperties.asInstanceOf[js.Any], hasNativeImports = hasNativeImports.asInstanceOf[js.Any], hasShadow = hasShadow.asInstanceOf[js.Any], nativeShadow = nativeShadow.asInstanceOf[js.Any], useNativeCSSProperties = useNativeCSSProperties.asInstanceOf[js.Any], useNativeCustomElements = useNativeCustomElements.asInstanceOf[js.Any], useNativeImports = useNativeImports.asInstanceOf[js.Any], useNativeShadow = useNativeShadow.asInstanceOf[js.Any], usePolyfillProto = usePolyfillProto.asInstanceOf[js.Any], useShadow = useShadow.asInstanceOf[js.Any], wantShadow = wantShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasNativeCSSProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNativeCSSProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNativeImports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNativeImports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseNativeCSSProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeCSSProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseNativeCustomElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeCustomElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseNativeImports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeImports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseNativeShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsePolyfillProto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePolyfillProto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWantShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wantShadow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

