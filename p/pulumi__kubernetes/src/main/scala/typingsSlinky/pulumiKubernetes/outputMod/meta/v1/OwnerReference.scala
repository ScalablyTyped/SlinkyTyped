package typingsSlinky.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OwnerReference contains enough information to let you identify an owning object. An owning
  * object must be in the same namespace as the dependent, or be cluster-scoped, so there is no
  * namespace field.
  */
@js.native
trait OwnerReference extends js.Object {
  /**
    * API version of the referent.
    */
  val apiVersion: String = js.native
  /**
    * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be
    * deleted from the key-value store until this reference is removed. Defaults to false. To set
    * this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable
    * Entity) will be returned.
    */
  val blockOwnerDeletion: Boolean = js.native
  /**
    * If true, this reference points to the managing controller.
    */
  val controller: Boolean = js.native
  /**
    * Kind of the referent. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: String = js.native
  /**
    * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  val name: String = js.native
  /**
    * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  val uid: String = js.native
}

object OwnerReference {
  @scala.inline
  def apply(
    apiVersion: String,
    blockOwnerDeletion: Boolean,
    controller: Boolean,
    kind: String,
    name: String,
    uid: String
  ): OwnerReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], blockOwnerDeletion = blockOwnerDeletion.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerReference]
  }
  @scala.inline
  implicit class OwnerReferenceOps[Self <: OwnerReference] (val x: Self) extends AnyVal {
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
    def withBlockOwnerDeletion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockOwnerDeletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withController(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

