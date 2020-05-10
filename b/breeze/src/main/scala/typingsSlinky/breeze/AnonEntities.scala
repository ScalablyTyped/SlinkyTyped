package typingsSlinky.breeze

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.breeze.breeze.Entity
import typingsSlinky.breeze.breeze.EntityKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEntities extends js.Object {
  var entities: js.Array[Entity] = js.native
  var tempKeyMapping: StringDictionary[EntityKey] = js.native
}

object AnonEntities {
  @scala.inline
  def apply(entities: js.Array[Entity], tempKeyMapping: StringDictionary[EntityKey]): AnonEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], tempKeyMapping = tempKeyMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntities]
  }
  @scala.inline
  implicit class AnonEntitiesOps[Self <: AnonEntities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: js.Array[Entity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempKeyMapping(value: StringDictionary[EntityKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempKeyMapping")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

