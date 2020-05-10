package typingsSlinky.phaser.Phaser.Types.GameObjects

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONGameObject extends js.Object {
  /**
    * The alpha value of the Game Object.
    */
  var alpha: Double = js.native
  /**
    * Sets the Blend Mode being used by this Game Object.
    */
  var blendMode: integer | String = js.native
  /**
    * The data of this Game Object.
    */
  var data: js.Object = js.native
  /**
    * The horizontally flipped state of the Game Object.
    */
  var flipX: Boolean = js.native
  /**
    * The vertically flipped state of the Game Object.
    */
  var flipY: Boolean = js.native
  /**
    * The frame key of this Game Object.
    */
  var frameKey: String = js.native
  /**
    * The name of this Game Object.
    */
  var name: String = js.native
  /**
    * The origin of this Game Object.
    */
  var origin: js.Object = js.native
  /**
    * The horizontal origin of this Game Object.
    */
  @JSName("origin.x")
  var originDotx: Double = js.native
  /**
    * The vertical origin of this Game Object.
    */
  @JSName("origin.y")
  var originDoty: Double = js.native
  /**
    * The angle of this Game Object in radians.
    */
  var rotation: Double = js.native
  /**
    * The scale of this Game Object
    */
  var scale: js.Object = js.native
  /**
    * The horizontal scale of this Game Object.
    */
  @JSName("scale.x")
  var scaleDotx: Double = js.native
  /**
    * The vertical scale of this Game Object.
    */
  @JSName("scale.y")
  var scaleDoty: Double = js.native
  /**
    * The Scale Mode being used by this Game Object.
    */
  var scaleMode: integer = js.native
  /**
    * The texture key of this Game Object.
    */
  var textureKey: String = js.native
  /**
    * A textual representation of this Game Object, i.e. `sprite`.
    */
  var `type`: String = js.native
  /**
    * The visible state of the Game Object.
    */
  var visible: Boolean = js.native
  /**
    * The x position of this Game Object.
    */
  var x: Double = js.native
  /**
    * The y position of this Game Object.
    */
  var y: Double = js.native
}

object JSONGameObject {
  @scala.inline
  def apply(
    alpha: Double,
    blendMode: integer | String,
    data: js.Object,
    flipX: Boolean,
    flipY: Boolean,
    frameKey: String,
    name: String,
    origin: js.Object,
    originDotx: Double,
    originDoty: Double,
    rotation: Double,
    scale: js.Object,
    scaleDotx: Double,
    scaleDoty: Double,
    scaleMode: integer,
    textureKey: String,
    `type`: String,
    visible: Boolean,
    x: Double,
    y: Double
  ): JSONGameObject = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], frameKey = frameKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleMode = scaleMode.asInstanceOf[js.Any], textureKey = textureKey.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("origin.x")(originDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("origin.y")(originDoty.asInstanceOf[js.Any])
    __obj.updateDynamic("scale.x")(scaleDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("scale.y")(scaleDoty.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONGameObject]
  }
  @scala.inline
  implicit class JSONGameObjectOps[Self <: JSONGameObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendMode(value: integer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlipX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlipY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginDotx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin.x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginDoty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin.y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleDotx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale.x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleDoty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale.y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleMode(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

