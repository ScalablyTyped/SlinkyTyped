package typingsSlinky.rotJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rotJs.anon.PartialOptionsBorn
import typingsSlinky.rotJs.anon.PartialOptionsCellHeight
import typingsSlinky.rotJs.anon.PartialOptionsCorridorLength
import typingsSlinky.rotJs.anon.PartialOptionsRoomDugPercentage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  @js.native
  object default extends js.Object {
    @js.native
    class Arena ()
      extends typingsSlinky.rotJs.arenaMod.default
    
    @js.native
    class Cellular protected ()
      extends typingsSlinky.rotJs.cellularMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, options: PartialOptionsBorn) = this()
    }
    
    @js.native
    class Digger protected ()
      extends typingsSlinky.rotJs.diggerMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, options: PartialOptionsCorridorLength) = this()
    }
    
    @js.native
    class DividedMaze ()
      extends typingsSlinky.rotJs.dividedmazeMod.default
    
    @js.native
    class EllerMaze ()
      extends typingsSlinky.rotJs.ellermazeMod.default
    
    @js.native
    class IceyMaze protected ()
      extends typingsSlinky.rotJs.iceymazeMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, regularity: Double) = this()
    }
    
    @js.native
    class Rogue protected ()
      extends typingsSlinky.rotJs.rogueMod.default {
      def this(width: Double, height: Double, options: PartialOptionsCellHeight) = this()
    }
    
    @js.native
    class Uniform protected ()
      extends typingsSlinky.rotJs.uniformMod.default {
      def this(width: Double, height: Double, options: PartialOptionsRoomDugPercentage) = this()
    }
    
    @js.native
    object Arena
      extends TopLevel[Instantiable0[typingsSlinky.rotJs.arenaMod.default]]
    
    @js.native
    object Cellular
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                /* options */ js.UndefOr[PartialOptionsBorn], 
                typingsSlinky.rotJs.cellularMod.default
              ]
            ]
    
    @js.native
    object Digger
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                /* options */ js.UndefOr[PartialOptionsCorridorLength], 
                typingsSlinky.rotJs.diggerMod.default
              ]
            ]
    
    @js.native
    object DividedMaze
      extends TopLevel[Instantiable0[typingsSlinky.rotJs.dividedmazeMod.default]]
    
    @js.native
    object EllerMaze
      extends TopLevel[Instantiable0[typingsSlinky.rotJs.ellermazeMod.default]]
    
    @js.native
    object IceyMaze
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                /* regularity */ js.UndefOr[Double], 
                typingsSlinky.rotJs.iceymazeMod.default
              ]
            ]
    
    @js.native
    object Rogue
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                /* options */ PartialOptionsCellHeight, 
                typingsSlinky.rotJs.rogueMod.default
              ]
            ]
    
    @js.native
    object Uniform
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                /* options */ PartialOptionsRoomDugPercentage, 
                typingsSlinky.rotJs.uniformMod.default
              ]
            ]
    
  }
  
}

