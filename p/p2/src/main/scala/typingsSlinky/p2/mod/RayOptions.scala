package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RayOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* result */ RaycastResult, Unit]] = js.native
  var checkCollisionResponse: js.UndefOr[Boolean] = js.native
  var collisionGroup: js.UndefOr[Double] = js.native
  var collisionMask: js.UndefOr[Double] = js.native
  var from: js.Tuple2[Double, Double] = js.native
  var mode: js.UndefOr[Double] = js.native
  var skipBackfaces: js.UndefOr[Boolean] = js.native
  var to: js.Tuple2[Double, Double] = js.native
}

object RayOptions {
  @scala.inline
  def apply(from: js.Tuple2[Double, Double], to: js.Tuple2[Double, Double]): RayOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RayOptions]
  }
  @scala.inline
  implicit class RayOptionsOps[Self <: RayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: /* result */ RaycastResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckCollisionResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCollisionResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckCollisionResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCollisionResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionMask")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipBackfaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBackfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipBackfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBackfaces")(js.undefined)
        ret
    }
  }
  
}

