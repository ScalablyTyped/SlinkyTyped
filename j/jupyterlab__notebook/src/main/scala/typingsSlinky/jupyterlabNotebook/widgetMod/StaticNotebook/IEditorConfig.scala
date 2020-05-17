package typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook

import typingsSlinky.jupyterlabNotebook.anon.PartialIConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A config object for the cell editors.
  */
@js.native
trait IEditorConfig extends js.Object {
  /**
    * Config options for code cells.
    */
  val code: PartialIConfig = js.native
  /**
    * Config options for markdown cells.
    */
  val markdown: PartialIConfig = js.native
  /**
    * Config options for raw cells.
    */
  val raw: PartialIConfig = js.native
}

object IEditorConfig {
  @scala.inline
  def apply(code: PartialIConfig, markdown: PartialIConfig, raw: PartialIConfig): IEditorConfig = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorConfig]
  }
  @scala.inline
  implicit class IEditorConfigOps[Self <: IEditorConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: PartialIConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkdown(value: PartialIConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: PartialIConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

