package typingsSlinky.jestWatcher

import typingsSlinky.jestWatcher.anon.ReadonlyJestHookEmitter
import typingsSlinky.jestWatcher.anon.ReadonlyJestHookSubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestHooksMod {
  
  @JSImport("jest-watcher/build/JestHooks", JSImport.Default)
  @js.native
  class default () extends JestHooks
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jestWatcher.jestWatcherStrings.onFileChange
    - typingsSlinky.jestWatcher.jestWatcherStrings.onTestRunComplete
    - typingsSlinky.jestWatcher.jestWatcherStrings.shouldRunTestSuite
  */
  trait AvailableHooks extends StObject
  object AvailableHooks {
    
    @scala.inline
    def onFileChange: typingsSlinky.jestWatcher.jestWatcherStrings.onFileChange = "onFileChange".asInstanceOf[typingsSlinky.jestWatcher.jestWatcherStrings.onFileChange]
    
    @scala.inline
    def onTestRunComplete: typingsSlinky.jestWatcher.jestWatcherStrings.onTestRunComplete = "onTestRunComplete".asInstanceOf[typingsSlinky.jestWatcher.jestWatcherStrings.onTestRunComplete]
    
    @scala.inline
    def shouldRunTestSuite: typingsSlinky.jestWatcher.jestWatcherStrings.shouldRunTestSuite = "shouldRunTestSuite".asInstanceOf[typingsSlinky.jestWatcher.jestWatcherStrings.shouldRunTestSuite]
  }
  
  @js.native
  trait JestHooks extends StObject {
    
    var _emitter: js.Any = js.native
    
    var _listeners: js.Any = js.native
    
    var _subscriber: js.Any = js.native
    
    def getEmitter(): ReadonlyJestHookEmitter = js.native
    
    def getSubscriber(): ReadonlyJestHookSubscribe = js.native
    
    def isUsed(hook: AvailableHooks): Boolean = js.native
  }
  object JestHooks {
    
    @scala.inline
    def apply(
      _emitter: js.Any,
      _listeners: js.Any,
      _subscriber: js.Any,
      getEmitter: () => ReadonlyJestHookEmitter,
      getSubscriber: () => ReadonlyJestHookSubscribe,
      isUsed: AvailableHooks => Boolean
    ): JestHooks = {
      val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], _listeners = _listeners.asInstanceOf[js.Any], _subscriber = _subscriber.asInstanceOf[js.Any], getEmitter = js.Any.fromFunction0(getEmitter), getSubscriber = js.Any.fromFunction0(getSubscriber), isUsed = js.Any.fromFunction1(isUsed))
      __obj.asInstanceOf[JestHooks]
    }
    
    @scala.inline
    implicit class JestHooksMutableBuilder[Self <: JestHooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetEmitter(value: () => ReadonlyJestHookEmitter): Self = StObject.set(x, "getEmitter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSubscriber(value: () => ReadonlyJestHookSubscribe): Self = StObject.set(x, "getSubscriber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsUsed(value: AvailableHooks => Boolean): Self = StObject.set(x, "isUsed", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_emitter(value: js.Any): Self = StObject.set(x, "_emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_listeners(value: js.Any): Self = StObject.set(x, "_listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_subscriber(value: js.Any): Self = StObject.set(x, "_subscriber", value.asInstanceOf[js.Any])
    }
  }
}
