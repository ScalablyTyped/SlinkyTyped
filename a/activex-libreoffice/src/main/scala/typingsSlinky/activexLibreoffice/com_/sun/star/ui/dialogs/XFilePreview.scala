package typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** {@link FilePicker} that support the preview of various file formats should implement this interface. */
@js.native
trait XFilePreview extends XInterface {
  /**
    * The method returns the available height of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The height of the preview window in pixel.
    */
  val AvailableHeight: Double = js.native
  /**
    * The method returns the available width of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The width of the preview window in pixel.
    */
  val AvailableWidth: Double = js.native
  /**
    * Returns the current show state of the preview.
    * @returns A value of `TRUE` if the preview window is visible. A value of `FALSE` if the preview window is invisible.
    */
  var ShowState: Boolean = js.native
  /**
    * The method returns all image formats that the preview supports.
    * @returns A sequence of all supported preview formats
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    */
  val SupportedImageFormats: SafeArray[Double] = js.native
  /**
    * The method returns the supported color depth of the target device.
    * @returns The color depth in bit, e.g. 8 bit, 16 bit, 32 bit.
    */
  val TargetColorDepth: Color = js.native
  /**
    * The method returns the available height of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The height of the preview window in pixel.
    */
  def getAvailableHeight(): Double = js.native
  /**
    * The method returns the available width of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The width of the preview window in pixel.
    */
  def getAvailableWidth(): Double = js.native
  /**
    * Returns the current show state of the preview.
    * @returns A value of `TRUE` if the preview window is visible. A value of `FALSE` if the preview window is invisible.
    */
  def getShowState(): Boolean = js.native
  /**
    * The method returns all image formats that the preview supports.
    * @returns A sequence of all supported preview formats
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    */
  def getSupportedImageFormats(): SafeArray[Double] = js.native
  /**
    * The method returns the supported color depth of the target device.
    * @returns The color depth in bit, e.g. 8 bit, 16 bit, 32 bit.
    */
  def getTargetColorDepth(): Color = js.native
  /**
    * Sets a new image. If the preview is currently hidden the image will be ignored. An empty any will clear the preview window.
    * @param aImageFormat Specifies the format of the data that will be delivered
    * @param aImage The image data, the image format defines how the image data have to be delivered
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    * @throws com::sun::star::lang::IllegalArgumentException If the specified image format is invalid or not supported by the preview implementation
    */
  def setImage(aImageFormat: Double, aImage: js.Any): Unit = js.native
  /**
    * Optionally sets the current show state of the preview. It is possible that the preview implementation doesn't support hiding the preview.
    * @param bShowState A value of `TRUE` shows the preview window. A value of `FALSE` hides the preview window.
    * @returns A value of `TRUE` on success. A value of `FALSE` if the operation fails for any reason or the preview implementation doesn't support hiding the p
    */
  def setShowState(bShowState: Boolean): Boolean = js.native
}

object XFilePreview {
  @scala.inline
  def apply(
    AvailableHeight: Double,
    AvailableWidth: Double,
    ShowState: Boolean,
    SupportedImageFormats: SafeArray[Double],
    TargetColorDepth: Color,
    acquire: () => Unit,
    getAvailableHeight: () => Double,
    getAvailableWidth: () => Double,
    getShowState: () => Boolean,
    getSupportedImageFormats: () => SafeArray[Double],
    getTargetColorDepth: () => Color,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setImage: (Double, js.Any) => Unit,
    setShowState: Boolean => Boolean
  ): XFilePreview = {
    val __obj = js.Dynamic.literal(AvailableHeight = AvailableHeight.asInstanceOf[js.Any], AvailableWidth = AvailableWidth.asInstanceOf[js.Any], ShowState = ShowState.asInstanceOf[js.Any], SupportedImageFormats = SupportedImageFormats.asInstanceOf[js.Any], TargetColorDepth = TargetColorDepth.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAvailableHeight = js.Any.fromFunction0(getAvailableHeight), getAvailableWidth = js.Any.fromFunction0(getAvailableWidth), getShowState = js.Any.fromFunction0(getShowState), getSupportedImageFormats = js.Any.fromFunction0(getSupportedImageFormats), getTargetColorDepth = js.Any.fromFunction0(getTargetColorDepth), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setImage = js.Any.fromFunction2(setImage), setShowState = js.Any.fromFunction1(setShowState))
    __obj.asInstanceOf[XFilePreview]
  }
  @scala.inline
  implicit class XFilePreviewOps[Self <: XFilePreview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailableWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedImageFormats(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedImageFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetColorDepth(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetColorDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAvailableHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAvailableWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetShowState(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShowState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSupportedImageFormats(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSupportedImageFormats")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTargetColorDepth(value: () => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetColorDepth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetImage(value: (Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetShowState(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShowState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

