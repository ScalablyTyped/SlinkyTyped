package typingsSlinky.reactRte.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.draftJs.mod.ContentBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportOptions extends js.Object {
  var blockRenderers: js.UndefOr[StringDictionary[BlockRenderer]] = js.native
  var blockStyleFn: js.UndefOr[BlockStyleFn] = js.native
  var entityStyleFn: js.UndefOr[EntityStyleFn] = js.native
  var inlineStyles: js.UndefOr[StringDictionary[RenderConfig]] = js.native
}

object ExportOptions {
  @scala.inline
  def apply(): ExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportOptions]
  }
  @scala.inline
  implicit class ExportOptionsOps[Self <: ExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockRenderers(value: StringDictionary[BlockRenderer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRenderers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockRenderers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRenderers")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockStyleFn(value: /* block */ ContentBlock => RenderConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStyleFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBlockStyleFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStyleFn")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityStyleFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any => RenderConfig
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityStyleFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEntityStyleFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityStyleFn")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineStyles(value: StringDictionary[RenderConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineStyles")(js.undefined)
        ret
    }
  }
  
}

