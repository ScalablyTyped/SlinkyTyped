package typingsSlinky.expressUnless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var method: js.UndefOr[String | js.Array[String]] = js.undefined
  var methods: js.UndefOr[js.Array[String]] = js.undefined
  var url: String | js.RegExp
}

object Method {
  @scala.inline
  def apply(
    url: String | js.RegExp,
    method: String | js.Array[String] = null,
    methods: js.Array[String] = null
  ): Method = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
}

