package typingsSlinky.rotDashJs.rotDashJsMod

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.rotDashJs.libPathAstarMod.default
import typingsSlinky.rotDashJs.libPathPathMod.Options
import typingsSlinky.rotDashJs.libPathPathMod.PassableCallback
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Path")
@js.native
object Path extends js.Object {
  @js.native
  class AStar protected () extends default {
    def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
    def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
  }
  
  @js.native
  class Dijkstra protected ()
    extends typingsSlinky.rotDashJs.libPathDijkstraMod.default {
    def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: Partial[Options]) = this()
  }
  
  var AStar: Instantiable4[
    /* toX */ Double, 
    /* toY */ Double, 
    /* passableCallback */ PassableCallback, 
    js.UndefOr[/* options */ Partial[Options]], 
    default
  ] = js.native
  var Dijkstra: Instantiable4[
    /* toX */ Double, 
    /* toY */ Double, 
    /* passableCallback */ PassableCallback, 
    /* options */ Partial[Options], 
    typingsSlinky.rotDashJs.libPathDijkstraMod.default
  ] = js.native
}

