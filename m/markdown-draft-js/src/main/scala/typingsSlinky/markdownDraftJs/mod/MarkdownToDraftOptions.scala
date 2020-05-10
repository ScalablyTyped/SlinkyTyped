package typingsSlinky.markdownDraftJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownToDraftOptions extends js.Object {
  var blockEntities: js.UndefOr[BlockEntitiesParam] = js.native
  var blockStyles: js.UndefOr[StringDictionary[String]] = js.native
  var blockTypes: js.UndefOr[BlockTypesParam] = js.native
  var remarkableOptions: js.UndefOr[StringDictionary[Boolean | js.Object]] = js.native
  var remarkablePlugins: js.UndefOr[js.Array[_]] = js.native
  var remarkablePreset: js.UndefOr[String] = js.native
}

object MarkdownToDraftOptions {
  @scala.inline
  def apply(): MarkdownToDraftOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkdownToDraftOptions]
  }
  @scala.inline
  implicit class MarkdownToDraftOptionsOps[Self <: MarkdownToDraftOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockEntities(value: BlockEntitiesParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockStyles(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockTypes(value: BlockTypesParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withRemarkableOptions(value: StringDictionary[Boolean | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarkableOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemarkableOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarkableOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRemarkablePlugins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarkablePlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemarkablePlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarkablePlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRemarkablePreset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarkablePreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemarkablePreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarkablePreset")(js.undefined)
        ret
    }
  }
  
}

