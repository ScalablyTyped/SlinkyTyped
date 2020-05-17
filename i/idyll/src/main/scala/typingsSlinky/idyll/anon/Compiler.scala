package typingsSlinky.idyll.anon

import typingsSlinky.idyllCompiler.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compiler extends js.Object {
  var compiler: Options = js.native
  var components: js.Any = js.native
  var transform: js.Array[_] = js.native
}

object Compiler {
  @scala.inline
  def apply(compiler: Options, components: js.Any, transform: js.Array[_]): Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
  @scala.inline
  implicit class CompilerOps[Self <: Compiler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompiler(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

