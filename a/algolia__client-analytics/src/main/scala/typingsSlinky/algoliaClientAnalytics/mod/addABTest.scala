package typingsSlinky.algoliaClientAnalytics.mod

import typingsSlinky.algoliaClientAnalytics.anon.ReadonlyPromiseAddABTestR
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-analytics", "addABTest")
@js.native
object addABTest extends js.Object {
  
  def apply(base: AnalyticsClient): js.Function2[
    /* abTest */ ABTest, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseAddABTestR
  ] = js.native
}
