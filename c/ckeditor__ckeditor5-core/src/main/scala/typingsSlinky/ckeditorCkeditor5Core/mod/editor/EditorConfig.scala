package typingsSlinky.ckeditorCkeditor5Core.mod.editor

import typingsSlinky.ckeditorCkeditor5Core.AnonItems
import typingsSlinky.ckeditorCkeditor5Core.mod.AlignmentConfig
import typingsSlinky.ckeditorCkeditor5Core.mod.AutosaveConfig
import typingsSlinky.ckeditorCkeditor5Core.mod.CKFinderAdapterConfig
import typingsSlinky.ckeditorCkeditor5Core.mod.CloudServicesConfig
import typingsSlinky.ckeditorCkeditor5Core.mod.FontFamilyConfig
import typingsSlinky.ckeditorCkeditor5Core.mod.FontSizeConfig
import typingsSlinky.ckeditorCkeditor5Core.mod.HeadingConfig
import typingsSlinky.ckeditorCkeditor5Core.mod.HighlightConfig
import typingsSlinky.ckeditorCkeditor5Core.mod.ImageConfig
import typingsSlinky.ckeditorCkeditor5Core.mod.MediaEmbedConfig
import typingsSlinky.ckeditorCkeditor5Core.mod.Plugin
import typingsSlinky.ckeditorCkeditor5Core.mod.TypingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// core/editor/editorconfig
@js.native
trait EditorConfig extends js.Object {
  var alignment: AlignmentConfig = js.native
  var autosave: AutosaveConfig = js.native
  var balloonToolbar: js.Array[String] = js.native
  var blockToolbar: js.Array[String] = js.native
  var ckfinder: CKFinderAdapterConfig = js.native
  var cloudServices: CloudServicesConfig = js.native
  var fontFamily: FontFamilyConfig = js.native
  var fontSize: FontSizeConfig = js.native
  var heading: HeadingConfig = js.native
  var highlight: HighlightConfig = js.native
  var image: ImageConfig = js.native
  var language: String = js.native
  var mediaEmbed: MediaEmbedConfig = js.native
  var plugins: js.Array[String | Plugin[Unit]] = js.native
  var removePlugins: js.Array[String] = js.native
  var toolbar: js.Array[String] | AnonItems = js.native
  var typing: TypingConfig = js.native
}

object EditorConfig {
  @scala.inline
  def apply(
    alignment: AlignmentConfig,
    autosave: AutosaveConfig,
    balloonToolbar: js.Array[String],
    blockToolbar: js.Array[String],
    ckfinder: CKFinderAdapterConfig,
    cloudServices: CloudServicesConfig,
    fontFamily: FontFamilyConfig,
    fontSize: FontSizeConfig,
    heading: HeadingConfig,
    highlight: HighlightConfig,
    image: ImageConfig,
    language: String,
    mediaEmbed: MediaEmbedConfig,
    plugins: js.Array[String | Plugin[Unit]],
    removePlugins: js.Array[String],
    toolbar: js.Array[String] | AnonItems,
    typing: TypingConfig
  ): EditorConfig = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], autosave = autosave.asInstanceOf[js.Any], balloonToolbar = balloonToolbar.asInstanceOf[js.Any], blockToolbar = blockToolbar.asInstanceOf[js.Any], ckfinder = ckfinder.asInstanceOf[js.Any], cloudServices = cloudServices.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], mediaEmbed = mediaEmbed.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], removePlugins = removePlugins.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorConfig]
  }
  @scala.inline
  implicit class EditorConfigOps[Self <: EditorConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: AlignmentConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutosave(value: AutosaveConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalloonToolbar(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockToolbar(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCkfinder(value: CKFinderAdapterConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ckfinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudServices(value: CloudServicesConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: FontFamilyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: FontSizeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeading(value: HeadingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: HighlightConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: ImageConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaEmbed(value: MediaEmbedConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaEmbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String | Plugin[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovePlugins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbar(value: js.Array[String] | AnonItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTyping(value: TypingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

