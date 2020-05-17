package typingsSlinky.jestCore.anon

import typingsSlinky.jestRunner.mod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var allTests: Double = js.native
  var stats: js.UndefOr[typingsSlinky.jestCore.typesMod.Stats] = js.native
  var tests: js.Array[Test] = js.native
  var total: js.UndefOr[Double] = js.native
}

object Stats {
  @scala.inline
  def apply(allTests: Double, tests: js.Array[Test]): Stats = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTests(value: js.Array[Test]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: typingsSlinky.jestCore.typesMod.Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

