package typingsSlinky.octokitRest.mod.Octokit

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.octokitRest.anon.Compress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookOptions
  extends /* option */ StringDictionary[js.Any] {
  var baseUrl: String
  var data: js.Any
  var headers: StringDictionary[String]
  var method: String
  // See https://github.com/bitinn/node-fetch#options
  var request: Compress
  var url: String
}

object HookOptions {
  @scala.inline
  def apply(
    baseUrl: String,
    data: js.Any,
    headers: StringDictionary[String],
    method: String,
    request: Compress,
    url: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): HookOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HookOptions]
  }
}

