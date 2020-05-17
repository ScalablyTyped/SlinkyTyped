package typingsSlinky.oakdexPokedex.mod

import typingsSlinky.oakdexPokedex.anon.Jump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PokemonVariation extends js.Object {
  var abilities: js.UndefOr[js.Array[String]] = js.native
  var base_stats: js.UndefOr[StatObject] = js.native
  var condition: js.UndefOr[String] = js.native
  var height_eu: js.UndefOr[String] = js.native
  var height_us: js.UndefOr[String] = js.native
  var image_suffix: js.UndefOr[String] = js.native
  var names: Translations = js.native
  var pokeathlon_stats: js.UndefOr[Jump] = js.native
  var types: js.Array[String] = js.native
  var weight_eu: js.UndefOr[String] = js.native
  var weight_us: js.UndefOr[String] = js.native
}

object PokemonVariation {
  @scala.inline
  def apply(names: Translations, types: js.Array[String]): PokemonVariation = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonVariation]
  }
  @scala.inline
  implicit class PokemonVariationOps[Self <: PokemonVariation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNames(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abilities")(js.undefined)
        ret
    }
    @scala.inline
    def withBase_stats(value: StatObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase_stats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_stats")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight_eu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height_eu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight_eu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height_eu")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight_us(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height_us")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight_us: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height_us")(js.undefined)
        ret
    }
    @scala.inline
    def withImage_suffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_suffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withPokeathlon_stats(value: Jump): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pokeathlon_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPokeathlon_stats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pokeathlon_stats")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight_eu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight_eu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight_eu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight_eu")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight_us(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight_us")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight_us: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight_us")(js.undefined)
        ret
    }
  }
  
}

