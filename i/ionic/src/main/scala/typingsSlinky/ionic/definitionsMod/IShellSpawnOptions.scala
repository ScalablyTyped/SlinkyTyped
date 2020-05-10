package typingsSlinky.ionic.definitionsMod

import typingsSlinky.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellSpawnOptions extends SpawnOptions {
  var showCommand: js.UndefOr[Boolean] = js.native
}

object IShellSpawnOptions {
  @scala.inline
  def apply(): IShellSpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShellSpawnOptions]
  }
  @scala.inline
  implicit class IShellSpawnOptionsOps[Self <: IShellSpawnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowCommand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCommand")(js.undefined)
        ret
    }
  }
  
}

