package typingsSlinky.ionic.anon

import typingsSlinky.ionic.definitionsMod.Org
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<ionic.ionic/definitions.App, 'name' | 'org'> */
@js.native
trait PickAppnameorg extends js.Object {
  var name: String = js.native
  @JSName("org")
  var org_ : js.UndefOr[Org] = js.native
}

object PickAppnameorg {
  @scala.inline
  def apply(name: String): PickAppnameorg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAppnameorg]
  }
  @scala.inline
  implicit class PickAppnameorgOps[Self <: PickAppnameorg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_(value: Org): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrg_ : Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(js.undefined)
        ret
    }
  }
  
}

