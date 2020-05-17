package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The document can provide access to CMIS properties and versions through this interface. */
@js.native
trait XCmisDocument extends XInterface {
  val AllVersions: SafeArray[CmisVersion] = js.native
  /** Contains the properties values named after their CMIS ID. */
  var CmisProperties: SafeArray[CmisProperty] = js.native
  def canCancelCheckOut(): Boolean = js.native
  def canCheckIn(): Boolean = js.native
  def canCheckOut(): Boolean = js.native
  /** Cancel checked out document, this will discard all changes since check-out. */
  def cancelCheckOut(): Unit = js.native
  /** Creates a new version of the document from the private working copy. */
  def checkIn(isMajor: Boolean, comment: String): Unit = js.native
  /** Check out the document into a private working copy on the server, and update the loaded document to reflect this change. */
  def checkOut(): Unit = js.native
  def getAllVersions(): SafeArray[CmisVersion] = js.native
  /** Tells whether a document can support versioning or not. */
  def isVersionable(): Boolean = js.native
  def updateCmisProperties(cmisProperties: SeqEquiv[CmisProperty]): Unit = js.native
}

object XCmisDocument {
  @scala.inline
  def apply(
    AllVersions: SafeArray[CmisVersion],
    CmisProperties: SafeArray[CmisProperty],
    acquire: () => Unit,
    canCancelCheckOut: () => Boolean,
    canCheckIn: () => Boolean,
    canCheckOut: () => Boolean,
    cancelCheckOut: () => Unit,
    checkIn: (Boolean, String) => Unit,
    checkOut: () => Unit,
    getAllVersions: () => SafeArray[CmisVersion],
    isVersionable: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateCmisProperties: SeqEquiv[CmisProperty] => Unit
  ): XCmisDocument = {
    val __obj = js.Dynamic.literal(AllVersions = AllVersions.asInstanceOf[js.Any], CmisProperties = CmisProperties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), canCancelCheckOut = js.Any.fromFunction0(canCancelCheckOut), canCheckIn = js.Any.fromFunction0(canCheckIn), canCheckOut = js.Any.fromFunction0(canCheckOut), cancelCheckOut = js.Any.fromFunction0(cancelCheckOut), checkIn = js.Any.fromFunction2(checkIn), checkOut = js.Any.fromFunction0(checkOut), getAllVersions = js.Any.fromFunction0(getAllVersions), isVersionable = js.Any.fromFunction0(isVersionable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateCmisProperties = js.Any.fromFunction1(updateCmisProperties))
    __obj.asInstanceOf[XCmisDocument]
  }
  @scala.inline
  implicit class XCmisDocumentOps[Self <: XCmisDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllVersions(value: SafeArray[CmisVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmisProperties(value: SafeArray[CmisProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CmisProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCancelCheckOut(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCancelCheckOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanCheckIn(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCheckIn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanCheckOut(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCheckOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCancelCheckOut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelCheckOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckIn(value: (Boolean, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkIn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCheckOut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAllVersions(value: () => SafeArray[CmisVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllVersions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVersionable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVersionable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateCmisProperties(value: SeqEquiv[CmisProperty] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCmisProperties")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

