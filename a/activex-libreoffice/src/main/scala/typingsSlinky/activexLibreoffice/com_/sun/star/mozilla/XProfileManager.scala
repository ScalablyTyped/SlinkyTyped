package typingsSlinky.activexLibreoffice.com_.sun.star.mozilla

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface to boot up and switch Mozilla/Thunderbird profiles
  * @see com.sun.star.mozilla.MozillaProductType
  * @see com.sun.star.mozilla.XProfileDiscover
  * @see com.sun.star.mozilla.MozillaBootstrap
  */
@js.native
trait XProfileManager extends XInterface {
  /**
    * attempts to get the current product.
    * @returns the current used product.
    */
  val CurrentProduct: MozillaProductType = js.native
  /**
    * attempts to get the current profile name.
    * @returns the current used profile.
    */
  val CurrentProfile: String = js.native
  /**
    * attempts to init XPCOM runtime using given profile.
    * @param product is the product to start up.
    * @param profileName the profile name to be used.
    * @returns the current reference count for the given profile.
    */
  def bootupProfile(product: MozillaProductType, profileName: String): Double = js.native
  /**
    * attempts to get the current product.
    * @returns the current used product.
    */
  def getCurrentProduct(): MozillaProductType = js.native
  /**
    * attempts to get the current profile name.
    * @returns the current used profile.
    */
  def getCurrentProfile(): String = js.native
  /**
    * attempts to check whether the current profile locked or not
    * @returns return sal_True is current profile is locked
    */
  def isCurrentProfileLocked(): Boolean = js.native
  /**
    * attempts to set the current used profile name for the given product.
    * @param product is the product to be used.
    * @param profileName the profile name to be used.
    * @returns the current used profile name for the given product.
    */
  def setCurrentProfile(product: MozillaProductType, profileName: String): String = js.native
  /**
    * attempts to shutdown the current profile.
    * @returns the current reference count for the current profile.
    */
  def shutdownProfile(): Double = js.native
}

object XProfileManager {
  @scala.inline
  def apply(
    CurrentProduct: MozillaProductType,
    CurrentProfile: String,
    acquire: () => Unit,
    bootupProfile: (MozillaProductType, String) => Double,
    getCurrentProduct: () => MozillaProductType,
    getCurrentProfile: () => String,
    isCurrentProfileLocked: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentProfile: (MozillaProductType, String) => String,
    shutdownProfile: () => Double
  ): XProfileManager = {
    val __obj = js.Dynamic.literal(CurrentProduct = CurrentProduct.asInstanceOf[js.Any], CurrentProfile = CurrentProfile.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), bootupProfile = js.Any.fromFunction2(bootupProfile), getCurrentProduct = js.Any.fromFunction0(getCurrentProduct), getCurrentProfile = js.Any.fromFunction0(getCurrentProfile), isCurrentProfileLocked = js.Any.fromFunction0(isCurrentProfileLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentProfile = js.Any.fromFunction2(setCurrentProfile), shutdownProfile = js.Any.fromFunction0(shutdownProfile))
    __obj.asInstanceOf[XProfileManager]
  }
  @scala.inline
  implicit class XProfileManagerOps[Self <: XProfileManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentProduct(value: MozillaProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentProduct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootupProfile(value: (MozillaProductType, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootupProfile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCurrentProduct(value: () => MozillaProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentProduct")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentProfile(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentProfile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCurrentProfileLocked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrentProfileLocked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCurrentProfile(value: (MozillaProductType, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrentProfile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShutdownProfile(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownProfile")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

