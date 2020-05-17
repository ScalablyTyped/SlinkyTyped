package typingsSlinky.jestConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootDir extends js.Object {
  var rootDir: String = js.native
  var testEnvironment: String = js.native
}

object RootDir {
  @scala.inline
  def apply(rootDir: String, testEnvironment: String): RootDir = {
    val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootDir]
  }
  @scala.inline
  implicit class RootDirOps[Self <: RootDir] (val x: Self) extends AnyVal {
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

