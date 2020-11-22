package typingsSlinky.reactSpringShared.globalsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.allocTypes.mod.OneOrMore
import typingsSlinky.fluids.mod.FluidValue
import typingsSlinky.reactSpringShared.frameLoopMod.FrameLoop
import typingsSlinky.reactSpringShared.frameLoopMod.OpaqueAnimation
import typingsSlinky.reactSpringShared.typesMod.InterpolatorArgs
import typingsSlinky.reactSpringShared.typesMod.InterpolatorConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-spring/shared/esm/globals", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var batchedUpdates: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
  
  var colorNames: StringDictionary[Double] | Null = js.native
  
  var createStringInterpolator: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]] = js.native
  
  var frameLoop: FrameLoop = js.native
  
  var now: js.Function0[Double] = js.native
  
  var requestAnimationFrame: js.Function1[/* cb */ js.Function1[/* time */ Double, Unit], Unit] = js.native
  
  var skipAnimation: Boolean = js.native
  
  var to: js.Function2[
    /* source */ OneOrMore[FluidValue[js.Any, js.Any]], 
    /* args */ InterpolatorArgs[js.Any, js.Any], 
    FluidValue[js.Any, js.Any]
  ] = js.native
  
  var willAdvance: js.Function1[/* animations */ js.Array[OpaqueAnimation], Unit] = js.native
}
