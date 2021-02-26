package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImagePosition extends StObject
@JSGlobal("ej.ImagePosition")
@js.native
object ImagePosition extends StObject {
  
  //support for aligning text in top and image in bottom
  @js.native
  sealed trait ImageBottom extends ImagePosition
  
  //support for aligning text in right and image in left
  @js.native
  sealed trait ImageLeft extends ImagePosition
  
  //support for aligning text in left and image in right
  @js.native
  sealed trait ImageRight extends ImagePosition
  
  //support for aligning text in bottom and image in top.
  @js.native
  sealed trait ImageTop extends ImagePosition
}
