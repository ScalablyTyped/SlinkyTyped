package typingsSlinky.rotDashJs

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rotDashJs.libPathPathMod.Options
import typingsSlinky.rotDashJs.libPathPathMod.PassableCallback
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/path", JSImport.Namespace)
@js.native
object libPathMod extends js.Object {
  @js.native
  object default extends js.Object {
    @js.native
    class AStar protected ()
      extends typingsSlinky.rotDashJs.libPathAstarMod.default {
      def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
    }
    
    @js.native
    class Dijkstra protected ()
      extends typingsSlinky.rotDashJs.libPathDijkstraMod.default {
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
    }
    
    @js.native
    object AStar
      extends TopLevel[
              Instantiable4[
                /* toX */ Double, 
                /* toY */ Double, 
                /* passableCallback */ PassableCallback, 
                js.UndefOr[/* options */ Partial[Options]], 
                typingsSlinky.rotDashJs.libPathAstarMod.default
              ]
            ]
    
    @js.native
    object Dijkstra
      extends TopLevel[
              Instantiable4[
                /* toX */ Double, 
                /* toY */ Double, 
                /* passableCallback */ PassableCallback, 
                /* options */ Partial[Options], 
                typingsSlinky.rotDashJs.libPathDijkstraMod.default
              ]
            ]
    
  }
  
}

