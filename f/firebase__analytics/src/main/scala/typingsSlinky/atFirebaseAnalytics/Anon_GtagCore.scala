package typingsSlinky.atFirebaseAnalytics

import typingsSlinky.atFirebaseAnalytics.atFirebaseAnalyticsStrings.config
import typingsSlinky.atFirebaseAnalytics.atFirebaseAnalyticsStrings.event
import typingsSlinky.atFirebaseAnalytics.atFirebaseAnalyticsStrings.set
import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.ControlParams
import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.CustomParams
import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.EventParams
import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.Gtag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GtagCore extends js.Object {
  @JSName("gtagCore")
  var gtagCore_Original: Gtag = js.native
  @JSName("wrappedGtag")
  var wrappedGtag_Original: Gtag = js.native
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: ControlParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: CustomParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: EventParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: EventParams): Unit = js.native
  @JSName("gtagCore")
  def gtagCore_set(command: set, config: CustomParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: ControlParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: CustomParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: EventParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: EventParams): Unit = js.native
  @JSName("wrappedGtag")
  def wrappedGtag_set(command: set, config: CustomParams): Unit = js.native
}

