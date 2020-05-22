package typingsSlinky.breeze.mod

import typingsSlinky.breeze.breeze.DataServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "DataService")
@js.native
class DataService protected ()
  extends typingsSlinky.breeze.breeze.DataService {
  def this(config: DataServiceOptions) = this()
  /* CompleteClass */
  override var adapterInstance: typingsSlinky.breeze.breeze.DataServiceAdapter = js.native
  /* CompleteClass */
  override var adapterName: String = js.native
  /* CompleteClass */
  override var hasServerMetadata: Boolean = js.native
  /* CompleteClass */
  override var jsonResultsAdapter: typingsSlinky.breeze.breeze.JsonResultsAdapter = js.native
  /* CompleteClass */
  override var serviceName: String = js.native
  /* CompleteClass */
  override var uriBuilderName: String = js.native
  /* CompleteClass */
  override var useJsonp: Boolean = js.native
  /* CompleteClass */
  override def using(config: DataServiceOptions): typingsSlinky.breeze.breeze.DataService = js.native
}

