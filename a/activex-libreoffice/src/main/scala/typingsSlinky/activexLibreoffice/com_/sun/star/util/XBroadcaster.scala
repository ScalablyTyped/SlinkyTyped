package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to control notification behavior of a broadcaster.
  * @since OOo 3.0
  */
@js.native
trait XBroadcaster extends XInterface {
  
  /**
    * suspends broadcasts to the registered listeners.
    *
    * The calls to {@link XBroadcaster.lockBroadcasts()} and {@link XBroadcaster.unlockBroadcasts()} may be nested and even overlapping, but they must be in
    * pairs. While there is at least one lock remaining, no broadcasts are sent to registered listeners.
    */
  def lockBroadcasts(): Unit = js.native
  
  /**
    * resumes the broadcasts which were suspended by {@link XBroadcaster.lockBroadcasts()} .
    *
    * The calls to {@link XBroadcaster.lockBroadcasts()} and {@link XBroadcaster.unlockBroadcasts()} may be nested and even overlapping, but they must be in
    * pairs. While there is at least one lock remaining, no broadcasts are sent to registered listeners.
    *
    * Pending broadcasts will be sent immediately after the last call to {@link XBroadcaster.lockBroadcasts()} is matched by a call to {@link
    * XBroadcaster.unlockBroadcasts()} . An implementation can decide to broadcast all pending notification in order or batch them in single broadcasts.
    */
  def unlockBroadcasts(): Unit = js.native
}
object XBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    lockBroadcasts: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    unlockBroadcasts: () => Unit
  ): XBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), lockBroadcasts = js.Any.fromFunction0(lockBroadcasts), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unlockBroadcasts = js.Any.fromFunction0(unlockBroadcasts))
    __obj.asInstanceOf[XBroadcaster]
  }
  
  @scala.inline
  implicit class XBroadcasterOps[Self <: XBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLockBroadcasts(value: () => Unit): Self = this.set("lockBroadcasts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnlockBroadcasts(value: () => Unit): Self = this.set("unlockBroadcasts", js.Any.fromFunction0(value))
  }
}
