package typingsSlinky.browserDashSync.browserDashSyncMod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RewriteRules extends js.Object {
  var fn: js.UndefOr[
    js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* match */ String, String]
  ] = js.undefined
  var `match`: js.RegExp
  var replace: js.UndefOr[String] = js.undefined
}

object RewriteRules {
  @scala.inline
  def apply(
    `match`: js.RegExp,
    fn: (/* req */ IncomingMessage, /* res */ ServerResponse, /* match */ String) => String = null,
    replace: String = null
  ): RewriteRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction3(fn))
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[RewriteRules]
  }
}

