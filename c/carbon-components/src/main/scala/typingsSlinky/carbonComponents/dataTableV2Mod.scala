package typingsSlinky.carbonComponents

import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableV2Mod {
  
  @JSImport("carbon-components/components/data-table-v2/data-table-v2", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.carbonComponents.dataTableMod.default {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/data-table-v2/data-table-v2", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/data-table-v2/data-table-v2", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    object eventHandlers {
      
      @JSImport("carbon-components/components/data-table-v2/data-table-v2", "default.eventHandlers")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/data-table-v2/data-table-v2", "default.eventHandlers.action-bar-cancel")
      @js.native
      def actionBarCancel: String = js.native
      
      @scala.inline
      def actionBarCancel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("action-bar-cancel")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/data-table-v2/data-table-v2", "default.eventHandlers.expand")
      @js.native
      def expand: String = js.native
      
      @JSImport("carbon-components/components/data-table-v2/data-table-v2", "default.eventHandlers.expandAll")
      @js.native
      def expandAll: String = js.native
      @scala.inline
      def expandAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def expand_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/data-table-v2/data-table-v2", "default.eventHandlers.select")
      @js.native
      def select: String = js.native
      
      @JSImport("carbon-components/components/data-table-v2/data-table-v2", "default.eventHandlers.select-all")
      @js.native
      def selectAll: String = js.native
      
      @scala.inline
      def selectAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select-all")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def select_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/data-table-v2/data-table-v2", "default.eventHandlers.sort")
      @js.native
      def sort: String = js.native
      @scala.inline
      def sort_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sort")(x.asInstanceOf[js.Any])
    }
  }
}
