package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicDataDto extends js.Object {
  var colloq: String = js.native
  var consumeOnFull: Boolean = js.native
  var consumed: Boolean = js.native
  var depth: Double = js.native
  var description: String = js.native
  var from: js.Array[String] = js.native
  var gold: GoldDto = js.native
  var group: String = js.native
  var hideFromAll: Boolean = js.native
  var id: Double = js.native
  var image: ImageDto = js.native
  var inStore: Boolean = js.native
  var into: js.Array[String] = js.native
  var maps: js.Array[StringDictionary[Boolean]] = js.native
  var name: String = js.native
  var plaintext: String = js.native
  var requiredChampion: String = js.native
  var rune: MetaDataDto = js.native
  var sanitizedDescription: String = js.native
  var specialRecipe: Double = js.native
  var stacks: Double = js.native
  var stats: BasicDataStatsDto = js.native
  var tags: js.Array[String] = js.native
}

object BasicDataDto {
  @scala.inline
  def apply(
    colloq: String,
    consumeOnFull: Boolean,
    consumed: Boolean,
    depth: Double,
    description: String,
    from: js.Array[String],
    gold: GoldDto,
    group: String,
    hideFromAll: Boolean,
    id: Double,
    image: ImageDto,
    inStore: Boolean,
    into: js.Array[String],
    maps: js.Array[StringDictionary[Boolean]],
    name: String,
    plaintext: String,
    requiredChampion: String,
    rune: MetaDataDto,
    sanitizedDescription: String,
    specialRecipe: Double,
    stacks: Double,
    stats: BasicDataStatsDto,
    tags: js.Array[String]
  ): BasicDataDto = {
    val __obj = js.Dynamic.literal(colloq = colloq.asInstanceOf[js.Any], consumeOnFull = consumeOnFull.asInstanceOf[js.Any], consumed = consumed.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gold = gold.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], hideFromAll = hideFromAll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], inStore = inStore.asInstanceOf[js.Any], into = into.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any], requiredChampion = requiredChampion.asInstanceOf[js.Any], rune = rune.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any], specialRecipe = specialRecipe.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicDataDto]
  }
  @scala.inline
  implicit class BasicDataDtoOps[Self <: BasicDataDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColloq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colloq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumeOnFull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumeOnFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGold(value: GoldDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideFromAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFromAll")(value.asInstanceOf[js.Any])
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
    def withInStore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInto(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("into")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaps(value: js.Array[StringDictionary[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaintext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredChampion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredChampion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRune(value: MetaDataDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSanitizedDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizedDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecialRecipe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialRecipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStacks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: BasicDataStatsDto): Self = {
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
  }
  
}

