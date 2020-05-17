package typingsSlinky.jestMessageUtil.anon

import typingsSlinky.jestTypes.configMod.Glob
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@jest/types.@jest/types.Config.ProjectConfig, 'rootDir' | 'testMatch'> */
@js.native
trait PickProjectConfigrootDirt extends js.Object {
  var rootDir: Path = js.native
  var testMatch: js.Array[Glob] = js.native
}

object PickProjectConfigrootDirt {
  @scala.inline
  def apply(rootDir: Path, testMatch: js.Array[Glob]): PickProjectConfigrootDirt = {
    val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickProjectConfigrootDirt]
  }
  @scala.inline
  implicit class PickProjectConfigrootDirtOps[Self <: PickProjectConfigrootDirt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRootDir(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestMatch(value: js.Array[Glob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

