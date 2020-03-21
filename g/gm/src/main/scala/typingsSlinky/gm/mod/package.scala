package typingsSlinky.gm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CompareCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* isEqual */ scala.Boolean, 
    /* equality */ scala.Double, 
    /* raw */ scala.Double, 
    js.Any
  ]
  type GetterCallback[T] = js.Function2[/* err */ js.Error | scala.Null, /* value */ T, js.Any]
  type WriteCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* stdout */ typingsSlinky.node.streamMod.Readable, 
    /* stderr */ typingsSlinky.node.streamMod.Readable, 
    /* cmd */ java.lang.String, 
    js.Any
  ]
}
