package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition to be met.
  */
@js.native
trait SchemaCondition extends js.Object {
  /**
    * Trusted attributes supplied by the IAM system.
    */
  var iam: js.UndefOr[String] = js.native
  /**
    * An operator to apply the subject with.
    */
  var op: js.UndefOr[String] = js.native
  /**
    * Trusted attributes discharged by the service.
    */
  var svc: js.UndefOr[String] = js.native
  /**
    * Trusted attributes supplied by any service that owns resources and uses
    * the IAM system for access control.
    */
  var sys: js.UndefOr[String] = js.native
  /**
    * DEPRECATED. Use &#39;values&#39; instead.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * The objects of the condition. This is mutually exclusive with
    * &#39;value&#39;.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCondition {
  @scala.inline
  def apply(): SchemaCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCondition]
  }
  @scala.inline
  implicit class SchemaConditionOps[Self <: SchemaCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iam")(js.undefined)
        ret
    }
    @scala.inline
    def withOp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(js.undefined)
        ret
    }
    @scala.inline
    def withSvc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svc")(js.undefined)
        ret
    }
    @scala.inline
    def withSys(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sys")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

