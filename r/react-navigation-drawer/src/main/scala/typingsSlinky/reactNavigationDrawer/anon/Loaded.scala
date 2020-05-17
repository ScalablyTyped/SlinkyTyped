package typingsSlinky.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loaded extends js.Object {
  var loaded: js.Array[Double] = js.native
}

object Loaded {
  @scala.inline
  def apply(loaded: js.Array[Double]): Loaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loaded]
  }
  @scala.inline
  implicit class LoadedOps[Self <: Loaded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoaded(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

