package typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientFusiontables.AnonCopyPresentation
import typingsSlinky.gapiClientFusiontables.AnonDelimiter
import typingsSlinky.gapiClientFusiontables.AnonEncoding
import typingsSlinky.gapiClientFusiontables.AnonFields
import typingsSlinky.gapiClientFusiontables.AnonMaxResults
import typingsSlinky.gapiClientFusiontables.AnonPrettyPrint
import typingsSlinky.gapiClientFusiontables.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableResource extends js.Object {
  /** Copies a table. */
  def copy(request: AnonCopyPresentation): Request_[Table] = js.native
  /** Deletes a table. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Retrieves a specific table by its ID. */
  def get(request: AnonFields): Request_[Table] = js.native
  /** Imports more rows into a table. */
  def importRows(request: AnonDelimiter): Request_[Import] = js.native
  /** Imports a new table. */
  def importTable(request: AnonEncoding): Request_[Table] = js.native
  /** Creates a new table. */
  def insert(request: AnonPrettyPrint): Request_[Table] = js.native
  /** Retrieves a list of tables a user owns. */
  def list(request: AnonMaxResults): Request_[TableList] = js.native
  /**
    * Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch
    * semantics.
    */
  def patch(request: AnonQuotaUser): Request_[Table] = js.native
  /** Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready. */
  def replaceRows(request: AnonDelimiter): Request_[Task] = js.native
  /** Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. */
  def update(request: AnonQuotaUser): Request_[Table] = js.native
}

object TableResource {
  @scala.inline
  def apply(
    copy: AnonCopyPresentation => Request_[Table],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Table],
    importRows: AnonDelimiter => Request_[Import],
    importTable: AnonEncoding => Request_[Table],
    insert: AnonPrettyPrint => Request_[Table],
    list: AnonMaxResults => Request_[TableList],
    patch: AnonQuotaUser => Request_[Table],
    replaceRows: AnonDelimiter => Request_[Task],
    update: AnonQuotaUser => Request_[Table]
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
    def withCopy(value: AnonCopyPresentation => Request_[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImportRows(value: AnonDelimiter => Request_[Import]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImportTable(value: AnonEncoding => Request_[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importTable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPrettyPrint => Request_[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[TableList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonQuotaUser => Request_[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceRows(value: AnonDelimiter => Request_[Task]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonQuotaUser => Request_[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

