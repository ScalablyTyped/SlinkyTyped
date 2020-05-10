package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access control list information for the item. For more information see
  * https://developers.google.com/cloud-search/docs/guides/index-your-data#acls
  */
@js.native
trait SchemaItemAcl extends js.Object {
  /**
    * Sets the type of access rules to apply when an item inherits its ACL from
    * a parent. This should always be set in tandem with the inheritAclFrom
    * field. Also, when the inheritAclFrom field is set, this field should be
    * set to a valid AclInheritanceType.
    */
  var aclInheritanceType: js.UndefOr[String] = js.native
  /**
    * List of principals who are explicitly denied access to the item in search
    * results. While principals are denied access by default, use denied
    * readers to handle exceptions and override the list allowed readers. The
    * maximum number of elements is 100.
    */
  var deniedReaders: js.UndefOr[js.Array[SchemaPrincipal]] = js.native
  /**
    * Name of the item to inherit the Access Permission List (ACL) from. Note:
    * ACL inheritance *only* provides access permissions to child items and
    * does not define structural relationships, nor does it provide convenient
    * ways to delete large groups of items. Deleting an ACL parent from the
    * index only alters the access permissions of child items that reference
    * the parent in the inheritAclFrom field. The item is still in the index,
    * but may not visible in search results. By contrast, deletion of a
    * container item also deletes all items that reference the container via
    * the containerName field. The maximum length for this field is 1536
    * characters.
    */
  var inheritAclFrom: js.UndefOr[String] = js.native
  /**
    * Optional. List of owners for the item. This field has no bearing on
    * document access permissions. It does, however, offer a slight ranking
    * boosts items where the querying user is an owner. The maximum number of
    * elements is 5.
    */
  var owners: js.UndefOr[js.Array[SchemaPrincipal]] = js.native
  /**
    * List of principals who are allowed to see the item in search results.
    * Optional if inheriting permissions from another item or if the item is
    * not intended to be visible, such as virtual containers. The maximum
    * number of elements is 1000.
    */
  var readers: js.UndefOr[js.Array[SchemaPrincipal]] = js.native
}

object SchemaItemAcl {
  @scala.inline
  def apply(): SchemaItemAcl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemAcl]
  }
  @scala.inline
  implicit class SchemaItemAclOps[Self <: SchemaItemAcl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAclInheritanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aclInheritanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAclInheritanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aclInheritanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withDeniedReaders(value: js.Array[SchemaPrincipal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deniedReaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeniedReaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deniedReaders")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritAclFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritAclFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritAclFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritAclFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withOwners(value: js.Array[SchemaPrincipal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(js.undefined)
        ret
    }
    @scala.inline
    def withReaders(value: js.Array[SchemaPrincipal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readers")(js.undefined)
        ret
    }
  }
  
}

