package typingsSlinky.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseDatabase.statsCollectionMod.StatsCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsListenerMod {
  
  @JSImport("@firebase/database/dist/src/core/stats/StatsListener", "StatsListener")
  @js.native
  class StatsListener protected () extends StObject {
    def this(collection_ : StatsCollection) = this()
    
    var collection_ : js.Any = js.native
    
    def get(): StringDictionary[Double] = js.native
    
    var last_ : js.Any = js.native
  }
}
