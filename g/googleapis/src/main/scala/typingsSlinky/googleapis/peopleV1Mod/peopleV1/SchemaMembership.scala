package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s read-only membership in a group.
  */
@js.native
trait SchemaMembership extends js.Object {
  /**
    * The contact group membership.
    */
  var contactGroupMembership: js.UndefOr[SchemaContactGroupMembership] = js.native
  /**
    * The domain membership.
    */
  var domainMembership: js.UndefOr[SchemaDomainMembership] = js.native
  /**
    * Metadata about the membership.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
}

object SchemaMembership {
  @scala.inline
  def apply(): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembership]
  }
  @scala.inline
  implicit class SchemaMembershipOps[Self <: SchemaMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactGroupMembership(value: SchemaContactGroupMembership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroupMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactGroupMembership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroupMembership")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainMembership(value: SchemaDomainMembership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainMembership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainMembership")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaFieldMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

