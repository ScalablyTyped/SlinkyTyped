package typingsSlinky.cwiseCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cwiseCompiler.cwiseCompilerStrings.array
  - typingsSlinky.cwiseCompiler.cwiseCompilerStrings.offset
  - typingsSlinky.cwiseCompiler.cwiseCompilerStrings.shape
  - typingsSlinky.cwiseCompiler.cwiseCompilerStrings.scalar
  - typingsSlinky.cwiseCompiler.cwiseCompilerStrings.index
  - typingsSlinky.cwiseCompiler.mod.BlockIndice
  - typingsSlinky.cwiseCompiler.mod.OffsetArg
*/
trait ArgType extends js.Object

object ArgType {
  @scala.inline
  def array: typingsSlinky.cwiseCompiler.cwiseCompilerStrings.array = "array".asInstanceOf[typingsSlinky.cwiseCompiler.cwiseCompilerStrings.array]
  @scala.inline
  def offset: typingsSlinky.cwiseCompiler.cwiseCompilerStrings.offset = "offset".asInstanceOf[typingsSlinky.cwiseCompiler.cwiseCompilerStrings.offset]
  @scala.inline
  def shape: typingsSlinky.cwiseCompiler.cwiseCompilerStrings.shape = "shape".asInstanceOf[typingsSlinky.cwiseCompiler.cwiseCompilerStrings.shape]
  @scala.inline
  def scalar: typingsSlinky.cwiseCompiler.cwiseCompilerStrings.scalar = "scalar".asInstanceOf[typingsSlinky.cwiseCompiler.cwiseCompilerStrings.scalar]
  @scala.inline
  def index: typingsSlinky.cwiseCompiler.cwiseCompilerStrings.index = "index".asInstanceOf[typingsSlinky.cwiseCompiler.cwiseCompilerStrings.index]
  @scala.inline
  implicit def apply(value: BlockIndice): ArgType = value.asInstanceOf[ArgType]
  @scala.inline
  implicit def apply(value: OffsetArg): ArgType = value.asInstanceOf[ArgType]
}

