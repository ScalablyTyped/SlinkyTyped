package typingsSlinky.cannon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Broadphaser extends js.Object {
  var broadphaser: Double = js.native
  var integrate: Double = js.native
  var makeContactConstraints: Double = js.native
  var narrowphase: Double = js.native
  var solve: Double = js.native
}

object Broadphaser {
  @scala.inline
  def apply(
    broadphaser: Double,
    integrate: Double,
    makeContactConstraints: Double,
    narrowphase: Double,
    solve: Double
  ): Broadphaser = {
    val __obj = js.Dynamic.literal(broadphaser = broadphaser.asInstanceOf[js.Any], integrate = integrate.asInstanceOf[js.Any], makeContactConstraints = makeContactConstraints.asInstanceOf[js.Any], narrowphase = narrowphase.asInstanceOf[js.Any], solve = solve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadphaser]
  }
  @scala.inline
  implicit class BroadphaserOps[Self <: Broadphaser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadphaser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadphaser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMakeContactConstraints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeContactConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNarrowphase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrowphase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSolve(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solve")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

