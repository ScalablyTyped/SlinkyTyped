package typingsSlinky.prettier.mod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line_ extends Doc {
  var hard: js.UndefOr[Boolean] = js.native
  var literal: js.UndefOr[Boolean] = js.native
  var soft: js.UndefOr[Boolean] = js.native
  var `type`: typingsSlinky.prettier.prettierStrings.line = js.native
}

object Line_ {
  @scala.inline
  def apply(`type`: typingsSlinky.prettier.prettierStrings.line): Line_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line_]
  }
  @scala.inline
  implicit class Line_Ops[Self <: Line_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.prettier.prettierStrings.line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hard")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteral(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literal")(js.undefined)
        ret
    }
    @scala.inline
    def withSoft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soft")(js.undefined)
        ret
    }
  }
  
}

