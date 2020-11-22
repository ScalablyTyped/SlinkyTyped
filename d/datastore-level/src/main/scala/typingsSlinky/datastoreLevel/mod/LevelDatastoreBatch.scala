package typingsSlinky.datastoreLevel.mod

import typingsSlinky.abstractLeveldown.mod.AbstractBatch
import typingsSlinky.interfaceDatastore.mod.Batch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelDatastoreBatch[Value] extends Batch[Value] {
  
  var ops: js.Array[AbstractBatch[String, Value]] = js.native
}
