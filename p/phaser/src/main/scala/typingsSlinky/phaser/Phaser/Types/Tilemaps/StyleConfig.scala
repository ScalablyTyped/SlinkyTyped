package typingsSlinky.phaser.Phaser.Types.Tilemaps

import typingsSlinky.phaser.Phaser.Display.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleConfig extends js.Object {
  /**
    * Color to use for drawing a filled rectangle at colliding tile locations. If set to null, colliding tiles will not be drawn.
    */
  var collidingTileColor: js.UndefOr[Color | Double | Null] = js.native
  /**
    * Color to use for drawing a line at interesting tile faces. If set to null, interesting tile faces will not be drawn.
    */
  var faceColor: js.UndefOr[Color | Double | Null] = js.native
  /**
    * Color to use for drawing a filled rectangle at non-colliding tile locations. If set to null, non-colliding tiles will not be drawn.
    */
  var tileColor: js.UndefOr[Color | Double | Null] = js.native
}

object StyleConfig {
  @scala.inline
  def apply(): StyleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleConfig]
  }
  @scala.inline
  implicit class StyleConfigOps[Self <: StyleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollidingTileColor(value: Color | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collidingTileColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollidingTileColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collidingTileColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCollidingTileColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collidingTileColor")(null)
        ret
    }
    @scala.inline
    def withFaceColor(value: Color | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceColor")(null)
        ret
    }
    @scala.inline
    def withTileColor(value: Color | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTileColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileColor")(null)
        ret
    }
  }
  
}

