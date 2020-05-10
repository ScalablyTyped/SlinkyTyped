package typingsSlinky.jupyterlabStatusbar.tokensMod

import typingsSlinky.jupyterlabStatusbar.tokensMod.IStatusBar.IItem
import typingsSlinky.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStatusBar_ extends js.Object {
  /**
    * Register a new status item.
    *
    * @param id - a unique id for the status item.
    *
    * @param options - The options for how to add the status item.
    *
    * @returns an `IDisposable` that can be disposed to remove the item.
    */
  def registerStatusItem(id: String, statusItem: IItem): IDisposable = js.native
}

object IStatusBar_ {
  @scala.inline
  def apply(registerStatusItem: (String, IItem) => IDisposable): IStatusBar_ = {
    val __obj = js.Dynamic.literal(registerStatusItem = js.Any.fromFunction2(registerStatusItem))
    __obj.asInstanceOf[IStatusBar_]
  }
  @scala.inline
  implicit class IStatusBar_Ops[Self <: IStatusBar_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterStatusItem(value: (String, IItem) => IDisposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerStatusItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

