package typingsSlinky.prettier.mod.doc.builders

import typingsSlinky.prettier.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Align_ extends Doc {
  var contents: Doc = js.native
  var n: Double | String | Type = js.native
  var `type`: typingsSlinky.prettier.prettierStrings.align = js.native
}

object Align_ {
  @scala.inline
  def apply(contents: Doc, n: Double | String | Type, `type`: typingsSlinky.prettier.prettierStrings.align): Align_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align_]
  }
  @scala.inline
  implicit class Align_Ops[Self <: Align_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(value: Doc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: Double | String | Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.prettier.prettierStrings.align): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

