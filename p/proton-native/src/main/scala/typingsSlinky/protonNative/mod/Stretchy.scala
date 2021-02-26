package typingsSlinky.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stretchy extends StObject {
  
  /**
    * Whether the component should stretch to fill the available space. Defaults to true.
    *
    * Excluded on:
    * - Tabs
    * - Grid children
    * - Combobox/RadioButton Items
    * - MenuBar
    */
  var stretchy: js.UndefOr[Boolean] = js.native
}
object Stretchy {
  
  @scala.inline
  def apply(): Stretchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stretchy]
  }
  
  @scala.inline
  implicit class StretchyMutableBuilder[Self <: Stretchy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStretchy(value: Boolean): Self = StObject.set(x, "stretchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchyUndefined: Self = StObject.set(x, "stretchy", js.undefined)
  }
}
