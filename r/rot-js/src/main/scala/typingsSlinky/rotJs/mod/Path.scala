package typingsSlinky.rotJs.mod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rotJs.anon.PartialOptions
import typingsSlinky.rotJs.astarMod.default
import typingsSlinky.rotJs.pathPathMod.PassableCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js", "Path")
@js.native
object Path extends js.Object {
  
  @js.native
  class AStar protected () extends default {
    def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
    def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
  }
  @js.native
  object AStar
    extends TopLevel[
          Instantiable4[
            /* toX */ Double, 
            /* toY */ Double, 
            /* passableCallback */ PassableCallback, 
            /* options */ js.UndefOr[PartialOptions], 
            default
          ]
        ]
  
  @js.native
  class Dijkstra protected ()
    extends typingsSlinky.rotJs.dijkstraMod.default {
    def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
  }
  @js.native
  object Dijkstra
    extends TopLevel[
          Instantiable4[
            /* toX */ Double, 
            /* toY */ Double, 
            /* passableCallback */ PassableCallback, 
            /* options */ PartialOptions, 
            typingsSlinky.rotJs.dijkstraMod.default
          ]
        ]
}
