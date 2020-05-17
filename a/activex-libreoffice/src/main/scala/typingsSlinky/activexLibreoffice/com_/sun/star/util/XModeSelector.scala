package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is supported by objects which supply different modes. */
@js.native
trait XModeSelector extends XInterface {
  /** @returns the current mode. */
  var Mode: String = js.native
  /** @returns a sequence of all supported modes. */
  val SupportedModes: SafeArray[String] = js.native
  /** @returns the current mode. */
  def getMode(): String = js.native
  /** @returns a sequence of all supported modes. */
  def getSupportedModes(): SafeArray[String] = js.native
  /** sets a new mode for the implementing object. */
  def setMode(aMode: String): Unit = js.native
  /** asks whether a mode is supported or not. */
  def supportsMode(aMode: String): Boolean = js.native
}

object XModeSelector {
  @scala.inline
  def apply(
    Mode: String,
    SupportedModes: SafeArray[String],
    acquire: () => Unit,
    getMode: () => String,
    getSupportedModes: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setMode: String => Unit,
    supportsMode: String => Boolean
  ): XModeSelector = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], SupportedModes = SupportedModes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMode = js.Any.fromFunction0(getMode), getSupportedModes = js.Any.fromFunction0(getSupportedModes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMode = js.Any.fromFunction1(setMode), supportsMode = js.Any.fromFunction1(supportsMode))
    __obj.asInstanceOf[XModeSelector]
  }
  @scala.inline
  implicit class XModeSelectorOps[Self <: XModeSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedModes(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSupportedModes(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSupportedModes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetMode(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSupportsMode(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsMode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

