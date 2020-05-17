package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows to set a password for an object. */
@js.native
trait XEncryptionProtectedSource extends XInterface {
  /**
    * removes encryption from the object.
    * @throws com::sun::star::io::IOException in case encryption could not be removed
    */
  def removeEncryption(): Unit = js.native
  /**
    * sets a password for the object.
    * @param sPassword the new password
    * @throws com::sun::star::io::IOException in case password could not be set
    */
  def setEncryptionPassword(sPassword: String): Unit = js.native
}

object XEncryptionProtectedSource {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEncryption: () => Unit,
    setEncryptionPassword: String => Unit
  ): XEncryptionProtectedSource = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryption = js.Any.fromFunction0(removeEncryption), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword))
    __obj.asInstanceOf[XEncryptionProtectedSource]
  }
  @scala.inline
  implicit class XEncryptionProtectedSourceOps[Self <: XEncryptionProtectedSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveEncryption(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEncryption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEncryptionPassword(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEncryptionPassword")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

