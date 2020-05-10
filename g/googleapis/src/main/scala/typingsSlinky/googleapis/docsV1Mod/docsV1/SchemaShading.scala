package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The shading of a paragraph.
  */
@js.native
trait SchemaShading extends js.Object {
  /**
    * The background color of this paragraph shading.
    */
  var backgroundColor: js.UndefOr[SchemaOptionalColor] = js.native
}

object SchemaShading {
  @scala.inline
  def apply(): SchemaShading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShading]
  }
  @scala.inline
  implicit class SchemaShadingOps[Self <: SchemaShading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: SchemaOptionalColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
  }
  
}

