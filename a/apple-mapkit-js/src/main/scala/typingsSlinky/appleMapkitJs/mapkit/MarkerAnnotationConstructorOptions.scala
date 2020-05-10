package typingsSlinky.appleMapkitJs.mapkit

import typingsSlinky.appleMapkitJs.Anon1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the options that initialize a marker annotation.
  */
@js.native
trait MarkerAnnotationConstructorOptions extends AnnotationConstructorOptions {
  /**
    * The background color of the balloon.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The fill color of the glyph.
    */
  var glyphColor: js.UndefOr[String] = js.native
  /**
    * The image to display in the marker balloon.
    */
  var glyphImage: js.UndefOr[Anon1] = js.native
  /**
    * The text to display in the marker balloon.
    */
  var glyphText: js.UndefOr[String] = js.native
  /**
    * The image to display in the balloon when the marker is selected.
    */
  var selectedGlyphImage: js.UndefOr[js.Object] = js.native
  /**
    * A value that determines the behavior of the subtitle's visibility.
    */
  var subtitleVisibility: js.UndefOr[String] = js.native
  /**
    * A value that determines the behavior of the title's visibility.
    */
  var titleVisibility: js.UndefOr[String] = js.native
}

object MarkerAnnotationConstructorOptions {
  @scala.inline
  def apply(): MarkerAnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerAnnotationConstructorOptions]
  }
  @scala.inline
  implicit class MarkerAnnotationConstructorOptionsOps[Self <: MarkerAnnotationConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphImage(value: Anon1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphImage")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedGlyphImage(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedGlyphImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedGlyphImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedGlyphImage")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleVisibility")(js.undefined)
        ret
    }
  }
  
}

