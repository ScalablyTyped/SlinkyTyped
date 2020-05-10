package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ability extends js.Object {
  var descriptions: Translations = js.native
  var index_number: Double = js.native
  var names: Translations = js.native
}

object Ability {
  @scala.inline
  def apply(descriptions: Translations, index_number: Double, names: Translations): Ability = {
    val __obj = js.Dynamic.literal(descriptions = descriptions.asInstanceOf[js.Any], index_number = index_number.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ability]
  }
  @scala.inline
  implicit class AbilityOps[Self <: Ability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptions(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

