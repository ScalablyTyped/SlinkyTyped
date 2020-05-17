package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XSecondAxisTitleSupplier extends XInterface {
  val SecondXAxisTitle: XShape = js.native
  val SecondYAxisTitle: XShape = js.native
  def getSecondXAxisTitle(): XShape = js.native
  def getSecondYAxisTitle(): XShape = js.native
}

object XSecondAxisTitleSupplier {
  @scala.inline
  def apply(
    SecondXAxisTitle: XShape,
    SecondYAxisTitle: XShape,
    acquire: () => Unit,
    getSecondXAxisTitle: () => XShape,
    getSecondYAxisTitle: () => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSecondAxisTitleSupplier = {
    val __obj = js.Dynamic.literal(SecondXAxisTitle = SecondXAxisTitle.asInstanceOf[js.Any], SecondYAxisTitle = SecondYAxisTitle.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSecondXAxisTitle = js.Any.fromFunction0(getSecondXAxisTitle), getSecondYAxisTitle = js.Any.fromFunction0(getSecondYAxisTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSecondAxisTitleSupplier]
  }
  @scala.inline
  implicit class XSecondAxisTitleSupplierOps[Self <: XSecondAxisTitleSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecondXAxisTitle(value: XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondXAxisTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondYAxisTitle(value: XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondYAxisTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSecondXAxisTitle(value: () => XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecondXAxisTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSecondYAxisTitle(value: () => XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecondYAxisTitle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

