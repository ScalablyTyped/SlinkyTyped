package typingsSlinky.saxes.mod

import typingsSlinky.saxes.saxesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NSOptionsWithoutNamespaces extends NSOptions {
  @JSName("additionalNamespaces")
  var additionalNamespaces_NSOptionsWithoutNamespaces: js.UndefOr[scala.Nothing] = js.native
  @JSName("resolvePrefix")
  var resolvePrefix_NSOptionsWithoutNamespaces: js.UndefOr[scala.Nothing] = js.native
  @JSName("xmlns")
  var xmlns_NSOptionsWithoutNamespaces: js.UndefOr[`false`] = js.native
}

object NSOptionsWithoutNamespaces {
  @scala.inline
  def apply(): NSOptionsWithoutNamespaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NSOptionsWithoutNamespaces]
  }
  @scala.inline
  implicit class NSOptionsWithoutNamespacesOps[Self <: NSOptionsWithoutNamespaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXmlns(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(js.undefined)
        ret
    }
  }
  
}

