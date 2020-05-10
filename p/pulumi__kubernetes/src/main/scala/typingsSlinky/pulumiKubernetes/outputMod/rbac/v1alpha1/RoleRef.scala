package typingsSlinky.pulumiKubernetes.outputMod.rbac.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RoleRef contains information that points to the role being used
  */
@js.native
trait RoleRef extends js.Object {
  /**
    * APIGroup is the group for the resource being referenced
    */
  val apiGroup: String = js.native
  /**
    * Kind is the type of resource being referenced
    */
  val kind: String = js.native
  /**
    * Name is the name of resource being referenced
    */
  val name: String = js.native
}

object RoleRef {
  @scala.inline
  def apply(apiGroup: String, kind: String, name: String): RoleRef = {
    val __obj = js.Dynamic.literal(apiGroup = apiGroup.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleRef]
  }
  @scala.inline
  implicit class RoleRefOps[Self <: RoleRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiGroup")(value.asInstanceOf[js.Any])
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

