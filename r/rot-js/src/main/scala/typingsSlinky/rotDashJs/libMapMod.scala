package typingsSlinky.rotDashJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rotDashJs.libMapCellularMod.Options
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/map", JSImport.Namespace)
@js.native
object libMapMod extends js.Object {
  @js.native
  object default extends js.Object {
    @js.native
    class Arena ()
      extends typingsSlinky.rotDashJs.libMapArenaMod.default
    
    @js.native
    class Cellular protected ()
      extends typingsSlinky.rotDashJs.libMapCellularMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, options: Partial[Options]) = this()
    }
    
    @js.native
    class Digger protected ()
      extends typingsSlinky.rotDashJs.libMapDiggerMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, options: Partial[typingsSlinky.rotDashJs.libMapDiggerMod.Options]) = this()
    }
    
    @js.native
    class DividedMaze ()
      extends typingsSlinky.rotDashJs.libMapDividedmazeMod.default
    
    @js.native
    class EllerMaze ()
      extends typingsSlinky.rotDashJs.libMapEllermazeMod.default
    
    @js.native
    class IceyMaze protected ()
      extends typingsSlinky.rotDashJs.libMapIceymazeMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, regularity: Double) = this()
    }
    
    @js.native
    class Rogue protected ()
      extends typingsSlinky.rotDashJs.libMapRogueMod.default {
      def this(width: Double, height: Double, options: Partial[typingsSlinky.rotDashJs.libMapRogueMod.Options]) = this()
    }
    
    @js.native
    class Uniform protected ()
      extends typingsSlinky.rotDashJs.libMapUniformMod.default {
      def this(width: Double, height: Double, options: Partial[typingsSlinky.rotDashJs.libMapUniformMod.Options]) = this()
    }
    
    @js.native
    object Arena
      extends TopLevel[Instantiable0[typingsSlinky.rotDashJs.libMapArenaMod.default]]
    
    @js.native
    object Cellular
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                js.UndefOr[/* options */ Partial[Options]], 
                typingsSlinky.rotDashJs.libMapCellularMod.default
              ]
            ]
    
    @js.native
    object Digger
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                js.UndefOr[/* options */ Partial[typingsSlinky.rotDashJs.libMapDiggerMod.Options]], 
                typingsSlinky.rotDashJs.libMapDiggerMod.default
              ]
            ]
    
    @js.native
    object DividedMaze
      extends TopLevel[Instantiable0[typingsSlinky.rotDashJs.libMapDividedmazeMod.default]]
    
    @js.native
    object EllerMaze
      extends TopLevel[Instantiable0[typingsSlinky.rotDashJs.libMapEllermazeMod.default]]
    
    @js.native
    object IceyMaze
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                js.UndefOr[/* regularity */ Double], 
                typingsSlinky.rotDashJs.libMapIceymazeMod.default
              ]
            ]
    
    @js.native
    object Rogue
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                /* options */ Partial[typingsSlinky.rotDashJs.libMapRogueMod.Options], 
                typingsSlinky.rotDashJs.libMapRogueMod.default
              ]
            ]
    
    @js.native
    object Uniform
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                /* options */ Partial[typingsSlinky.rotDashJs.libMapUniformMod.Options], 
                typingsSlinky.rotDashJs.libMapUniformMod.default
              ]
            ]
    
  }
  
}

