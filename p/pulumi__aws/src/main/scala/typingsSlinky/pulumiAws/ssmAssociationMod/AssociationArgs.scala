package typingsSlinky.pulumiAws.ssmAssociationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ssm.AssociationOutputLocation
import typingsSlinky.pulumiAws.inputMod.ssm.AssociationTarget
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationArgs extends js.Object {
  /**
    * The descriptive name for the association.
    */
  val associationName: js.UndefOr[Input[String]] = js.native
  /**
    * Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls.
    */
  val automationTargetParameterName: js.UndefOr[Input[String]] = js.native
  /**
    * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
    */
  val complianceSeverity: js.UndefOr[Input[String]] = js.native
  /**
    * The document version you want to associate with the target(s). Can be a specific version or the default version.
    */
  val documentVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
    */
  val instanceId: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxConcurrency: js.UndefOr[Input[String]] = js.native
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxErrors: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the SSM document to apply.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * An output location block. Output Location is documented below.
    */
  val outputLocation: js.UndefOr[Input[AssociationOutputLocation]] = js.native
  /**
    * A block of arbitrary string parameters to pass to the SSM document.
    */
  val parameters: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A cron expression when the association will be applied to the target(s).
    */
  val scheduleExpression: js.UndefOr[Input[String]] = js.native
  /**
    * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
    */
  val targets: js.UndefOr[Input[js.Array[Input[AssociationTarget]]]] = js.native
}

object AssociationArgs {
  @scala.inline
  def apply(): AssociationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationArgs]
  }
  @scala.inline
  implicit class AssociationArgsOps[Self <: AssociationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationName")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomationTargetParameterName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationTargetParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationTargetParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationTargetParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceSeverity(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceSeverity")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrency(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxErrors(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
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
    def withOutputLocation(value: Input[AssociationOutputLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleExpression(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: Input[js.Array[Input[AssociationTarget]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
  }
  
}

