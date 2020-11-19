package typingsSlinky.looksSame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("looks-same/build/src/lib/diff-clusters", JSImport.Namespace)
@js.native
object diffClustersMod extends js.Object {
  
  @js.native
  trait DiffClusters extends js.Object {
    
    var _clusters: js.Any = js.native
    
    var _clustersSize: js.Any = js.native
    
    def _joinToClusters(x: js.Any, y: js.Any): Unit = js.native
    
    def clusters: js.Array[_] = js.native
    
    def update(x: js.Any, y: js.Any): this.type = js.native
  }
  
  @js.native
  class default () extends DiffClusters {
    def this(clustersSize: Double) = this()
  }
}
