package typingsSlinky.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCompiler.AnonTagName
  - typingsSlinky.angularCompiler.AnonText
*/
trait JSDocTag extends js.Object

object JSDocTag {
  @scala.inline
  def AnonTagName(tagName: JSDocTagName | String): JSDocTag = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocTag]
  }
  @scala.inline
  def AnonText(text: String): JSDocTag = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocTag]
  }
}

