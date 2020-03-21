package typingsSlinky.angularCompiler.outputAstMod

import typingsSlinky.angularCompiler.angularCompilerStrings.desc
import typingsSlinky.angularCompiler.angularCompilerStrings.id
import typingsSlinky.angularCompiler.angularCompilerStrings.meaning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCompiler.angularCompilerStrings.desc
  - typingsSlinky.angularCompiler.angularCompilerStrings.id
  - typingsSlinky.angularCompiler.angularCompilerStrings.meaning
*/
trait JSDocTagName extends js.Object

object JSDocTagName {
  @scala.inline
  def Desc: desc = this.cast("desc")
  @scala.inline
  def Id: id = this.cast("id")
  @scala.inline
  def Meaning: meaning = this.cast("meaning")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

