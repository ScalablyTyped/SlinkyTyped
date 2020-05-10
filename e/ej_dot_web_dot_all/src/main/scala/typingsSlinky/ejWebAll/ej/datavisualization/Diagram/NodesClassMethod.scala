package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesClassMethod extends js.Object {
  /** Sets the visibility of the method.
    * @Default {ej.datavisualization.Diagram.ScopeValueDefaults.Public}
    */
  var scope: js.UndefOr[String] = js.native
}

object NodesClassMethod {
  @scala.inline
  def apply(): NodesClassMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesClassMethod]
  }
  @scala.inline
  implicit class NodesClassMethodOps[Self <: NodesClassMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

