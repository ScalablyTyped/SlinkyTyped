package typingsSlinky.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofinput extends js.Object {
  ////////////////////
  // Input - IME
  ////////////////////
  /**
    * Use the chrome.input.ime API to implement a custom IME for Chrome OS. This allows your extension to handle keystrokes, set the composition, and manage the candidate window.
    * Permissions:  "input"
    * @since Chrome 21.
    */
  val ime: Typeofime = js.native
}

object Typeofinput {
  @scala.inline
  def apply(ime: Typeofime): Typeofinput = {
    val __obj = js.Dynamic.literal(ime = ime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofinput]
  }
  @scala.inline
  implicit class TypeofinputOps[Self <: Typeofinput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIme(value: Typeofime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

