package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the access to a container of database reports.
  * @see Reports
  */
@js.native
trait XReportDocumentsSupplier extends XInterface {
  /**
    * returns the container of reports.
    * @returns the report documents
    * @see Reports
    */
  val ReportDocuments: XNameAccess = js.native
  /**
    * returns the container of reports.
    * @returns the report documents
    * @see Reports
    */
  def getReportDocuments(): XNameAccess = js.native
}

object XReportDocumentsSupplier {
  @scala.inline
  def apply(
    ReportDocuments: XNameAccess,
    acquire: () => Unit,
    getReportDocuments: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XReportDocumentsSupplier = {
    val __obj = js.Dynamic.literal(ReportDocuments = ReportDocuments.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getReportDocuments = js.Any.fromFunction0(getReportDocuments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XReportDocumentsSupplier]
  }
  @scala.inline
  implicit class XReportDocumentsSupplierOps[Self <: XReportDocumentsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportDocuments(value: XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetReportDocuments(value: () => XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReportDocuments")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

