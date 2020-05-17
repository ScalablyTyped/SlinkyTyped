package typingsSlinky.breeze.breeze

import typingsSlinky.breeze.anon.InterfaceName
import typingsSlinky.breeze.anon.ResourceName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataServiceAdapter extends js.Object {
  var JsonResultsAdapter: typingsSlinky.breeze.breeze.JsonResultsAdapter = js.native
  def checkForRecomposition(interfaceInitializedArgs: InterfaceName): Unit = js.native
  def executeQuery(mappingContext: typingsSlinky.breeze.anon.DataService): js.Promise[_] = js.native
  def fetchMetadata(metadataStore: MetadataStore, dataService: DataService): js.Promise[_] = js.native
  def initialize(): Unit = js.native
  def saveChanges(saveContext: ResourceName, saveBundle: js.Object): js.Promise[SaveResult] = js.native
}

object DataServiceAdapter {
  @scala.inline
  def apply(
    JsonResultsAdapter: JsonResultsAdapter,
    checkForRecomposition: InterfaceName => Unit,
    executeQuery: typingsSlinky.breeze.anon.DataService => js.Promise[_],
    fetchMetadata: (MetadataStore, DataService) => js.Promise[_],
    initialize: () => Unit,
    saveChanges: (ResourceName, js.Object) => js.Promise[SaveResult]
  ): DataServiceAdapter = {
    val __obj = js.Dynamic.literal(JsonResultsAdapter = JsonResultsAdapter.asInstanceOf[js.Any], checkForRecomposition = js.Any.fromFunction1(checkForRecomposition), executeQuery = js.Any.fromFunction1(executeQuery), fetchMetadata = js.Any.fromFunction2(fetchMetadata), initialize = js.Any.fromFunction0(initialize), saveChanges = js.Any.fromFunction2(saveChanges))
    __obj.asInstanceOf[DataServiceAdapter]
  }
  @scala.inline
  implicit class DataServiceAdapterOps[Self <: DataServiceAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonResultsAdapter(value: JsonResultsAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonResultsAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckForRecomposition(value: InterfaceName => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkForRecomposition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExecuteQuery(value: typingsSlinky.breeze.anon.DataService => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFetchMetadata(value: (MetadataStore, DataService) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMetadata")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSaveChanges(value: (ResourceName, js.Object) => js.Promise[SaveResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChanges")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

