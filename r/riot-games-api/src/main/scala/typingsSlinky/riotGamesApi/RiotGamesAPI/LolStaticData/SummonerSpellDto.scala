package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummonerSpellDto extends js.Object {
  var cooldown: js.Array[Double] = js.native
  var cooldownBurn: String = js.native
  var cost: js.Array[Double] = js.native
  var costBurn: String = js.native
  var costType: String = js.native
  var description: String = js.native
  var effect: js.Array[js.Array[Double]] = js.native
  var effectBurn: js.Array[String] = js.native
  var id: Double = js.native
  var image: ImageDto = js.native
  var key: String = js.native
  var leveltip: LevelTipDto = js.native
  var maxrank: Double = js.native
  var modes: js.Array[String] = js.native
  var name: String = js.native
  var range: js.Array[Double] | String = js.native
  var rangeBurn: String = js.native
  var resource: String = js.native
  var sanitizedDescription: String = js.native
  var sanitizedTooltip: String = js.native
  var summonerLevel: Double = js.native
  var tooltip: String = js.native
  var vars: js.Array[SpellVarsDto] = js.native
}

object SummonerSpellDto {
  @scala.inline
  def apply(
    cooldown: js.Array[Double],
    cooldownBurn: String,
    cost: js.Array[Double],
    costBurn: String,
    costType: String,
    description: String,
    effect: js.Array[js.Array[Double]],
    effectBurn: js.Array[String],
    id: Double,
    image: ImageDto,
    key: String,
    leveltip: LevelTipDto,
    maxrank: Double,
    modes: js.Array[String],
    name: String,
    range: js.Array[Double] | String,
    rangeBurn: String,
    resource: String,
    sanitizedDescription: String,
    sanitizedTooltip: String,
    summonerLevel: Double,
    tooltip: String,
    vars: js.Array[SpellVarsDto]
  ): SummonerSpellDto = {
    val __obj = js.Dynamic.literal(cooldown = cooldown.asInstanceOf[js.Any], cooldownBurn = cooldownBurn.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], costBurn = costBurn.asInstanceOf[js.Any], costType = costType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], effectBurn = effectBurn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], leveltip = leveltip.asInstanceOf[js.Any], maxrank = maxrank.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangeBurn = rangeBurn.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any], sanitizedTooltip = sanitizedTooltip.asInstanceOf[js.Any], summonerLevel = summonerLevel.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummonerSpellDto]
  }
  @scala.inline
  implicit class SummonerSpellDtoOps[Self <: SummonerSpellDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCooldown(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCooldownBurn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldownBurn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCost(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCostBurn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costBurn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCostType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffect(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectBurn(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectBurn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: ImageDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeveltip(value: LevelTipDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leveltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxrank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxrank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeBurn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeBurn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSanitizedDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizedDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSanitizedTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizedTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummonerLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summonerLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVars(value: js.Array[SpellVarsDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

