package typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientFusiontables.anon.CopyPresentation
import typingsSlinky.gapiClientFusiontables.anon.Delimiter
import typingsSlinky.gapiClientFusiontables.anon.Encoding
import typingsSlinky.gapiClientFusiontables.anon.Fields
import typingsSlinky.gapiClientFusiontables.anon.MaxResults
import typingsSlinky.gapiClientFusiontables.anon.PrettyPrint
import typingsSlinky.gapiClientFusiontables.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableResource extends js.Object {
  /** Copies a table. */
  def copy(request: CopyPresentation): Request[Table] = js.native
  /** Deletes a table. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Retrieves a specific table by its ID. */
  def get(request: Fields): Request[Table] = js.native
  /** Imports more rows into a table. */
  def importRows(request: Delimiter): Request[Import] = js.native
  /** Imports a new table. */
  def importTable(request: Encoding): Request[Table] = js.native
  /** Creates a new table. */
  def insert(request: PrettyPrint): Request[Table] = js.native
  /** Retrieves a list of tables a user owns. */
  def list(request: MaxResults): Request[TableList] = js.native
  /**
    * Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch
    * semantics.
    */
  def patch(request: QuotaUser): Request[Table] = js.native
  /** Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready. */
  def replaceRows(request: Delimiter): Request[Task] = js.native
  /** Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. */
  def update(request: QuotaUser): Request[Table] = js.native
}

object TableResource {
  @scala.inline
  def apply(
    copy: CopyPresentation => Request[Table],
    delete: Fields => Request[Unit],
    get: Fields => Request[Table],
    importRows: Delimiter => Request[Import],
    importTable: Encoding => Request[Table],
    insert: PrettyPrint => Request[Table],
    list: MaxResults => Request[TableList],
    patch: QuotaUser => Request[Table],
    replaceRows: Delimiter => Request[Task],
    update: QuotaUser => Request[Table]
  ): TableResource = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), importRows = js.Any.fromFunction1(importRows), importTable = js.Any.fromFunction1(importTable), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), replaceRows = js.Any.fromFunction1(replaceRows), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TableResource]
  }
  @scala.inline
  implicit class TableResourceOps[Self <: TableResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: CopyPresentation => Request[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImportRows(value: Delimiter => Request[Import]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImportTable(value: Encoding => Request[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importTable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: PrettyPrint => Request[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[TableList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: QuotaUser => Request[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceRows(value: Delimiter => Request[Task]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: QuotaUser => Request[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

