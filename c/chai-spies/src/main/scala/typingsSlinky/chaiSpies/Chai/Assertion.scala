package typingsSlinky.chaiSpies.Chai

import typingsSlinky.chaiSpies.ChaiSpies.Been
import typingsSlinky.chaiSpies.ChaiSpies.Called
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assertion extends js.Object {
  
  /**
    *  * ####.been
    * * Assert that something has been spied on. Negation passes through.
    * * ```ts
    * * expect(spy).to.have.been.called();
    * * spy.should.have.been.called();
    * ```
    * Note that ```been``` can be used as a chainable method.
    */
  def been(): Assertion = js.native
  /**
    *  * ####.been
    * * Assert that something has been spied on. Negation passes through.
    * * ```ts
    * * expect(spy).to.have.been.called();
    * * spy.should.have.been.called();
    * ```
    * Note that ```been``` can be used as a chainable method.
    */
  @JSName("been")
  var been_Original: Been = js.native
  
  /**
    * ####.called
    * Assert that a spy has been called. Negation passes through.
    * ```ts
    * expect(spy).to.have.been.called();
    * spy.should.have.been.called();
    * ```
    * Note that ```called``` can be used as a chainable method.
    */
  def called(): Assertion = js.native
  /**
    * ####.called
    * Assert that a spy has been called. Negation passes through.
    * ```ts
    * expect(spy).to.have.been.called();
    * spy.should.have.been.called();
    * ```
    * Note that ```called``` can be used as a chainable method.
    */
  @JSName("called")
  var called_Original: Called = js.native
  
  /**
    *  * ####.nth (function)
    * * Assert that something has been spied on on a certain index. Negation passes through.
    * * ```ts
    * * expect(spy).on.nth(5).be.called.with('foobar');
    * * spy.should.on.nth(5).be.called.with('foobar');
    * ```
    * Note that ```nth``` can be used as a chainable method.
    */
  def nth(index: Double): Assertion = js.native
  
  /**
    * ####.spy
    * Asserts that object is a spy.
    * ```ts
    * expect(spy).to.be.spy;
    * spy.should.be.spy;
    * ```
    */
  var spy: Assertion = js.native
}
