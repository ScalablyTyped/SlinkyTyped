package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon extends Overlay {
  var anchor: Size = js.native
  var imageOffset: Size = js.native
  var imageSize: Size = js.native
  var imageUrl: Size = js.native
  var infoWindowAnchor: Size = js.native
  var printImageUrl: String = js.native
  var size: Size = js.native
  def setAnchor(anchor: Size): Unit = js.native
  def setImageOffset(offset: Size): Unit = js.native
  def setImageSize(offset: Size): Unit = js.native
  def setImageUrl(imageUrl: String): Unit = js.native
  def setInfoWindowAnchor(anchor: Size): Unit = js.native
  def setPrintImageUrl(url: String): Unit = js.native
  def setSize(size: Size): Unit = js.native
}

object Icon {
  @scala.inline
  def apply(
    anchor: Size,
    imageOffset: Size,
    imageSize: Size,
    imageUrl: Size,
    infoWindowAnchor: Size,
    printImageUrl: String,
    setAnchor: Size => Unit,
    setImageOffset: Size => Unit,
    setImageSize: Size => Unit,
    setImageUrl: String => Unit,
    setInfoWindowAnchor: Size => Unit,
    setPrintImageUrl: String => Unit,
    setSize: Size => Unit,
    size: Size
  ): Icon = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], imageOffset = imageOffset.asInstanceOf[js.Any], imageSize = imageSize.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], infoWindowAnchor = infoWindowAnchor.asInstanceOf[js.Any], printImageUrl = printImageUrl.asInstanceOf[js.Any], setAnchor = js.Any.fromFunction1(setAnchor), setImageOffset = js.Any.fromFunction1(setImageOffset), setImageSize = js.Any.fromFunction1(setImageSize), setImageUrl = js.Any.fromFunction1(setImageUrl), setInfoWindowAnchor = js.Any.fromFunction1(setInfoWindowAnchor), setPrintImageUrl = js.Any.fromFunction1(setPrintImageUrl), setSize = js.Any.fromFunction1(setSize), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageOffset(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrl(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoWindowAnchor(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoWindowAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAnchor(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnchor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImageOffset(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImageSize(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImageUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetInfoWindowAnchor(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInfoWindowAnchor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPrintImageUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrintImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSize(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

