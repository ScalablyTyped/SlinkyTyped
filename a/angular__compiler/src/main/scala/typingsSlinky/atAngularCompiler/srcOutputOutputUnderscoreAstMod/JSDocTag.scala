package typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSDocTag extends js.Object {
  var tagName: js.UndefOr[(JSDocTagName | String) with js.UndefOr[scala.Nothing]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object JSDocTag {
  @scala.inline
  def apply(tagName: (JSDocTagName | String) with js.UndefOr[scala.Nothing] = null, text: String = null): JSDocTag = {
    val __obj = js.Dynamic.literal()
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocTag]
  }
}

