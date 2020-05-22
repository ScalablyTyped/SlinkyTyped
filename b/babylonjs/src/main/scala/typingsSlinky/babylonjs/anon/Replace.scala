package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replace extends js.Object {
  var replace: String
  var search: js.RegExp
}

object Replace {
  @scala.inline
  def apply(replace: String, search: js.RegExp): Replace = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replace]
  }
}

