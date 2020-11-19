package typingsSlinky.atomically

import typingsSlinky.atomically.typesMod.Disposer
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atomically/dist/utils/temp", JSImport.Namespace)
@js.native
object tempMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def create(filePath: String): String = js.native
    
    def get(filePath: String, creator: js.Function1[/* filePath */ String, String]): js.Tuple2[String, Disposer] = js.native
    def get(filePath: String, creator: js.Function1[/* filePath */ String, String], purge: Boolean): js.Tuple2[String, Disposer] = js.native
    
    def purge(filePath: String): Unit = js.native
    
    def purgeSync(filePath: String): Unit = js.native
    
    def purgeSyncAll(): Unit = js.native
    
    var store: Record[String, Boolean] = js.native
    
    def truncate(filePath: String): String = js.native
  }
}
