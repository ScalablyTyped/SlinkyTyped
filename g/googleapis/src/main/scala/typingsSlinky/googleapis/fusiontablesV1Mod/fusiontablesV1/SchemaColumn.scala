package typingsSlinky.googleapis.fusiontablesV1Mod.fusiontablesV1

import typingsSlinky.googleapis.AnonColumnId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the id, name and type of a column in a table.
  */
@js.native
trait SchemaColumn extends js.Object {
  /**
    * Optional identifier of the base column. If present, this column is
    * derived from the specified base column.
    */
  var baseColumn: js.UndefOr[AnonColumnId] = js.native
  /**
    * Identifier for the column.
    */
  var columnId: js.UndefOr[Double] = js.native
  /**
    * Optional column description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional column predicate. Used to map table to graph data model
    * (subject,predicate,object) See
    * http://www.w3.org/TR/2014/REC-rdf11-concepts-20140225/#data-model
    */
  var graph_predicate: js.UndefOr[String] = js.native
  /**
    * Type name: a template for an individual column.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Required name of the column.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required type of the column.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaColumn {
  @scala.inline
  def apply(): SchemaColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumn]
  }
  @scala.inline
  implicit class SchemaColumnOps[Self <: SchemaColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseColumn(value: AnonColumnId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withGraph_predicate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph_predicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraph_predicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph_predicate")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

