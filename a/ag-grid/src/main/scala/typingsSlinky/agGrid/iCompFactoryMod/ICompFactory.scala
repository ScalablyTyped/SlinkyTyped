package typingsSlinky.agGrid.iCompFactoryMod

import typingsSlinky.agGrid.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompFactory extends js.Object {
  def create(): Component = js.native
}

object ICompFactory {
  @scala.inline
  def apply(create: () => Component): ICompFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[ICompFactory]
  }
  @scala.inline
  implicit class ICompFactoryOps[Self <: ICompFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: () => Component): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

