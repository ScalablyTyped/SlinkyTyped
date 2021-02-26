package typingsSlinky.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checked extends StObject {
  
  var checked: js.Array[typingsSlinky.rcTree.interfaceMod.Key] = js.native
  
  var halfChecked: js.Array[typingsSlinky.rcTree.interfaceMod.Key] = js.native
}
object Checked {
  
  @scala.inline
  def apply(
    checked: js.Array[typingsSlinky.rcTree.interfaceMod.Key],
    halfChecked: js.Array[typingsSlinky.rcTree.interfaceMod.Key]
  ): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  @scala.inline
  implicit class CheckedMutableBuilder[Self <: Checked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = StObject.set(x, "checked", js.Array(value :_*))
    
    @scala.inline
    def setHalfChecked(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfCheckedVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = StObject.set(x, "halfChecked", js.Array(value :_*))
  }
}
