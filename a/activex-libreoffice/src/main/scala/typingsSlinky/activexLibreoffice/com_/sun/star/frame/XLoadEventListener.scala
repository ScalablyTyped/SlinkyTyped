package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to receive callbacks from an asynchronous frame loader.
  * @see XFrameLoader
  */
@js.native
trait XLoadEventListener extends XEventListener {
  /**
    * is called when a frame load is canceled or failed.
    * @param Loader the source of this event
    */
  def loadCancelled(Loader: XFrameLoader): Unit = js.native
  /**
    * is called when a new component is loaded into a frame successfully.
    * @param Loader the source of this event
    */
  def loadFinished(Loader: XFrameLoader): Unit = js.native
}

object XLoadEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    loadCancelled: XFrameLoader => Unit,
    loadFinished: XFrameLoader => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLoadEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), loadCancelled = js.Any.fromFunction1(loadCancelled), loadFinished = js.Any.fromFunction1(loadFinished), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLoadEventListener]
  }
  @scala.inline
  implicit class XLoadEventListenerOps[Self <: XLoadEventListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadCancelled(value: XFrameLoader => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadCancelled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadFinished(value: XFrameLoader => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadFinished")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

