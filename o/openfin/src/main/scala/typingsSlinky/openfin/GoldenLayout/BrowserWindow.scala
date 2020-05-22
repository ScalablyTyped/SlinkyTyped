package typingsSlinky.openfin.GoldenLayout

import org.scalajs.dom.raw.Window
import typingsSlinky.openfin.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserWindow extends js.Object {
  /**
    * True if the window has been opened and its GoldenLayout instance initialised.
    */
  var isInitialised: Boolean
  /**
    * Closes the popout
    */
  def close(): Unit
  /**
    * Returns the GoldenLayout instance from the child window
    */
  def getGlInstance(): typingsSlinky.openfin.GoldenLayout.GoldenLayout
  /**
    * Returns the native Window object
    */
  def getWindow(): Window
  /**
    * Returns the popout to its original position as specified in parentId and indexInParent
    */
  def popIn(): Unit
  /**
    * Creates a window configuration object from the Popout.
    */
  def toConfig(): Content
}

object BrowserWindow {
  @scala.inline
  def apply(
    close: () => Unit,
    getGlInstance: () => typingsSlinky.openfin.GoldenLayout.GoldenLayout,
    getWindow: () => Window,
    isInitialised: Boolean,
    popIn: () => Unit,
    toConfig: () => Content
  ): BrowserWindow = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getGlInstance = js.Any.fromFunction0(getGlInstance), getWindow = js.Any.fromFunction0(getWindow), isInitialised = isInitialised.asInstanceOf[js.Any], popIn = js.Any.fromFunction0(popIn), toConfig = js.Any.fromFunction0(toConfig))
    __obj.asInstanceOf[BrowserWindow]
  }
}

