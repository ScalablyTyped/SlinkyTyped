package typingsSlinky.googleAnalytics.UniversalAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developers.google.com/analytics/devguides/collection/analyticsjs/method-reference
// https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference#hitType
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleAnalytics.googleAnalyticsStrings.pageview
  - typingsSlinky.googleAnalytics.googleAnalyticsStrings.screenview
  - typingsSlinky.googleAnalytics.googleAnalyticsStrings.event
  - typingsSlinky.googleAnalytics.googleAnalyticsStrings.transaction
  - typingsSlinky.googleAnalytics.googleAnalyticsStrings.item
  - typingsSlinky.googleAnalytics.googleAnalyticsStrings.social
  - typingsSlinky.googleAnalytics.googleAnalyticsStrings.exception
  - typingsSlinky.googleAnalytics.googleAnalyticsStrings.timing
*/
trait HitType extends js.Object
object HitType {
  
  @scala.inline
  def event: typingsSlinky.googleAnalytics.googleAnalyticsStrings.event = "event".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.event]
  
  @scala.inline
  def exception: typingsSlinky.googleAnalytics.googleAnalyticsStrings.exception = "exception".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.exception]
  
  @scala.inline
  def item: typingsSlinky.googleAnalytics.googleAnalyticsStrings.item = "item".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.item]
  
  @scala.inline
  def pageview: typingsSlinky.googleAnalytics.googleAnalyticsStrings.pageview = "pageview".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.pageview]
  
  @scala.inline
  def screenview: typingsSlinky.googleAnalytics.googleAnalyticsStrings.screenview = "screenview".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.screenview]
  
  @scala.inline
  def social: typingsSlinky.googleAnalytics.googleAnalyticsStrings.social = "social".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.social]
  
  @scala.inline
  def timing: typingsSlinky.googleAnalytics.googleAnalyticsStrings.timing = "timing".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.timing]
  
  @scala.inline
  def transaction: typingsSlinky.googleAnalytics.googleAnalyticsStrings.transaction = "transaction".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.transaction]
}
