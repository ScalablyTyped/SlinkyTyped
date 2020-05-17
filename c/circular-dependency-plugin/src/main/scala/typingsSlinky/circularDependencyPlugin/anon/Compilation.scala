package typingsSlinky.circularDependencyPlugin.anon

import typingsSlinky.webpack.mod.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compilation extends js.Object {
  var compilation: typingsSlinky.webpack.mod.compilation.Compilation = js.native
  var module: Module = js.native
  var paths: js.Array[String] = js.native
}

object Compilation {
  @scala.inline
  def apply(
    compilation: typingsSlinky.webpack.mod.compilation.Compilation,
    module: Module,
    paths: js.Array[String]
  ): Compilation = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compilation]
  }
  @scala.inline
  implicit class CompilationOps[Self <: Compilation] (val x: Self) extends AnyVal {
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

