package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendOption extends StObject
@JSImport("cesium", "BlendOption")
@js.native
object BlendOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendOption with Double] = js.native
  
  @js.native
  sealed trait OPAQUE extends BlendOption
  /* 0 */ val OPAQUE: typingsSlinky.cesium.mod.BlendOption.OPAQUE with Double = js.native
  
  @js.native
  sealed trait OPAQUE_AND_TRANSLUCENT extends BlendOption
  /* 1 */ val OPAQUE_AND_TRANSLUCENT: typingsSlinky.cesium.mod.BlendOption.OPAQUE_AND_TRANSLUCENT with Double = js.native
  
  @js.native
  sealed trait TRANSLUCENT extends BlendOption
  /* 2 */ val TRANSLUCENT: typingsSlinky.cesium.mod.BlendOption.TRANSLUCENT with Double = js.native
}
