package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonFieldsKey
import typingsSlinky.gapiClientDfareporting.AnonKey
import typingsSlinky.gapiClientDfareporting.AnonScope
import typingsSlinky.gapiClientDfareporting.AnonSynchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  var compatibleFields: CompatibleFieldsResource = js.native
  var files: FilesResource = js.native
  /** Deletes a report by its ID. */
  def delete(request: AnonFieldsKey): Request_[Unit] = js.native
  /** Retrieves a report by its ID. */
  def get(request: AnonFieldsKey): Request_[Report] = js.native
  /** Creates a report. */
  def insert(request: AnonKey): Request_[Report] = js.native
  /** Retrieves list of reports. */
  def list(request: AnonScope): Request_[ReportList] = js.native
  /** Updates a report. This method supports patch semantics. */
  def patch(request: AnonFieldsKey): Request_[Report] = js.native
  /** Runs a report. */
  def run(request: AnonSynchronous): Request_[File] = js.native
  /** Updates a report. */
  def update(request: AnonFieldsKey): Request_[Report] = js.native
}

object ReportsResource {
  @scala.inline
  def apply(
    compatibleFields: CompatibleFieldsResource,
    delete: AnonFieldsKey => Request_[Unit],
    files: FilesResource,
    get: AnonFieldsKey => Request_[Report],
    insert: AnonKey => Request_[Report],
    list: AnonScope => Request_[ReportList],
    patch: AnonFieldsKey => Request_[Report],
    run: AnonSynchronous => Request_[File],
    update: AnonFieldsKey => Request_[Report]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(compatibleFields = compatibleFields.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), files = files.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), run = js.Any.fromFunction1(run), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ReportsResource]
  }
  @scala.inline
  implicit class ReportsResourceOps[Self <: ReportsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompatibleFields(value: CompatibleFieldsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: AnonFieldsKey => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFiles(value: FilesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonFieldsKey => Request_[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonScope => Request_[ReportList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFieldsKey => Request_[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(value: AnonSynchronous => Request_[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFieldsKey => Request_[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

