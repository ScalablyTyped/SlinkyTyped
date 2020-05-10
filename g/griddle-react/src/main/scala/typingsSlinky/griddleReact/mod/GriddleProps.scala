package typingsSlinky.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleProps[T]
  extends GriddlePlugin
     with GriddleInitialState {
  var core: js.UndefOr[GriddlePlugin] = js.native
  var data: js.UndefOr[js.Array[T]] = js.native
  var plugins: js.UndefOr[js.Array[GriddlePlugin]] = js.native
  var storeKey: js.UndefOr[String] = js.native
}

object GriddleProps {
  @scala.inline
  def apply[T](): GriddleProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleProps[T]]
  }
  @scala.inline
  implicit class GriddlePropsOps[Self[t] <: GriddleProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCore(value: GriddlePlugin): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("core")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCore: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("core")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[GriddlePlugin]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeKey")(js.undefined)
        ret
    }
  }
  
}

