package typingsSlinky.activexLibreoffice.com_.sun.star.office

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
@js.native
trait Quickstart extends XFastPropertySet {
  /** The first two parameters are ignored */
  def createAndSetVeto(p1: Boolean, p2: Boolean, DisableVeto: Boolean): Unit = js.native
  def createAutoStart(bQuickstart: Boolean, bAutostart: Boolean): Unit = js.native
  def createDefault(): Unit = js.native
  def createStart(bQuickstart: Boolean): Unit = js.native
}

object Quickstart {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createAndSetVeto: (Boolean, Boolean, Boolean) => Unit,
    createAutoStart: (Boolean, Boolean) => Unit,
    createDefault: () => Unit,
    createStart: Boolean => Unit,
    getFastPropertyValue: Double => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFastPropertyValue: (Double, js.Any) => Unit
  ): Quickstart = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAndSetVeto = js.Any.fromFunction3(createAndSetVeto), createAutoStart = js.Any.fromFunction2(createAutoStart), createDefault = js.Any.fromFunction0(createDefault), createStart = js.Any.fromFunction1(createStart), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue))
    __obj.asInstanceOf[Quickstart]
  }
  @scala.inline
  implicit class QuickstartOps[Self <: Quickstart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAndSetVeto(value: (Boolean, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAndSetVeto")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreateAutoStart(value: (Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAutoStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateStart(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStart")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

