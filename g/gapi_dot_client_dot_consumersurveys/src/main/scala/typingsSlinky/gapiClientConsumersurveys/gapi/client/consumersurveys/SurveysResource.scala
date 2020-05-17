package typingsSlinky.gapiClientConsumersurveys.gapi.client.consumersurveys

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientConsumersurveys.anon.Fields
import typingsSlinky.gapiClientConsumersurveys.anon.Key
import typingsSlinky.gapiClientConsumersurveys.anon.Oauthtoken
import typingsSlinky.gapiClientConsumersurveys.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveysResource extends js.Object {
  /** Removes a survey from view in all user GET requests. */
  def delete(request: Key): Request[SurveysDeleteResponse] = js.native
  /** Retrieves information about the specified survey. */
  def get(request: Key): Request[Survey] = js.native
  /** Creates a survey. */
  def insert(request: Oauthtoken): Request[Survey] = js.native
  /** Lists the surveys owned by the authenticated user. */
  def list(request: Fields): Request[SurveysListResponse] = js.native
  /** Begins running a survey. */
  def start(request: PrettyPrint): Request[SurveysStartResponse] = js.native
  /** Stops a running survey. */
  def stop(request: PrettyPrint): Request[SurveysStopResponse] = js.native
  /** Updates a survey. Currently the only property that can be updated is the owners property. */
  def update(request: Key): Request[Survey] = js.native
}

object SurveysResource {
  @scala.inline
  def apply(
    delete: Key => Request[SurveysDeleteResponse],
    get: Key => Request[Survey],
    insert: Oauthtoken => Request[Survey],
    list: Fields => Request[SurveysListResponse],
    start: PrettyPrint => Request[SurveysStartResponse],
    stop: PrettyPrint => Request[SurveysStopResponse],
    update: Key => Request[Survey]
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
    def withDelete(value: Key => Request[SurveysDeleteResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Key => Request[Survey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Oauthtoken => Request[Survey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[SurveysListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: PrettyPrint => Request[SurveysStartResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: PrettyPrint => Request[SurveysStopResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[Survey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

