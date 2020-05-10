package typingsSlinky.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgAnalyzeModulesHost extends js.Object {
  def isSourceFile(filePath: String): Boolean = js.native
}

object NgAnalyzeModulesHost {
  @scala.inline
  def apply(isSourceFile: String => Boolean): NgAnalyzeModulesHost = {
    val __obj = js.Dynamic.literal(isSourceFile = js.Any.fromFunction1(isSourceFile))
    __obj.asInstanceOf[NgAnalyzeModulesHost]
  }
  @scala.inline
  implicit class NgAnalyzeModulesHostOps[Self <: NgAnalyzeModulesHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSourceFile(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSourceFile")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

