package typingsSlinky.activexLibreoffice.com_.sun.star.presentation

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** With this interface you can control any object that implements a {@link Presentation} . */
@js.native
trait XPresentation extends XInterface {
  /** The presentation is stopped and the full-screen mode will end. */
  def end(): Unit = js.native
  /** Starts the presentation from the beginning and shows the actual running time to the user. */
  def rehearseTimings(): Unit = js.native
  /** The presentation is shown in full-screen and started from the beginning. */
  def start(): Unit = js.native
}

object XPresentation {
  @scala.inline
  def apply(
    acquire: () => Unit,
    end: () => Unit,
    queryInterface: `type` => js.Any,
    rehearseTimings: () => Unit,
    release: () => Unit,
    start: () => Unit
  ): XPresentation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), end = js.Any.fromFunction0(end), queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = js.Any.fromFunction0(rehearseTimings), release = js.Any.fromFunction0(release), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[XPresentation]
  }
  @scala.inline
  implicit class XPresentationOps[Self <: XPresentation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRehearseTimings(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rehearseTimings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

