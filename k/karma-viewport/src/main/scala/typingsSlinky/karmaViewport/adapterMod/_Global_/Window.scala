package typingsSlinky.karmaViewport.adapterMod._Global_

import typingsSlinky.karmaViewport.viewportMod.Viewport
import typingsSlinky.karmaViewport.viewportMod.ViewportConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var __viewport__ : ViewportConfiguration = js.native
  var viewport: Viewport = js.native
}

object Window {
  @scala.inline
  def apply(__viewport__ : ViewportConfiguration, viewport: Viewport): Window = {
    val __obj = js.Dynamic.literal(__viewport__ = __viewport__.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__viewport__(value: ViewportConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__viewport__")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewport(value: Viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

