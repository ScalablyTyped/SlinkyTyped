package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties that apply to a section&#39;s column.
  */
@js.native
trait SchemaSectionColumnProperties extends js.Object {
  /**
    * The padding at the end of the column.
    */
  var paddingEnd: js.UndefOr[SchemaDimension] = js.native
  /**
    * The width of the column.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
}

object SchemaSectionColumnProperties {
  @scala.inline
  def apply(): SchemaSectionColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSectionColumnProperties]
  }
  @scala.inline
  implicit class SchemaSectionColumnPropertiesOps[Self <: SchemaSectionColumnProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaddingEnd(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

