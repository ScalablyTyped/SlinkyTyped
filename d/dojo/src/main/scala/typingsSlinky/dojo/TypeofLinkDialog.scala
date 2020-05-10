package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.dojo.dijit._editor.plugins.LinkDialog.ImgLinkDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofLinkDialog extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/LinkDialog.ImgLinkDialog.html
    *
    * This plugin extends LinkDialog and adds in a plugin for handling image links.
    * provides the image link dialog.
    * The command provided by this plugin is:
    * 
    * insertImage
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  var ImgLinkDialog: Instantiable1[
    js.UndefOr[/* args */ js.Object], 
    typingsSlinky.dojo.dijit._editor.plugins.LinkDialog.ImgLinkDialog
  ] = js.native
}

object TypeofLinkDialog {
  @scala.inline
  def apply(ImgLinkDialog: Instantiable1[js.UndefOr[/* args */ js.Object], ImgLinkDialog]): TypeofLinkDialog = {
    val __obj = js.Dynamic.literal(ImgLinkDialog = ImgLinkDialog.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLinkDialog]
  }
  @scala.inline
  implicit class TypeofLinkDialogOps[Self <: TypeofLinkDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImgLinkDialog(value: Instantiable1[js.UndefOr[/* args */ js.Object], ImgLinkDialog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImgLinkDialog")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

