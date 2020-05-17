package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterEffect extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.FilterEffect_typekey")
  var PowerPointDotFilterEffect_typekey: FilterEffect = js.native
  var Reveal: MsoTriState = js.native
  var Subtype: MsoAnimFilterEffectSubtype = js.native
  var Type: MsoAnimFilterEffectType = js.native
}

object FilterEffect {
  @scala.inline
  def apply(
    Application: Application,
    Parent: js.Any,
    PowerPointDotFilterEffect_typekey: FilterEffect,
    Reveal: MsoTriState,
    Subtype: MsoAnimFilterEffectSubtype,
    Type: MsoAnimFilterEffectType
  ): FilterEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reveal = Reveal.asInstanceOf[js.Any], Subtype = Subtype.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.FilterEffect_typekey")(PowerPointDotFilterEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEffect]
  }
  @scala.inline
  implicit class FilterEffectOps[Self <: FilterEffect] (val x: Self) extends AnyVal {
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
    def withPowerPointDotFilterEffect_typekey(value: FilterEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.FilterEffect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReveal(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reveal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtype(value: MsoAnimFilterEffectSubtype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoAnimFilterEffectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

