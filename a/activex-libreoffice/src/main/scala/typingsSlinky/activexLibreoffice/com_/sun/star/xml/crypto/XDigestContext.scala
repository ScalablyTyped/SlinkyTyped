package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to generate the digest.
  *
  * The algorithm to generate the digest is specified on object creation.
  * @see XDigestContextSupplier
  * @since OOo 3.4
  */
@js.native
trait XDigestContext extends XInterface {
  /** finalizes digest and disposes context. */
  def finalizeDigestAndDispose(): SafeArray[Double] = js.native
  /**
    * update the digest with the given data.
    * @param aData data that should be used to update the digest
    */
  def updateDigest(aData: SeqEquiv[Double]): Unit = js.native
}

object XDigestContext {
  @scala.inline
  def apply(
    acquire: () => Unit,
    finalizeDigestAndDispose: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateDigest: SeqEquiv[Double] => Unit
  ): XDigestContext = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), finalizeDigestAndDispose = js.Any.fromFunction0(finalizeDigestAndDispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateDigest = js.Any.fromFunction1(updateDigest))
    __obj.asInstanceOf[XDigestContext]
  }
  @scala.inline
  implicit class XDigestContextOps[Self <: XDigestContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinalizeDigestAndDispose(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizeDigestAndDispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateDigest(value: SeqEquiv[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDigest")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

