package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ruler extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Levels: RulerLevels = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Ruler_typekey")
  var PowerPointDotRuler_typekey: Ruler = js.native
  val TabStops: typingsSlinky.activexPowerpoint.PowerPoint.TabStops = js.native
}

object Ruler {
  @scala.inline
  def apply(
    Application: Application,
    Levels: RulerLevels,
    Parent: js.Any,
    PowerPointDotRuler_typekey: Ruler,
    TabStops: TabStops
  ): Ruler = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TabStops = TabStops.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Ruler_typekey")(PowerPointDotRuler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruler]
  }
  @scala.inline
  implicit class RulerOps[Self <: Ruler] (val x: Self) extends AnyVal {
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
    def withLevels(value: RulerLevels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotRuler_typekey(value: Ruler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Ruler_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabStops(value: TabStops): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabStops")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

