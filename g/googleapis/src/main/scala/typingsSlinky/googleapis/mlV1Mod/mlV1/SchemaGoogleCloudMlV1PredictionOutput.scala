package typingsSlinky.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents results of a prediction job.
  */
@js.native
trait SchemaGoogleCloudMlV1PredictionOutput extends js.Object {
  /**
    * The number of data instances which resulted in errors.
    */
  var errorCount: js.UndefOr[String] = js.native
  /**
    * Node hours used by the batch prediction job.
    */
  var nodeHours: js.UndefOr[Double] = js.native
  /**
    * The output Google Cloud Storage location provided at the job creation
    * time.
    */
  var outputPath: js.UndefOr[String] = js.native
  /**
    * The number of generated predictions.
    */
  var predictionCount: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1PredictionOutput {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1PredictionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1PredictionOutput]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1PredictionOutputOps[Self <: SchemaGoogleCloudMlV1PredictionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHours")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictionCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictionCount")(js.undefined)
        ret
    }
  }
  
}

