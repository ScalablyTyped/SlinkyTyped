package typingsSlinky.pulumiKubernetes.outputMod.authentication.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BoundObjectReference is a reference to an object that a token is bound to.
  */
@js.native
trait BoundObjectReference extends js.Object {
  /**
    * API version of the referent.
    */
  val apiVersion: String = js.native
  /**
    * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
    */
  val kind: String = js.native
  /**
    * Name of the referent.
    */
  val name: String = js.native
  /**
    * UID of the referent.
    */
  val uid: String = js.native
}

object BoundObjectReference {
  @scala.inline
  def apply(apiVersion: String, kind: String, name: String, uid: String): BoundObjectReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundObjectReference]
  }
  @scala.inline
  implicit class BoundObjectReferenceOps[Self <: BoundObjectReference] (val x: Self) extends AnyVal {
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

