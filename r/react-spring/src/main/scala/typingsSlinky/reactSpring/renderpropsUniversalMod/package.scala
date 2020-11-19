package typingsSlinky.reactSpring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object renderpropsUniversalMod {
  
  type SpringEasingFunc = js.Function1[/* t */ scala.Double, scala.Double]
  
  type SpringRendererFunc[DS /* <: js.Object */] = js.Function1[/* params */ DS, slinky.core.facade.ReactElement]
  
  type TrailKeyProps = java.lang.String | scala.Double
  
  type TransitionKeyProps = java.lang.String | scala.Double
}
