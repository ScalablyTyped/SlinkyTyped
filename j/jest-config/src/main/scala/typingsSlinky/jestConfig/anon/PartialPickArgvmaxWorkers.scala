package typingsSlinky.jestConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.Argv, 'maxWorkers' | 'runInBand' | 'watch'>> */
@js.native
trait PartialPickArgvmaxWorkers extends js.Object {
  var maxWorkers: js.UndefOr[Double | String] = js.native
  var runInBand: js.UndefOr[Boolean] = js.native
  var watch: js.UndefOr[Boolean] = js.native
}

object PartialPickArgvmaxWorkers {
  @scala.inline
  def apply(): PartialPickArgvmaxWorkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickArgvmaxWorkers]
  }
  @scala.inline
  implicit class PartialPickArgvmaxWorkersOps[Self <: PartialPickArgvmaxWorkers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxWorkers(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withRunInBand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runInBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunInBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runInBand")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

