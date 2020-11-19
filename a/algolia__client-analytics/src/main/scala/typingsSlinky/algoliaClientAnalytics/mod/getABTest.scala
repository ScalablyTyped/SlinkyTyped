package typingsSlinky.algoliaClientAnalytics.mod

import typingsSlinky.algoliaClientAnalytics.anon.ReadonlyPromiseGetABTestR
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-analytics", "getABTest")
@js.native
object getABTest extends js.Object {
  
  def apply(base: AnalyticsClient): js.Function2[
    /* abTestID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseGetABTestR
  ] = js.native
}
