package typingsSlinky.nodeJsonDb

import typingsSlinky.nodeJsonDb.mod.JsonDB
import typingsSlinky.nodeJsonDb.utilsMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-json-db/dist/lib/DBParentData", JSImport.Namespace)
@js.native
object dbparentdataMod extends js.Object {
  
  @js.native
  class DBParentData protected () extends js.Object {
    def this(data: js.Any, db: JsonDB, dataPath: String) = this()
    def this(data: js.Any, db: JsonDB, dataPath: String, parent: String) = this()
    
    /**
      * Check if it's an array
      * @param deletion
      */
    var checkArray: js.Any = js.native
    
    val data: KeyValue = js.native
    
    val dataPath: String = js.native
    
    val db: JsonDB = js.native
    
    /**
      * Delete the data of the current path
      */
    def delete(): Unit = js.native
    
    /**
      * Get the data linked to this path
      */
    def getData(): js.Any = js.native
    
    val parent: js.UndefOr[String] = js.native
    
    /**
      * Set the data to the wanted path
      * @param toSet
      */
    def setData(toSet: js.Any): Unit = js.native
  }
}
