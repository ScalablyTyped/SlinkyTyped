package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ruler extends StObject {
  
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
  implicit class RulerMutableBuilder[Self <: Ruler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevels(value: RulerLevels): Self = StObject.set(x, "Levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotRuler_typekey(value: Ruler): Self = StObject.set(x, "PowerPoint.Ruler_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabStops(value: TabStops): Self = StObject.set(x, "TabStops", value.asInstanceOf[js.Any])
  }
}
