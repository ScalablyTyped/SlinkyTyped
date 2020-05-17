package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XStatusIndicatorFactory} instead of this
  * @deprecated Deprecated
  */
@js.native
trait XStatusIndicatorSupplier extends XInterface {
  /**
    * use {@link XStatusIndicatorFactory.createStatusIndicator()} instead of this
    * @deprecated Deprecated
    */
  val StatusIndicator: XStatusIndicator = js.native
  /**
    * use {@link XStatusIndicatorFactory.createStatusIndicator()} instead of this
    * @deprecated Deprecated
    */
  def getStatusIndicator(): XStatusIndicator = js.native
}

object XStatusIndicatorSupplier {
  @scala.inline
  def apply(
    StatusIndicator: XStatusIndicator,
    acquire: () => Unit,
    getStatusIndicator: () => XStatusIndicator,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStatusIndicatorSupplier = {
    val __obj = js.Dynamic.literal(StatusIndicator = StatusIndicator.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStatusIndicator = js.Any.fromFunction0(getStatusIndicator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStatusIndicatorSupplier]
  }
  @scala.inline
  implicit class XStatusIndicatorSupplierOps[Self <: XStatusIndicatorSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusIndicator(value: XStatusIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStatusIndicator(value: () => XStatusIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatusIndicator")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

