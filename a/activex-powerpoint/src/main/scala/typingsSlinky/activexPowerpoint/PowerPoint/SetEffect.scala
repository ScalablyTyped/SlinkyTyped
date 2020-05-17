package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetEffect extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.SetEffect_typekey")
  var PowerPointDotSetEffect_typekey: SetEffect = js.native
  var Property: MsoAnimProperty = js.native
  var To: js.Any = js.native
}

object SetEffect {
  @scala.inline
  def apply(
    Application: Application,
    Parent: js.Any,
    PowerPointDotSetEffect_typekey: SetEffect,
    Property: MsoAnimProperty,
    To: js.Any
  ): SetEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SetEffect_typekey")(PowerPointDotSetEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEffect]
  }
  @scala.inline
  implicit class SetEffectOps[Self <: SetEffect] (val x: Self) extends AnyVal {
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
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotSetEffect_typekey(value: SetEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.SetEffect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: MsoAnimProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

