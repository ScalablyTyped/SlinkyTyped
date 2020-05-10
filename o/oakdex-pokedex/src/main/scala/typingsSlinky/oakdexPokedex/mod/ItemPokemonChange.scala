package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemPokemonChange extends js.Object {
  var change: js.UndefOr[String] = js.native
  var change_by: js.UndefOr[Double] = js.native
  var change_by_percent: js.UndefOr[Double] = js.native
  var conditions: js.UndefOr[js.Array[String]] = js.native
  var field: String = js.native
  var revive: js.UndefOr[Boolean] = js.native
}

object ItemPokemonChange {
  @scala.inline
  def apply(field: String): ItemPokemonChange = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPokemonChange]
  }
  @scala.inline
  implicit class ItemPokemonChangeOps[Self <: ItemPokemonChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withChange_by(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChange_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_by")(js.undefined)
        ret
    }
    @scala.inline
    def withChange_by_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_by_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChange_by_percent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_by_percent")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withRevive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revive")(js.undefined)
        ret
    }
  }
  
}

