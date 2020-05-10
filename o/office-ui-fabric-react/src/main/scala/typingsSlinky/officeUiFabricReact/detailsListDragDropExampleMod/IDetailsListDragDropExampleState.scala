package typingsSlinky.officeUiFabricReact.detailsListDragDropExampleMod

import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListDragDropExampleState extends js.Object {
  var columns: js.Array[IColumn] = js.native
  var frozenColumnCountFromEnd: String = js.native
  var frozenColumnCountFromStart: String = js.native
  var isColumnReorderEnabled: Boolean = js.native
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ] = js.native
}

object IDetailsListDragDropExampleState {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    frozenColumnCountFromEnd: String,
    frozenColumnCountFromStart: String,
    isColumnReorderEnabled: Boolean,
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ]
  ): IDetailsListDragDropExampleState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], frozenColumnCountFromEnd = frozenColumnCountFromEnd.asInstanceOf[js.Any], frozenColumnCountFromStart = frozenColumnCountFromStart.asInstanceOf[js.Any], isColumnReorderEnabled = isColumnReorderEnabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListDragDropExampleState]
  }
  @scala.inline
  implicit class IDetailsListDragDropExampleStateOps[Self <: IDetailsListDragDropExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[IColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrozenColumnCountFromEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumnCountFromEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrozenColumnCountFromStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumnCountFromStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsColumnReorderEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColumnReorderEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

