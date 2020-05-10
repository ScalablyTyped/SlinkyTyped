package typingsSlinky.node.childProcessMod

import typingsSlinky.node.nodeStrings.pipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpawnOptionsWithoutStdio extends SpawnOptions {
  @JSName("stdio")
  var stdio_SpawnOptionsWithoutStdio: js.UndefOr[pipe | (js.Array[js.UndefOr[Null | pipe]])] = js.native
}

object SpawnOptionsWithoutStdio {
  @scala.inline
  def apply(): SpawnOptionsWithoutStdio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnOptionsWithoutStdio]
  }
  @scala.inline
  implicit class SpawnOptionsWithoutStdioOps[Self <: SpawnOptionsWithoutStdio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStdio(value: pipe | (js.Array[js.UndefOr[Null | pipe]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(js.undefined)
        ret
    }
  }
  
}

