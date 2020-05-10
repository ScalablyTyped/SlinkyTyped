package typingsSlinky.postmark.domainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends js.Object {
  var DKIMVerified: Boolean = js.native
  var ID: Double = js.native
  var Name: String = js.native
  var ReturnPathDomainVerified: Boolean = js.native
  var SpfVerified: Boolean = js.native
  var WeakDKIM: Boolean = js.native
}

object Domain {
  @scala.inline
  def apply(
    DKIMVerified: Boolean,
    ID: Double,
    Name: String,
    ReturnPathDomainVerified: Boolean,
    SpfVerified: Boolean,
    WeakDKIM: Boolean
  ): Domain = {
    val __obj = js.Dynamic.literal(DKIMVerified = DKIMVerified.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReturnPathDomainVerified = ReturnPathDomainVerified.asInstanceOf[js.Any], SpfVerified = SpfVerified.asInstanceOf[js.Any], WeakDKIM = WeakDKIM.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDKIMVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKIMVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnPathDomainVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnPathDomainVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpfVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpfVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeakDKIM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeakDKIM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

