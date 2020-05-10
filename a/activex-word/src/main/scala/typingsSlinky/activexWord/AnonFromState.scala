package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFromState extends js.Object {
  val Doc: Document = js.native
  val FromState: Double = js.native
  val Handled: Boolean = js.native
  val ToState: Double = js.native
}

object AnonFromState {
  @scala.inline
  def apply(Doc: Document, FromState: Double, Handled: Boolean, ToState: Double): AnonFromState = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], FromState = FromState.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any], ToState = ToState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromState]
  }
  @scala.inline
  implicit class AnonFromStateOps[Self <: AnonFromState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

