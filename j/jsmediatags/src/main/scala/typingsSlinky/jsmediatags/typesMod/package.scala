package typingsSlinky.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Byte = scala.Double
  type ByteArray = js.Array[typingsSlinky.jsmediatags.typesMod.Byte]
  type FrameReaderSignature = js.Function5[
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* data */ typingsSlinky.jsmediatags.mediaFileReaderMod.default, 
    /* flags */ js.UndefOr[js.Any], 
    /* id3header */ js.UndefOr[typingsSlinky.jsmediatags.typesMod.TagHeader], 
    js.Any
  ]
  type TagFrames = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jsmediatags.typesMod.TagFrame]
  type Tags = typingsSlinky.jsmediatags.typesMod.ShortcutTags with typingsSlinky.jsmediatags.typesMod.TagFrames
}
