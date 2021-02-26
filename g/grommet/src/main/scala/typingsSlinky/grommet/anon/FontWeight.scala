package typingsSlinky.grommet.anon

import slinky.core.ReactComponentClass
import typingsSlinky.grommet.baseMod.ExtendProps
import typingsSlinky.grommet.baseMod.ExtendType
import typingsSlinky.grommet.baseMod.ExtendValue
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.PropsOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontWeight extends StObject {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var extend: js.UndefOr[ExtendType[PropsOf[ReactComponentClass[AnchorPropsOmitDetailedHT]]]] = js.native
  
  var fontWeight: js.UndefOr[Double] = js.native
  
  var hover: js.UndefOr[TextDecoration] = js.native
  
  var textDecoration: js.UndefOr[String] = js.native
}
object FontWeight {
  
  @scala.inline
  def apply(): FontWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeight]
  }
  
  @scala.inline
  implicit class FontWeightMutableBuilder[Self <: FontWeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setExtend(value: ExtendType[PropsOf[ReactComponentClass[AnchorPropsOmitDetailedHT]]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(
      value: /* props */ ExtendProps[PropsOf[ReactComponentClass[AnchorPropsOmitDetailedHT]]] => ExtendValue[PropsOf[ReactComponentClass[AnchorPropsOmitDetailedHT]]]
    ): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setHover(value: TextDecoration): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
