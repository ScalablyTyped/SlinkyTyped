package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pane extends StObject {
  
  def Activate(): Unit = js.native
  
  val Active: MsoTriState = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Pane_typekey")
  var PowerPointDotPane_typekey: Pane = js.native
  
  val ViewType: PpViewType = js.native
}
object Pane {
  
  @scala.inline
  def apply(
    Activate: () => Unit,
    Active: MsoTriState,
    Application: Application,
    Parent: js.Any,
    PowerPointDotPane_typekey: Pane,
    ViewType: PpViewType
  ): Pane = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Pane_typekey")(PowerPointDotPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pane]
  }
  
  @scala.inline
  implicit class PaneMutableBuilder[Self <: Pane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setActive(value: MsoTriState): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPane_typekey(value: Pane): Self = StObject.set(x, "PowerPoint.Pane_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: PpViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
  }
}
