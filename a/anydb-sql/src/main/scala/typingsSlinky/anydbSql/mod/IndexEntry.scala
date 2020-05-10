package typingsSlinky.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexEntry extends js.Object {
  var Cardinality: Double = js.native
  var Collation: String = js.native
  var Column_name: String = js.native
  var Comment: String = js.native
  var Index_comment: String = js.native
  var Index_type: String = js.native
  var Key_name: String = js.native
  var Non_unique: Boolean = js.native
  var Packed: Boolean = js.native
  var Seq_in_index: Double = js.native
  var Sub_part: String = js.native
  var Table: String = js.native
}

object IndexEntry {
  @scala.inline
  def apply(
    Cardinality: Double,
    Collation: String,
    Column_name: String,
    Comment: String,
    Index_comment: String,
    Index_type: String,
    Key_name: String,
    Non_unique: Boolean,
    Packed: Boolean,
    Seq_in_index: Double,
    Sub_part: String,
    Table: String
  ): IndexEntry = {
    val __obj = js.Dynamic.literal(Cardinality = Cardinality.asInstanceOf[js.Any], Collation = Collation.asInstanceOf[js.Any], Column_name = Column_name.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Index_comment = Index_comment.asInstanceOf[js.Any], Index_type = Index_type.asInstanceOf[js.Any], Key_name = Key_name.asInstanceOf[js.Any], Non_unique = Non_unique.asInstanceOf[js.Any], Packed = Packed.asInstanceOf[js.Any], Seq_in_index = Seq_in_index.asInstanceOf[js.Any], Sub_part = Sub_part.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexEntry]
  }
  @scala.inline
  implicit class IndexEntryOps[Self <: IndexEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardinality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cardinality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Collation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Column_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex_comment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNon_unique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Non_unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Packed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeq_in_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Seq_in_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSub_part(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sub_part")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

