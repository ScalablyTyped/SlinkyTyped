package typingsSlinky.rotDashJs.rotDashJsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.rotDashJs.libMapArenaMod.default
import typingsSlinky.rotDashJs.libMapCellularMod.Options
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Map")
@js.native
object Map extends js.Object {
  @js.native
  class Arena () extends default
  
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
  
  var Arena: Instantiable0[default] = js.native
  var Cellular: Instantiable3[
    /* width */ Double, 
    /* height */ Double, 
    js.UndefOr[/* options */ Partial[Options]], 
    typingsSlinky.rotDashJs.libMapCellularMod.default
  ] = js.native
  var Digger: Instantiable3[
    /* width */ Double, 
    /* height */ Double, 
    js.UndefOr[/* options */ Partial[typingsSlinky.rotDashJs.libMapDiggerMod.Options]], 
    typingsSlinky.rotDashJs.libMapDiggerMod.default
  ] = js.native
  var DividedMaze: Instantiable0[typingsSlinky.rotDashJs.libMapDividedmazeMod.default] = js.native
  var EllerMaze: Instantiable0[typingsSlinky.rotDashJs.libMapEllermazeMod.default] = js.native
  var IceyMaze: Instantiable3[
    /* width */ Double, 
    /* height */ Double, 
    js.UndefOr[/* regularity */ Double], 
    typingsSlinky.rotDashJs.libMapIceymazeMod.default
  ] = js.native
  var Rogue: Instantiable3[
    /* width */ Double, 
    /* height */ Double, 
    /* options */ Partial[typingsSlinky.rotDashJs.libMapRogueMod.Options], 
    typingsSlinky.rotDashJs.libMapRogueMod.default
  ] = js.native
  var Uniform: Instantiable3[
    /* width */ Double, 
    /* height */ Double, 
    /* options */ Partial[typingsSlinky.rotDashJs.libMapUniformMod.Options], 
    typingsSlinky.rotDashJs.libMapUniformMod.default
  ] = js.native
}

