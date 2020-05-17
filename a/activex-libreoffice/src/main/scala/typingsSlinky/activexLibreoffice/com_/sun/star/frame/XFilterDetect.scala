package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link com.sun.star.document.XExtendedFilterDetection} instead of this
  * @deprecated Deprecated
  */
@js.native
trait XFilterDetect extends XInterface {
  def getContentType(URL: String): String = js.native
  def useExternBrowser(URL: String): Boolean = js.native
}

object XFilterDetect {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getContentType: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    useExternBrowser: String => Boolean
  ): XFilterDetect = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getContentType = js.Any.fromFunction1(getContentType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), useExternBrowser = js.Any.fromFunction1(useExternBrowser))
    __obj.asInstanceOf[XFilterDetect]
  }
  @scala.inline
  implicit class XFilterDetectOps[Self <: XFilterDetect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContentType(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUseExternBrowser(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternBrowser")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

