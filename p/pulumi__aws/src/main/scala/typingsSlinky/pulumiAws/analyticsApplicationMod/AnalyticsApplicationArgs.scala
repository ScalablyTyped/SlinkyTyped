package typingsSlinky.pulumiAws.analyticsApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.kinesis.AnalyticsApplicationCloudwatchLoggingOptions
import typingsSlinky.pulumiAws.inputMod.kinesis.AnalyticsApplicationInputs
import typingsSlinky.pulumiAws.inputMod.kinesis.AnalyticsApplicationOutput
import typingsSlinky.pulumiAws.inputMod.kinesis.AnalyticsApplicationReferenceDataSources
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationArgs extends js.Object {
  /**
    * The CloudWatch log stream options to monitor application errors.
    * See CloudWatch Logging Options below for more details.
    */
  val cloudwatchLoggingOptions: js.UndefOr[Input[AnalyticsApplicationCloudwatchLoggingOptions]] = js.native
  /**
    * SQL Code to transform input data, and generate output.
    */
  val code: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the application.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Input configuration of the application. See Inputs below for more details.
    */
  val inputs: js.UndefOr[Input[AnalyticsApplicationInputs]] = js.native
  /**
    * Name of the Kinesis Analytics Application.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Output destination configuration of the application. See Outputs below for more details.
    */
  val outputs: js.UndefOr[Input[js.Array[Input[AnalyticsApplicationOutput]]]] = js.native
  /**
    * An S3 Reference Data Source for the application.
    * See Reference Data Sources below for more details.
    */
  val referenceDataSources: js.UndefOr[Input[AnalyticsApplicationReferenceDataSources]] = js.native
  /**
    * Key-value mapping of tags for the Kinesis Analytics Application.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object AnalyticsApplicationArgs {
  @scala.inline
  def apply(): AnalyticsApplicationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationArgs]
  }
  @scala.inline
  implicit class AnalyticsApplicationArgsOps[Self <: AnalyticsApplicationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudwatchLoggingOptions(value: Input[AnalyticsApplicationCloudwatchLoggingOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLoggingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchLoggingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLoggingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: Input[AnalyticsApplicationInputs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
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
    def withOutputs(value: Input[js.Array[Input[AnalyticsApplicationOutput]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceDataSources(value: Input[AnalyticsApplicationReferenceDataSources]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceDataSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceDataSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceDataSources")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

