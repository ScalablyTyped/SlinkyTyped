package typingsSlinky.prettier.mod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Concat_ extends Doc {
  var parts: js.Array[Doc] = js.native
  var `type`: typingsSlinky.prettier.prettierStrings.concat = js.native
}

object Concat_ {
  @scala.inline
  def apply(parts: js.Array[Doc], `type`: typingsSlinky.prettier.prettierStrings.concat): Concat_ = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concat_]
  }
  @scala.inline
  implicit class Concat_Ops[Self <: Concat_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParts(value: js.Array[Doc]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.prettier.prettierStrings.concat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

