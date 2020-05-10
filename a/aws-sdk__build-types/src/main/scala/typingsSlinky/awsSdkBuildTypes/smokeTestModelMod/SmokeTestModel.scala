package typingsSlinky.awsSdkBuildTypes.smokeTestModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmokeTestModel extends js.Object {
  /**
    * The region to use should no alternative be supplied via the test runner's execution environment.
    */
  var defaultRegion: String = js.native
  var testCases: js.Array[SmokeTestCase] = js.native
  /**
    * The version of smoke test document.
    */
  var version: Double = js.native
}

object SmokeTestModel {
  @scala.inline
  def apply(defaultRegion: String, testCases: js.Array[SmokeTestCase], version: Double): SmokeTestModel = {
    val __obj = js.Dynamic.literal(defaultRegion = defaultRegion.asInstanceOf[js.Any], testCases = testCases.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmokeTestModel]
  }
  @scala.inline
  implicit class SmokeTestModelOps[Self <: SmokeTestModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCases(value: js.Array[SmokeTestCase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

