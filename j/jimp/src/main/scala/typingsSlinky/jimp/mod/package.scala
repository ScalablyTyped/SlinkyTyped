package typingsSlinky.jimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ js.Error | scala.Null, /* value */ T, U]
  type ImageCallback[U] = js.ThisFunction3[
    /* this */ typingsSlinky.jimp.mod.DepreciatedJimp, 
    /* err */ js.Error | scala.Null, 
    /* value */ typingsSlinky.jimp.mod.DepreciatedJimp, 
    /* coords */ typingsSlinky.jimp.anon.X, 
    U
  ]
}
