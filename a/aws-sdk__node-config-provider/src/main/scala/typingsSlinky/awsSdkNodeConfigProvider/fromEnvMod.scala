package typingsSlinky.awsSdkNodeConfigProvider

import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEnvMod {
  
  @JSImport("@aws-sdk/node-config-provider/dist/cjs/fromEnv", "fromEnv")
  @js.native
  def fromEnv[T](envVarSelector: GetterFromEnv[T]): Provider[T] = js.native
  
  type GetterFromEnv[T] = js.Function1[/* env */ ProcessEnv, js.UndefOr[T]]
}
