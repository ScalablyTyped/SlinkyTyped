package typingsSlinky.algoliaClientAnalytics.mod

import typingsSlinky.algoliaClientAnalytics.anon.ReadonlyPromiseStopABTest
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-analytics", "stopABTest")
@js.native
object stopABTest extends js.Object {
  
  def apply(base: AnalyticsClient): js.Function2[
    /* abTestID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseStopABTest
  ] = js.native
}
