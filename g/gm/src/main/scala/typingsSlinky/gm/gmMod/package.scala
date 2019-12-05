package typingsSlinky.gm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gmMod {
  import typingsSlinky.node.streamMod.Readable

  type CompareCallback = js.Function4[
    /* err */ js.Error | Null, 
    /* isEqual */ Boolean, 
    /* equality */ Double, 
    /* raw */ Double, 
    js.Any
  ]
  type GetterCallback[T] = js.Function2[/* err */ js.Error | Null, /* value */ T, js.Any]
  type WriteCallback = js.Function4[
    /* err */ js.Error | Null, 
    /* stdout */ Readable, 
    /* stderr */ Readable, 
    /* cmd */ String, 
    js.Any
  ]
}
