package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBigquery.anon.All
import typingsSlinky.gapiClientBigquery.anon.Alt
import typingsSlinky.gapiClientBigquery.anon.DatasetId
import typingsSlinky.gapiClientBigquery.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetsResource extends js.Object {
  /**
    * Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying
    * deleteContents. Immediately after deletion, you can create another dataset with the same name.
    */
  def delete(request: Alt): Request[Unit] = js.native
  /** Returns the dataset specified by datasetID. */
  def get(request: DatasetId): Request[Dataset] = js.native
  /** Creates a new empty dataset. */
  def insert(request: Fields): Request[Dataset] = js.native
  /** Lists all datasets in the specified project to which you have been granted the READER dataset role. */
  def list(request: All): Request[DatasetList] = js.native
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource. This method supports patch semantics.
    */
  def patch(request: DatasetId): Request[Dataset] = js.native
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource.
    */
  def update(request: DatasetId): Request[Dataset] = js.native
}

object DatasetsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: DatasetId => Request[Dataset],
    insert: Fields => Request[Dataset],
    list: All => Request[DatasetList],
    patch: DatasetId => Request[Dataset],
    update: DatasetId => Request[Dataset]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DatasetsResource]
  }
  @scala.inline
  implicit class DatasetsResourceOps[Self <: DatasetsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: DatasetId => Request[Dataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Fields => Request[Dataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: All => Request[DatasetList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: DatasetId => Request[Dataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: DatasetId => Request[Dataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

