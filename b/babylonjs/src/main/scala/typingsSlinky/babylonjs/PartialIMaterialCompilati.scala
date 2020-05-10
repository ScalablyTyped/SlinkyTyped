package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.IMaterialCompilationOptions> */
@js.native
trait PartialIMaterialCompilati extends js.Object {
  var clipPlane: js.UndefOr[Boolean] = js.native
  var useInstances: js.UndefOr[Boolean] = js.native
}

object PartialIMaterialCompilati {
  @scala.inline
  def apply(): PartialIMaterialCompilati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIMaterialCompilati]
  }
  @scala.inline
  implicit class PartialIMaterialCompilatiOps[Self <: PartialIMaterialCompilati] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipPlane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPlane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipPlane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPlane")(js.undefined)
        ret
    }
    @scala.inline
    def withUseInstances(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInstances")(js.undefined)
        ret
    }
  }
  
}

