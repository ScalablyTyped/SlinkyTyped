package typingsSlinky.postcss.mod

import typingsSlinky.postcss.postcssBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapOptions extends js.Object {
  /**
    * Indicates that PostCSS should add annotation comments to the CSS. By default,
    * PostCSS will always add a comment with a path to the source map. PostCSS will
    * not add annotations to CSS files that do not contain any comments.
    *
    * By default, PostCSS presumes that you want to save the source map as
    * opts.to + '.map' and will use this path in the annotation comment. A different
    * path can be set by providing a string value for annotation.
    *
    * If you have set inline: true, annotation cannot be disabled.
    */
  var annotation: js.UndefOr[String | `false`] = js.native
  /**
    * Override "from" in map's sources.
    */
  var from: js.UndefOr[String] = js.native
  /**
    * Indicates that the source map should be embedded in the output CSS as a
    * Base64-encoded comment. By default, it is true. But if all previous maps
    * are external, not inline, PostCSS will not embed the map even if you do
    * not set this option.
    *
    * If you have an inline source map, the result.map property will be empty,
    * as the source map will be contained within the text of result.css.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * Source map content from a previous processing step (e.g., Sass compilation).
    * PostCSS will try to read the previous source map automatically (based on comments
    * within the source CSS), but you can use this option to identify it manually.
    * If desired, you can omit the previous map with prev: false.
    */
  var prev: js.UndefOr[js.Any] = js.native
  /**
    * Indicates that PostCSS should set the origin content (e.g., Sass source)
    * of the source map. By default, it is true. But if all previous maps do not
    * contain sources content, PostCSS will also leave it out even if you do not set
    * this option.
    */
  var sourcesContent: js.UndefOr[Boolean] = js.native
}

object SourceMapOptions {
  @scala.inline
  def apply(): SourceMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMapOptions]
  }
  @scala.inline
  implicit class SourceMapOptionsOps[Self <: SourceMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcesContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcesContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcesContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcesContent")(js.undefined)
        ret
    }
  }
  
}

