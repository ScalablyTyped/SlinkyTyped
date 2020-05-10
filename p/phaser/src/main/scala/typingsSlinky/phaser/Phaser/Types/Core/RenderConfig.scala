package typingsSlinky.phaser.Phaser.Types.Core

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderConfig extends js.Object {
  /**
    * When set to `true`, WebGL uses linear interpolation to draw scaled or rotated textures, giving a smooth appearance. When set to `false`, WebGL uses nearest-neighbor interpolation, giving a crisper appearance. `false` also disables antialiasing of the game canvas itself, if the browser supports it, when the game canvas is scaled.
    */
  var antialias: js.UndefOr[Boolean] = js.native
  /**
    * Sets the `antialias` property when the WebGL context is created. Setting this value does not impact any subsequent textures that are created, or the canvas style attributes.
    */
  var antialiasGL: js.UndefOr[Boolean] = js.native
  /**
    * The default WebGL batch size.
    */
  var batchSize: js.UndefOr[integer] = js.native
  /**
    * Whether the game canvas will be cleared between each rendering frame.
    */
  var clearBeforeRender: js.UndefOr[Boolean] = js.native
  /**
    * When set to `true` it will create a desynchronized context for both 2D and WebGL. See https://developers.google.com/web/updates/2019/05/desynchronized for details.
    */
  var desynchronized: js.UndefOr[Boolean] = js.native
  /**
    * Let the browser abort creating a WebGL context if it judges performance would be unacceptable.
    */
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of lights allowed to be visible within range of a single Camera in the LightManager.
    */
  var maxLights: js.UndefOr[integer] = js.native
  /**
    * The mipmap magFilter to be used when creating WebGL textures.
    */
  var mipmapFilter: js.UndefOr[String] = js.native
  /**
    * Sets `antialias` and `roundPixels` to true. This is the best setting for pixel-art games.
    */
  var pixelArt: js.UndefOr[Boolean] = js.native
  /**
    * "high-performance", "low-power" or "default". A hint to the browser on how much device power the game might use.
    */
  var powerPreference: js.UndefOr[String] = js.native
  /**
    * In WebGL mode, the drawing buffer contains colors with pre-multiplied alpha.
    */
  var premultipliedAlpha: js.UndefOr[Boolean] = js.native
  /**
    * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
    */
  var roundPixels: js.UndefOr[Boolean] = js.native
  /**
    * Whether the game canvas will be transparent. Boolean that indicates if the canvas contains an alpha channel. If set to false, the browser now knows that the backdrop is always opaque, which can speed up drawing of transparent content and images.
    */
  var transparent: js.UndefOr[Boolean] = js.native
}

object RenderConfig {
  @scala.inline
  def apply(): RenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderConfig]
  }
  @scala.inline
  implicit class RenderConfigOps[Self <: RenderConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntialias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntialias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(js.undefined)
        ret
    }
    @scala.inline
    def withAntialiasGL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialiasGL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntialiasGL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialiasGL")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchSize(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withClearBeforeRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBeforeRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearBeforeRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBeforeRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDesynchronized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desynchronized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesynchronized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desynchronized")(js.undefined)
        ret
    }
    @scala.inline
    def withFailIfMajorPerformanceCaveat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failIfMajorPerformanceCaveat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailIfMajorPerformanceCaveat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failIfMajorPerformanceCaveat")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLights(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLights")(js.undefined)
        ret
    }
    @scala.inline
    def withMipmapFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mipmapFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMipmapFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mipmapFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelArt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelArt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelArt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelArt")(js.undefined)
        ret
    }
    @scala.inline
    def withPowerPreference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPowerPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withPremultipliedAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultipliedAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremultipliedAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultipliedAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundPixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(js.undefined)
        ret
    }
  }
  
}

