package typingsSlinky.gaxios

import typingsSlinky.gaxios.anon.Config
import typingsSlinky.gaxios.anon.ShouldRetry
import typingsSlinky.gaxios.commonMod.GaxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryMod {
  
  @JSImport("gaxios/build/src/retry", "getRetryConfig")
  @js.native
  def getRetryConfig(err: GaxiosError[_]): js.Promise[Config | ShouldRetry] = js.native
}
