package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OwnerReference contains enough information to let you identify an owning
  * object. Currently, an owning object must be in the same namespace, so there
  * is no namespace field.
  */
@js.native
trait SchemaOwnerReference extends js.Object {
  /**
    * API version of the referent.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * If true, AND if the owner has the &quot;foregroundDeletion&quot;
    * finalizer, then the owner cannot be deleted from the key-value store
    * until this reference is removed. Defaults to false. To set this field, a
    * user needs &quot;delete&quot; permission of the owner, otherwise 422
    * (Unprocessable Entity) will be returned. +optional
    */
  var blockOwnerDeletion: js.UndefOr[Boolean] = js.native
  /**
    * If true, this reference points to the managing controller. +optional
    */
  var controller: js.UndefOr[Boolean] = js.native
  /**
    * Kind of the referent. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the referent. More info:
    * http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: js.UndefOr[String] = js.native
  /**
    * UID of the referent. More info:
    * http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: js.UndefOr[String] = js.native
}

object SchemaOwnerReference {
  @scala.inline
  def apply(): SchemaOwnerReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOwnerReference]
  }
  @scala.inline
  implicit class SchemaOwnerReferenceOps[Self <: SchemaOwnerReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockOwnerDeletion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockOwnerDeletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockOwnerDeletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockOwnerDeletion")(js.undefined)
        ret
    }
    @scala.inline
    def withController(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.undefined)
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
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
  }
  
}

