package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasteryDto extends StObject {
  
  var description: js.Array[String] = js.native
  
  var id: Double = js.native
  
  var image: ImageDto = js.native
  
  var masteryTree: String = js.native
  
  var name: String = js.native
  
  var prereq: String = js.native
  
  var ranks: Double = js.native
  
  var sanitizedDescription: js.Array[String] = js.native
}
object MasteryDto {
  
  @scala.inline
  def apply(
    description: js.Array[String],
    id: Double,
    image: ImageDto,
    masteryTree: String,
    name: String,
    prereq: String,
    ranks: Double,
    sanitizedDescription: js.Array[String]
  ): MasteryDto = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], masteryTree = masteryTree.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prereq = prereq.asInstanceOf[js.Any], ranks = ranks.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryDto]
  }
  
  @scala.inline
  implicit class MasteryDtoMutableBuilder[Self <: MasteryDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ImageDto): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasteryTree(value: String): Self = StObject.set(x, "masteryTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrereq(value: String): Self = StObject.set(x, "prereq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanks(value: Double): Self = StObject.set(x, "ranks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizedDescription(value: js.Array[String]): Self = StObject.set(x, "sanitizedDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizedDescriptionVarargs(value: String*): Self = StObject.set(x, "sanitizedDescription", js.Array(value :_*))
  }
}
