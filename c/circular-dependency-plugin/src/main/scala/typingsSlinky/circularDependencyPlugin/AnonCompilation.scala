package typingsSlinky.circularDependencyPlugin

import typingsSlinky.webpack.mod.Module
import typingsSlinky.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompilation extends js.Object {
  var compilation: Compilation = js.native
  var module: Module = js.native
  var paths: js.Array[String] = js.native
}

object AnonCompilation {
  @scala.inline
  def apply(compilation: Compilation, module: Module, paths: js.Array[String]): AnonCompilation = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompilation]
  }
  @scala.inline
  implicit class AnonCompilationOps[Self <: AnonCompilation] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withModule(value: Module): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

