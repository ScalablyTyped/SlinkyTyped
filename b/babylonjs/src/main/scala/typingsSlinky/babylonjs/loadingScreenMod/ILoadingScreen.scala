package typingsSlinky.babylonjs.loadingScreenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoadingScreen extends js.Object {
  /**
    * Gets or sets the color to use for the background
    */
  var loadingUIBackgroundColor: String = js.native
  /**
    * Gets or sets the text to display while loading
    */
  var loadingUIText: String = js.native
  /**
    * Function called to display the loading screen
    */
  def displayLoadingUI(): Unit = js.native
  /**
    * Function called to hide the loading screen
    */
  def hideLoadingUI(): Unit = js.native
}

object ILoadingScreen {
  @scala.inline
  def apply(
    displayLoadingUI: () => Unit,
    hideLoadingUI: () => Unit,
    loadingUIBackgroundColor: String,
    loadingUIText: String
  ): ILoadingScreen = {
    val __obj = js.Dynamic.literal(displayLoadingUI = js.Any.fromFunction0(displayLoadingUI), hideLoadingUI = js.Any.fromFunction0(hideLoadingUI), loadingUIBackgroundColor = loadingUIBackgroundColor.asInstanceOf[js.Any], loadingUIText = loadingUIText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadingScreen]
  }
  @scala.inline
  implicit class ILoadingScreenOps[Self <: ILoadingScreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayLoadingUI(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLoadingUI")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideLoadingUI(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLoadingUI")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadingUIBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingUIBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingUIText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingUIText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

