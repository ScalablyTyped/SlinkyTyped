package typingsSlinky.devextreme.mod.DevExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointSelector extends js.Object {
  /** Gets an endpoint with a specific key. */
  def urlFor(key: String): String = js.native
}

object EndpointSelector {
  @scala.inline
  def apply(urlFor: String => String): EndpointSelector = {
    val __obj = js.Dynamic.literal(urlFor = js.Any.fromFunction1(urlFor))
    __obj.asInstanceOf[EndpointSelector]
  }
  @scala.inline
  implicit class EndpointSelectorOps[Self <: EndpointSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrlFor(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlFor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

