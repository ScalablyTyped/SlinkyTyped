package typingsSlinky.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines how many and what items the entity can be equipped with.
  */
@js.native
trait IEquippableComponent extends js.Object {
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var slots: js.Array[AnonAccepteditems] = js.native
}

object IEquippableComponent {
  @scala.inline
  def apply(slots: js.Array[AnonAccepteditems]): IEquippableComponent = {
    val __obj = js.Dynamic.literal(slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEquippableComponent]
  }
  @scala.inline
  implicit class IEquippableComponentOps[Self <: IEquippableComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlots(value: js.Array[AnonAccepteditems]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

