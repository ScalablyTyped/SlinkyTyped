package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterEffect extends StObject {
  
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
  implicit class FilterEffectMutableBuilder[Self <: FilterEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotFilterEffect_typekey(value: FilterEffect): Self = StObject.set(x, "PowerPoint.FilterEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReveal(value: MsoTriState): Self = StObject.set(x, "Reveal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtype(value: MsoAnimFilterEffectSubtype): Self = StObject.set(x, "Subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoAnimFilterEffectType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
