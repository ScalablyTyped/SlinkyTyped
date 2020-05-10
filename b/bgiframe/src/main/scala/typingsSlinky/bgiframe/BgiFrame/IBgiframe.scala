package typingsSlinky.bgiframe.BgiFrame

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBgiframe extends js.Object {
  var s: ISettings = js.native
  def createIframe(): HTMLElement = js.native
  def fire(element: HTMLElement): Unit = js.native
  def getIframe(element: HTMLElement): HTMLElement = js.native
  def prop(n: js.Any): String = js.native
}

object IBgiframe {
  @scala.inline
  def apply(
    createIframe: () => HTMLElement,
    fire: HTMLElement => Unit,
    getIframe: HTMLElement => HTMLElement,
    prop: js.Any => String,
    s: ISettings
  ): IBgiframe = {
    val __obj = js.Dynamic.literal(createIframe = js.Any.fromFunction0(createIframe), fire = js.Any.fromFunction1(fire), getIframe = js.Any.fromFunction1(getIframe), prop = js.Any.fromFunction1(prop), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBgiframe]
  }
  @scala.inline
  implicit class IBgiframeOps[Self <: IBgiframe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateIframe(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createIframe")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFire(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIframe(value: HTMLElement => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIframe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProp(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withS(value: ISettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

