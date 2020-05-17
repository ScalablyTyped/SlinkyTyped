package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyEffect extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var From: js.Any = js.native
  val Parent: js.Any = js.native
  val Points: AnimationPoints = js.native
  @JSName("PowerPoint.PropertyEffect_typekey")
  var PowerPointDotPropertyEffect_typekey: PropertyEffect = js.native
  var Property: MsoAnimProperty = js.native
  var To: js.Any = js.native
}

object PropertyEffect {
  @scala.inline
  def apply(
    Application: Application,
    From: js.Any,
    Parent: js.Any,
    Points: AnimationPoints,
    PowerPointDotPropertyEffect_typekey: PropertyEffect,
    Property: MsoAnimProperty,
    To: js.Any
  ): PropertyEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PropertyEffect_typekey")(PowerPointDotPropertyEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyEffect]
  }
  @scala.inline
  implicit class PropertyEffectOps[Self <: PropertyEffect] (val x: Self) extends AnyVal {
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
    def withFrom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("From")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: AnimationPoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotPropertyEffect_typekey(value: PropertyEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.PropertyEffect_typekey")(value.asInstanceOf[js.Any])
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

