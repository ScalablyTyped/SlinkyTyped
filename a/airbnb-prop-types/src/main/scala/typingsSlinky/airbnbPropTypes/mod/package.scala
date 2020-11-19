package typingsSlinky.airbnbPropTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ReactFunctionComponentLike = js.Function1[/* repeated */ js.Any, typingsSlinky.propTypes.mod.ReactNodeLike]
  
  type ReactLegacyRefLike[T] = (js.Function1[/* instance */ T | scala.Null, scala.Unit]) | typingsSlinky.airbnbPropTypes.mod.ReactRefLike[T]
  
  type ReactTypeLike = java.lang.String | typingsSlinky.airbnbPropTypes.mod.ReactClassComponentLike | typingsSlinky.airbnbPropTypes.mod.ReactFunctionComponentLike
}
