package typingsSlinky.gapiClientFitness.gapi.client.fitness

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientFitness.AnonDataTypeName
import typingsSlinky.gapiClientFitness.AnonFields
import typingsSlinky.gapiClientFitness.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourcesResource extends js.Object {
  var dataPointChanges: DataPointChangesResource = js.native
  var datasets: DatasetsResource = js.native
  /**
    * Creates a new data source that is unique across all data sources belonging to this user. The data stream ID field can be omitted and will be generated
    * by the server with the correct format. The data stream ID is an ordered combination of some fields from the data source. In addition to the data source
    * fields reflected into the data source ID, the developer project number that is authenticated when creating the data source is included. This developer
    * project number is obfuscated when read by any other developer reading public data types.
    */
  def create(request: AnonFields): Request_[DataSource] = js.native
  /** Deletes the specified data source. The request will fail if the data source contains any data points. */
  def delete(request: AnonKey): Request_[DataSource] = js.native
  /** Returns the specified data source. */
  def get(request: AnonKey): Request_[DataSource] = js.native
  /**
    * Lists all data sources that are visible to the developer, using the OAuth scopes provided. The list is not exhaustive; the user may have private data
    * sources that are only visible to other developers, or calls using other scopes.
    */
  def list(request: AnonDataTypeName): Request_[ListDataSourcesResponse] = js.native
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId. This method supports patch semantics.
    */
  def patch(request: AnonKey): Request_[DataSource] = js.native
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId.
    */
  def update(request: AnonKey): Request_[DataSource] = js.native
}

object DataSourcesResource {
  @scala.inline
  def apply(
    create: AnonFields => Request_[DataSource],
    dataPointChanges: DataPointChangesResource,
    datasets: DatasetsResource,
    delete: AnonKey => Request_[DataSource],
    get: AnonKey => Request_[DataSource],
    list: AnonDataTypeName => Request_[ListDataSourcesResponse],
    patch: AnonKey => Request_[DataSource],
    update: AnonKey => Request_[DataSource]
  ): DataSourcesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), dataPointChanges = dataPointChanges.asInstanceOf[js.Any], datasets = datasets.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DataSourcesResource]
  }
  @scala.inline
  implicit class DataSourcesResourceOps[Self <: DataSourcesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonFields => Request_[DataSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDataPointChanges(value: DataPointChangesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPointChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasets(value: DatasetsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: AnonKey => Request_[DataSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[DataSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonDataTypeName => Request_[ListDataSourcesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonKey => Request_[DataSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[DataSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

