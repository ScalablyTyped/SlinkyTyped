package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to set a default size. This size will be used in case no further information si available. */
trait XDefaultSizeTransmitter extends XInterface {
  /**
    * set a default size
    * @param aSize100ThMm specifies a size in hundredth mm.
    */
  def setDefaultSize(aSize100ThMm: Size): Unit
}

object XDefaultSizeTransmitter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDefaultSize: Size => Unit
  ): XDefaultSizeTransmitter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultSize = js.Any.fromFunction1(setDefaultSize))
    __obj.asInstanceOf[XDefaultSizeTransmitter]
  }
}

