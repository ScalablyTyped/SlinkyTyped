package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter.
  */
@js.native
trait SchemaFilter extends js.Object {
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.native
  /**
    * A filter on a document field.
    */
  var fieldFilter: js.UndefOr[SchemaFieldFilter] = js.native
  /**
    * A filter that takes exactly one argument.
    */
  var unaryFilter: js.UndefOr[SchemaUnaryFilter] = js.native
}

object SchemaFilter {
  @scala.inline
  def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  @scala.inline
  implicit class SchemaFilterOps[Self <: SchemaFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompositeFilter(value: SchemaCompositeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompositeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldFilter(value: SchemaFieldFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withUnaryFilter(value: SchemaUnaryFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unaryFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnaryFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unaryFilter")(js.undefined)
        ret
    }
  }
  
}

