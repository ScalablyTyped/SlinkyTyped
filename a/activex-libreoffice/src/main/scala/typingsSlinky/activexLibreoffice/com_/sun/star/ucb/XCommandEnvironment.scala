package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the environment for a command.
  * @author Kai Sommerfeld
  * @see XCommandProcessor
  * @version 1.0
  */
@js.native
trait XCommandEnvironment extends XInterface {
  /**
    * returns the command's interaction handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns an interaction handler
    */
  val InteractionHandler: XInteractionHandler = js.native
  /**
    * returns the command's progress handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns a progress handler
    */
  val ProgressHandler: XProgressHandler = js.native
  /**
    * returns the command's interaction handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns an interaction handler
    */
  def getInteractionHandler(): XInteractionHandler = js.native
  /**
    * returns the command's progress handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns a progress handler
    */
  def getProgressHandler(): XProgressHandler = js.native
}

object XCommandEnvironment {
  @scala.inline
  def apply(
    InteractionHandler: XInteractionHandler,
    ProgressHandler: XProgressHandler,
    acquire: () => Unit,
    getInteractionHandler: () => XInteractionHandler,
    getProgressHandler: () => XProgressHandler,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCommandEnvironment = {
    val __obj = js.Dynamic.literal(InteractionHandler = InteractionHandler.asInstanceOf[js.Any], ProgressHandler = ProgressHandler.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInteractionHandler = js.Any.fromFunction0(getInteractionHandler), getProgressHandler = js.Any.fromFunction0(getProgressHandler), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCommandEnvironment]
  }
  @scala.inline
  implicit class XCommandEnvironmentOps[Self <: XCommandEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteractionHandler(value: XInteractionHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InteractionHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressHandler(value: XProgressHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetInteractionHandler(value: () => XInteractionHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInteractionHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProgressHandler(value: () => XProgressHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProgressHandler")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

