package typingsSlinky.rellax.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rellax.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RellaxOptions extends js.Object {
  /**
    * Will run on every animation event
    * @param positions Object with x and y positions of the rellax element
    */
  var callback: js.UndefOr[js.Function1[/* positions */ AnonX, Unit]] = js.native
  /**
    * Enable the ability to center parallax elements in your viewport
    */
  var center: js.UndefOr[Boolean] = js.native
  /**
    * Enable horizontal parallax. This feature is intended for panoramic style websites, where users scroll horizontally instead of vertically
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * Do we want rellax element to be relative to the mentioned wrapper.
    */
  var relativeToWrapper: js.UndefOr[Boolean] = js.native
  /**
    * Allow decimal pixel values
    */
  var round: js.UndefOr[Boolean] = js.native
  /**
    * A negative value will make it move slower than regular scrolling, and a positive value will make it move faster
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * Enable vertical parallax
    */
  var vertical: js.UndefOr[Boolean] = js.native
  /**
    * By default, the position of parallax elements is determined via the scroll position of the body. Passing in the wrapper property will tell Rellax to watch that element instead
    */
  var wrapper: js.UndefOr[String | HTMLElement] = js.native
}

object RellaxOptions {
  @scala.inline
  def apply(): RellaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RellaxOptions]
  }
  @scala.inline
  implicit class RellaxOptionsOps[Self <: RellaxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: /* positions */ AnonX => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeToWrapper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeToWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeToWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeToWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
  }
  
}

