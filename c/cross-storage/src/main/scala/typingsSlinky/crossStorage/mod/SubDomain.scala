package typingsSlinky.crossStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubDomain extends js.Object {
  var allow: js.Array[CrossStorageMethod]
  var origin: js.RegExp
}

object SubDomain {
  @scala.inline
  def apply(allow: js.Array[CrossStorageMethod], origin: js.RegExp): SubDomain = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDomain]
  }
}

