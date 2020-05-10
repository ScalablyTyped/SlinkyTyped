package typingsSlinky.geopattern.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternOptions extends js.Object {
  /**
    * Controls the relative background color of the generated image. The color
    * is not identical to that used in the pattern because the hue is rotated
    * by the generator. This is a CSS hexadecimal color value, which defaults
    * to #933c3c.
    */
  var baseColor: js.UndefOr[String] = js.native
  /**
    * Specify an exact background color. This is a CSS hexadecimal color
    * value.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Determines the pattern. All of the original patterns from the Ruby
    * version at jasonlong/geo_pattern are available in this port, and their
    * names are camelCased.
    */
  var generator: js.UndefOr[GeneratorType] = js.native
}

object PatternOptions {
  @scala.inline
  def apply(): PatternOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatternOptions]
  }
  @scala.inline
  implicit class PatternOptionsOps[Self <: PatternOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColor")(js.undefined)
        ret
    }
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
    def withGenerator(value: GeneratorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(js.undefined)
        ret
    }
  }
  
}

