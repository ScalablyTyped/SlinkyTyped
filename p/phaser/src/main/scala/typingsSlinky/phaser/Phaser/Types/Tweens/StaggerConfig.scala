package typingsSlinky.phaser.Phaser.Types.Tweens

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaggerConfig extends js.Object {
  /**
    * An ease to apply across the staggered values. Can either be a string, such as 'sine.inout', or a function.
    */
  var ease: js.UndefOr[String | js.Function] = js.native
  /**
    * The index to start the stagger from. Can be the strings `first`, `last` or `center`, or an integer representing the stagger position.
    */
  var from: js.UndefOr[String | integer] = js.native
  /**
    * Set the stagger to run across a grid by providing an array where element 0 is the width of the grid and element 1 is the height. Combine with the 'from' property to control direction.
    */
  var grid: js.UndefOr[js.Array[integer]] = js.native
  /**
    * The value to start the stagger from. Can be used as a way to offset the stagger while still using a range for the value.
    */
  var start: js.UndefOr[Double] = js.native
}

object StaggerConfig {
  @scala.inline
  def apply(): StaggerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaggerConfig]
  }
  @scala.inline
  implicit class StaggerConfigOps[Self <: StaggerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEase(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String | integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: js.Array[integer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

