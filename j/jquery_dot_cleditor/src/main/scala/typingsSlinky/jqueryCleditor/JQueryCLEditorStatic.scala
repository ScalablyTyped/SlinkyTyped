package typingsSlinky.jqueryCleditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains global properties and methods used to create
  * custom plugins and override built in functionality.
  */
@js.native
trait JQueryCLEditorStatic extends js.Object {
  var buttons: js.Array[JQueryCLEditorButtonDefinition] = js.native
  var defaultOptions: JQueryCLEditorOptions = js.native
  def imagesPath(): String = js.native
}

object JQueryCLEditorStatic {
  @scala.inline
  def apply(
    buttons: js.Array[JQueryCLEditorButtonDefinition],
    defaultOptions: JQueryCLEditorOptions,
    imagesPath: () => String
  ): JQueryCLEditorStatic = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], defaultOptions = defaultOptions.asInstanceOf[js.Any], imagesPath = js.Any.fromFunction0(imagesPath))
    __obj.asInstanceOf[JQueryCLEditorStatic]
  }
  @scala.inline
  implicit class JQueryCLEditorStaticOps[Self <: JQueryCLEditorStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: js.Array[JQueryCLEditorButtonDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOptions(value: JQueryCLEditorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImagesPath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagesPath")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

