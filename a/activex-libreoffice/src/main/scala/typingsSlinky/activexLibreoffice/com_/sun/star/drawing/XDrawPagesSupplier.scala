package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** must be supported to provide access to a multi-page drawing-layer. */
@js.native
trait XDrawPagesSupplier extends XInterface {
  /** @returns an indexed container with the service {@link DrawPages} . */
  val DrawPages: XDrawPages = js.native
  /** @returns an indexed container with the service {@link DrawPages} . */
  def getDrawPages(): XDrawPages = js.native
}

object XDrawPagesSupplier {
  @scala.inline
  def apply(
    DrawPages: XDrawPages,
    acquire: () => Unit,
    getDrawPages: () => XDrawPages,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrawPagesSupplier = {
    val __obj = js.Dynamic.literal(DrawPages = DrawPages.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDrawPages = js.Any.fromFunction0(getDrawPages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDrawPagesSupplier]
  }
  @scala.inline
  implicit class XDrawPagesSupplierOps[Self <: XDrawPagesSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawPages(value: XDrawPages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrawPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDrawPages(value: () => XDrawPages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDrawPages")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

