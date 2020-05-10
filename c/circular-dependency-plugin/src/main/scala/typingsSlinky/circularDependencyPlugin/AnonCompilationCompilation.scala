package typingsSlinky.circularDependencyPlugin

import typingsSlinky.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompilationCompilation extends js.Object {
  var compilation: Compilation = js.native
}

object AnonCompilationCompilation {
  @scala.inline
  def apply(compilation: Compilation): AnonCompilationCompilation = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompilationCompilation]
  }
  @scala.inline
  implicit class AnonCompilationCompilationOps[Self <: AnonCompilationCompilation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilation(value: Compilation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

