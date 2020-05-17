package typingsSlinky.gapiClientPrediction.gapi.client.prediction

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPrediction.anon.Fields
import typingsSlinky.gapiClientPrediction.anon.Key
import typingsSlinky.gapiClientPrediction.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainedmodelsResource extends js.Object {
  /** Get analysis of the model and the data the model was trained on. */
  def analyze(request: Fields): Request[Analyze] = js.native
  /** Delete a trained model. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Check training status of your model. */
  def get(request: Fields): Request[Insert2] = js.native
  /** Train a Prediction API model. */
  def insert(request: Key): Request[Insert2] = js.native
  /** List available models. */
  def list(request: MaxResults): Request[List] = js.native
  /** Submit model id and request a prediction. */
  def predict(request: Fields): Request[Output] = js.native
  /** Add new data to a trained model. */
  def update(request: Fields): Request[Insert2] = js.native
}

object TrainedmodelsResource {
  @scala.inline
  def apply(
    analyze: Fields => Request[Analyze],
    delete: Fields => Request[Unit],
    get: Fields => Request[Insert2],
    insert: Key => Request[Insert2],
    list: MaxResults => Request[List],
    predict: Fields => Request[Output],
    update: Fields => Request[Insert2]
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
    def withAnalyze(value: Fields => Request[Analyze]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyze")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[Insert2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[Insert2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[List]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPredict(value: Fields => Request[Output]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predict")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Fields => Request[Insert2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

