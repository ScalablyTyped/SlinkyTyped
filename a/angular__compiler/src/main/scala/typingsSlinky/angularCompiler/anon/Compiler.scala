package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.compilerMod.AotCompiler
import typingsSlinky.angularCompiler.staticReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compiler extends js.Object {
  var compiler: AotCompiler
  var reflector: StaticReflector
}

object Compiler {
  @scala.inline
  def apply(compiler: AotCompiler, reflector: StaticReflector): Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], reflector = reflector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
}

