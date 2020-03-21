package typingsSlinky.piwikTracker.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PiwikTracker extends EventEmitter {
  def track(options: PiwikTrackOptions): Unit = js.native
}

