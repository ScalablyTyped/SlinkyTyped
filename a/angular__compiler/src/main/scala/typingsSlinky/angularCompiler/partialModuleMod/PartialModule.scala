package typingsSlinky.angularCompiler.partialModuleMod

import typingsSlinky.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialModule extends js.Object {
  var fileName: String = js.native
  var statements: js.Array[Statement] = js.native
}

object PartialModule {
  @scala.inline
  def apply(fileName: String, statements: js.Array[Statement]): PartialModule = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialModule]
  }
  @scala.inline
  implicit class PartialModuleOps[Self <: PartialModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatements(value: js.Array[Statement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

