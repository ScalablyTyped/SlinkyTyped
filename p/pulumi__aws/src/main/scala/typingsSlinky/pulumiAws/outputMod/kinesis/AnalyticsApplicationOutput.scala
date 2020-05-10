package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationOutput extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String = js.native
  var kinesisFirehose: js.UndefOr[AnalyticsApplicationOutputKinesisFirehose] = js.native
  var kinesisStream: js.UndefOr[AnalyticsApplicationOutputKinesisStream] = js.native
  var lambda: js.UndefOr[AnalyticsApplicationOutputLambda] = js.native
  /**
    * Name of the Kinesis Analytics Application.
    */
  var name: String = js.native
  var schema: AnalyticsApplicationOutputSchema = js.native
}

object AnalyticsApplicationOutput {
  @scala.inline
  def apply(id: String, name: String, schema: AnalyticsApplicationOutputSchema): AnalyticsApplicationOutput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutput]
  }
  @scala.inline
  implicit class AnalyticsApplicationOutputOps[Self <: AnalyticsApplicationOutput] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: AnalyticsApplicationOutputSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKinesisFirehose(value: AnalyticsApplicationOutputKinesisFirehose): Self = {
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
    def withKinesisStream(value: AnalyticsApplicationOutputKinesisStream): Self = {
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
    def withLambda(value: AnalyticsApplicationOutputLambda): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambda: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(js.undefined)
        ret
    }
  }
  
}

