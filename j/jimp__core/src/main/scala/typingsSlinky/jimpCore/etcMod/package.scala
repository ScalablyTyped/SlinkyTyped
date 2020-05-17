package typingsSlinky.jimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object etcMod {
  type DecoderFn = js.Function1[/* data */ typingsSlinky.node.Buffer, typingsSlinky.jimpCore.etcMod.Bitmap]
  type EncoderFn[ImageType /* <: typingsSlinky.jimpCore.etcMod.Image */] = js.Function1[/* image */ ImageType, typingsSlinky.node.Buffer]
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ js.Error | scala.Null, /* value */ T, U]
  type ImageCallback[jimp] = js.ThisFunction3[
    /* this */ jimp, 
    /* err */ js.Error | scala.Null, 
    /* value */ jimp, 
    /* coords */ typingsSlinky.jimpCore.anon.X, 
    js.Any
  ]
}
