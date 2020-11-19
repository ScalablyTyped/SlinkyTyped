package typingsSlinky.rotJs

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rotJs.anon.PartialOptions
import typingsSlinky.rotJs.pathPathMod.PassableCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js/lib/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    @js.native
    class AStar protected ()
      extends typingsSlinky.rotJs.astarMod.default {
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
                typingsSlinky.rotJs.astarMod.default
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
}
