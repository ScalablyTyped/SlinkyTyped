package typingsSlinky.reactNativeSignatureCapture.mod

import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeSignatureCapture.reactNativeSignatureCaptureStrings.landscape
import typingsSlinky.reactNativeSignatureCapture.reactNativeSignatureCaptureStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureCaptureProps extends ViewProps {
  /**
    * sets the max size of the image maintains aspect ratio,
    *
    * @default 500
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * Triggered when user marks their signature on the canvas.
    * This will not be called when the user does not perform any action on canvas.
    *
    * @param event - the event when a drag is performed
    */
  var onDragEvent: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  /**
    * Triggered when saveImage() is called, which return Base64 Encoded String and image file path.
    *
    * @param params - the file path and encoded png
    */
  var onSaveEvent: js.UndefOr[js.Function1[/* params */ SaveEventParams, Unit]] = js.native
  /**
    * Make this props true, if you want to save the image file in external storage.
    * Warning: Image file will be visible in gallery or any other image browsing app
    *
    * @default false
    */
  var saveImageFileInExtStorage: js.UndefOr[Boolean] = js.native
  /**
    * If this props is made to false, it will hide the dashed border (the border is shown on iOS only).
    *
    * @default false
    */
  var showBorder: js.UndefOr[Boolean] = js.native
  /**
    * If this props is made to true, it will display the native buttons "Save" and "Reset".
    *
    * @default false
    */
  var showNativeButtons: js.UndefOr[Boolean] = js.native
  /**
    * If this props is made to true, it will display the "x_ _ _ _ _ _ _ _ _ _ _" placeholder indicating where to sign.
    *
    * @default false
    */
  var showTitleLabel: js.UndefOr[Boolean] = js.native
  /**
    * Change the screen orientation based on boolean value
    * "portrait" or "landscape"
    */
  var viewMode: js.UndefOr[portrait | landscape] = js.native
}

object SignatureCaptureProps {
  @scala.inline
  def apply(): SignatureCaptureProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureCaptureProps]
  }
  @scala.inline
  implicit class SignatureCapturePropsOps[Self <: SignatureCaptureProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEvent(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSaveEvent(value: /* params */ SaveEventParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSaveEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSaveEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSaveEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveImageFileInExtStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveImageFileInExtStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveImageFileInExtStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveImageFileInExtStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNativeButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNativeButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNativeButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNativeButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTitleLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitleLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTitleLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitleLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withViewMode(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(js.undefined)
        ret
    }
  }
  
}

