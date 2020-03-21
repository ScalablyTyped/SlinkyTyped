package typingsSlinky.keystonejsAppNuxt.mod

import typingsSlinky.keystonejsAppNuxt.AnonDev
import typingsSlinky.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/app-nuxt", "NuxtApp")
@js.native
class NuxtApp () extends BaseApp {
  def this(options: NuxtOptions) = this()
  def prepareMiddleware(hasDev: AnonDev): js.Promise[Unit] = js.native
}

