package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdGroupDevices extends js.Object {
  def clearDesktopBidModifier(): Unit = js.native
  def clearMobileBidModifier(): Unit = js.native
  def clearTabletBidModifier(): Unit = js.native
  def getDesktopBidModifier(): Double = js.native
  def getMobileBidModifier(): Double = js.native
  def getTabletBidModifier(): Double = js.native
  def setDesktopBidModifier(modifier: Double): Unit = js.native
  def setMobileBidModifier(modifier: Double): Unit = js.native
  def setTabletBidModifier(modifier: Double): Unit = js.native
}

object AdGroupDevices {
  @scala.inline
  def apply(
    clearDesktopBidModifier: () => Unit,
    clearMobileBidModifier: () => Unit,
    clearTabletBidModifier: () => Unit,
    getDesktopBidModifier: () => Double,
    getMobileBidModifier: () => Double,
    getTabletBidModifier: () => Double,
    setDesktopBidModifier: Double => Unit,
    setMobileBidModifier: Double => Unit,
    setTabletBidModifier: Double => Unit
  ): AdGroupDevices = {
    val __obj = js.Dynamic.literal(clearDesktopBidModifier = js.Any.fromFunction0(clearDesktopBidModifier), clearMobileBidModifier = js.Any.fromFunction0(clearMobileBidModifier), clearTabletBidModifier = js.Any.fromFunction0(clearTabletBidModifier), getDesktopBidModifier = js.Any.fromFunction0(getDesktopBidModifier), getMobileBidModifier = js.Any.fromFunction0(getMobileBidModifier), getTabletBidModifier = js.Any.fromFunction0(getTabletBidModifier), setDesktopBidModifier = js.Any.fromFunction1(setDesktopBidModifier), setMobileBidModifier = js.Any.fromFunction1(setMobileBidModifier), setTabletBidModifier = js.Any.fromFunction1(setTabletBidModifier))
    __obj.asInstanceOf[AdGroupDevices]
  }
  @scala.inline
  implicit class AdGroupDevicesOps[Self <: AdGroupDevices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearDesktopBidModifier(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDesktopBidModifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearMobileBidModifier(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMobileBidModifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearTabletBidModifier(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTabletBidModifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDesktopBidModifier(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDesktopBidModifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMobileBidModifier(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMobileBidModifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTabletBidModifier(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabletBidModifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDesktopBidModifier(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDesktopBidModifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMobileBidModifier(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMobileBidModifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTabletBidModifier(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTabletBidModifier")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

