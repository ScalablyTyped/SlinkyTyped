package typingsSlinky.googleAnalytics.UniversalAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def event: typingsSlinky.googleAnalytics.googleAnalyticsStrings.event = this.cast("event")
  @scala.inline
  def exception: typingsSlinky.googleAnalytics.googleAnalyticsStrings.exception = this.cast("exception")
  @scala.inline
  def item: typingsSlinky.googleAnalytics.googleAnalyticsStrings.item = this.cast("item")
  @scala.inline
  def pageview: typingsSlinky.googleAnalytics.googleAnalyticsStrings.pageview = this.cast("pageview")
  @scala.inline
  def screenview: typingsSlinky.googleAnalytics.googleAnalyticsStrings.screenview = this.cast("screenview")
  @scala.inline
  def social: typingsSlinky.googleAnalytics.googleAnalyticsStrings.social = this.cast("social")
  @scala.inline
  def timing: typingsSlinky.googleAnalytics.googleAnalyticsStrings.timing = this.cast("timing")
  @scala.inline
  def transaction: typingsSlinky.googleAnalytics.googleAnalyticsStrings.transaction = this.cast("transaction")
}

