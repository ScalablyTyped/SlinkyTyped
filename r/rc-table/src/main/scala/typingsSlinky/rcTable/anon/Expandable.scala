package typingsSlinky.rcTable.anon

import typingsSlinky.rcTable.interfaceMod.ExpandableConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expandable[RecordType] extends StObject {
  
  var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.native
}
object Expandable {
  
  @scala.inline
  def apply[RecordType](): Expandable[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expandable[RecordType]]
  }
  
  @scala.inline
  implicit class ExpandableMutableBuilder[Self <: Expandable[_], RecordType] (val x: Self with Expandable[RecordType]) extends AnyVal {
    
    @scala.inline
    def setExpandable(value: ExpandableConfig[RecordType]): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
  }
}
