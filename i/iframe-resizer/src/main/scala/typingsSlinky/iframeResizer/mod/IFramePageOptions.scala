package typingsSlinky.iframeResizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IFramePageOptions extends js.Object {
  /**
    * These option can be used to override the option set in the parent page
    */
  var heightCalculationMethod: js.UndefOr[HeightCalculationMethod | js.Function0[Double]] = js.native
  /**
    * Receive message posted from the parent page with the iframe.iFrameResizer.sendMessage() method.
    */
  var messageCallback: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
  /**
    * This function is called once iFrame-Resizer has been initialized after receiving a call from the parent page.
    */
  var readyCallback: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * This option allows you to restrict the domain of the parent page,
    * to prevent other sites mimicking your parent page.
    */
  var targetOrigin: js.UndefOr[String] = js.native
  /**
    * These option can be used to override the option set in the parent page
    */
  var widthCalculationMethod: js.UndefOr[WidthCalculationMethod | js.Function0[Double]] = js.native
}

object IFramePageOptions {
  @scala.inline
  def apply(): IFramePageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFramePageOptions]
  }
  @scala.inline
  implicit class IFramePageOptionsOps[Self <: IFramePageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeightCalculationMethodFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightCalculationMethod")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeightCalculationMethod(value: HeightCalculationMethod | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightCalculationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightCalculationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightCalculationMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageCallback(value: /* message */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMessageCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withReadyCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReadyCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthCalculationMethodFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthCalculationMethod")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidthCalculationMethod(value: WidthCalculationMethod | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthCalculationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthCalculationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthCalculationMethod")(js.undefined)
        ret
    }
  }
  
}

