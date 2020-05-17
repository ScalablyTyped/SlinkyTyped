package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates IDs which are unique within the container. */
@js.native
trait XUniqueIDFactory extends XInterface {
  def createUniqueID(): String = js.native
}

object XUniqueIDFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createUniqueID: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUniqueIDFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createUniqueID = js.Any.fromFunction0(createUniqueID), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUniqueIDFactory]
  }
  @scala.inline
  implicit class XUniqueIDFactoryOps[Self <: XUniqueIDFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateUniqueID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUniqueID")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

