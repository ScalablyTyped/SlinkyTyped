package typingsSlinky.jasmineNode.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineNode extends js.Object {
  def executeSpecsInFolder(options: ExecuteSpecsOptions): Unit = js.native
  def loadHelpersInFolder(path: String, pattern: js.RegExp): Unit = js.native
}

object JasmineNode {
  @scala.inline
  def apply(
    executeSpecsInFolder: ExecuteSpecsOptions => Unit,
    loadHelpersInFolder: (String, js.RegExp) => Unit
  ): JasmineNode = {
    val __obj = js.Dynamic.literal(executeSpecsInFolder = js.Any.fromFunction1(executeSpecsInFolder), loadHelpersInFolder = js.Any.fromFunction2(loadHelpersInFolder))
    __obj.asInstanceOf[JasmineNode]
  }
  @scala.inline
  implicit class JasmineNodeOps[Self <: JasmineNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecuteSpecsInFolder(value: ExecuteSpecsOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeSpecsInFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadHelpersInFolder(value: (String, js.RegExp) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadHelpersInFolder")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

