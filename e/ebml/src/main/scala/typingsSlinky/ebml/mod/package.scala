package typingsSlinky.ebml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Decoder = typingsSlinky.ebml.mod.Decoder_
  
  type Encoder = typingsSlinky.ebml.mod.Encoder_
  
  type StateAndTagData = js.Tuple2[
    typingsSlinky.ebml.ebmlStrings.tag | typingsSlinky.ebml.ebmlStrings.start | typingsSlinky.ebml.ebmlStrings.end, 
    typingsSlinky.ebml.mod.Tag[js.Any] | typingsSlinky.ebml.mod.TagMetadata
  ]
  
  type Tag[T /* <: typingsSlinky.ebml.mod.TagType */] = typingsSlinky.ebml.mod.Tag_[T]
}
