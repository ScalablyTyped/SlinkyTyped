package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBigquery.AnonAll
import typingsSlinky.gapiClientBigquery.AnonAlt
import typingsSlinky.gapiClientBigquery.AnonDatasetId
import typingsSlinky.gapiClientBigquery.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetsResource extends js.Object {
  /**
    * Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying
    * deleteContents. Immediately after deletion, you can create another dataset with the same name.
    */
  def delete(request: AnonAlt): Request_[Unit] = js.native
  /** Returns the dataset specified by datasetID. */
  def get(request: AnonDatasetId): Request_[Dataset] = js.native
  /** Creates a new empty dataset. */
  def insert(request: AnonFields): Request_[Dataset] = js.native
  /** Lists all datasets in the specified project to which you have been granted the READER dataset role. */
  def list(request: AnonAll): Request_[DatasetList] = js.native
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource. This method supports patch semantics.
    */
  def patch(request: AnonDatasetId): Request_[Dataset] = js.native
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource.
    */
  def update(request: AnonDatasetId): Request_[Dataset] = js.native
}

object DatasetsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonDatasetId => Request_[Dataset],
    insert: AnonFields => Request_[Dataset],
    list: AnonAll => Request_[DatasetList],
    patch: AnonDatasetId => Request_[Dataset],
    update: AnonDatasetId => Request_[Dataset]
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
    def withDelete(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonDatasetId => Request_[Dataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[Dataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAll => Request_[DatasetList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonDatasetId => Request_[Dataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonDatasetId => Request_[Dataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

