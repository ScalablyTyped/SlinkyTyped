package typingsSlinky.awsSdkMiddlewareSigning.configurationsMod

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.RegionInfo
import typingsSlinky.awsSdkTypes.utilMod.RegionInfoProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviouslyResolved extends js.Object {
  
  def credentialDefaultProvider(input: js.Any): Provider[Credentials] = js.native
  
  var region: String | Provider[String] = js.native
  
  def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = js.native
  def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = js.native
  @JSName("regionInfoProvider")
  var regionInfoProvider_Original: RegionInfoProvider = js.native
  
  var sha256: HashConstructor = js.native
  
  var signingName: String = js.native
}
