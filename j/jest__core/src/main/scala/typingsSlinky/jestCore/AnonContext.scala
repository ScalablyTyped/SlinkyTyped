package typingsSlinky.jestCore

import typingsSlinky.jestCore.searchSourceMod.default
import typingsSlinky.jestRuntime.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: Context
  var searchSource: default
}

object AnonContext {
  @scala.inline
  def apply(context: Context, searchSource: default): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], searchSource = searchSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContext]
  }
}

