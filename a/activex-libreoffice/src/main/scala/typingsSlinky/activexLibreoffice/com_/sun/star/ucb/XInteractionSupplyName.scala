package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an interaction continuation used to hand back a new name for something.
  *
  * For example, this continuation can be selected when handling a {@link NameClashResolveRequest} in order to supply a new name for a clashing resource.
  * @author Kai Sommerfeld
  * @version 1.0
  */
@js.native
trait XInteractionSupplyName extends XInteractionContinuation {
  /**
    * sets the name to supply.
    * @param Name contains the name to supply.
    */
  def setName(Name: String): Unit = js.native
}

object XInteractionSupplyName {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setName: String => Unit
  ): XInteractionSupplyName = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[XInteractionSupplyName]
  }
  @scala.inline
  implicit class XInteractionSupplyNameOps[Self <: XInteractionSupplyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

