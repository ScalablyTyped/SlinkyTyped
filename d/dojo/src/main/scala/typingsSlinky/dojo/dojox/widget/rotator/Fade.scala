package typingsSlinky.dojo.dojox.widget.rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/Fade.html
  *
  *
  */
@js.native
trait Fade extends js.Object {
  /**
    * Returns a dojo.Animation that cross fades two rotator panes.
    *
    * @param args
    */
  def crossFade(args: js.Object): js.Any = js.native
  /**
    * Returns a dojo.Animation that fades out the current pane, then fades in
    * the next pane.
    *
    * @param args
    */
  def fade(args: js.Object): js.Any = js.native
}

object Fade {
  @scala.inline
  def apply(crossFade: js.Object => js.Any, fade: js.Object => js.Any): Fade = {
    val __obj = js.Dynamic.literal(crossFade = js.Any.fromFunction1(crossFade), fade = js.Any.fromFunction1(fade))
    __obj.asInstanceOf[Fade]
  }
  @scala.inline
  implicit class FadeOps[Self <: Fade] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossFade(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossFade")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFade(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

