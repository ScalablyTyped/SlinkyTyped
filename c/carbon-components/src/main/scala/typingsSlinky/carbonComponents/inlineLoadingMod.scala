package typingsSlinky.carbonComponents

import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inlineLoadingMod {
  
  @JSImport("carbon-components/components/inline-loading/inline-loading", JSImport.Default)
  @js.native
  class default protected () extends InlineLoading {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/inline-loading/inline-loading", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/inline-loading/inline-loading", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    object states {
      
      @JSImport("carbon-components/components/inline-loading/inline-loading", "default.states")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/inline-loading/inline-loading", "default.states.ACTIVE")
      @js.native
      def ACTIVE: String = js.native
      @scala.inline
      def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/inline-loading/inline-loading", "default.states.ERROR")
      @js.native
      def ERROR: String = js.native
      @scala.inline
      def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/inline-loading/inline-loading", "default.states.FINISHED")
      @js.native
      def FINISHED: String = js.native
      @scala.inline
      def FINISHED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINISHED")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/inline-loading/inline-loading", "default.states.INACTIVE")
      @js.native
      def INACTIVE: String = js.native
      @scala.inline
      def INACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INACTIVE")(x.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait InlineLoading extends StObject {
    
    def setState(state: js.Any): this.type = js.native
  }
  object InlineLoading {
    
    @scala.inline
    def apply(setState: js.Any => InlineLoading): InlineLoading = {
      val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[InlineLoading]
    }
    
    @scala.inline
    implicit class InlineLoadingMutableBuilder[Self <: InlineLoading] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetState(value: js.Any => InlineLoading): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
}
