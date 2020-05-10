package typingsSlinky.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends Node {
  var pairs: js.Array[HashPair] = js.native
  @JSName("type")
  var type_Hash: typingsSlinky.handlebars.handlebarsStrings.Hash = js.native
}

object Hash {
  @scala.inline
  def apply(
    loc: SourceLocation,
    pairs: js.Array[HashPair],
    `type`: typingsSlinky.handlebars.handlebarsStrings.Hash
  ): Hash = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  @scala.inline
  implicit class HashOps[Self <: Hash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPairs(value: js.Array[HashPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.handlebars.handlebarsStrings.Hash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

