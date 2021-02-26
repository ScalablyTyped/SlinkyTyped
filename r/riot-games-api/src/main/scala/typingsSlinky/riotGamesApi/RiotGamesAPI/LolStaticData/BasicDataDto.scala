package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicDataDto extends StObject {
  
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
  implicit class BasicDataDtoMutableBuilder[Self <: BasicDataDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColloq(value: String): Self = StObject.set(x, "colloq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumeOnFull(value: Boolean): Self = StObject.set(x, "consumeOnFull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumed(value: Boolean): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value :_*))
    
    @scala.inline
    def setGold(value: GoldDto): Self = StObject.set(x, "gold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFromAll(value: Boolean): Self = StObject.set(x, "hideFromAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ImageDto): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInStore(value: Boolean): Self = StObject.set(x, "inStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInto(value: js.Array[String]): Self = StObject.set(x, "into", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntoVarargs(value: String*): Self = StObject.set(x, "into", js.Array(value :_*))
    
    @scala.inline
    def setMaps(value: js.Array[StringDictionary[Boolean]]): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapsVarargs(value: StringDictionary[Boolean]*): Self = StObject.set(x, "maps", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredChampion(value: String): Self = StObject.set(x, "requiredChampion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRune(value: MetaDataDto): Self = StObject.set(x, "rune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizedDescription(value: String): Self = StObject.set(x, "sanitizedDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialRecipe(value: Double): Self = StObject.set(x, "specialRecipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStacks(value: Double): Self = StObject.set(x, "stacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: BasicDataStatsDto): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
