package typingsSlinky.phaser.Phaser.Types.GameObjects.Sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined phaser.Phaser.Types.GameObjects.GameObjectConfig & {  key ? :string,   frame ? :number | string} */
@js.native
trait SpriteConfig extends js.Object {
  /**
    * Add the GameObject to the scene.
    */
  var add: js.UndefOr[Boolean] = js.native
  /**
    * The alpha (opacity) of the Game Object.
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * The rotation angle of the Game Object, in degrees.
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * The blend mode of the GameObject.
    */
  var blendMode: js.UndefOr[Double] = js.native
  /**
    * The depth of the GameObject.
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    * The horizontally flipped state of the Game Object.
    */
  var flipX: js.UndefOr[Boolean] = js.native
  /**
    * The vertically flipped state of the Game Object.
    */
  var flipY: js.UndefOr[Boolean] = js.native
  /**
    * An optional frame from the Texture this Game Object is rendering with.
    */
  var frame: js.UndefOr[Double | String] = js.native
  /**
    * The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The origin of the Game Object.
    */
  var origin: js.UndefOr[Double | js.Object] = js.native
  /**
    * The rotation angle of the Game Object, in radians.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * The scale of the GameObject.
    */
  var scale: js.UndefOr[Double | js.Object] = js.native
  /**
    * The scale mode of the GameObject.
    */
  var scaleMode: js.UndefOr[Double] = js.native
  /**
    * The scroll factor of the GameObject.
    */
  var scrollFactor: js.UndefOr[Double | js.Object] = js.native
  /**
    * The visible state of the Game Object.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * The x position of the Game Object.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y position of the Game Object.
    */
  var y: js.UndefOr[Double] = js.native
}

object SpriteConfig {
  @scala.inline
  def apply(): SpriteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpriteConfig]
  }
  @scala.inline
  implicit class SpriteConfigOps[Self <: SpriteConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipX")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: Double | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMode")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollFactor(value: Double | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

