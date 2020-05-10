package typingsSlinky.newman.mod

import typingsSlinky.newman.AnonRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewmanRunFailure extends js.Object {
  /** The event where the failure occurred */
  var at: String = js.native
  var cursor: AnonRef | js.Object = js.native
  var error: NewmanRunExecutionAssertionError = js.native
  var parent: js.Any = js.native
  var source: js.UndefOr[NewmanRunExecutionItem] = js.native
}

object NewmanRunFailure {
  @scala.inline
  def apply(at: String, cursor: AnonRef | js.Object, error: NewmanRunExecutionAssertionError, parent: js.Any): NewmanRunFailure = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunFailure]
  }
  @scala.inline
  implicit class NewmanRunFailureOps[Self <: NewmanRunFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: AnonRef | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: NewmanRunExecutionAssertionError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: NewmanRunExecutionItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

