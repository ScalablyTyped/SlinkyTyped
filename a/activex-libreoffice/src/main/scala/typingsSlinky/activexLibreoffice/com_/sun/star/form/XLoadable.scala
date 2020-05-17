package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to implement objects which may be loaded.
  *
  * The object is typically implemented by high-level objects which can connect to a data source.
  * @see XLoadListener
  */
@js.native
trait XLoadable extends XInterface {
  /**
    * adds the specified listener to receive load-related events
    * @param aListener the listener to add.
    */
  def addLoadListener(aListener: XLoadListener): Unit = js.native
  /** returns if the object is in loaded state. */
  def isLoaded(): Boolean = js.native
  /**
    * loads the data.
    *
    * If the data is already loaded (->isLoaded), then the method returns silently. In this case, you should use ->reload.
    */
  def load(): Unit = js.native
  /**
    * does a smart refresh of the object.
    *
    * The final state will be the same as if unload and load were called, but reload is the more efficient way to do the same. If the object isn't loaded,
    * nothing happens.
    */
  def reload(): Unit = js.native
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    */
  def removeLoadListener(aListener: XLoadListener): Unit = js.native
  /** unloads the data. */
  def unload(): Unit = js.native
}

object XLoadable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addLoadListener: XLoadListener => Unit,
    isLoaded: () => Boolean,
    load: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: () => Unit,
    removeLoadListener: XLoadListener => Unit,
    unload: () => Unit
  ): XLoadable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addLoadListener = js.Any.fromFunction1(addLoadListener), isLoaded = js.Any.fromFunction0(isLoaded), load = js.Any.fromFunction0(load), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeLoadListener = js.Any.fromFunction1(removeLoadListener), unload = js.Any.fromFunction0(unload))
    __obj.asInstanceOf[XLoadable]
  }
  @scala.inline
  implicit class XLoadableOps[Self <: XLoadable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddLoadListener(value: XLoadListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLoadListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsLoaded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveLoadListener(value: XLoadListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLoadListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

