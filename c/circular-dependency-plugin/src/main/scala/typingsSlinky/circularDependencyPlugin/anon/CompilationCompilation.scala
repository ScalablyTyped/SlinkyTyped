package typingsSlinky.circularDependencyPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilationCompilation extends js.Object {
  var compilation: typingsSlinky.webpack.mod.compilation.Compilation = js.native
}

object CompilationCompilation {
  @scala.inline
  def apply(compilation: typingsSlinky.webpack.mod.compilation.Compilation): CompilationCompilation = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationCompilation]
  }
  @scala.inline
  implicit class CompilationCompilationOps[Self <: CompilationCompilation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilation(value: typingsSlinky.webpack.mod.compilation.Compilation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

