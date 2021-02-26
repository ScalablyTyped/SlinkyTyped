package typingsSlinky.newrelic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CollectPendingData extends StObject {
    
    var collectPendingData: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var waitForIdle: js.UndefOr[Boolean] = js.native
  }
  object CollectPendingData {
    
    @scala.inline
    def apply(): CollectPendingData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectPendingData]
    }
    
    @scala.inline
    implicit class CollectPendingDataMutableBuilder[Self <: CollectPendingData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollectPendingData(value: Boolean): Self = StObject.set(x, "collectPendingData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectPendingDataUndefined: Self = StObject.set(x, "collectPendingData", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWaitForIdle(value: Boolean): Self = StObject.set(x, "waitForIdle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForIdleUndefined: Self = StObject.set(x, "waitForIdle", js.undefined)
    }
  }
  
  @js.native
  trait ModuleName extends StObject {
    
    var moduleName: String = js.native
    
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
    
    def onRequire(): Unit = js.native
  }
  object ModuleName {
    
    @scala.inline
    def apply(moduleName: String, onRequire: () => Unit): ModuleName = {
      val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], onRequire = js.Any.fromFunction0(onRequire))
      __obj.asInstanceOf[ModuleName]
    }
    
    @scala.inline
    implicit class ModuleNameMutableBuilder[Self <: ModuleName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnRequire(value: () => Unit): Self = StObject.set(x, "onRequire", js.Any.fromFunction0(value))
    }
  }
}
