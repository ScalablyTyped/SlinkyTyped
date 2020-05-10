package typingsSlinky.gapiClientPrediction.gapi.client.prediction

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPrediction.AnonFields
import typingsSlinky.gapiClientPrediction.AnonKey
import typingsSlinky.gapiClientPrediction.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainedmodelsResource extends js.Object {
  /** Get analysis of the model and the data the model was trained on. */
  def analyze(request: AnonFields): Request_[Analyze] = js.native
  /** Delete a trained model. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Check training status of your model. */
  def get(request: AnonFields): Request_[Insert2] = js.native
  /** Train a Prediction API model. */
  def insert(request: AnonKey): Request_[Insert2] = js.native
  /** List available models. */
  def list(request: AnonMaxResults): Request_[List] = js.native
  /** Submit model id and request a prediction. */
  def predict(request: AnonFields): Request_[Output] = js.native
  /** Add new data to a trained model. */
  def update(request: AnonFields): Request_[Insert2] = js.native
}

object TrainedmodelsResource {
  @scala.inline
  def apply(
    analyze: AnonFields => Request_[Analyze],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Insert2],
    insert: AnonKey => Request_[Insert2],
    list: AnonMaxResults => Request_[List],
    predict: AnonFields => Request_[Output],
    update: AnonFields => Request_[Insert2]
  ): TrainedmodelsResource = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), predict = js.Any.fromFunction1(predict), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TrainedmodelsResource]
  }
  @scala.inline
  implicit class TrainedmodelsResourceOps[Self <: TrainedmodelsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyze(value: AnonFields => Request_[Analyze]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyze")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[Insert2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[Insert2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[List]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPredict(value: AnonFields => Request_[Output]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predict")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFields => Request_[Insert2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

