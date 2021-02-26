package typingsSlinky.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchTestHooks
  extends NightwatchGlobals
     with NightwatchTests {
  
  var after: js.UndefOr[GlobalNightwatchTestHook] = js.native
  
  var afterEach: js.UndefOr[GlobalNightwatchTestHookEach] = js.native
  
  var before: js.UndefOr[GlobalNightwatchTestHook] = js.native
  
  var beforeEach: js.UndefOr[GlobalNightwatchTestHookEach] = js.native
}
object NightwatchTestHooks {
  
  @scala.inline
  def apply(): NightwatchTestHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestHooks]
  }
  
  @scala.inline
  implicit class NightwatchTestHooksMutableBuilder[Self <: NightwatchTestHooks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterEach(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = StObject.set(x, "afterEach", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setBefore(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeEach(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = StObject.set(x, "beforeEach", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
