package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addons {
  
  @JSImport("react-native", "addons.TestModule")
  @js.native
  val TestModule: TestModuleStatic = js.native
  type TestModule = TestModuleStatic
  
  @js.native
  trait TestModuleStatic extends StObject {
    
    def markTestCompleted(): Unit = js.native
    
    def markTestPassed(indicator: js.Any): Unit = js.native
    
    def verifySnapshot(done: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  object TestModuleStatic {
    
    @scala.inline
    def apply(
      markTestCompleted: () => Unit,
      markTestPassed: js.Any => Unit,
      verifySnapshot: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit] => Unit
    ): TestModuleStatic = {
      val __obj = js.Dynamic.literal(markTestCompleted = js.Any.fromFunction0(markTestCompleted), markTestPassed = js.Any.fromFunction1(markTestPassed), verifySnapshot = js.Any.fromFunction1(verifySnapshot))
      __obj.asInstanceOf[TestModuleStatic]
    }
    
    @scala.inline
    implicit class TestModuleStaticMutableBuilder[Self <: TestModuleStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarkTestCompleted(value: () => Unit): Self = StObject.set(x, "markTestCompleted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMarkTestPassed(value: js.Any => Unit): Self = StObject.set(x, "markTestPassed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerifySnapshot(value: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit] => Unit): Self = StObject.set(x, "verifySnapshot", js.Any.fromFunction1(value))
    }
  }
}
