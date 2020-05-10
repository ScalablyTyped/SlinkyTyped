package typingsSlinky.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinExternalApplicationStatic extends js.Object {
  /**
    * Returns an External Application object that represents an existing external application.
    */
  def wrap(uuid: String): OpenFinExternalApplication = js.native
}

object OpenFinExternalApplicationStatic {
  @scala.inline
  def apply(wrap: String => OpenFinExternalApplication): OpenFinExternalApplicationStatic = {
    val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction1(wrap))
    __obj.asInstanceOf[OpenFinExternalApplicationStatic]
  }
  @scala.inline
  implicit class OpenFinExternalApplicationStaticOps[Self <: OpenFinExternalApplicationStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrap(value: String => OpenFinExternalApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

