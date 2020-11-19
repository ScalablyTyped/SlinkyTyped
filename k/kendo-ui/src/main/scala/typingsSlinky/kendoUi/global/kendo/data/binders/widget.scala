package typingsSlinky.kendoUi.global.kendo.data.binders

import typingsSlinky.kendoUi.kendo.data.Binder
import typingsSlinky.kendoUi.kendo.data.DataSourceBinder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.binders.widget")
@js.native
object widget extends js.Object {
  
  def source(bindingName: String, fieldName: String, setter: String): DataSourceBinder = js.native
  
  @js.native
  class checked ()
    extends typingsSlinky.kendoUi.kendo.data.binders.widget.checked
  
  @js.native
  class disabled () extends Binder
  
  @js.native
  object dropdowntree extends js.Object {
    
    @js.native
    class value ()
      extends typingsSlinky.kendoUi.kendo.data.binders.widget.dropdowntree.value
  }
  
  @js.native
  class enabled () extends Binder
  
  @js.native
  class end ()
    extends typingsSlinky.kendoUi.kendo.data.binders.widget.end
  
  @js.native
  class events () extends Binder
  
  @js.native
  object gantt extends js.Object {
    
    def dependencies(bindingName: String, fieldName: String, setter: String): DataSourceBinder = js.native
  }
  
  @js.native
  object grid extends js.Object {
    
    def source(bindingName: String, fieldName: String, setter: String): DataSourceBinder = js.native
  }
  
  @js.native
  class invisible () extends Binder
  
  @js.native
  object multiselect extends js.Object {
    
    @js.native
    class value ()
      extends typingsSlinky.kendoUi.kendo.data.binders.widget.multiselect.value
  }
  
  @js.native
  object scheduler extends js.Object {
    
    def source(bindingName: String, fieldName: String, setter: String): DataSourceBinder = js.native
  }
  
  @js.native
  class start ()
    extends typingsSlinky.kendoUi.kendo.data.binders.widget.start
  
  @js.native
  class value ()
    extends typingsSlinky.kendoUi.kendo.data.binders.widget.value
  
  @js.native
  class visible () extends Binder
}
