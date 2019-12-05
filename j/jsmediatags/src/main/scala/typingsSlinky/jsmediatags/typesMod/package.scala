package typingsSlinky.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.jsmediatags.build2MediaFileReaderMod.default

  type Byte = Double
  type ByteArray = js.Array[Byte]
  type DataType = js.Array[Double] | TypedArray | String
  type FrameReaderSignature = js.Function5[
    /* offset */ Double, 
    /* length */ Double, 
    /* data */ default, 
    /* flags */ js.UndefOr[js.Any], 
    /* id3header */ js.UndefOr[TagHeader], 
    js.Any
  ]
  type TagFrames = StringDictionary[TagFrame]
  type Tags = ShortcutTags with TagFrames
  type TypedArray = scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
}
