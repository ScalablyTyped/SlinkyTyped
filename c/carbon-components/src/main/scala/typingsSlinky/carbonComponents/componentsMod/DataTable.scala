package typingsSlinky.carbonComponents.componentsMod

import typingsSlinky.carbonComponents.dataTableMod.default
import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "DataTable")
@js.native
class DataTable protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}
object DataTable {
  
  @JSImport("carbon-components/globals/js/components", "DataTable")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "DataTable.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  object eventHandlers {
    
    @JSImport("carbon-components/globals/js/components", "DataTable.eventHandlers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/globals/js/components", "DataTable.eventHandlers.action-bar-cancel")
    @js.native
    def actionBarCancel: String = js.native
    
    @scala.inline
    def actionBarCancel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("action-bar-cancel")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "DataTable.eventHandlers.expand")
    @js.native
    def expand: String = js.native
    
    @JSImport("carbon-components/globals/js/components", "DataTable.eventHandlers.expandAll")
    @js.native
    def expandAll: String = js.native
    @scala.inline
    def expandAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def expand_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "DataTable.eventHandlers.select")
    @js.native
    def select: String = js.native
    
    @JSImport("carbon-components/globals/js/components", "DataTable.eventHandlers.select-all")
    @js.native
    def selectAll: String = js.native
    
    @scala.inline
    def selectAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select-all")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def select_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "DataTable.eventHandlers.sort")
    @js.native
    def sort: String = js.native
    @scala.inline
    def sort_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sort")(x.asInstanceOf[js.Any])
  }
}
