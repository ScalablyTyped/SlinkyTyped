package typingsSlinky.phaser.Phaser.Types.GameObjects.BitmapText

import typingsSlinky.phaser.Phaser.GameObjects.DynamicBitmapText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayCallbackConfig extends js.Object {
  /**
    * The character code of the character being rendered.
    */
  var charCode: Double = js.native
  /**
    * Custom data stored with the character being rendered.
    */
  var data: js.Any = js.native
  /**
    * The index of the character being rendered.
    */
  var index: Double = js.native
  /**
    * The Dynamic Bitmap Text object that owns this character being rendered.
    */
  var parent: DynamicBitmapText = js.native
  /**
    * The rotation of the character being rendered.
    */
  var rotation: Double = js.native
  /**
    * The scale of the character being rendered.
    */
  var scale: Double = js.native
  /**
    * The tint of the character being rendered. Always zero in Canvas.
    */
  var tint: TintConfig = js.native
  /**
    * The x position of the character being rendered.
    */
  var x: Double = js.native
  /**
    * The y position of the character being rendered.
    */
  var y: Double = js.native
}

object DisplayCallbackConfig {
  @scala.inline
  def apply(
    charCode: Double,
    data: js.Any,
    index: Double,
    parent: DynamicBitmapText,
    rotation: Double,
    scale: Double,
    tint: TintConfig,
    x: Double,
    y: Double
  ): DisplayCallbackConfig = {
    val __obj = js.Dynamic.literal(charCode = charCode.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tint = tint.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayCallbackConfig]
  }
  @scala.inline
  implicit class DisplayCallbackConfigOps[Self <: DisplayCallbackConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: DynamicBitmapText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTint(value: TintConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tint")(value.asInstanceOf[js.Any])
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

