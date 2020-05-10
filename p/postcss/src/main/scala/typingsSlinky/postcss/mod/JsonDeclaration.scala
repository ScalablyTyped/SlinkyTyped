package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonDeclaration extends JsonNode {
  /**
    * True if the declaration has an !important annotation.
    */
  var important: js.UndefOr[Boolean] = js.native
}

object JsonDeclaration {
  @scala.inline
  def apply(): JsonDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonDeclaration]
  }
  @scala.inline
  implicit class JsonDeclarationOps[Self <: JsonDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("important")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("important")(js.undefined)
        ret
    }
  }
  
}

