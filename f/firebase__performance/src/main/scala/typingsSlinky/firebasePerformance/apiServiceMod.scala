package typingsSlinky.firebasePerformance

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Navigator
import org.scalajs.dom.raw.PerformanceEntry
import org.scalajs.dom.raw.Storage
import typingsSlinky.firebasePerformance.anon.OnFirstInputDelay
import typingsSlinky.firebasePerformance.anon.TypeofPerformanceObserver
import typingsSlinky.firebasePerformance.apiServiceMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/api_service", "Api")
  @js.native
  class Api () extends StObject {
    def this(window: Window) = this()
    
    /** PreformanceObserver constructor function. */
    val PerformanceObserver: js.Any = js.native
    
    val document: Document = js.native
    
    def getEntriesByName(name: String): js.Array[PerformanceEntry] = js.native
    
    def getEntriesByType(`type`: EntryType): js.Array[PerformanceEntry] = js.native
    
    def getTimeOrigin(): Double = js.native
    
    def getUrl(): String = js.native
    
    val localStorage: js.UndefOr[Storage] = js.native
    
    def mark(name: String): Unit = js.native
    
    def measure(measureName: String, mark1: String, mark2: String): Unit = js.native
    
    val navigator: Navigator = js.native
    
    val onFirstInputDelay: js.UndefOr[js.Function] = js.native
    
    val performance: js.Any = js.native
    
    def requiredApisAvailable(): Boolean = js.native
    
    def setupObserver(entryType: EntryType, callback: js.Function1[/* entry */ PerformanceEntry, Unit]): Unit = js.native
    
    val window: js.UndefOr[Window] = js.native
    
    val windowLocation: js.Any = js.native
  }
  /* static members */
  object Api {
    
    @JSImport("@firebase/performance/dist/src/services/api_service", "Api.getInstance")
    @js.native
    def getInstance(): Api = js.native
  }
  
  @JSImport("@firebase/performance/dist/src/services/api_service", "setupApi")
  @js.native
  def setupApi(window: Window): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.mark
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.measure
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.paint
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.resource
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.frame
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.navigation
  */
  trait EntryType extends StObject
  object EntryType {
    
    @scala.inline
    def frame: typingsSlinky.firebasePerformance.firebasePerformanceStrings.frame = "frame".asInstanceOf[typingsSlinky.firebasePerformance.firebasePerformanceStrings.frame]
    
    @scala.inline
    def mark: typingsSlinky.firebasePerformance.firebasePerformanceStrings.mark = "mark".asInstanceOf[typingsSlinky.firebasePerformance.firebasePerformanceStrings.mark]
    
    @scala.inline
    def measure: typingsSlinky.firebasePerformance.firebasePerformanceStrings.measure = "measure".asInstanceOf[typingsSlinky.firebasePerformance.firebasePerformanceStrings.measure]
    
    @scala.inline
    def navigation: typingsSlinky.firebasePerformance.firebasePerformanceStrings.navigation = "navigation".asInstanceOf[typingsSlinky.firebasePerformance.firebasePerformanceStrings.navigation]
    
    @scala.inline
    def paint: typingsSlinky.firebasePerformance.firebasePerformanceStrings.paint = "paint".asInstanceOf[typingsSlinky.firebasePerformance.firebasePerformanceStrings.paint]
    
    @scala.inline
    def resource: typingsSlinky.firebasePerformance.firebasePerformanceStrings.resource = "resource".asInstanceOf[typingsSlinky.firebasePerformance.firebasePerformanceStrings.resource]
  }
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var PerformanceObserver: TypeofPerformanceObserver = js.native
      
      var perfMetrics: js.UndefOr[OnFirstInputDelay] = js.native
    }
    object Window {
      
      @scala.inline
      def apply(PerformanceObserver: TypeofPerformanceObserver): Window = {
        val __obj = js.Dynamic.literal(PerformanceObserver = PerformanceObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPerfMetrics(value: OnFirstInputDelay): Self = StObject.set(x, "perfMetrics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPerfMetricsUndefined: Self = StObject.set(x, "perfMetrics", js.undefined)
        
        @scala.inline
        def setPerformanceObserver(value: TypeofPerformanceObserver): Self = StObject.set(x, "PerformanceObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
