package typingsSlinky.jestConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRootDir extends js.Object {
  var rootDir: String = js.native
  var testEnvironment: String = js.native
}

object AnonRootDir {
  @scala.inline
  def apply(rootDir: String, testEnvironment: String): AnonRootDir = {
    val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRootDir]
  }
  @scala.inline
  implicit class AnonRootDirOps[Self <: AnonRootDir] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

