package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CrossVersionObjectReference contains enough information to let you identify the referred
  * resource.
  */
@js.native
trait CrossVersionObjectReference extends js.Object {
  /**
    * API version of the referent
    */
  val apiVersion: String = js.native
  /**
    * Kind of the referent; More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
    */
  val kind: String = js.native
  /**
    * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  val name: String = js.native
}

object CrossVersionObjectReference {
  @scala.inline
  def apply(apiVersion: String, kind: String, name: String): CrossVersionObjectReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossVersionObjectReference]
  }
  @scala.inline
  implicit class CrossVersionObjectReferenceOps[Self <: CrossVersionObjectReference] (val x: Self) extends AnyVal {
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
  }
  
}

