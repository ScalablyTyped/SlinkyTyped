package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedSlideShows extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.NamedSlideShows_typekey")
  var PowerPointDotNamedSlideShows_typekey: NamedSlideShows = js.native
  def Add(Name: String, safeArrayOfSlideIDs: js.Any): NamedSlideShow = js.native
  def Item(Index: js.Any): NamedSlideShow = js.native
}

object NamedSlideShows {
  @scala.inline
  def apply(
    Add: (String, js.Any) => NamedSlideShow,
    Application: Application,
    Count: Double,
    Item: js.Any => NamedSlideShow,
    Parent: js.Any,
    PowerPointDotNamedSlideShows_typekey: NamedSlideShows
  ): NamedSlideShows = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.NamedSlideShows_typekey")(PowerPointDotNamedSlideShows_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedSlideShows]
  }
  @scala.inline
  implicit class NamedSlideShowsOps[Self <: NamedSlideShows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, js.Any) => NamedSlideShow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => NamedSlideShow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotNamedSlideShows_typekey(value: NamedSlideShows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.NamedSlideShows_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

