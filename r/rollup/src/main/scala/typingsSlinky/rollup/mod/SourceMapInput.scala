package typingsSlinky.rollup.mod

import typingsSlinky.rollup.anon.Mappings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rollup.mod.ExistingRawSourceMap
  - java.lang.String
  - scala.Null
  - typingsSlinky.rollup.anon.Mappings
*/
trait SourceMapInput extends js.Object

object SourceMapInput {
  @scala.inline
  implicit def apply(value: ExistingRawSourceMap): SourceMapInput = value.asInstanceOf[SourceMapInput]
  @scala.inline
  implicit def apply(value: Mappings): SourceMapInput = value.asInstanceOf[SourceMapInput]
  @scala.inline
  implicit def apply(value: Null): SourceMapInput = value.asInstanceOf[SourceMapInput]
  @scala.inline
  implicit def apply(value: String): SourceMapInput = value.asInstanceOf[SourceMapInput]
}

