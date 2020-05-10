package typingsSlinky.jestAxe

import typingsSlinky.axeCore.mod.Result
import typingsSlinky.axeCore.mod.RunOptions
import typingsSlinky.axeCore.mod.TestEngine
import typingsSlinky.axeCore.mod.TestEnvironment
import typingsSlinky.axeCore.mod.TestRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<axe-core.axe-core.AxeResults> */
@js.native
trait PartialAxeResults extends js.Object {
  var inapplicable: js.UndefOr[js.Array[Result]] = js.native
  var incomplete: js.UndefOr[js.Array[Result]] = js.native
  var passes: js.UndefOr[js.Array[Result]] = js.native
  var testEngine: js.UndefOr[TestEngine] = js.native
  var testEnvironment: js.UndefOr[TestEnvironment] = js.native
  var testRunner: js.UndefOr[TestRunner] = js.native
  var timestamp: js.UndefOr[String] = js.native
  var toolOptions: js.UndefOr[RunOptions] = js.native
  var url: js.UndefOr[String] = js.native
  var violations: js.UndefOr[js.Array[Result]] = js.native
}

object PartialAxeResults {
  @scala.inline
  def apply(): PartialAxeResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAxeResults]
  }
  @scala.inline
  implicit class PartialAxeResultsOps[Self <: PartialAxeResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInapplicable(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inapplicable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInapplicable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inapplicable")(js.undefined)
        ret
    }
    @scala.inline
    def withIncomplete(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withPasses(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passes")(js.undefined)
        ret
    }
    @scala.inline
    def withTestEngine(value: TestEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withTestEnvironment(value: TestEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testEnvironment")(js.undefined)
        ret
    }
    @scala.inline
    def withTestRunner(value: TestRunner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRunner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestRunner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRunner")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withToolOptions(value: RunOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withViolations(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violations")(js.undefined)
        ret
    }
  }
  
}

