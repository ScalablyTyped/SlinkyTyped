package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.FieldsKey
import typingsSlinky.gapiClientDfareporting.anon.Key
import typingsSlinky.gapiClientDfareporting.anon.Scope
import typingsSlinky.gapiClientDfareporting.anon.Synchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  var compatibleFields: CompatibleFieldsResource = js.native
  var files: FilesResource = js.native
  /** Deletes a report by its ID. */
  def delete(request: FieldsKey): Request[Unit] = js.native
  /** Retrieves a report by its ID. */
  def get(request: FieldsKey): Request[Report] = js.native
  /** Creates a report. */
  def insert(request: Key): Request[Report] = js.native
  /** Retrieves list of reports. */
  def list(request: Scope): Request[ReportList] = js.native
  /** Updates a report. This method supports patch semantics. */
  def patch(request: FieldsKey): Request[Report] = js.native
  /** Runs a report. */
  def run(request: Synchronous): Request[File] = js.native
  /** Updates a report. */
  def update(request: FieldsKey): Request[Report] = js.native
}

object ReportsResource {
  @scala.inline
  def apply(
    compatibleFields: CompatibleFieldsResource,
    delete: FieldsKey => Request[Unit],
    files: FilesResource,
    get: FieldsKey => Request[Report],
    insert: Key => Request[Report],
    list: Scope => Request[ReportList],
    patch: FieldsKey => Request[Report],
    run: Synchronous => Request[File],
    update: FieldsKey => Request[Report]
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
    def withDelete(value: FieldsKey => Request[Unit]): Self = {
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
    def withGet(value: FieldsKey => Request[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Scope => Request[ReportList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: FieldsKey => Request[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(value: Synchronous => Request[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: FieldsKey => Request[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

