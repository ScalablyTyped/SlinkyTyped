package typingsSlinky.eslint.anon

import typingsSlinky.eslint.mod.AST.SourceLocation
import typingsSlinky.eslint.mod.Rule.ReportDescriptorLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loc extends ReportDescriptorLocation {
  var loc: SourceLocation | Column
}

object Loc {
  @scala.inline
  def apply(loc: SourceLocation | Column): Loc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loc]
  }
}

