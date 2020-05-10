package typingsSlinky.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationContextMenu extends js.Object {
  /** Enables/disables the delete menu in the annotation context menu.
    */
  var isDeleteEnable: js.UndefOr[Boolean] = js.native
  /** Enables/disables the annotation context menu.
    */
  var isEnable: js.UndefOr[Boolean] = js.native
  /** Enables/disables the popup menu in the annotation context menu.
    */
  var isPopupEnable: js.UndefOr[Boolean] = js.native
  /** Enables/disables the properties menu in the annotation context menu.
    */
  var isPropertiesEnable: js.UndefOr[Boolean] = js.native
}

object AnnotationContextMenu {
  @scala.inline
  def apply(): AnnotationContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationContextMenu]
  }
  @scala.inline
  implicit class AnnotationContextMenuOps[Self <: AnnotationContextMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDeleteEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleteEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDeleteEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleteEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPopupEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPopupEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPopupEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPopupEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPropertiesEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPropertiesEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPropertiesEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPropertiesEnable")(js.undefined)
        ret
    }
  }
  
}

