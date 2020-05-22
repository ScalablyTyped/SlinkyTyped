package typingsSlinky.prettier.mod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indent_ extends _Doc {
  var contents: Doc
  var `type`: typingsSlinky.prettier.prettierStrings.indent
}

object Indent_ {
  @scala.inline
  def apply(contents: Doc, `type`: typingsSlinky.prettier.prettierStrings.indent): Indent_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent_]
  }
}

