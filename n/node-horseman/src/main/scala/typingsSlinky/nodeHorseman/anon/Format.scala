package typingsSlinky.nodeHorseman.anon

import typingsSlinky.nodeHorseman.nodeHorsemanStrings.A3
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.A4
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.A5
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.Legal
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.Letter
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.Tabloid
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.landscape
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.native
  var margin: js.UndefOr[String] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
  }
  
}

