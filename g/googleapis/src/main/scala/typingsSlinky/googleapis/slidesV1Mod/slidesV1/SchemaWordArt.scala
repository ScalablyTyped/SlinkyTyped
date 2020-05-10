package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing word art.
  */
@js.native
trait SchemaWordArt extends js.Object {
  /**
    * The text rendered as word art.
    */
  var renderedText: js.UndefOr[String] = js.native
}

object SchemaWordArt {
  @scala.inline
  def apply(): SchemaWordArt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWordArt]
  }
  @scala.inline
  implicit class SchemaWordArtOps[Self <: SchemaWordArt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedText")(js.undefined)
        ret
    }
  }
  
}

