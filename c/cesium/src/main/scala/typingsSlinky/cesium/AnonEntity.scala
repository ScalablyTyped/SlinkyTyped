package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Entity
import typingsSlinky.cesium.mod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEntity extends js.Object {
  var entity: Entity = js.native
  var geometryOptions: js.Any = js.native
  var geometryPropertyName: String = js.native
  var observedPropertyNames: js.Array[String] = js.native
  var scene: Scene = js.native
}

object AnonEntity {
  @scala.inline
  def apply(
    entity: Entity,
    geometryOptions: js.Any,
    geometryPropertyName: String,
    observedPropertyNames: js.Array[String],
    scene: Scene
  ): AnonEntity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], geometryOptions = geometryOptions.asInstanceOf[js.Any], geometryPropertyName = geometryPropertyName.asInstanceOf[js.Any], observedPropertyNames = observedPropertyNames.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntity]
  }
  @scala.inline
  implicit class AnonEntityOps[Self <: AnonEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometryOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometryPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryPropertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservedPropertyNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedPropertyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

