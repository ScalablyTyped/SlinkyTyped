package typingsSlinky.grommet.anon

import typingsSlinky.grommet.baseMod.ExtendProps
import typingsSlinky.grommet.baseMod.ExtendType
import typingsSlinky.grommet.baseMod.ExtendValue
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `25` extends StObject {
  
  var extend: js.UndefOr[ExtendType[Record[String, _]]] = js.native
  
  var size: js.UndefOr[LargeMedium] = js.native
}
object `25` {
  
  @scala.inline
  def apply(): `25` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit class `25MutableBuilder`[Self <: `25`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, _]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, _]] => ExtendValue[Record[String, _]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setSize(value: LargeMedium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
