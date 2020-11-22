package typingsSlinky.algoliasearch.algoliasearchMod

import typingsSlinky.algoliaClientAnalytics.mod.ABTest
import typingsSlinky.algoliaClientAnalytics.mod.GetABTestsOptions
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import typingsSlinky.algoliaTransporter.mod.Transporter
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseAddABTestR
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseDeleteABTe
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseGetABTestR
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseGetABTests
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseStopABTest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-analytics.@algolia/client-analytics.AnalyticsClient & {readonly addABTest (abTest : @algolia/client-analytics.@algolia/client-analytics.ABTest, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.AddABTestResponse>>, readonly getABTest (abTestID : number, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.GetABTestResponse>>, readonly getABTests (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-analytics.@algolia/client-analytics.GetABTestsOptions | undefined): std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.GetABTestsResponse>>, readonly stopABTest (abTestID : number, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.StopABTestResponse>>, readonly deleteABTest (abTestID : number, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.DeleteABTestResponse>>} */
@js.native
trait AnalyticsClient extends js.Object {
  
  def addABTest(abTest: ABTest): ReadonlyPromiseAddABTestR = js.native
  def addABTest(abTest: ABTest, requestOptions: RequestOptions): ReadonlyPromiseAddABTestR = js.native
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  def deleteABTest(abTestID: Double): ReadonlyPromiseDeleteABTe = js.native
  def deleteABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseDeleteABTe = js.native
  
  def getABTest(abTestID: Double): ReadonlyPromiseGetABTestR = js.native
  def getABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseGetABTestR = js.native
  
  def getABTests(): ReadonlyPromiseGetABTests = js.native
  def getABTests(requestOptions: RequestOptions with GetABTestsOptions): ReadonlyPromiseGetABTests = js.native
  
  def stopABTest(abTestID: Double): ReadonlyPromiseStopABTest = js.native
  def stopABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseStopABTest = js.native
  
  /**
    * The underlying transporter.
    */
  val transporter: Transporter = js.native
}
