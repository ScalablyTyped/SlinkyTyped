package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.Identifier] {
  var name: String
}

object Identifier {
  @scala.inline
  def apply(name: String, `type`: typingsSlinky.luaparse.luaparseStrings.Identifier, loc: AnonEnd = null): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

