package typingsSlinky.globalize.globalizeMod

import typingsSlinky.globalize.globalizeStrings.cardinal
import typingsSlinky.globalize.globalizeStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralGeneratorOptions extends js.Object {
  /**
  		 * cardinal (default), or ordinal.
  		 */
  var `type`: js.UndefOr[cardinal | ordinal] = js.native
}

object PluralGeneratorOptions {
  @scala.inline
  def apply(): PluralGeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluralGeneratorOptions]
  }
  @scala.inline
  implicit class PluralGeneratorOptionsOps[Self <: PluralGeneratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: cardinal | ordinal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

