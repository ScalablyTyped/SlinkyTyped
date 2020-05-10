package typingsSlinky.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBuildPaths extends js.Object {
  var buildPaths: js.Array[String] = js.native
  var testPaths: js.Array[String] = js.native
}

object AnonBuildPaths {
  @scala.inline
  def apply(buildPaths: js.Array[String], testPaths: js.Array[String]): AnonBuildPaths = {
    val __obj = js.Dynamic.literal(buildPaths = buildPaths.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuildPaths]
  }
  @scala.inline
  implicit class AnonBuildPathsOps[Self <: AnonBuildPaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPaths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

