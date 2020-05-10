package typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceAccountSubject holds detailed information for service-account-kind subject.
  */
@js.native
trait ServiceAccountSubject extends js.Object {
  /**
    * `name` is the name of matching ServiceAccount objects, or "*" to match regardless of name.
    * Required.
    */
  var name: Input[String] = js.native
  /**
    * `namespace` is the namespace of matching ServiceAccount objects. Required.
    */
  var namespace: Input[String] = js.native
}

object ServiceAccountSubject {
  @scala.inline
  def apply(name: Input[String], namespace: Input[String]): ServiceAccountSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountSubject]
  }
  @scala.inline
  implicit class ServiceAccountSubjectOps[Self <: ServiceAccountSubject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

