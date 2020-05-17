package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XServiceInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XTypeProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides documentation for UNO services
  * @since LibreOffice 5.1
  */
@js.native
trait XServiceDocumenter extends js.Object {
  var CoreBaseUrl: String = js.native
  var ServiceBaseUrl: String = js.native
  def showCoreDocs(xService: XServiceInfo): Unit = js.native
  def showInterfaceDocs(xTypeProvider: XTypeProvider): Unit = js.native
  def showServiceDocs(xService: XServiceInfo): Unit = js.native
}

object XServiceDocumenter {
  @scala.inline
  def apply(
    CoreBaseUrl: String,
    ServiceBaseUrl: String,
    showCoreDocs: XServiceInfo => Unit,
    showInterfaceDocs: XTypeProvider => Unit,
    showServiceDocs: XServiceInfo => Unit
  ): XServiceDocumenter = {
    val __obj = js.Dynamic.literal(CoreBaseUrl = CoreBaseUrl.asInstanceOf[js.Any], ServiceBaseUrl = ServiceBaseUrl.asInstanceOf[js.Any], showCoreDocs = js.Any.fromFunction1(showCoreDocs), showInterfaceDocs = js.Any.fromFunction1(showInterfaceDocs), showServiceDocs = js.Any.fromFunction1(showServiceDocs))
    __obj.asInstanceOf[XServiceDocumenter]
  }
  @scala.inline
  implicit class XServiceDocumenterOps[Self <: XServiceDocumenter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoreBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoreBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCoreDocs(value: XServiceInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCoreDocs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowInterfaceDocs(value: XTypeProvider => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInterfaceDocs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowServiceDocs(value: XServiceInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showServiceDocs")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

