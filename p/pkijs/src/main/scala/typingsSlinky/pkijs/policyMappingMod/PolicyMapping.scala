package typingsSlinky.pkijs.policyMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyMapping extends js.Object {
  var issuerDomainPolicy: String = js.native
  var subjectDomainPolicy: String = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PolicyMapping {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    issuerDomainPolicy: String,
    subjectDomainPolicy: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PolicyMapping = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), issuerDomainPolicy = issuerDomainPolicy.asInstanceOf[js.Any], subjectDomainPolicy = subjectDomainPolicy.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PolicyMapping]
  }
  @scala.inline
  implicit class PolicyMappingOps[Self <: PolicyMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIssuerDomainPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerDomainPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectDomainPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectDomainPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

