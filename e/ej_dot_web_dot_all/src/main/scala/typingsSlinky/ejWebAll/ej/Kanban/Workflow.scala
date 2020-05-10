package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workflow extends js.Object {
  /** Gets or sets an object that indicates to render the Kanban with specified workflows allowed Transitions.
    * @Default {null}
    */
  var allowedTransitions: js.UndefOr[String] = js.native
  /** Gets or sets an object that indicates to render the Kanban with specified workflows key.
    * @Default {null}
    */
  var key: js.UndefOr[String | Double] = js.native
}

object Workflow {
  @scala.inline
  def apply(): Workflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workflow]
  }
  @scala.inline
  implicit class WorkflowOps[Self <: Workflow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedTransitions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTransitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTransitions")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

