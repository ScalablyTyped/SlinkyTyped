package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a value incremented continuously across a range.
  */
@js.native
trait EmitterOpEaseConfig extends EmitterOpOnUpdateType {
  /**
    * The name of the easing function.
    */
  var ease: js.UndefOr[String] = js.native
  /**
    * The ending value.
    */
  var end: Double = js.native
  /**
    * The starting value.
    */
  var start: Double = js.native
}

object EmitterOpEaseConfig {
  @scala.inline
  def apply(end: Double, start: Double): EmitterOpEaseConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpEaseConfig]
  }
  @scala.inline
  implicit class EmitterOpEaseConfigOps[Self <: EmitterOpEaseConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEase(value: String): Self = {
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
  }
  
}

