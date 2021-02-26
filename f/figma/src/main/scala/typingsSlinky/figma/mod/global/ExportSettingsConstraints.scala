package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.HEIGHT
import typingsSlinky.figma.figmaStrings.SCALE
import typingsSlinky.figma.figmaStrings.WIDTH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSettingsConstraints extends StObject {
  
  val `type`: SCALE | WIDTH | HEIGHT = js.native
  
  val value: Double = js.native
}
object ExportSettingsConstraints {
  
  @scala.inline
  def apply(`type`: SCALE | WIDTH | HEIGHT, value: Double): ExportSettingsConstraints = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsConstraints]
  }
  
  @scala.inline
  implicit class ExportSettingsConstraintsMutableBuilder[Self <: ExportSettingsConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: SCALE | WIDTH | HEIGHT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
