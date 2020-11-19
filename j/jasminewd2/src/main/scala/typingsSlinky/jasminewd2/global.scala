package typingsSlinky.jasminewd2

import typingsSlinky.jasmine.DoneFn
import typingsSlinky.jasminewd2.jasmine.AsyncCustomMatcherFactories
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def afterAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  def afterAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  def afterEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  def afterEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  def beforeAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  def beforeAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  def beforeEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  def beforeEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  def fit(expectation: String): Unit = js.native
  def fit(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  def it(expectation: String): Unit = js.native
  def it(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  def xit(expectation: String): Unit = js.native
  def xit(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  @js.native
  object jasmine extends js.Object {
    
    def addMatchers(matchers: AsyncCustomMatcherFactories): Unit = js.native
  }
}
