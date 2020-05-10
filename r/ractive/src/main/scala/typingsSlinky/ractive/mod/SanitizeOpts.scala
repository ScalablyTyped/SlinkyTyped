package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SanitizeOpts extends js.Object {
  /** A list of element names to remove from the template. */
  var elements: js.Array[String] = js.native
  /** Whether or not to remove DOM event listener attributes, like onclick, from the template. */
  var eventAttributes: js.UndefOr[Boolean] = js.native
}

object SanitizeOpts {
  @scala.inline
  def apply(elements: js.Array[String]): SanitizeOpts = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizeOpts]
  }
  @scala.inline
  implicit class SanitizeOptsOps[Self <: SanitizeOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAttributes")(js.undefined)
        ret
    }
  }
  
}

