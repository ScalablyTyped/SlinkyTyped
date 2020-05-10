package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the Line.  When unset, these fields default to values
  * that match the appearance of new lines created in the Slides editor.
  */
@js.native
trait SchemaLineProperties extends js.Object {
  /**
    * The dash style of the line.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * The style of the arrow at the end of the line.
    */
  var endArrow: js.UndefOr[String] = js.native
  /**
    * The connection at the end of the line. If unset, there is no connection.
    * Only lines with a Type indicating it is a &quot;connector&quot; can have
    * an `end_connection`.
    */
  var endConnection: js.UndefOr[SchemaLineConnection] = js.native
  /**
    * The fill of the line. The default line fill matches the defaults for new
    * lines created in the Slides editor.
    */
  var lineFill: js.UndefOr[SchemaLineFill] = js.native
  /**
    * The hyperlink destination of the line. If unset, there is no link.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  /**
    * The style of the arrow at the beginning of the line.
    */
  var startArrow: js.UndefOr[String] = js.native
  /**
    * The connection at the beginning of the line. If unset, there is no
    * connection.  Only lines with a Type indicating it is a
    * &quot;connector&quot; can have a `start_connection`.
    */
  var startConnection: js.UndefOr[SchemaLineConnection] = js.native
  /**
    * The thickness of the line.
    */
  var weight: js.UndefOr[SchemaDimension] = js.native
}

object SchemaLineProperties {
  @scala.inline
  def apply(): SchemaLineProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLineProperties]
  }
  @scala.inline
  implicit class SchemaLinePropertiesOps[Self <: SchemaLineProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEndArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withEndConnection(value: SchemaLineConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withLineFill(value: SchemaLineFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineFill")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: SchemaLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withStartArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withStartConnection(value: SchemaLineConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

