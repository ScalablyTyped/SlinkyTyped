package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeNonWordCharactersBoolean extends js.Object {
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.native
}

object AnonIncludeNonWordCharactersBoolean {
  @scala.inline
  def apply(): AnonIncludeNonWordCharactersBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIncludeNonWordCharactersBoolean]
  }
  @scala.inline
  implicit class AnonIncludeNonWordCharactersBooleanOps[Self <: AnonIncludeNonWordCharactersBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeNonWordCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNonWordCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNonWordCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNonWordCharacters")(js.undefined)
        ret
    }
  }
  
}

