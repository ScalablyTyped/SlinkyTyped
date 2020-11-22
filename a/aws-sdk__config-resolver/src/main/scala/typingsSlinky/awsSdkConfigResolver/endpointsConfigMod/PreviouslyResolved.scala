package typingsSlinky.awsSdkConfigResolver.endpointsConfigMod

import typingsSlinky.awsSdkTypes.httpMod.Endpoint
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.RegionInfo
import typingsSlinky.awsSdkTypes.utilMod.RegionInfoProvider
import typingsSlinky.awsSdkTypes.utilMod.UrlParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviouslyResolved extends js.Object {
  
  def region(): js.Promise[String] = js.native
  
  def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = js.native
  def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = js.native
  @JSName("regionInfoProvider")
  var regionInfoProvider_Original: RegionInfoProvider = js.native
  
  @JSName("region")
  var region_Original: Provider[String] = js.native
  
  def urlParser(url: String): Endpoint = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
}
