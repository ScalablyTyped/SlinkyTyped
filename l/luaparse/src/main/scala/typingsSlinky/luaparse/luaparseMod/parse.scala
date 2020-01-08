package typingsSlinky.luaparse.luaparseMod

import typingsSlinky.luaparse.Anon_True
import typingsSlinky.luaparse.libAstMod.Chunk
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luaparse", "parse")
@js.native
object parse extends js.Object {
  def apply(): Parser = js.native
  def apply(code: String): Chunk = js.native
  def apply(code: String, options: Partial[Options] with Anon_True): Parser = js.native
  def apply(options: Partial[Options]): Parser = js.native
}

