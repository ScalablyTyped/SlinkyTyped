package typingsSlinky.gapiClientPrediction.gapi.client.prediction

import typingsSlinky.gapiClientPrediction.AnonClassWeightedAccuracy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insert2 extends js.Object {
  /** Insert time of the model (as a RFC 3339 timestamp). */
  var created: js.UndefOr[String] = js.native
  /** The unique name for the predictive model. */
  var id: js.UndefOr[String] = js.native
  /** What kind of resource this is. */
  var kind: js.UndefOr[String] = js.native
  /** Model metadata. */
  var modelInfo: js.UndefOr[AnonClassWeightedAccuracy] = js.native
  /** Type of predictive model (CLASSIFICATION or REGRESSION). */
  var modelType: js.UndefOr[String] = js.native
  /** A URL to re-request this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** Google storage location of the training data file. */
  var storageDataLocation: js.UndefOr[String] = js.native
  /** Google storage location of the preprocessing pmml file. */
  var storagePMMLLocation: js.UndefOr[String] = js.native
  /** Google storage location of the pmml model file. */
  var storagePMMLModelLocation: js.UndefOr[String] = js.native
  /** Training completion time (as a RFC 3339 timestamp). */
  var trainingComplete: js.UndefOr[String] = js.native
  /** The current status of the training job. This can be one of following: RUNNING; DONE; ERROR; ERROR: TRAINING JOB NOT FOUND */
  var trainingStatus: js.UndefOr[String] = js.native
}

object Insert2 {
  @scala.inline
  def apply(): Insert2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Insert2]
  }
  @scala.inline
  implicit class Insert2Ops[Self <: Insert2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withModelInfo(value: AnonClassWeightedAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withModelType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageDataLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageDataLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageDataLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageDataLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withStoragePMMLLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePMMLLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoragePMMLLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePMMLLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withStoragePMMLModelLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePMMLModelLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoragePMMLModelLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePMMLModelLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingComplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingStatus")(js.undefined)
        ret
    }
  }
  
}

