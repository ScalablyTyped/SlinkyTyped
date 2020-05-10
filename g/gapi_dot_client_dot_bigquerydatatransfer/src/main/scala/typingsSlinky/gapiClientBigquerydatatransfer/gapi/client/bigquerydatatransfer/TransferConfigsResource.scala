package typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBigquerydatatransfer.AnonAccesstoken
import typingsSlinky.gapiClientBigquerydatatransfer.AnonAuthorizationCode
import typingsSlinky.gapiClientBigquerydatatransfer.AnonDataSourceIds
import typingsSlinky.gapiClientBigquerydatatransfer.AnonFields
import typingsSlinky.gapiClientBigquerydatatransfer.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferConfigsResource extends js.Object {
  var runs: RunsResource = js.native
  /** Creates a new data transfer configuration. */
  def create(request: AnonAuthorizationCode): Request_[TransferConfig] = js.native
  /**
    * Deletes a data transfer configuration,
    * including any associated transfer runs and logs.
    */
  def delete(request: AnonAccesstoken): Request_[js.Object] = js.native
  /** Returns information about a data transfer config. */
  def get(request: AnonAccesstoken): Request_[TransferConfig] = js.native
  /** Returns information about all data transfers in the project. */
  def list(request: AnonDataSourceIds): Request_[ListTransferConfigsResponse] = js.native
  /**
    * Updates a data transfer configuration.
    * All fields must be set, even if they are not updated.
    */
  def patch(request: AnonFields): Request_[TransferConfig] = js.native
  /**
    * Creates transfer runs for a time range [range_start_time, range_end_time].
    * For each date - or whatever granularity the data source supports - in the
    * range, one transfer run is created.
    * Note that runs are created per UTC time in the time range.
    */
  def scheduleRuns(request: AnonKey): Request_[ScheduleTransferRunsResponse] = js.native
}

object TransferConfigsResource {
  @scala.inline
  def apply(
    create: AnonAuthorizationCode => Request_[TransferConfig],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[TransferConfig],
    list: AnonDataSourceIds => Request_[ListTransferConfigsResponse],
    patch: AnonFields => Request_[TransferConfig],
    runs: RunsResource,
    scheduleRuns: AnonKey => Request_[ScheduleTransferRunsResponse]
  ): TransferConfigsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), runs = runs.asInstanceOf[js.Any], scheduleRuns = js.Any.fromFunction1(scheduleRuns))
    __obj.asInstanceOf[TransferConfigsResource]
  }
  @scala.inline
  implicit class TransferConfigsResourceOps[Self <: TransferConfigsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAuthorizationCode => Request_[TransferConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[TransferConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonDataSourceIds => Request_[ListTransferConfigsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[TransferConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRuns(value: RunsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleRuns(value: AnonKey => Request_[ScheduleTransferRunsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleRuns")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

