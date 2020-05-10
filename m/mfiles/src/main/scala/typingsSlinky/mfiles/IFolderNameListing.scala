package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderNameListing extends js.Object {
  val Count: Double = js.native
  val MoreValues: Boolean = js.native
  def Item(Index: Double): ITypedValue = js.native
  def SortWithExpression(Expression: IExpression, Locale: Double): Unit = js.native
}

object IFolderNameListing {
  @scala.inline
  def apply(
    Count: Double,
    Item: Double => ITypedValue,
    MoreValues: Boolean,
    SortWithExpression: (IExpression, Double) => Unit
  ): IFolderNameListing = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MoreValues = MoreValues.asInstanceOf[js.Any], SortWithExpression = js.Any.fromFunction2(SortWithExpression))
    __obj.asInstanceOf[IFolderNameListing]
  }
  @scala.inline
  implicit class IFolderNameListingOps[Self <: IFolderNameListing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double => ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoreValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoreValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortWithExpression(value: (IExpression, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortWithExpression")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

