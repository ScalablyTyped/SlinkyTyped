package typingsSlinky.keystonejsAppStatic.mod

import typingsSlinky.keystonejsAppStatic.anon.Dev
import typingsSlinky.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keystonejs/app-static", "StaticApp")
@js.native
class StaticApp () extends BaseApp {
  def this(options: StaticOptions) = this()
  
  def prepareMiddleware(hasDev: Dev): js.Promise[Unit] = js.native
}
