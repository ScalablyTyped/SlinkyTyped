package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGround extends js.Object {
  /**
    * Should the ground be removed (default false)
    */
  var ground: js.UndefOr[Boolean] = js.native
  /**
    * Should the skybox be removed (default false)
    */
  var skyBox: js.UndefOr[Boolean] = js.native
}

object AnonGround {
  @scala.inline
  def apply(): AnonGround = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGround]
  }
  @scala.inline
  implicit class AnonGroundOps[Self <: AnonGround] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ground")(js.undefined)
        ret
    }
    @scala.inline
    def withSkyBox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkyBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyBox")(js.undefined)
        ret
    }
  }
  
}

