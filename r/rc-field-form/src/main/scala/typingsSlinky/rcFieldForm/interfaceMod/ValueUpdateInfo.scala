package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.rcFieldFormStrings.external
import typingsSlinky.rcFieldForm.rcFieldFormStrings.internal
import typingsSlinky.rcFieldForm.rcFieldFormStrings.valueUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueUpdateInfo extends NotifyInfo {
  
  var source: internal | external = js.native
  
  var `type`: valueUpdate = js.native
}
object ValueUpdateInfo {
  
  @scala.inline
  def apply(source: internal | external, `type`: valueUpdate): ValueUpdateInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueUpdateInfo]
  }
  
  @scala.inline
  implicit class ValueUpdateInfoMutableBuilder[Self <: ValueUpdateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: internal | external): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: valueUpdate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
