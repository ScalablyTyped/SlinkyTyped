package typingsSlinky.pkijs.policyInformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyInformation extends js.Object {
  var policyIdentifier: String = js.native
  /**
    * Value of the TIME class
    */
  var policyQualifiers: js.Array[typingsSlinky.pkijs.policyQualifierInfoMod.default] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PolicyInformation {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    policyIdentifier: String,
    policyQualifiers: js.Array[typingsSlinky.pkijs.policyQualifierInfoMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PolicyInformation = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), policyIdentifier = policyIdentifier.asInstanceOf[js.Any], policyQualifiers = policyQualifiers.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PolicyInformation]
  }
  @scala.inline
  implicit class PolicyInformationOps[Self <: PolicyInformation] (val x: Self) extends AnyVal {
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
    def withPolicyIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyQualifiers(value: js.Array[typingsSlinky.pkijs.policyQualifierInfoMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyQualifiers")(value.asInstanceOf[js.Any])
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

