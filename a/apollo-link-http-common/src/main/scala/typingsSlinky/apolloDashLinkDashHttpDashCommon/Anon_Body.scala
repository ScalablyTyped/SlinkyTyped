package typingsSlinky.apolloDashLinkDashHttpDashCommon

import typingsSlinky.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod.Body
import typingsSlinky.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod.HttpConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: Body
  var options: HttpConfig with (Record[String, _])
}

object Anon_Body {
  @scala.inline
  def apply(body: Body, options: HttpConfig with (Record[String, _])): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Body]
  }
}

