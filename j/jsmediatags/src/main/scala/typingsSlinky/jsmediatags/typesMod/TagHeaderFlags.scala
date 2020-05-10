package typingsSlinky.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagHeaderFlags extends js.Object {
  var experimental_indicator: Boolean = js.native
  var extended_header: Boolean = js.native
  var footer_present: Boolean = js.native
  var unsynchronisation: Boolean = js.native
}

object TagHeaderFlags {
  @scala.inline
  def apply(
    experimental_indicator: Boolean,
    extended_header: Boolean,
    footer_present: Boolean,
    unsynchronisation: Boolean
  ): TagHeaderFlags = {
    val __obj = js.Dynamic.literal(experimental_indicator = experimental_indicator.asInstanceOf[js.Any], extended_header = extended_header.asInstanceOf[js.Any], footer_present = footer_present.asInstanceOf[js.Any], unsynchronisation = unsynchronisation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagHeaderFlags]
  }
  @scala.inline
  implicit class TagHeaderFlagsOps[Self <: TagHeaderFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExperimental_indicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental_indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtended_header(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extended_header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter_present(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer_present")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsynchronisation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsynchronisation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

