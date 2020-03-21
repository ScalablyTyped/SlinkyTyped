package typingsSlinky.instagramPrivateApi.timelineFeedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pagination
  - typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh
  - typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.warm_start_fetch
  - typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.cold_start_fetch
*/
trait TimelineFeedReason extends js.Object

object TimelineFeedReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cold_start_fetch: typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.cold_start_fetch = this.cast("cold_start_fetch")
  @scala.inline
  def pagination: typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pagination = this.cast("pagination")
  @scala.inline
  def pull_to_refresh: typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh = this.cast("pull_to_refresh")
  @scala.inline
  def warm_start_fetch: typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.warm_start_fetch = this.cast("warm_start_fetch")
}

