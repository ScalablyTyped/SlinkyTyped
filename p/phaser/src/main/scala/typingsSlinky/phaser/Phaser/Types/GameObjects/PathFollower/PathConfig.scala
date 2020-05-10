package typingsSlinky.phaser.Phaser.Types.GameObjects.PathFollower

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for a PathFollower.
  */
@js.native
trait PathConfig extends js.Object {
  /**
    * The duration of the path follow in ms. Must be `> 0`.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The start position of the path follow, between 0 and 1. Must be less than `to`.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * Whether to position the PathFollower on the Path using its path offset.
    */
  var positionOnPath: js.UndefOr[Boolean] = js.native
  /**
    * Should the PathFollower automatically rotate to point in the direction of the Path?
    */
  var rotateToPath: js.UndefOr[Boolean] = js.native
  /**
    * If the PathFollower is rotating to match the Path, this value is added to the rotation value. This allows you to rotate objects to a path but control the angle of the rotation as well.
    */
  var rotationOffset: js.UndefOr[Double] = js.native
  /**
    * Current start position of the path follow, must be between `from` and `to`.
    */
  var startAt: js.UndefOr[Double] = js.native
  /**
    * The end position of the path follow, between 0 and 1. Must be more than `from`.
    */
  var to: js.UndefOr[Double] = js.native
}

object PathConfig {
  @scala.inline
  def apply(): PathConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathConfig]
  }
  @scala.inline
  implicit class PathConfigOps[Self <: PathConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self = {
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
    def withPositionOnPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionOnPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionOnPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionOnPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateToPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateToPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateToPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateToPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

