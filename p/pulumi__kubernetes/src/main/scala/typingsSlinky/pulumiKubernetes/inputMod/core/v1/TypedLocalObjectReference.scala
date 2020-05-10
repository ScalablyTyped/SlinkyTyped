package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TypedLocalObjectReference contains enough information to let you locate the typed referenced
  * object inside the same namespace.
  */
@js.native
trait TypedLocalObjectReference extends js.Object {
  /**
    * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the
    * specified Kind must be in the core API group. For any other third-party types, APIGroup is
    * required.
    */
  var apiGroup: js.UndefOr[Input[String]] = js.native
  /**
    * Kind is the type of resource being referenced
    */
  var kind: Input[String] = js.native
  /**
    * Name is the name of resource being referenced
    */
  var name: Input[String] = js.native
}

object TypedLocalObjectReference {
  @scala.inline
  def apply(kind: Input[String], name: Input[String]): TypedLocalObjectReference = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLocalObjectReference]
  }
  @scala.inline
  implicit class TypedLocalObjectReferenceOps[Self <: TypedLocalObjectReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiGroup(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiGroup")(js.undefined)
        ret
    }
  }
  
}

