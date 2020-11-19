package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.serverActionsMod.ServerActions
import typingsSlinky.firebaseDatabase.statsCollectionMod.StatsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/stats/StatsReporter", JSImport.Namespace)
@js.native
object statsReporterMod extends js.Object {
  
  @js.native
  class StatsReporter protected () extends js.Object {
    /**
      * @param collection
      * @param server_
      */
    def this(collection: StatsCollection, server_ : ServerActions) = this()
    
    def includeStat(stat: String): Unit = js.native
    
    var reportStats_ : js.Any = js.native
    
    var server_ : js.Any = js.native
    
    var statsListener_ : js.Any = js.native
    
    var statsToReport_ : js.Any = js.native
  }
}
