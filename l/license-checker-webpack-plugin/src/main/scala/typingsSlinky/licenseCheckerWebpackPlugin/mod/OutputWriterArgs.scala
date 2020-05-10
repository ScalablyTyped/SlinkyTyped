package typingsSlinky.licenseCheckerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputWriterArgs extends js.Object {
  var dependencies: js.Array[Dependency] = js.native
}

object OutputWriterArgs {
  @scala.inline
  def apply(dependencies: js.Array[Dependency]): OutputWriterArgs = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputWriterArgs]
  }
  @scala.inline
  implicit class OutputWriterArgsOps[Self <: OutputWriterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencies(value: js.Array[Dependency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

