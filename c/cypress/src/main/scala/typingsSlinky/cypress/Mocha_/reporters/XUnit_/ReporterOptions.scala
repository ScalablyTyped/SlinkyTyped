package typingsSlinky.cypress.Mocha_.reporters.XUnit_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReporterOptions extends js.Object {
  var output: js.UndefOr[String] = js.native
  var suiteName: js.UndefOr[String] = js.native
}

object ReporterOptions {
  @scala.inline
  def apply(): ReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReporterOptions]
  }
  @scala.inline
  implicit class ReporterOptionsOps[Self <: ReporterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withSuiteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuiteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteName")(js.undefined)
        ret
    }
  }
  
}

