package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.views

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDocumentView extends XInterface {
  val DefaultView: XAbstractView = js.native
  def getDefaultView(): XAbstractView = js.native
}

object XDocumentView {
  @scala.inline
  def apply(
    DefaultView: XAbstractView,
    acquire: () => Unit,
    getDefaultView: () => XAbstractView,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentView = {
    val __obj = js.Dynamic.literal(DefaultView = DefaultView.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultView = js.Any.fromFunction0(getDefaultView), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentView]
  }
  @scala.inline
  implicit class XDocumentViewOps[Self <: XDocumentView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultView(value: XAbstractView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDefaultView(value: () => XAbstractView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultView")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

