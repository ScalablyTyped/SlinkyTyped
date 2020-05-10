package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.compilerMod.AotCompiler
import typingsSlinky.angularCompiler.staticReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompiler extends js.Object {
  var compiler: AotCompiler = js.native
  var reflector: StaticReflector = js.native
}

object AnonCompiler {
  @scala.inline
  def apply(compiler: AotCompiler, reflector: StaticReflector): AnonCompiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], reflector = reflector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompiler]
  }
  @scala.inline
  implicit class AnonCompilerOps[Self <: AnonCompiler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompiler(value: AotCompiler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReflector(value: StaticReflector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

