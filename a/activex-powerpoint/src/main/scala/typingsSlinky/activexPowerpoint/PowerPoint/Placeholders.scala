package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placeholders extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Placeholders_typekey")
  var PowerPointDotPlaceholders_typekey: Placeholders = js.native
  def FindByName(Index: js.Any): Shape = js.native
  def Item(Index: Double): Shape = js.native
}

object Placeholders {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    FindByName: js.Any => Shape,
    Item: Double => Shape,
    Parent: js.Any,
    PowerPointDotPlaceholders_typekey: Placeholders
  ): Placeholders = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], FindByName = js.Any.fromFunction1(FindByName), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Placeholders_typekey")(PowerPointDotPlaceholders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholders]
  }
  @scala.inline
  implicit class PlaceholdersOps[Self <: Placeholders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFindByName(value: js.Any => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => Shape): Self = {
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
    def withPowerPointDotPlaceholders_typekey(value: Placeholders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Placeholders_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

