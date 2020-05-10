package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapTypeChangeEventArgs extends js.Object {
  /** The map type that map has changed to. */
  var newMapTypeId: MapTypeId = js.native
  /** The map type that the map has changed from. */
  var oldMapTypeId: MapTypeId = js.native
  /** The map instance the event occured on */
  var target: Map = js.native
  /** The type of object the event was attached to. Should always be "map" */
  var targetType: String = js.native
}

object IMapTypeChangeEventArgs {
  @scala.inline
  def apply(newMapTypeId: MapTypeId, oldMapTypeId: MapTypeId, target: Map, targetType: String): IMapTypeChangeEventArgs = {
    val __obj = js.Dynamic.literal(newMapTypeId = newMapTypeId.asInstanceOf[js.Any], oldMapTypeId = oldMapTypeId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapTypeChangeEventArgs]
  }
  @scala.inline
  implicit class IMapTypeChangeEventArgsOps[Self <: IMapTypeChangeEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewMapTypeId(value: MapTypeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMapTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldMapTypeId(value: MapTypeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldMapTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

