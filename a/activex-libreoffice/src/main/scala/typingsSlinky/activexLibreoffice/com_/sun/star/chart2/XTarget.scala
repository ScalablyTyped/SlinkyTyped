package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTarget extends XInterface {
  def addDrawElement(): Unit
}

object XTarget {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addDrawElement: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTarget = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addDrawElement = js.Any.fromFunction0(addDrawElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTarget]
  }
}

