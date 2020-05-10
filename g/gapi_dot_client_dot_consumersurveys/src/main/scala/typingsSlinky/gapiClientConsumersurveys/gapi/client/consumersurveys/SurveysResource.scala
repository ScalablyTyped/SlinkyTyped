package typingsSlinky.gapiClientConsumersurveys.gapi.client.consumersurveys

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientConsumersurveys.AnonFields
import typingsSlinky.gapiClientConsumersurveys.AnonKey
import typingsSlinky.gapiClientConsumersurveys.AnonOauthtoken
import typingsSlinky.gapiClientConsumersurveys.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveysResource extends js.Object {
  /** Removes a survey from view in all user GET requests. */
  def delete(request: AnonKey): Request_[SurveysDeleteResponse] = js.native
  /** Retrieves information about the specified survey. */
  def get(request: AnonKey): Request_[Survey] = js.native
  /** Creates a survey. */
  def insert(request: AnonOauthtoken): Request_[Survey] = js.native
  /** Lists the surveys owned by the authenticated user. */
  def list(request: AnonFields): Request_[SurveysListResponse] = js.native
  /** Begins running a survey. */
  def start(request: AnonPrettyPrint): Request_[SurveysStartResponse] = js.native
  /** Stops a running survey. */
  def stop(request: AnonPrettyPrint): Request_[SurveysStopResponse] = js.native
  /** Updates a survey. Currently the only property that can be updated is the owners property. */
  def update(request: AnonKey): Request_[Survey] = js.native
}

object SurveysResource {
  @scala.inline
  def apply(
    delete: AnonKey => Request_[SurveysDeleteResponse],
    get: AnonKey => Request_[Survey],
    insert: AnonOauthtoken => Request_[Survey],
    list: AnonFields => Request_[SurveysListResponse],
    start: AnonPrettyPrint => Request_[SurveysStartResponse],
    stop: AnonPrettyPrint => Request_[SurveysStopResponse],
    update: AnonKey => Request_[Survey]
  ): SurveysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SurveysResource]
  }
  @scala.inline
  implicit class SurveysResourceOps[Self <: SurveysResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonKey => Request_[SurveysDeleteResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[Survey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonOauthtoken => Request_[Survey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[SurveysListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: AnonPrettyPrint => Request_[SurveysStartResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: AnonPrettyPrint => Request_[SurveysStopResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[Survey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

