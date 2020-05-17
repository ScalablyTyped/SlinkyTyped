package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedSlideShow extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.NamedSlideShow_typekey")
  var PowerPointDotNamedSlideShow_typekey: NamedSlideShow = js.native
  val SlideIDs: js.Any = js.native
  def Delete(): Unit = js.native
}

object NamedSlideShow {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Delete: () => Unit,
    Name: String,
    Parent: js.Any,
    PowerPointDotNamedSlideShow_typekey: NamedSlideShow,
    SlideIDs: js.Any
  ): NamedSlideShow = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlideIDs = SlideIDs.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.NamedSlideShow_typekey")(PowerPointDotNamedSlideShow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedSlideShow]
  }
  @scala.inline
  implicit class NamedSlideShowOps[Self <: NamedSlideShow] (val x: Self) extends AnyVal {
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
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotNamedSlideShow_typekey(value: NamedSlideShow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.NamedSlideShow_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideIDs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideIDs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

