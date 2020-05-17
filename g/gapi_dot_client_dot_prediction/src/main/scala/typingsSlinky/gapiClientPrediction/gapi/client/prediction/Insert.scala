package typingsSlinky.gapiClientPrediction.gapi.client.prediction

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insert extends js.Object {
  /** The unique name for the predictive model. */
  var id: js.UndefOr[String] = js.native
  /** Type of predictive model (classification or regression). */
  var modelType: js.UndefOr[String] = js.native
  /** The Id of the model to be copied over. */
  var sourceModel: js.UndefOr[String] = js.native
  /** Google storage location of the training data file. */
  var storageDataLocation: js.UndefOr[String] = js.native
  /** Google storage location of the preprocessing pmml file. */
  var storagePMMLLocation: js.UndefOr[String] = js.native
  /** Google storage location of the pmml model file. */
  var storagePMMLModelLocation: js.UndefOr[String] = js.native
  /** Instances to train model on. */
  var trainingInstances: js.UndefOr[js.Array[typingsSlinky.gapiClientPrediction.anon.Output]] = js.native
  /** A class weighting function, which allows the importance weights for class labels to be specified (Categorical models only). */
  var utility: js.UndefOr[js.Array[Record[String, Double]]] = js.native
}

object Insert {
  @scala.inline
  def apply(): Insert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Insert]
  }
  @scala.inline
  implicit class InsertOps[Self <: Insert] (val x: Self) extends AnyVal {
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
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withSourceModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceModel")(js.undefined)
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
    def withTrainingInstances(value: js.Array[typingsSlinky.gapiClientPrediction.anon.Output]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withUtility(value: js.Array[Record[String, Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utility")(js.undefined)
        ret
    }
  }
  
}

