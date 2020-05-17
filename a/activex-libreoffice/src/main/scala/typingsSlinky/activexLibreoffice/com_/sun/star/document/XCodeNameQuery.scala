package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XCodeNameQuery extends js.Object {
  def getCodeNameForContainer(aObj: XInterface): String = js.native
  def getCodeNameForObject(aObj: XInterface): String = js.native
}

object XCodeNameQuery {
  @scala.inline
  def apply(getCodeNameForContainer: XInterface => String, getCodeNameForObject: XInterface => String): XCodeNameQuery = {
    val __obj = js.Dynamic.literal(getCodeNameForContainer = js.Any.fromFunction1(getCodeNameForContainer), getCodeNameForObject = js.Any.fromFunction1(getCodeNameForObject))
    __obj.asInstanceOf[XCodeNameQuery]
  }
  @scala.inline
  implicit class XCodeNameQueryOps[Self <: XCodeNameQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCodeNameForContainer(value: XInterface => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCodeNameForContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCodeNameForObject(value: XInterface => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCodeNameForObject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

