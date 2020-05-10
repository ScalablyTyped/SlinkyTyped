package typingsSlinky.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Controls the collision box of the entity. When changes to the component are applied the entity's collision box is immediately updated to reflect the new dimensions. WARNING: If the change of the collision box dimensions would cause the entity to be inside a block, the entity might become stuck there and start suffocating.
  */
@js.native
trait ICollisionBoxComponent extends js.Object {
  /**
    * Height of the collision box in blocks. A negative value will be assumed to be 0
    * @default 1.0
    */
  var height: Double = js.native
  /**
    * Width and Depth of the collision box in blocks. A negative value will be assumed to be 0
    * @default 1.0
    */
  var width: Double = js.native
}

object ICollisionBoxComponent {
  @scala.inline
  def apply(height: Double, width: Double): ICollisionBoxComponent = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionBoxComponent]
  }
  @scala.inline
  implicit class ICollisionBoxComponentOps[Self <: ICollisionBoxComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

