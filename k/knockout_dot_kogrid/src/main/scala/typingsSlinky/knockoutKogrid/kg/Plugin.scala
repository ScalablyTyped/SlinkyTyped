package typingsSlinky.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin[EntityType] extends js.Object {
  def onGridInit(grid: Grid[EntityType]): Unit = js.native
}

object Plugin {
  @scala.inline
  def apply[EntityType](onGridInit: Grid[EntityType] => Unit): Plugin[EntityType] = {
    val __obj = js.Dynamic.literal(onGridInit = js.Any.fromFunction1(onGridInit))
    __obj.asInstanceOf[Plugin[EntityType]]
  }
  @scala.inline
  implicit class PluginOps[Self[entitytype] <: Plugin[entitytype], EntityType] (val x: Self[EntityType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EntityType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EntityType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EntityType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EntityType] with Other]
    @scala.inline
    def withOnGridInit(value: Grid[EntityType] => Unit): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGridInit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

