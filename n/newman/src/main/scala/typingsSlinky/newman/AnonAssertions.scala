package typingsSlinky.newman

import typingsSlinky.newman.mod.NewmanRunStat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssertions extends js.Object {
  var assertions: NewmanRunStat = js.native
  var items: NewmanRunStat = js.native
  var iterations: NewmanRunStat = js.native
  var prerequestScripts: NewmanRunStat = js.native
  var prerequests: NewmanRunStat = js.native
  var requests: NewmanRunStat = js.native
  var scripts: NewmanRunStat = js.native
  var testScripts: NewmanRunStat = js.native
  var tests: NewmanRunStat = js.native
}

object AnonAssertions {
  @scala.inline
  def apply(
    assertions: NewmanRunStat,
    items: NewmanRunStat,
    iterations: NewmanRunStat,
    prerequestScripts: NewmanRunStat,
    prerequests: NewmanRunStat,
    requests: NewmanRunStat,
    scripts: NewmanRunStat,
    testScripts: NewmanRunStat,
    tests: NewmanRunStat
  ): AnonAssertions = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], prerequestScripts = prerequestScripts.asInstanceOf[js.Any], prerequests = prerequests.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], testScripts = testScripts.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssertions]
  }
  @scala.inline
  implicit class AnonAssertionsOps[Self <: AnonAssertions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssertions(value: NewmanRunStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assertions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: NewmanRunStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: NewmanRunStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrerequestScripts(value: NewmanRunStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerequestScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrerequests(value: NewmanRunStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequests(value: NewmanRunStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScripts(value: NewmanRunStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestScripts(value: NewmanRunStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTests(value: NewmanRunStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

