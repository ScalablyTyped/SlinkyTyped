package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A position in a query result set.
  */
@js.native
trait SchemaCursor extends js.Object {
  /**
    * If the position is just before or just after the given values, relative
    * to the sort order defined by the query.
    */
  var before: js.UndefOr[Boolean] = js.native
  /**
    * The values that represent a position, in the order they appear in the
    * order by clause of a query.  Can contain fewer values than specified in
    * the order by clause.
    */
  var values: js.UndefOr[js.Array[SchemaValue]] = js.native
}

object SchemaCursor {
  @scala.inline
  def apply(): SchemaCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCursor]
  }
  @scala.inline
  implicit class SchemaCursorOps[Self <: SchemaCursor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SchemaValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

