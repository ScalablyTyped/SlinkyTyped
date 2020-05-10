package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTestability extends js.Object {
  def addToWindow(registry: TestabilityRegistry): Unit = js.native
  def findTestabilityInTree(registry: TestabilityRegistry, elem: js.Any, findInAncestors: Boolean): Testability | Null = js.native
}

object GetTestability {
  @scala.inline
  def apply(
    addToWindow: TestabilityRegistry => Unit,
    findTestabilityInTree: (TestabilityRegistry, js.Any, Boolean) => Testability | Null
  ): GetTestability = {
    val __obj = js.Dynamic.literal(addToWindow = js.Any.fromFunction1(addToWindow), findTestabilityInTree = js.Any.fromFunction3(findTestabilityInTree))
    __obj.asInstanceOf[GetTestability]
  }
  @scala.inline
  implicit class GetTestabilityOps[Self <: GetTestability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddToWindow(value: TestabilityRegistry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToWindow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindTestabilityInTree(value: (TestabilityRegistry, js.Any, Boolean) => Testability | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findTestabilityInTree")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

