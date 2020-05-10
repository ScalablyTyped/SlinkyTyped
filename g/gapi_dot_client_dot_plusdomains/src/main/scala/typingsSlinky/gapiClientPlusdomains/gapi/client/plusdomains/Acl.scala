package typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl extends js.Object {
  /** Description of the access granted, suitable for display. */
  var description: js.UndefOr[String] = js.native
  /** Whether access is restricted to the domain. */
  var domainRestricted: js.UndefOr[Boolean] = js.native
  /** The list of access entries. */
  var items: js.UndefOr[js.Array[PlusDomainsAclentryResource]] = js.native
  /** Identifies this resource as a collection of access controls. Value: "plus#acl". */
  var kind: js.UndefOr[String] = js.native
}

object Acl {
  @scala.inline
  def apply(): Acl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acl]
  }
  @scala.inline
  implicit class AclOps[Self <: Acl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainRestricted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainRestricted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainRestricted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainRestricted")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[PlusDomainsAclentryResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

