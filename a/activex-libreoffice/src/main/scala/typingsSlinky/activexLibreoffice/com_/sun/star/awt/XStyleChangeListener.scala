package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * to be implemented by components which wish to be notified about changes in the style of a component
  * @see XStyleSettings
  */
@js.native
trait XStyleChangeListener extends XEventListener {
  def styleSettingsChanged(Event: EventObject): Unit = js.native
}

object XStyleChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    styleSettingsChanged: EventObject => Unit
  ): XStyleChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), styleSettingsChanged = js.Any.fromFunction1(styleSettingsChanged))
    __obj.asInstanceOf[XStyleChangeListener]
  }
  @scala.inline
  implicit class XStyleChangeListenerOps[Self <: XStyleChangeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyleSettingsChanged(value: EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSettingsChanged")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

