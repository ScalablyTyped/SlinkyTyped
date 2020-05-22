package typingsSlinky.angularCompiler.outputAstMod

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
  def TagName(tagName: JSDocTagName | String, text: String = null): JSDocTag = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocTag]
  }
  @scala.inline
  def Text(text: String): JSDocTag = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocTag]
  }
}

