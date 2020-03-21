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
  def prepareMiddleware(hasDev: AnonDev): js.Promise[Unit] = js.native
}

