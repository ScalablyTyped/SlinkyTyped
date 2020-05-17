package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialRender extends js.Object {
  var initialRender: Boolean = js.native
}

object InitialRender {
  @scala.inline
  def apply(initialRender: Boolean): InitialRender = {
    val __obj = js.Dynamic.literal(initialRender = initialRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialRender]
  }
  @scala.inline
  implicit class InitialRenderOps[Self <: InitialRender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRender")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

