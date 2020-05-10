package typingsSlinky.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimateAppear extends js.Object {
  var animateAppear: Boolean = js.native
  var animationType: String = js.native
  var closable: Boolean = js.native
  var footer: js.Array[scala.Nothing] = js.native
  var maskClosable: Boolean = js.native
  var operation: Boolean = js.native
  var popup: Boolean = js.native
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
  var transparent: Boolean = js.native
  var visible: Boolean = js.native
  def onClose(): Unit = js.native
}

object AnonAnimateAppear {
  @scala.inline
  def apply(
    animateAppear: Boolean,
    animationType: String,
    closable: Boolean,
    footer: js.Array[scala.Nothing],
    maskClosable: Boolean,
    onClose: () => Unit,
    operation: Boolean,
    popup: Boolean,
    styles: StringDictionary[RegisteredStyle[_]],
    transparent: Boolean,
    visible: Boolean
  ): AnonAnimateAppear = {
    val __obj = js.Dynamic.literal(animateAppear = animateAppear.asInstanceOf[js.Any], animationType = animationType.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), operation = operation.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimateAppear]
  }
  @scala.inline
  implicit class AnonAnimateAppearOps[Self <: AnonAnimateAppear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateAppear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateAppear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOperation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: StringDictionary[RegisteredStyle[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

