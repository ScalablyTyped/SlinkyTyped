package typingsSlinky.angularCompiler.outputAstMod

import typingsSlinky.angularCompiler.anon.TagName
import typingsSlinky.angularCompiler.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCompiler.anon.TagName
  - typingsSlinky.angularCompiler.anon.Text
*/
trait JSDocTag extends js.Object

object JSDocTag {
  @scala.inline
  implicit def apply(value: TagName): JSDocTag = value.asInstanceOf[JSDocTag]
  @scala.inline
  implicit def apply(value: Text): JSDocTag = value.asInstanceOf[JSDocTag]
}

