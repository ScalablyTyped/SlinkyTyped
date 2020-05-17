package typingsSlinky.rollup.mod

import typingsSlinky.rollup.anon.Missing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rollup.anon.Missing
  - typingsSlinky.rollup.mod.ExistingDecodedSourceMap
*/
trait DecodedSourceMapOrMissing extends js.Object

object DecodedSourceMapOrMissing {
  @scala.inline
  implicit def apply(value: ExistingDecodedSourceMap): DecodedSourceMapOrMissing = value.asInstanceOf[DecodedSourceMapOrMissing]
  @scala.inline
  implicit def apply(value: Missing): DecodedSourceMapOrMissing = value.asInstanceOf[DecodedSourceMapOrMissing]
}

