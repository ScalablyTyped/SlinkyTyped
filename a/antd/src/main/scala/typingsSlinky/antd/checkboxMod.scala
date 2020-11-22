package typingsSlinky.antd

import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.Indeterminate
import typingsSlinky.antd.checkboxGroupMod.CheckboxGroupContext
import typingsSlinky.antd.checkboxGroupMod.CheckboxGroupProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/checkbox", JSImport.Namespace)
@js.native
object checkboxMod extends js.Object {
  
  @js.native
  class default ()
    extends typingsSlinky.antd.checkboxCheckboxMod.default
  /* static members */
  @js.native
  object default extends js.Object {
    
    var Group: ReactComponentClass[CheckboxGroupProps] = js.native
    
    var __ANT_CHECKBOX: Boolean = js.native
    
    var contextType: Context[CheckboxGroupContext | Null] = js.native
    
    var defaultProps: Indeterminate = js.native
  }
}
