package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A color that can either be fully opaque or fully transparent.
  */
@js.native
trait SchemaOptionalColor extends js.Object {
  /**
    * If set, this will be used as an opaque color. If unset, this represents a
    * transparent color.
    */
  var color: js.UndefOr[SchemaColor] = js.native
}

object SchemaOptionalColor {
  @scala.inline
  def apply(): SchemaOptionalColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptionalColor]
  }
  @scala.inline
  implicit class SchemaOptionalColorOps[Self <: SchemaOptionalColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: SchemaColor): Self = {
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
  }
  
}

