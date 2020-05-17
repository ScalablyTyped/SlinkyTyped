package typingsSlinky.restifyPlugins

import typingsSlinky.restifyPlugins.mod.TMetricsCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object restifyPluginsStrings {
  @js.native
  sealed trait aborted extends TMetricsCallback
  
  @js.native
  sealed trait close extends TMetricsCallback
  
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
}

