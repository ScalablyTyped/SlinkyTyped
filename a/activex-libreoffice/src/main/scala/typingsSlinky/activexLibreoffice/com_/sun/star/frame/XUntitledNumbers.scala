package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** knows all currently used and all free numbers for using with untitled but counted objects. */
@js.native
trait XUntitledNumbers extends XInterface {
  /**
    * returns the localized string value to be used for untitled objects in combination with the leased number.
    *
    * Note: Such string already contains leading spaces/tabs etc. ! The only thing which an outside code has todo then ... adding a leased number to the
    * string.
    * @returns the localized string for untitled components.
    */
  val UntitledPrefix: String = js.native
  /**
    * returns the localized string value to be used for untitled objects in combination with the leased number.
    *
    * Note: Such string already contains leading spaces/tabs etc. ! The only thing which an outside code has todo then ... adding a leased number to the
    * string.
    * @returns the localized string for untitled components.
    */
  def getUntitledPrefix(): String = js.native
  /**
    * callee has to lease a number before they can use it within in its own title.
    *
    * Such number must be freed after using e.g. while the object was closed or gets another title (e.g. by saving a document to a real location on disc).
    * @param xComponent the component which has to be registered for the leased number.
    * @returns the new number for these object or 0 if no further numbers are available.
    * @throws [IllegalArgumentException] if an invalid object reference was provided to this method.
    */
  def leaseNumber(xComponent: XInterface): Double = js.native
  /**
    * has to be used to mark those number as "free for using".
    *
    * If the registered component does not use such leased number any longer it has to be released so it can be used for new components.
    *
    * Note: calling this method with an unknown (but normally valid number) has to be ignored. No exceptions - no errors.
    * @param nNumber specify number for release.
    * @throws [IllegalArgumentException] if the given number is the special value 0.
    */
  def releaseNumber(nNumber: Double): Unit = js.native
  /**
    * does the same then releaseNumber () but it searches the corresponding number for the specified component and deregister it.
    * @param xComponent the component for deregistration.
    * @throws [IllegalArgumentException] if an invalid object reference was provided to this method.
    */
  def releaseNumberForComponent(xComponent: XInterface): Unit = js.native
}

object XUntitledNumbers {
  @scala.inline
  def apply(
    UntitledPrefix: String,
    acquire: () => Unit,
    getUntitledPrefix: () => String,
    leaseNumber: XInterface => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    releaseNumber: Double => Unit,
    releaseNumberForComponent: XInterface => Unit
  ): XUntitledNumbers = {
    val __obj = js.Dynamic.literal(UntitledPrefix = UntitledPrefix.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getUntitledPrefix = js.Any.fromFunction0(getUntitledPrefix), leaseNumber = js.Any.fromFunction1(leaseNumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseNumber = js.Any.fromFunction1(releaseNumber), releaseNumberForComponent = js.Any.fromFunction1(releaseNumberForComponent))
    __obj.asInstanceOf[XUntitledNumbers]
  }
  @scala.inline
  implicit class XUntitledNumbersOps[Self <: XUntitledNumbers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUntitledPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UntitledPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUntitledPrefix(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUntitledPrefix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLeaseNumber(value: XInterface => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReleaseNumber(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReleaseNumberForComponent(value: XInterface => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNumberForComponent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

