package typingsSlinky.baseui.fileUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleProps extends js.Object {
  @JSName("$afterFileDrop")
  var $afterFileDrop: Boolean = js.native
  @JSName("$isDisabled")
  var $isDisabled: Boolean = js.native
  @JSName("$isDragAccept")
  var $isDragAccept: Boolean = js.native
  @JSName("$isDragActive")
  var $isDragActive: Boolean = js.native
  @JSName("$isDragReject")
  var $isDragReject: Boolean = js.native
  @JSName("$isFocused")
  var $isFocused: Boolean = js.native
}

object StyleProps {
  @scala.inline
  def apply(
    $afterFileDrop: Boolean,
    $isDisabled: Boolean,
    $isDragAccept: Boolean,
    $isDragActive: Boolean,
    $isDragReject: Boolean,
    $isFocused: Boolean
  ): StyleProps = {
    val __obj = js.Dynamic.literal($afterFileDrop = $afterFileDrop.asInstanceOf[js.Any], $isDisabled = $isDisabled.asInstanceOf[js.Any], $isDragAccept = $isDragAccept.asInstanceOf[js.Any], $isDragActive = $isDragActive.asInstanceOf[js.Any], $isDragReject = $isDragReject.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleProps]
  }
  @scala.inline
  implicit class StylePropsOps[Self <: StyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$afterFileDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$afterFileDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isDragAccept(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isDragAccept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isDragActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isDragActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isDragReject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isDragReject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isFocused")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

