package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section column in the document.
  */
@js.native
trait SectionColumn extends js.Object {
  /**
    * Specifies the space between adjacent section columns.
    */
  var spacing: Double = js.native
  /**
    * Specifies the width of the section column.
    */
  var width: Double = js.native
}

object SectionColumn {
  @scala.inline
  def apply(spacing: Double, width: Double): SectionColumn = {
    val __obj = js.Dynamic.literal(spacing = spacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionColumn]
  }
  @scala.inline
  implicit class SectionColumnOps[Self <: SectionColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

