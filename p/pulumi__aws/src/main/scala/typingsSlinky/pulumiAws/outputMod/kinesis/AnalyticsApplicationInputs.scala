package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputs extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String = js.native
  var kinesisFirehose: js.UndefOr[AnalyticsApplicationInputsKinesisFirehose] = js.native
  var kinesisStream: js.UndefOr[AnalyticsApplicationInputsKinesisStream] = js.native
  var namePrefix: String = js.native
  var parallelism: js.UndefOr[AnalyticsApplicationInputsParallelism] = js.native
  var processingConfiguration: js.UndefOr[AnalyticsApplicationInputsProcessingConfiguration] = js.native
  var schema: AnalyticsApplicationInputsSchema = js.native
  var startingPositionConfigurations: js.Array[AnalyticsApplicationInputsStartingPositionConfiguration] = js.native
  var streamNames: js.Array[String] = js.native
}

object AnalyticsApplicationInputs {
  @scala.inline
  def apply(
    id: String,
    namePrefix: String,
    schema: AnalyticsApplicationInputsSchema,
    startingPositionConfigurations: js.Array[AnalyticsApplicationInputsStartingPositionConfiguration],
    streamNames: js.Array[String]
  ): AnalyticsApplicationInputs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], namePrefix = namePrefix.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], startingPositionConfigurations = startingPositionConfigurations.asInstanceOf[js.Any], streamNames = streamNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputs]
  }
  @scala.inline
  implicit class AnalyticsApplicationInputsOps[Self <: AnalyticsApplicationInputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: AnalyticsApplicationInputsSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingPositionConfigurations(value: js.Array[AnalyticsApplicationInputsStartingPositionConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPositionConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKinesisFirehose(value: AnalyticsApplicationInputsKinesisFirehose): Self = {
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
    def withKinesisStream(value: AnalyticsApplicationInputsKinesisStream): Self = {
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
    def withParallelism(value: AnalyticsApplicationInputsParallelism): Self = {
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
    def withProcessingConfiguration(value: AnalyticsApplicationInputsProcessingConfiguration): Self = {
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
  }
  
}

