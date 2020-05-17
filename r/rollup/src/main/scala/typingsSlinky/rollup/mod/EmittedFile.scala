package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rollup.mod.EmittedAsset
  - typingsSlinky.rollup.mod.EmittedChunk
*/
trait EmittedFile extends js.Object

object EmittedFile {
  @scala.inline
  implicit def apply(value: EmittedAsset): EmittedFile = value.asInstanceOf[EmittedFile]
  @scala.inline
  implicit def apply(value: EmittedChunk): EmittedFile = value.asInstanceOf[EmittedFile]
}

