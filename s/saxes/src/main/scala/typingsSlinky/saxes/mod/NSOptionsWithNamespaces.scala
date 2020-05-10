package typingsSlinky.saxes.mod

import typingsSlinky.saxes.saxesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NSOptionsWithNamespaces extends NSOptions {
  @JSName("xmlns")
  var xmlns_NSOptionsWithNamespaces: `true` = js.native
}

object NSOptionsWithNamespaces {
  @scala.inline
  def apply(xmlns: `true`): NSOptionsWithNamespaces = {
    val __obj = js.Dynamic.literal(xmlns = xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[NSOptionsWithNamespaces]
  }
  @scala.inline
  implicit class NSOptionsWithNamespacesOps[Self <: NSOptionsWithNamespaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXmlns(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

