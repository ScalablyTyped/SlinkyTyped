package typingsSlinky.ebml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ebmlMod {
  import typingsSlinky.ebml.ebmlStrings.end
  import typingsSlinky.ebml.ebmlStrings.start
  import typingsSlinky.ebml.ebmlStrings.tag

  type Decoder = Decoder_
  type Encoder = Encoder_
  type StateAndTagData = js.Tuple2[tag | start | end, Tag[js.Any] | TagMetadata]
  type Tag[T /* <: TagType */] = Tag_[T]
}
