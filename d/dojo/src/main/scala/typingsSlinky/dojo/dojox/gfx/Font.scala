package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.Font.html
  *
  * An object specifying the properties for a Font used in text operations.
  *
  */
@js.native
trait Font extends js.Object {
  /**
    * The font family, one of 'serif', 'sanserif', ..., default value 'serif'.
    *
    */
  var family: String = js.native
  /**
    * The font size (including units), default value '10pt'.
    *
    */
  var size: String = js.native
  /**
    * The font style, one of 'normal', 'bold', default value 'normal'.
    *
    */
  var style: String = js.native
  /**
    * Specifies this object is a Font, value 'font'.
    *
    */
  var `type`: String = js.native
  /**
    * The font variant, one of 'normal', ... , default value 'normal'.
    *
    */
  var variant: String = js.native
  /**
    * The font weight, one of 'normal', ..., default value 'normal'.
    *
    */
  var weight: String = js.native
}

object Font {
  @scala.inline
  def apply(family: String, size: String, style: String, `type`: String, variant: String, weight: String): Font = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

