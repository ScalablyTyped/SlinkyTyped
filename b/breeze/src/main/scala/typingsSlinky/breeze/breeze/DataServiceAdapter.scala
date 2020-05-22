package typingsSlinky.breeze.breeze

import typingsSlinky.breeze.anon.InterfaceName
import typingsSlinky.breeze.anon.ResourceName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataServiceAdapter extends js.Object {
  var JsonResultsAdapter: typingsSlinky.breeze.breeze.JsonResultsAdapter
  def checkForRecomposition(interfaceInitializedArgs: InterfaceName): Unit
  def executeQuery(mappingContext: typingsSlinky.breeze.anon.DataService): js.Promise[_]
  def fetchMetadata(metadataStore: MetadataStore, dataService: DataService): js.Promise[_]
  def initialize(): Unit
  def saveChanges(saveContext: ResourceName, saveBundle: js.Object): js.Promise[SaveResult]
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
}

