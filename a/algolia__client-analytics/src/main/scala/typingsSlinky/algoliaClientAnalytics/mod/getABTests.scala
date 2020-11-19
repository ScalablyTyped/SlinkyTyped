package typingsSlinky.algoliaClientAnalytics.mod

import typingsSlinky.algoliaClientAnalytics.anon.ReadonlyPromiseGetABTests
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-analytics", "getABTests")
@js.native
object getABTests extends js.Object {
  
  def apply(base: AnalyticsClient): js.Function1[
    /* requestOptions */ js.UndefOr[RequestOptions with GetABTestsOptions], 
    ReadonlyPromiseGetABTests
  ] = js.native
}
