package typingsSlinky.keystonejsAppNext.mod

import typingsSlinky.keystonejsAppNext.AnonDev
import typingsSlinky.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/app-next", "NextApp")
@js.native
class NextApp () extends BaseApp {
  def this(options: NextOptions) = this()
  def prepareMiddleware(hasDevDistDir: AnonDev): js.Promise[_] = js.native
}

