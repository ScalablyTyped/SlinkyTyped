package typingsSlinky.jestDocblock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pragmas extends js.Object {
  var comments: js.UndefOr[String] = js.undefined
  var pragmas: js.UndefOr[typingsSlinky.jestDocblock.mod.Pragmas] = js.undefined
}

object Pragmas {
  @scala.inline
  def apply(comments: String = null, pragmas: typingsSlinky.jestDocblock.mod.Pragmas = null): Pragmas = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (pragmas != null) __obj.updateDynamic("pragmas")(pragmas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pragmas]
  }
}

