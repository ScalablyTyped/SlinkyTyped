package typingsSlinky.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneParameters extends js.Object {
  var ammo: js.UndefOr[String] = js.native
  var fixedTimeStep: js.UndefOr[Double] = js.native
  var rateLimit: js.UndefOr[Boolean] = js.native
}

object SceneParameters {
  @scala.inline
  def apply(): SceneParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneParameters]
  }
  @scala.inline
  implicit class SceneParametersOps[Self <: SceneParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmmo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ammo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmmo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ammo")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedTimeStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedTimeStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedTimeStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedTimeStep")(js.undefined)
        ret
    }
    @scala.inline
    def withRateLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimit")(js.undefined)
        ret
    }
  }
  
}

