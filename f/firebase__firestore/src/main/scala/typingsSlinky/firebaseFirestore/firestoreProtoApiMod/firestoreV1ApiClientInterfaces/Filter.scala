package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  var compositeFilter: js.UndefOr[CompositeFilter] = js.native
  var fieldFilter: js.UndefOr[FieldFilter] = js.native
  var unaryFilter: js.UndefOr[UnaryFilter] = js.native
}

object Filter {
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompositeFilter(value: CompositeFilter): Self = {
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
    def withFieldFilter(value: FieldFilter): Self = {
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
    def withUnaryFilter(value: UnaryFilter): Self = {
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

