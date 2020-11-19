package typingsSlinky.keystonejsAppNuxt.mod

import typingsSlinky.keystonejsAppNuxt.anon.Dev
import typingsSlinky.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keystonejs/app-nuxt", "NuxtApp")
@js.native
class NuxtApp () extends BaseApp {
  def this(options: NuxtOptions) = this()
  
  def prepareMiddleware(hasDev: Dev): js.Promise[Unit] = js.native
}
