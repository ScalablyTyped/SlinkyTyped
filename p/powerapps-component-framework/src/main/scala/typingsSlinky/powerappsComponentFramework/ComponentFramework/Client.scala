package typingsSlinky.powerappsComponentFramework.ComponentFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface for the context.client
	 */
@js.native
trait Client extends js.Object {
  /**
  		 * Whether this control should disable its scrolling capabilities.
  		 */
  var disableScroll: Boolean = js.native
  /**
  		 * Returns a value to indicate which client the script is executing in.
  		 * Web: Web application, or Unified Interface
  		 * Outlook: Outlook
  		 * Mobile: Mobile app
  		 */
  def getClient(): String = js.native
  /**
  		 * Device form factor.
  		 * Unknown = 0
  		 * Desktop = 1
  		 * Tablet = 2
  		 * Phone = 3
  		 */
  def getFormFactor(): Double = js.native
  /**
  		 * Returns information whether the server is online or offline.
  		 */
  def isOffline(): Boolean = js.native
}

object Client {
  @scala.inline
  def apply(
    disableScroll: Boolean,
    getClient: () => String,
    getFormFactor: () => Double,
    isOffline: () => Boolean
  ): Client = {
    val __obj = js.Dynamic.literal(disableScroll = disableScroll.asInstanceOf[js.Any], getClient = js.Any.fromFunction0(getClient), getFormFactor = js.Any.fromFunction0(getFormFactor), isOffline = js.Any.fromFunction0(isOffline))
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetClient(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClient")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFormFactor(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormFactor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOffline(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOffline")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

