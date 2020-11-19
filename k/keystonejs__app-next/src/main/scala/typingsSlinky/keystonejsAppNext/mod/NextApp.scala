package typingsSlinky.keystonejsAppNext.mod

import typingsSlinky.keystonejsAppNext.anon.Dev
import typingsSlinky.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keystonejs/app-next", "NextApp")
@js.native
class NextApp () extends BaseApp {
  def this(options: NextOptions) = this()
  
  def prepareMiddleware(hasDevDistDir: Dev): js.Promise[_] = js.native
}
