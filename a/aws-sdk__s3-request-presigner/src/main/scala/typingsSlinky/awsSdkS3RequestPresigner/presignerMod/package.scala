package typingsSlinky.awsSdkS3RequestPresigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object presignerMod {
  
  /**
    * PartialBy<T, K> makes properties specified in K optional in interface T
    * see: https://stackoverflow.com/questions/43159887/make-a-single-property-optional-in-typescript
    * */
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type PartialBy[T, K /* <: /* keyof T */ java.lang.String */] = (typingsSlinky.awsSdkS3RequestPresigner.presignerMod.Omit[T, K]) with (typingsSlinky.std.Partial[typingsSlinky.std.Pick[T, K]])
}
