package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBenchmarkIndex extends js.Object {
  var benchmarkIndex: js.UndefOr[Double] = js.native
  var hostUserAgent: js.UndefOr[String] = js.native
  var networkUserAgent: js.UndefOr[String] = js.native
}

object AnonBenchmarkIndex {
  @scala.inline
  def apply(): AnonBenchmarkIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBenchmarkIndex]
  }
  @scala.inline
  implicit class AnonBenchmarkIndexOps[Self <: AnonBenchmarkIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBenchmarkIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benchmarkIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBenchmarkIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benchmarkIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withHostUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostUserAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostUserAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkUserAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkUserAgent")(js.undefined)
        ret
    }
  }
  
}

