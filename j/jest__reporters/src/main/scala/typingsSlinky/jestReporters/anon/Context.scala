package typingsSlinky.jestReporters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: typingsSlinky.jestReporters.typesMod.Context
  var matches: AllTests
}

object Context {
  @scala.inline
  def apply(context: typingsSlinky.jestReporters.typesMod.Context, matches: AllTests): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

