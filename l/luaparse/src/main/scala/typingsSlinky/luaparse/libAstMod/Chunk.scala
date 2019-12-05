package typingsSlinky.luaparse.libAstMod

import typingsSlinky.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk
  extends Base[typingsSlinky.luaparse.luaparseStrings.Chunk]
     with _Node {
  var body: js.Array[Statement]
  var comments: js.UndefOr[js.Array[String]] = js.undefined
}

object Chunk {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    `type`: typingsSlinky.luaparse.luaparseStrings.Chunk,
    comments: js.Array[String] = null,
    loc: Anon_End = null
  ): Chunk = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
}

