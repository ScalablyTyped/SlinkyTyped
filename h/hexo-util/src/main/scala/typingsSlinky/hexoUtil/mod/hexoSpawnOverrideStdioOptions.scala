package typingsSlinky.hexoUtil.mod

import typingsSlinky.node.childProcessMod.StdioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hexoSpawnOverrideStdioOptions extends hexoSpawnOptions {
  @JSName("stdio")
  var stdio_hexoSpawnOverrideStdioOptions: StdioOptions = js.native
}

object hexoSpawnOverrideStdioOptions {
  @scala.inline
  def apply(stdio: StdioOptions): hexoSpawnOverrideStdioOptions = {
    val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any])
    __obj.asInstanceOf[hexoSpawnOverrideStdioOptions]
  }
  @scala.inline
  implicit class hexoSpawnOverrideStdioOptionsOps[Self <: hexoSpawnOverrideStdioOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStdio(value: StdioOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

