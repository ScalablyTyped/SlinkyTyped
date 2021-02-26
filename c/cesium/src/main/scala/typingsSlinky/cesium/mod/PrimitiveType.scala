package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrimitiveType extends StObject
@JSImport("cesium", "PrimitiveType")
@js.native
object PrimitiveType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrimitiveType with Double] = js.native
  
  @js.native
  sealed trait LINES extends PrimitiveType
  /* 1 */ val LINES: typingsSlinky.cesium.mod.PrimitiveType.LINES with Double = js.native
  
  @js.native
  sealed trait LINE_LOOP extends PrimitiveType
  /* 2 */ val LINE_LOOP: typingsSlinky.cesium.mod.PrimitiveType.LINE_LOOP with Double = js.native
  
  @js.native
  sealed trait LINE_STRIP extends PrimitiveType
  /* 3 */ val LINE_STRIP: typingsSlinky.cesium.mod.PrimitiveType.LINE_STRIP with Double = js.native
  
  @js.native
  sealed trait POINTS extends PrimitiveType
  /* 0 */ val POINTS: typingsSlinky.cesium.mod.PrimitiveType.POINTS with Double = js.native
  
  @js.native
  sealed trait TRIANGLES extends PrimitiveType
  /* 4 */ val TRIANGLES: typingsSlinky.cesium.mod.PrimitiveType.TRIANGLES with Double = js.native
  
  @js.native
  sealed trait TRIANGLE_FAN extends PrimitiveType
  /* 6 */ val TRIANGLE_FAN: typingsSlinky.cesium.mod.PrimitiveType.TRIANGLE_FAN with Double = js.native
  
  @js.native
  sealed trait TRIANGLE_STRIP extends PrimitiveType
  /* 5 */ val TRIANGLE_STRIP: typingsSlinky.cesium.mod.PrimitiveType.TRIANGLE_STRIP with Double = js.native
}
