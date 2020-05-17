package typingsSlinky.jdenticon.mod.global

import typingsSlinky.jdenticon.anon.Color
import typingsSlinky.jdenticon.anon.Grayscale
import typingsSlinky.jdenticon.jdenticonStrings.never
import typingsSlinky.jdenticon.jdenticonStrings.observe
import typingsSlinky.jdenticon.jdenticonStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JdenticonConfig extends js.Object {
  /**
    * Specifies the background color to be rendered behind the icon.
    * 
    * Supported syntaxes are:
    *  * `"#rgb"`
    *  * `"#rgba"`
    *  * `"#rrggbb"`
    *  * `"#rrggbbaa"`
    */
  var backColor: js.UndefOr[String] = js.native
  /**
    * Limits the possible hues in generated icons. The hues are specified as an array of hues in degrees. If the
    * option is omitted or an empty array is specified, all hues are allowed.
    */
  var hues: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Specifies the lightness of the generated icon.
    */
  var lightness: js.UndefOr[Color] = js.native
  /**
    * Specifies the padding surrounding the icon in percents in the range [0.0, 0.5).
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * Specifies when icons will be rendered.
    * 
    *  * `"never"` – icons are never rendered automatically. You need to call `jdenticon.update()` manually to
    *    render identicons.
    * 
    *  * `"once"` – icons are rendered once the page has loaded. Any dynamically inserted or modified icons will
    *    not be rendered unless `jdenticon.update()` is manually called.
    * 
    *  * `"observe"` – icons are rendered upon page load, and the DOM is monitored for new icons using a 
    *    `MutationObserver`. Use this if icons are inserted dynamically, e.g. by using Angular, React or 
    *    VanillaJS. This option behaves as `"once"` in IE<11.
    * 
    * @remarks
    * This option has no effect in Node environments.
    */
  var replaceMode: js.UndefOr[never | once | observe] = js.native
  /**
    * Specifies the saturation of the generated icon.
    * 
    * For backward compatibility a single number can be specified instead of a `{ color, grayscale }`
    * object. This single number refers to the saturation of colored shapes.
    */
  var saturation: js.UndefOr[Grayscale | Double] = js.native
}

object JdenticonConfig {
  @scala.inline
  def apply(): JdenticonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JdenticonConfig]
  }
  @scala.inline
  implicit class JdenticonConfigOps[Self <: JdenticonConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hues")(js.undefined)
        ret
    }
    @scala.inline
    def withLightness(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightness")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceMode(value: never | once | observe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSaturation(value: Grayscale | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(js.undefined)
        ret
    }
  }
  
}

