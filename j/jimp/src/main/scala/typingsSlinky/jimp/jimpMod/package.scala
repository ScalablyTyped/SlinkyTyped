package typingsSlinky.jimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jimpMod {
  import typingsSlinky.jimp.Anon_AlignmentX
  import typingsSlinky.jimp.Anon_X

  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ js.Error | Null, /* value */ T, U]
  type ImageCallback[U] = js.ThisFunction3[
    /* this */ DepreciatedJimp, 
    /* err */ js.Error | Null, 
    /* value */ DepreciatedJimp, 
    /* coords */ Anon_X, 
    U
  ]
  type PrintableText = js.Any | Anon_AlignmentX
}
