package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISimplificationSettings extends js.Object {
  /**
    * Gets or sets the distance when this optimized version should be used
    */
  var distance: Double = js.native
  /**
    * Gets an already optimized mesh
    */
  var optimizeMesh: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the expected quality
    */
  var quality: Double = js.native
}

object ISimplificationSettings {
  @scala.inline
  def apply(distance: Double, quality: Double): ISimplificationSettings = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimplificationSettings]
  }
  @scala.inline
  implicit class ISimplificationSettingsOps[Self <: ISimplificationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeMesh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeMesh")(js.undefined)
        ret
    }
  }
  
}

