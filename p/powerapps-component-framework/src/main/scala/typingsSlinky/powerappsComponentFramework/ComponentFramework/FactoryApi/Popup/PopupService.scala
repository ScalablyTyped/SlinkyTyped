package typingsSlinky.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupService extends js.Object {
  /**
  			 * Close an existing popup in the service with the given name. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to close
  			 */
  def closePopup(name: String): Unit = js.native
  /**
  			 * Create a new popup element
  			 * @param props The popup properties object, see Popup interface for more
  			 */
  def createPopup(props: typingsSlinky.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup): Unit = js.native
  /**
  			 * Remove the referenced popup from the popupService, unregister the service
  			 * @param name The name of the popup to remove
  			 */
  def deletePopup(name: String): Unit = js.native
  /**
  			 * Gets the currently set popup Id
  			 */
  def getPopupsId(): String = js.native
  /**
  			 * Open an existing popup in the service with the given name. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to open
  			 */
  def openPopup(name: String): Unit = js.native
  /**
  			 * Sets the ID (on the DOM and in the system) for the root popup element.
  			 * @param id The string to set as the id
  			 */
  def setPopupsId(id: String): Unit = js.native
  /**
  			 * Update an existing popup in the service with the given name, patching new content to the same popup element. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to update
  			 * @param newProps the updated properties to give to the popup.
  			 */
  def updatePopup(
    name: String,
    newProps: typingsSlinky.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup
  ): Unit = js.native
}

object PopupService {
  @scala.inline
  def apply(
    closePopup: String => Unit,
    createPopup: typingsSlinky.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup => Unit,
    deletePopup: String => Unit,
    getPopupsId: () => String,
    openPopup: String => Unit,
    setPopupsId: String => Unit,
    updatePopup: (String, typingsSlinky.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup) => Unit
  ): PopupService = {
    val __obj = js.Dynamic.literal(closePopup = js.Any.fromFunction1(closePopup), createPopup = js.Any.fromFunction1(createPopup), deletePopup = js.Any.fromFunction1(deletePopup), getPopupsId = js.Any.fromFunction0(getPopupsId), openPopup = js.Any.fromFunction1(openPopup), setPopupsId = js.Any.fromFunction1(setPopupsId), updatePopup = js.Any.fromFunction2(updatePopup))
    __obj.asInstanceOf[PopupService]
  }
  @scala.inline
  implicit class PopupServiceOps[Self <: PopupService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosePopup(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePopup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreatePopup(value: typingsSlinky.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPopup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeletePopup(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePopup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPopupsId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupsId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenPopup(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openPopup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPopupsId(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPopupsId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdatePopup(
      value: (String, typingsSlinky.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePopup")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

