package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChampionDto extends js.Object {
  var allytips: js.Array[String] = js.native
  var blurb: String = js.native
  var enemytips: js.Array[String] = js.native
  var id: Double = js.native
  var image: ImageDto = js.native
  var info: InfoDto = js.native
  var key: String = js.native
  var lore: String = js.native
  var name: String = js.native
  var partype: String = js.native
  var passive: PassiveDto = js.native
  var recommended: js.Array[RecommendedDto] = js.native
  var skins: js.Array[SkinDto] = js.native
  var spells: js.Array[ChampionSpellDto] = js.native
  var stats: StatsDto = js.native
  var tags: js.Array[String] = js.native
  var title: String = js.native
}

object ChampionDto {
  @scala.inline
  def apply(
    allytips: js.Array[String],
    blurb: String,
    enemytips: js.Array[String],
    id: Double,
    image: ImageDto,
    info: InfoDto,
    key: String,
    lore: String,
    name: String,
    partype: String,
    passive: PassiveDto,
    recommended: js.Array[RecommendedDto],
    skins: js.Array[SkinDto],
    spells: js.Array[ChampionSpellDto],
    stats: StatsDto,
    tags: js.Array[String],
    title: String
  ): ChampionDto = {
    val __obj = js.Dynamic.literal(allytips = allytips.asInstanceOf[js.Any], blurb = blurb.asInstanceOf[js.Any], enemytips = enemytips.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lore = lore.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partype = partype.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any], recommended = recommended.asInstanceOf[js.Any], skins = skins.asInstanceOf[js.Any], spells = spells.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionDto]
  }
  @scala.inline
  implicit class ChampionDtoOps[Self <: ChampionDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllytips(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allytips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlurb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnemytips(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enemytips")(value.asInstanceOf[js.Any])
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
    def withInfo(value: InfoDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassive(value: PassiveDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecommended(value: js.Array[RecommendedDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkins(value: js.Array[SkinDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpells(value: js.Array[ChampionSpellDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: StatsDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

