package typingsSlinky.breeze.global.breeze

import typingsSlinky.breeze.anon.InterfaceName
import typingsSlinky.breeze.anon.ResourceName
import typingsSlinky.breeze.breeze.SaveResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.DataServiceAdapter")
@js.native
class DataServiceAdapter ()
  extends typingsSlinky.breeze.breeze.DataServiceAdapter {
  /* CompleteClass */
  override var JsonResultsAdapter: typingsSlinky.breeze.breeze.JsonResultsAdapter = js.native
  /* CompleteClass */
  override def checkForRecomposition(interfaceInitializedArgs: InterfaceName): Unit = js.native
  /* CompleteClass */
  override def executeQuery(mappingContext: typingsSlinky.breeze.anon.DataService): js.Promise[_] = js.native
  /* CompleteClass */
  override def fetchMetadata(
    metadataStore: typingsSlinky.breeze.breeze.MetadataStore,
    dataService: typingsSlinky.breeze.breeze.DataService
  ): js.Promise[_] = js.native
  /* CompleteClass */
  override def initialize(): Unit = js.native
  /* CompleteClass */
  override def saveChanges(saveContext: ResourceName, saveBundle: js.Object): js.Promise[SaveResult] = js.native
}

