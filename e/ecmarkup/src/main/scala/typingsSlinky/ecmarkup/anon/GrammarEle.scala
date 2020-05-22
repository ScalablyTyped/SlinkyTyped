package typingsSlinky.ecmarkup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrammarEle extends js.Object {
  var grammar: typingsSlinky.grammarkdown.mod.Grammar
  var grammarEle: org.scalajs.dom.raw.Element
}

object GrammarEle {
  @scala.inline
  def apply(grammar: typingsSlinky.grammarkdown.mod.Grammar, grammarEle: org.scalajs.dom.raw.Element): GrammarEle = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], grammarEle = grammarEle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarEle]
  }
}

