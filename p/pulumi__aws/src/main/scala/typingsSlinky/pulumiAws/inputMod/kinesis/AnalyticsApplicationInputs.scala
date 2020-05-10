package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputs extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.native
  var kinesisFirehose: js.UndefOr[Input[AnalyticsApplicationInputsKinesisFirehose]] = js.native
  var kinesisStream: js.UndefOr[Input[AnalyticsApplicationInputsKinesisStream]] = js.native
  var namePrefix: Input[String] = js.native
  var parallelism: js.UndefOr[Input[AnalyticsApplicationInputsParallelism]] = js.native
  var processingConfiguration: js.UndefOr[Input[AnalyticsApplicationInputsProcessingConfiguration]] = js.native
  var schema: Input[AnalyticsApplicationInputsSchema] = js.native
  var startingPositionConfigurations: js.UndefOr[Input[js.Array[Input[AnalyticsApplicationInputsStartingPositionConfiguration]]]] = js.native
  var streamNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object AnalyticsApplicationInputs {
  @scala.inline
  def apply(namePrefix: Input[String], schema: Input[AnalyticsApplicationInputsSchema]): AnalyticsApplicationInputs = {
    val __obj = js.Dynamic.literal(namePrefix = namePrefix.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputs]
  }
  @scala.inline
  implicit class AnalyticsApplicationInputsOps[Self <: AnalyticsApplicationInputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamePrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: Input[AnalyticsApplicationInputsSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisFirehose(value: Input[AnalyticsApplicationInputsKinesisFirehose]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisFirehose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisFirehose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisFirehose")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisStream(value: Input[AnalyticsApplicationInputsKinesisStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisStream")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelism(value: Input[AnalyticsApplicationInputsParallelism]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelism")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingConfiguration(value: Input[AnalyticsApplicationInputsProcessingConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withStartingPositionConfigurations(value: Input[js.Array[Input[AnalyticsApplicationInputsStartingPositionConfiguration]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPositionConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingPositionConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPositionConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamNames(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamNames")(js.undefined)
        ret
    }
  }
  
}

