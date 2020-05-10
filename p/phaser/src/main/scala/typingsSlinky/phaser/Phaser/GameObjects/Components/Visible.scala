package typingsSlinky.phaser.Phaser.GameObjects.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the visibility of a Game Object.
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait Visible extends js.Object {
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  var visible: Boolean = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  def setVisible(value: Boolean): this.type = js.native
}

object Visible {
  @scala.inline
  def apply(setVisible: Boolean => Visible, visible: Boolean): Visible = {
    val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1(setVisible), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visible]
  }
  @scala.inline
  implicit class VisibleOps[Self <: Visible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetVisible(value: Boolean => Visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.Any.fromFunction1(value))
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

