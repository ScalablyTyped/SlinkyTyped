package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityChangedEventArgs extends js.Object {
  var args: js.Object = js.native
  var entity: Entity = js.native
  var entityAction: EntityActionSymbol = js.native
}

object EntityChangedEventArgs {
  @scala.inline
  def apply(args: js.Object, entity: Entity, entityAction: EntityActionSymbol): EntityChangedEventArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], entityAction = entityAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityChangedEventArgs]
  }
  @scala.inline
  implicit class EntityChangedEventArgsOps[Self <: EntityChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntity(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityAction(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityAction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

