package typingsSlinky.oauth2orize.mod.grant

import typingsSlinky.oauth2orize.mod.IssueGrantTokenFunction
import typingsSlinky.oauth2orize.mod.MiddlewareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oauth2orize", "grant.token")
@js.native
object token extends js.Object {
  
  def apply(issue: IssueGrantTokenFunction): MiddlewareFunction = js.native
  def apply(options: Options, issue: IssueGrantTokenFunction): MiddlewareFunction = js.native
}
