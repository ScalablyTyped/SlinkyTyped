package typingsSlinky.gulpDashWatch

import typingsSlinky.gulpDashWatch.gulpDashWatchStrings.add
import typingsSlinky.gulpDashWatch.gulpDashWatchStrings.change
import typingsSlinky.gulpDashWatch.gulpDashWatchStrings.unlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  var event: add | change | unlink
}

object Anon_Add {
  @scala.inline
  def apply(event: add | change | unlink): Anon_Add = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Add]
  }
}

