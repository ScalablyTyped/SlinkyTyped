package typingsSlinky.cypress.Cypress

import typingsSlinky.cypress.cypressStrings.`match`
import typingsSlinky.cypress.cypressStrings.`throw`
import typingsSlinky.cypress.cypressStrings.alwaysDOTreturned
import typingsSlinky.cypress.cypressStrings.beDOTa
import typingsSlinky.cypress.cypressStrings.beDOTabove
import typingsSlinky.cypress.cypressStrings.beDOTalwaysDOTcalledWithMatch
import typingsSlinky.cypress.cypressStrings.beDOTalwaysDOTcalledWithNew
import typingsSlinky.cypress.cypressStrings.beDOTan
import typingsSlinky.cypress.cypressStrings.beDOTapproximately
import typingsSlinky.cypress.cypressStrings.beDOTarguments
import typingsSlinky.cypress.cypressStrings.beDOTatDOTleast
import typingsSlinky.cypress.cypressStrings.beDOTbelow
import typingsSlinky.cypress.cypressStrings.beDOTcalled
import typingsSlinky.cypress.cypressStrings.beDOTcalledAfter
import typingsSlinky.cypress.cypressStrings.beDOTcalledBefore
import typingsSlinky.cypress.cypressStrings.beDOTcalledOn
import typingsSlinky.cypress.cypressStrings.beDOTcalledOnce
import typingsSlinky.cypress.cypressStrings.beDOTcalledThrice
import typingsSlinky.cypress.cypressStrings.beDOTcalledTwice
import typingsSlinky.cypress.cypressStrings.beDOTcalledWithExactly
import typingsSlinky.cypress.cypressStrings.beDOTcalledWithMatch
import typingsSlinky.cypress.cypressStrings.beDOTcalledWithNew
import typingsSlinky.cypress.cypressStrings.beDOTchecked
import typingsSlinky.cypress.cypressStrings.beDOTcloseTo
import typingsSlinky.cypress.cypressStrings.beDOTdisabled
import typingsSlinky.cypress.cypressStrings.beDOTempty
import typingsSlinky.cypress.cypressStrings.beDOTenabled
import typingsSlinky.cypress.cypressStrings.beDOTfalse
import typingsSlinky.cypress.cypressStrings.beDOTfocused
import typingsSlinky.cypress.cypressStrings.beDOTgreaterThan
import typingsSlinky.cypress.cypressStrings.beDOTgt
import typingsSlinky.cypress.cypressStrings.beDOTgte
import typingsSlinky.cypress.cypressStrings.beDOThidden
import typingsSlinky.cypress.cypressStrings.beDOTinstanceOf
import typingsSlinky.cypress.cypressStrings.beDOTlessThan
import typingsSlinky.cypress.cypressStrings.beDOTlt
import typingsSlinky.cypress.cypressStrings.beDOTlte
import typingsSlinky.cypress.cypressStrings.beDOTok
import typingsSlinky.cypress.cypressStrings.beDOTselected
import typingsSlinky.cypress.cypressStrings.beDOTtrue
import typingsSlinky.cypress.cypressStrings.beDOTundefined
import typingsSlinky.cypress.cypressStrings.beDOTvisible
import typingsSlinky.cypress.cypressStrings.beDOTwithin
import typingsSlinky.cypress.cypressStrings.change
import typingsSlinky.cypress.cypressStrings.contain
import typingsSlinky.cypress.cypressStrings.containDOThtml
import typingsSlinky.cypress.cypressStrings.containDOTtext
import typingsSlinky.cypress.cypressStrings.containDOTvalue
import typingsSlinky.cypress.cypressStrings.decrease
import typingsSlinky.cypress.cypressStrings.deepDOTequal
import typingsSlinky.cypress.cypressStrings.eq
import typingsSlinky.cypress.cypressStrings.eql
import typingsSlinky.cypress.cypressStrings.equal
import typingsSlinky.cypress.cypressStrings.exist
import typingsSlinky.cypress.cypressStrings.haveDOTallDOTkeys
import typingsSlinky.cypress.cypressStrings.haveDOTalwaysDOTthrown
import typingsSlinky.cypress.cypressStrings.haveDOTanyDOTkeys
import typingsSlinky.cypress.cypressStrings.haveDOTattr
import typingsSlinky.cypress.cypressStrings.haveDOTcallCount
import typingsSlinky.cypress.cypressStrings.haveDOTclass
import typingsSlinky.cypress.cypressStrings.haveDOTcss
import typingsSlinky.cypress.cypressStrings.haveDOTdata
import typingsSlinky.cypress.cypressStrings.haveDOTdeepDOTproperty
import typingsSlinky.cypress.cypressStrings.haveDOTdescendants
import typingsSlinky.cypress.cypressStrings.haveDOTfocus
import typingsSlinky.cypress.cypressStrings.haveDOThtml
import typingsSlinky.cypress.cypressStrings.haveDOTid
import typingsSlinky.cypress.cypressStrings.haveDOTlength
import typingsSlinky.cypress.cypressStrings.haveDOTlengthDOTgreaterThan
import typingsSlinky.cypress.cypressStrings.haveDOTlengthDOTgt
import typingsSlinky.cypress.cypressStrings.haveDOTlengthDOTgte
import typingsSlinky.cypress.cypressStrings.haveDOTlengthDOTlessThan
import typingsSlinky.cypress.cypressStrings.haveDOTlengthDOTlt
import typingsSlinky.cypress.cypressStrings.haveDOTlengthDOTlte
import typingsSlinky.cypress.cypressStrings.haveDOTmembers
import typingsSlinky.cypress.cypressStrings.haveDOTorderedDOTmembers
import typingsSlinky.cypress.cypressStrings.haveDOTownProperty
import typingsSlinky.cypress.cypressStrings.haveDOTprop
import typingsSlinky.cypress.cypressStrings.haveDOTproperty
import typingsSlinky.cypress.cypressStrings.haveDOTstring
import typingsSlinky.cypress.cypressStrings.haveDOTtext
import typingsSlinky.cypress.cypressStrings.haveDOTthrown
import typingsSlinky.cypress.cypressStrings.haveDOTvalue
import typingsSlinky.cypress.cypressStrings.include
import typingsSlinky.cypress.cypressStrings.includeDOThtml
import typingsSlinky.cypress.cypressStrings.includeDOTmembers
import typingsSlinky.cypress.cypressStrings.includeDOTtext
import typingsSlinky.cypress.cypressStrings.includeDOTvalue
import typingsSlinky.cypress.cypressStrings.increase
import typingsSlinky.cypress.cypressStrings.notDOTalwaysDOTreturned
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTa
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTabove
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTalwaysDOTcalledWithMatch
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTalwaysDOTcalledWithNew
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTan
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTapproximately
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTarguments
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTatDOTleast
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTbelow
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTcalled
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTcalledAfter
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTcalledBefore
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTcalledOn
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTcalledOnce
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTcalledThrice
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTcalledTwice
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTcalledWithExactly
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTcalledWithMatch
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTcalledWithNew
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTchecked
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTcloseTo
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTdisabled
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTempty
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTenabled
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTfalse
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTfocused
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTgreaterThan
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTgt
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTgte
import typingsSlinky.cypress.cypressStrings.notDOTbeDOThidden
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTinstanceOf
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTlessThan
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTlt
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTlte
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTok
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTselected
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTtrue
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTundefined
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTvisible
import typingsSlinky.cypress.cypressStrings.notDOTbeDOTwithin
import typingsSlinky.cypress.cypressStrings.notDOTchange
import typingsSlinky.cypress.cypressStrings.notDOTcontain
import typingsSlinky.cypress.cypressStrings.notDOTcontainDOThtml
import typingsSlinky.cypress.cypressStrings.notDOTcontainDOTtext
import typingsSlinky.cypress.cypressStrings.notDOTcontainDOTvalue
import typingsSlinky.cypress.cypressStrings.notDOTdecrease
import typingsSlinky.cypress.cypressStrings.notDOTdeepDOTequal
import typingsSlinky.cypress.cypressStrings.notDOTeq
import typingsSlinky.cypress.cypressStrings.notDOTeql
import typingsSlinky.cypress.cypressStrings.notDOTequal
import typingsSlinky.cypress.cypressStrings.notDOTexist
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTallDOTkeys
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTalwaysDOTthrown
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTanyDOTkeys
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTattr
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTcallCount
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTclass
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTcss
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTdata
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTdeepDOTproperty
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTdescendants
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTfocus
import typingsSlinky.cypress.cypressStrings.notDOThaveDOThtml
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTid
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTlength
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTlengthDOTgreaterThan
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTlengthDOTgt
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTlengthDOTlessThan
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTlengthDOTlt
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTlengthDOTlte
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTmembers
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTorderedDOTmembers
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTownProperty
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTprop
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTproperty
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTstring
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTtext
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTthrown
import typingsSlinky.cypress.cypressStrings.notDOThaveDOTvalue
import typingsSlinky.cypress.cypressStrings.notDOTinclude
import typingsSlinky.cypress.cypressStrings.notDOTincludeDOThtml
import typingsSlinky.cypress.cypressStrings.notDOTincludeDOTmembers
import typingsSlinky.cypress.cypressStrings.notDOTincludeDOTtext
import typingsSlinky.cypress.cypressStrings.notDOTincludeDOTvalue
import typingsSlinky.cypress.cypressStrings.notDOTincrease
import typingsSlinky.cypress.cypressStrings.notDOTmatch
import typingsSlinky.cypress.cypressStrings.notDOTrespondTo
import typingsSlinky.cypress.cypressStrings.notDOTreturned
import typingsSlinky.cypress.cypressStrings.notDOTsatisfy
import typingsSlinky.cypress.cypressStrings.respondTo
import typingsSlinky.cypress.cypressStrings.returned
import typingsSlinky.cypress.cypressStrings.satisfy
import typingsSlinky.cypress.typesSinonMod.SinonSpy
import typingsSlinky.std.Date
import typingsSlinky.std.Error
import typingsSlinky.std.ErrorConstructor
import typingsSlinky.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Kind of onerous, but has a nice auto-complete. Also fallbacks at the end for custom stuff
/**
  * @see https://on.cypress.io/should
  *
  * @interface Chainer
  * @template Subject
  */
@js.native
trait Chainer[Subject] extends js.Object {
  // fallback
  /**
    * Create an assertion. Assertions are automatically retried until they pass or time out.
    * Ctrl+Space will invoke auto-complete in most editors.
    * @see https://on.cypress.io/should
    */
  def apply(chainers: String): Chainable[Subject] = js.native
  def apply(chainers: String, value: js.Any): Chainable[Subject] = js.native
  def apply(chainers: String, value: js.Any, `match`: js.Any): Chainable[Subject] = js.native
  /**
    * Assert that the selection matches a given selector, using `.is()`. Note that this overrides the built-in chai assertion. If the object asserted against is not a jQuery object, the original implementation will be called.
    * @example
    *    cy.get('#result').should('match', ':empty')
    * @see http://chaijs.com/plugins/chai-jquery/#matchselector
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: `match`, value: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target matches the given regular expression `re`.
    * @example
    *    cy.wrap('foobar').should('match', /^foo/)
    * @see http://chaijs.com/api/bdd/#method_match
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: `match`, value: RegExp): Chainable[Subject] = js.native
  /**
    * When no arguments are provided, `.throw` invokes the target function and asserts that an error is thrown.
    * When one argument is provided, and it’s a string, `.throw` invokes the target function and asserts that an error is thrown with a message that contains that string.
    * @example
    *    function badFn() { throw new TypeError('Illegal salmon!') }
    *    cy.wrap(badFn).should('throw')
    *    cy.wrap(badFn).should('throw', 'salmon')
    *    cy.wrap(badFn).should('throw', /salmon/)
    * @see http://chaijs.com/api/bdd/#method_throw
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: `throw`): Chainable[Subject] = js.native
  def apply(chainer: `throw`, error: js.Function): Chainable[Subject] = js.native
  def apply(chainer: `throw`, error: js.Function, expected: String): Chainable[Subject] = js.native
  def apply(chainer: `throw`, error: js.Function, expected: RegExp): Chainable[Subject] = js.native
  /**
    * When no arguments are provided, `.throw` invokes the target function and asserts that an error is thrown.
    * When one argument is provided, and it’s a string, `.throw` invokes the target function and asserts that an error is thrown with a message that contains that string.
    * @example
    *    function badFn() { throw new TypeError('Illegal salmon!') }
    *    cy.wrap(badFn).should('throw')
    *    cy.wrap(badFn).should('throw', 'salmon')
    *    cy.wrap(badFn).should('throw', /salmon/)
    * @see http://chaijs.com/api/bdd/#method_throw
    * @see https://on.cypress.io/assertions
    */
  // tslint:disable-next-line ban-types
  def apply(chainer: `throw`, error: Error): Chainable[Subject] = js.native
  def apply(chainer: `throw`, error: Error, expected: String): Chainable[Subject] = js.native
  def apply(chainer: `throw`, error: Error, expected: RegExp): Chainable[Subject] = js.native
  def apply(chainer: `throw`, value: String): Chainable[Subject] = js.native
  def apply(chainer: `throw`, value: RegExp): Chainable[Subject] = js.native
  /**
    * Assert spy always returned the provided value.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwaysreturnedobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: alwaysDOTreturned, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.above', 5)
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTabove, value: Double): Chainable[Subject] = js.native
  def apply(chainer: beDOTabove, value: Date): Chainable[Subject] = js.native
  /**
    * Assert if spy was always called with matching arguments (and possibly others).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwayscalledwithmatcharg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTalwaysDOTcalledWithMatch, args: js.Any*): Chainable[Subject] = js.native
  // sinon-chai
  /**
    * Assert spy/stub was called the `new` operator.
    * Beware that this is inferred based on the value of the this object and the spy function’s prototype, so it may give false positives if you actively return the right kind of object.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithnew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTalwaysDOTcalledWithNew): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `type` is equal to the given string type.
    * Types are case insensitive. See the `type-detect` project page for info on the type detection algorithm:
    * https://github.com/chaijs/type-detect.
    * @example
    *    cy.wrap({ foo: 'bar' }).should('be.an', 'object')
    * @alias a
    * @see http://chaijs.com/api/bdd/#method_a
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTan, value: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number that’s within a given +/- `delta` range of the given number `expected`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(5.1).should('be.approximately', 5, 0.5)
    * @alias closeTo
    * @see http://chaijs.com/api/bdd/#method_closeto
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTapproximately, value: Double, delta: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is an `arguments` object.
    * @example
    *    cy.wrap(arguments).should('be.arguments')
    * @see http://chaijs.com/api/bdd/#method_arguments
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTarguments): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a `n` date greater than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.at.least', 5)
    * @see http://chaijs.com/api/bdd/#method_least
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTatDOTleast, value: Double): Chainable[Subject] = js.native
  def apply(chainer: beDOTatDOTleast, value: Date): Chainable[Subject] = js.native
  // chai
  /**
    * Asserts that the target’s `type` is equal to the given string type.
    * Types are case insensitive. See the `type-detect` project page for info on the type detection algorithm:
    * https://github.com/chaijs/type-detect.
    * @example
    *    cy.wrap('foo').should('be.a', 'string')
    * @see http://chaijs.com/api/bdd/#method_a
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTa, `type`: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('be.below', 5)
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTbelow, value: Double): Chainable[Subject] = js.native
  /**
    * `true` if the spy was called at least once
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTcalled): Chainable[Subject] = js.native
  /**
    * Assert spy was called after `anotherSpy`
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledafteranotherspy
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTcalledAfter, spy: SinonSpy): Chainable[Subject] = js.native
  /**
    * Assert spy was called before `anotherSpy`
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledbeforeanotherspy
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTcalledBefore, spy: SinonSpy): Chainable[Subject] = js.native
  /**
    * Assert spy was called exactly once
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledonce
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTcalledOnce): Chainable[Subject] = js.native
  /**
    * Assert spy was called at least once with `obj` as `this`. `calledOn` also accepts a matcher (see [matchers](http://sinonjs.org/releases/v4.1.3/spies/#matchers)).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledonobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTcalledOn, context: js.Any): Chainable[Subject] = js.native
  /**
    * Assert spy was called exactly three times
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledthrice
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTcalledThrice): Chainable[Subject] = js.native
  /**
    * Assert spy was called exactly twice
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledtwice
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTcalledTwice): Chainable[Subject] = js.native
  /**
    * Assert spy was called at least once with the provided arguments and no others.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithexactlyarg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTcalledWithExactly, args: js.Any*): Chainable[Subject] = js.native
  /**
    * Assert spy was called with matching arguments (and possibly others).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithmatcharg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTcalledWithMatch, args: js.Any*): Chainable[Subject] = js.native
  /**
    * Assert spy/stub was called the `new` operator.
    * Beware that this is inferred based on the value of the this object and the spy function’s prototype, so it may give false positives if you actively return the right kind of object.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithnew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTcalledWithNew): Chainable[Subject] = js.native
  // jquery-chai
  /**
    * Assert that at least one element of the selection is checked, using `.is(':checked')`.
    * @example
    *    cy.get('#result').should('be.checked')
    * @see http://chaijs.com/plugins/chai-jquery/#checked
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTchecked): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number that’s within a given +/- `delta` range of the given number `expected`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(5.1).should('be.closeTo', 5, 0.5)
    * @see http://chaijs.com/api/bdd/#method_closeto
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTcloseTo, value: Double, delta: Double): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is disabled, using `.is(':disabled')`.
    * @example
    *    cy.get('#result').should('be.disabled')
    * @see http://chaijs.com/plugins/chai-jquery/#disabled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTdisabled): Chainable[Subject] = js.native
  /**
    * When the target is a string or array, .empty asserts that the target’s length property is strictly (===) equal to 0
    * @example
    *    cy.wrap([]).should('be.empty')
    *    cy.wrap('').should('be.empty')
    * @see http://chaijs.com/api/bdd/#method_empty
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTempty): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is enabled, using `.is(':enabled')`.
    * @example
    *    cy.get('#result').should('be.enabled')
    * @see http://chaijs.com/plugins/chai-jquery/#enabled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTenabled): Chainable[Subject] = js.native
  /**
    * Asserts that the target is strictly (`===`) equal to `false`.
    * @example
    *    cy.wrap(false).should('be.false')
    * @see http://chaijs.com/api/bdd/#method_false
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTfalse): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is focused.
    * @example
    *    cy.get('#result').should('be.focused')
    *    cy.get('#result').should('have.focus')
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTfocused): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.greaterThan', 5)
    * @alias above
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTgreaterThan, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a `n` date greater than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.gte', 5)
    * @alias least
    * @see http://chaijs.com/api/bdd/#method_least
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTgte, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.gt', 5)
    * @alias above
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTgt, value: Double): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is hidden, using `.is(':hidden')`.
    * @example
    *    cy.get('#result').should('be.hidden')
    * @see http://chaijs.com/plugins/chai-jquery/#hidden
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOThidden): Chainable[Subject] = js.native
  /**
    * Asserts that the target is an instance of the given `constructor`.
    * @example
    *    cy.wrap([1, 2]).should('be.instanceOf', Array)
    * @see http://chaijs.com/api/bdd/#method_instanceof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTinstanceOf, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('be.lessThan', 5)
    * @alias below
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTlessThan, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('be.lte', 5)
    * @alias most
    * @see http://chaijs.com/api/bdd/#method_most
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTlte, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('be.lt', 5)
    * @alias below
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTlt, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is loosely (`==`) equal to `true`. However, it’s often best to assert that the target is strictly (`===`) or deeply equal to its expected value.
    * @example
    *    cy.wrap(1).should('be.ok')
    * @see http://chaijs.com/api/bdd/#method_ok
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTok): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is selected, using `.is(':selected')`.
    * @example
    *    cy.get('#result').should('be.selected')
    * @see http://chaijs.com/plugins/chai-jquery/#selected
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTselected): Chainable[Subject] = js.native
  /**
    * Asserts that the target is strictly (`===`) equal to true.
    * @example
    *    cy.wrap(true).should('be.true')
    * @see http://chaijs.com/api/bdd/#method_true
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTtrue): Chainable[Subject] = js.native
  /**
    * Asserts that the target is strictly (`===`) equal to undefined.
    * @example
    *    cy.wrap(undefined).should('be.undefined')
    * @see http://chaijs.com/api/bdd/#method_undefined
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTundefined): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is visible, using `.is(':visible')`.
    * @example
    *    cy.get('#result').should('be.visible')
    * @see http://chaijs.com/plugins/chai-jquery/#visible
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTvisible): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a number or a date greater than or equal to the given number or date `start`, and less than or equal to the given number or date `finish` respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.within', 5, 10)
    * @see http://chaijs.com/api/bdd/#method_within
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: beDOTwithin, start: Double, end: Double): Chainable[Subject] = js.native
  def apply(chainer: beDOTwithin, start: Date, end: Date): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.change` asserts that the given function `subject` returns a different value when it’s invoked before the target function compared to when it’s invoked afterward.
    * However, it’s often best to assert that `subject` is equal to its expected value.
    * @example
    *    let dots = ''
    *    function addDot() { dots += '.' }
    *    function getDots() { return dots }
    *    cy.wrap(addDot).should('change', getDots)
    * @see http://chaijs.com/api/bdd/#method_change
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: change, fn: js.Function1[/* repeated */ js.Any, _]): Chainable[Subject] = js.native
  /**
    * When two arguments are provided, `.change` asserts that the value of the given object `subject`'s `prop` property is different before invoking the target function compared to afterward.
    * @example
    *    const myObj = { dots: '' }
    *    function addDot() { myObj.dots += '.' }
    *    cy.wrap(addDot).should('change', myObj, 'dots')
    * @see http://chaijs.com/api/bdd/#method_change
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: change, obj: js.Object, prop: String): Chainable[Subject] = js.native
  /**
    * Assert that the html of the first element of the selection partially contains the given html, using `.html()`.
    * @example
    *    cy.get('#result').should('contain.html', '<em>John Doe</em>')
    * @see http://chaijs.com/plugins/chai-jquery/#htmlhtml
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: containDOThtml, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the text of the first element of the selection partially contains the given text, using `.text()`.
    * @example
    *    cy.get('#result').should('contain.text', 'John Doe')
    * @see http://chaijs.com/plugins/chai-jquery/#texttext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: containDOTtext, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection partially contains the given value, using `.val()`.
    * @example
    *    cy.get('textarea').should('contain.value', 'foo bar baz')
    * @see http://chaijs.com/plugins/chai-jquery/#valuevalue
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: containDOTvalue, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the selection contains the given text, using `:contains()`. If the object asserted against is not a jQuery object, or if `contain` is not called as a function, the original implementation will be called.
    * @example
    *    cy.get('#result').should('contain', 'text')
    * @see http://chaijs.com/plugins/chai-jquery/#containtext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: contain, value: String): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string val is a substring of the target.
    * @example
    *    cy.wrap('tester').should('contain', 'test')
    * @alias include
    * @see http://chaijs.com/api/bdd/#method_include
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: contain, value: js.Any): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.decrease` asserts that the given function `subject` returns a lesser number when it’s invoked after invoking the target function compared to when it’s invoked beforehand.
    * `.decrease` also causes all `.by` assertions that follow in the chain to assert how much lesser of a number is returned. It’s often best to assert that the return value decreased by the expected amount, rather than asserting it decreased by any amount.
    * @example
    *    let val = 1
    *    function subtractTwo() { val -= 2 }
    *    function getVal() { return val }
    *    cy.wrap(subtractTwo).should('decrease', getVal)
    * @see http://chaijs.com/api/bdd/#method_decrease
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: decrease, fn: js.Function1[/* repeated */ js.Any, _]): Chainable[Subject] = js.native
  /**
    * When two arguments are provided, `.decrease` asserts that the value of the given object `subject`'s `prop` property is lesser after invoking the target function compared to beforehand.
    * @example
    *    let val = 1
    *    function subtractTwo() { val -= 2 }
    *    function getVal() { return val }
    *    cy.wrap(subtractTwo).should('decrease', getVal)
    * @see http://chaijs.com/api/bdd/#method_decrease
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: decrease, obj: js.Object, prop: String): Chainable[Subject] = js.native
  /**
    * Causes all `.equal`, `.include`, `.members`, `.keys`, and `.property` assertions that follow in the chain to use deep equality instead of strict (`===`) equality. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({ a: 1 }).should('deep.equal', { a: 1 })
    * @see http://chaijs.com/api/bdd/#method_deep
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: deepDOTequal, value: Subject): Chainable[Subject] = js.native
  /**
    * Asserts that the target is deeply equal to the given `obj`. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({a: 1}).should('eql', {a: 1}).and('not.equal', {a: 1})
    * @see http://chaijs.com/api/bdd/#method_eql
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: eql, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is strictly (`===`) equal to the given `val`.
    * @example
    *    cy.wrap(1).should('equal', 1)
    * @see http://chaijs.com/api/bdd/#method_equal
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: equal, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is strictly (`===`) equal to the given `val`.
    * @example
    *    cy.wrap(1).should('eq', 1)
    * @alias equal
    * @see http://chaijs.com/api/bdd/#method_equal
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: eq, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to either `null` or `undefined`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(1).should('exist')
    * @see http://chaijs.com/api/bdd/#method_exist
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: exist): Chainable[Subject] = js.native
  /**
    * Causes all `.keys` assertions that follow in the chain to require that the target have all of the given keys. This is the opposite of `.any`, which only requires that the target have at least one of the given keys.
    * @example
    *    cy.wrap({ a: 1, b: 2 }).should('have.all.keys', 'a', 'b')
    * @see http://chaijs.com/api/bdd/#method_all
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTallDOTkeys, value: String*): Chainable[Subject] = js.native
  /**
    * Assert spy always threw an exception.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwaysthrew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTalwaysDOTthrown): Chainable[Subject] = js.native
  def apply(chainer: haveDOTalwaysDOTthrown, value: String): Chainable[Subject] = js.native
  def apply(chainer: haveDOTalwaysDOTthrown, value: Error): Chainable[Subject] = js.native
  def apply(chainer: haveDOTalwaysDOTthrown, value: ErrorConstructor): Chainable[Subject] = js.native
  /**
    * Causes all `.keys` assertions that follow in the chain to only require that the target have at least one of the given keys. This is the opposite of `.all`, which requires that the target have all of the given keys.
    * @example
    *    cy.wrap({ a: 1, b: 2 }).should('have.any.keys', 'a')
    * @see http://chaijs.com/api/bdd/#method_any
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTanyDOTkeys, value: String*): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given attribute, using `.attr()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('have.attr', 'role')
    *    cy.get('#result').should('have.attr', 'role', 'menu')
    * @see http://chaijs.com/plugins/chai-jquery/#attrname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTattr, value: String): Chainable[Subject] = js.native
  def apply(chainer: haveDOTattr, value: String, `match`: String): Chainable[Subject] = js.native
  /**
    * Assert the number of calls.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycallcount
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTcallCount, value: Double): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given attribute, using `.attr()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('have.class', 'success')
    * @see http://chaijs.com/plugins/chai-jquery/#classclassname
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTclass, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given CSS property, using `.css()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('have.css', 'display', 'none')
    * @see http://chaijs.com/plugins/chai-jquery/#cssname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTcss, value: String): Chainable[Subject] = js.native
  def apply(chainer: haveDOTcss, value: String, `match`: String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given data value, using `.data()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('have.data', 'foo', 'bar')
    * @see http://chaijs.com/plugins/chai-jquery/#dataname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTdata, value: String): Chainable[Subject] = js.native
  def apply(chainer: haveDOTdata, value: String, `match`: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target has a property with the given key `name`. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({ x: {a: 1 }}).should('have.deep.property', 'x', { a: 1 })
    * @see http://chaijs.com/api/bdd/#method_property
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTdeepDOTproperty, value: String, obj: js.Object): Chainable[Subject] = js.native
  /**
    * Assert that the selection contains at least one element which has a descendant matching the given selector, using `.has()`.
    * @example
    *    cy.get('#result').should('have.descendants', 'h1')
    * @see http://chaijs.com/plugins/chai-jquery/#descendantsselector
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTdescendants, selector: String): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is focused.
    * @example
    *    cy.get('#result').should('have.focus')
    *    cy.get('#result').should('be.focused')
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTfocus): Chainable[Subject] = js.native
  /**
    * Assert that the html of the first element of the selection is equal to the given html, using `.html()`.
    * @example
    *    cy.get('#result').should('have.html', '<em>John Doe</em>')
    * @see http://chaijs.com/plugins/chai-jquery/#htmlhtml
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOThtml, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given id, using `.attr('id')`.
    * @example
    *    cy.get('#result').should('have.id', 'result')
    * @see http://chaijs.com/plugins/chai-jquery/#idid
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTid, value: String): Chainable[Subject] = js.native
  def apply(chainer: haveDOTid, value: String, `match`: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is greater than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.greaterThan', 2)
    *    cy.wrap('foo').should('have.length.greaterThan', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTlengthDOTgreaterThan, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is greater than or equal to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.gte', 2)
    *    cy.wrap('foo').should('have.length.gte', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTlengthDOTgte, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is greater than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.gt', 2)
    *    cy.wrap('foo').should('have.length.gt', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTlengthDOTgt, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is less than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.lessThan', 4)
    *    cy.wrap('foo').should('have.length.lessThan', 4)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTlengthDOTlessThan, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is less than or equal to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.lte', 4)
    *    cy.wrap('foo').should('have.length.lte', 4)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTlengthDOTlte, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is less than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.lt', 4)
    *    cy.wrap('foo').should('have.length.lt', 4)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTlengthDOTlt, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is equal to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length', 3)
    *    cy.wrap('foo').should('have.length', 3)
    * @alias lengthOf
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTlength, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target array has the same members as the given array `set`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.members', [2, 1, 3])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTmembers, values: js.Array[_]): Chainable[Subject] = js.native
  /**
    * Asserts that the target array has the same members as the given array where order matters.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.ordered.members', [1, 2, 3])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTorderedDOTmembers, values: js.Array[_]): Chainable[Subject] = js.native
  /**
    * Causes all `.property` and `.include` assertions that follow in the chain to ignore inherited properties.
    * @example
    *    Object.prototype.b = 2
    *    cy.wrap({ a: 1 }).should('have.property', 'a').and('not.have.ownProperty', 'b')
    * @see http://chaijs.com/api/bdd/#method_ownproperty
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTownProperty, property: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target has a property with the given key `name`.
    * @example
    *    cy.wrap({ a: 1 }).should('have.property', 'a')
    *    cy.wrap({ a: 1 }).should('have.property', 'a', 1)
    * @see http://chaijs.com/api/bdd/#method_property
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTproperty, property: String): Chainable[Subject] = js.native
  def apply(chainer: haveDOTproperty, property: String, value: js.Any): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given property, using `.prop()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('have.prop', 'disabled')
    *    cy.get('#result').should('have.prop', 'disabled', false)
    * @see http://chaijs.com/plugins/chai-jquery/#propname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTprop, value: String): Chainable[Subject] = js.native
  def apply(chainer: haveDOTprop, value: String, `match`: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target string contains the given substring `str`.
    * @example
    *    cy.wrap('foobar').should('have.string', 'bar')
    * @see http://chaijs.com/api/bdd/#method_string
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTstring, `match`: String): Chainable[Subject] = js.native
  def apply(chainer: haveDOTstring, `match`: RegExp): Chainable[Subject] = js.native
  /**
    * Assert that the text of the first element of the selection is equal to the given text, using `.text()`.
    * @example
    *    cy.get('#result').should('have.text', 'John Doe')
    * @see http://chaijs.com/plugins/chai-jquery/#texttext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTtext, value: String): Chainable[Subject] = js.native
  /**
    * Assert spy threw an exception at least once.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spythrew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTthrown): Chainable[Subject] = js.native
  def apply(chainer: haveDOTthrown, value: String): Chainable[Subject] = js.native
  def apply(chainer: haveDOTthrown, value: Error): Chainable[Subject] = js.native
  def apply(chainer: haveDOTthrown, value: ErrorConstructor): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection has the given value, using `.val()`.
    * @example
    *    cy.get('textarea').should('have.value', 'foo bar baz')
    * @see http://chaijs.com/plugins/chai-jquery/#valuevalue
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: haveDOTvalue, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the html of the first element of the selection partially contains the given html, using `.html()`.
    * @example
    *    cy.get('#result').should('include.html', '<em>John Doe</em>')
    * @see http://chaijs.com/plugins/chai-jquery/#htmlhtml
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: includeDOThtml, value: String): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string `val` is a substring of the target.
    * @example
    *    cy.wrap([1, 2, 3]).should('include.members', [1, 2])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: includeDOTmembers, value: js.Array[_]): Chainable[Subject] = js.native
  /**
    * Assert that the text of the first element of the selection partially contains the given text, using `.text()`.
    * @example
    *    cy.get('#result').should('include.text', 'John Doe')
    * @see http://chaijs.com/plugins/chai-jquery/#texttext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: includeDOTtext, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection partially contains the given value, using `.val()`.
    * @example
    *    cy.get('textarea').should('include.value', 'foo bar baz')
    * @see http://chaijs.com/plugins/chai-jquery/#valuevalue
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: includeDOTvalue, value: String): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string `val` is a substring of the target.
    * @example
    *    cy.wrap('foobar').should('include', 'foo')
    * @see http://chaijs.com/api/bdd/#method_include
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: include, value: js.Any): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.increase` asserts that the given function `subject` returns a greater number when it’s
    * invoked after invoking the target function compared to when it’s invoked beforehand.
    * `.increase` also causes all `.by` assertions that follow in the chain to assert how much greater of a number is returned.
    * It’s often best to assert that the return value increased by the expected amount, rather than asserting it increased by any amount.
    * @example
    *    let val = 1
    *    function addTwo() { val += 2 }
    *    function getVal() { return val }
    *    cy.wrap(addTwo).should('increase', getVal)
    * @see http://chaijs.com/api/bdd/#method_increase
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: increase, value: js.Object, property: String): Chainable[Subject] = js.native
  /**
    * Assert spy not always returned the provided value.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwaysreturnedobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTalwaysDOTreturned, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a not number or not a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('not.be.above', 10)
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTabove, value: Double): Chainable[Subject] = js.native
  def apply(chainer: notDOTbeDOTabove, value: Date): Chainable[Subject] = js.native
  /**
    * Assert if spy was not always called with matching arguments (and possibly others).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwayscalledwithmatcharg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTalwaysDOTcalledWithMatch, args: js.Any*): Chainable[Subject] = js.native
  // sinon-chai.not
  /**
    * Assert spy/stub was not called the `new` operator.
    * Beware that this is inferred based on the value of the this object and the spy function’s prototype, so it may give false positives if you actively return the right kind of object.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithnew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTalwaysDOTcalledWithNew): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `type` is not equal to the given string type.
    * Types are case insensitive. See the `type-detect` project page for info on the type detection algorithm:
    * https://github.com/chaijs/type-detect.
    * @example
    *    cy.wrap('foo').should('not.be.an', 'object')
    * @alias a
    * @see http://chaijs.com/api/bdd/#method_a
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTan, value: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a not number that’s within a given +/- `delta` range of the given number `expected`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(5.1).should('not.be.approximately', 6, 0.5)
    * @alias closeTo
    * @see http://chaijs.com/api/bdd/#method_closeto
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTapproximately, value: Double, delta: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not an `arguments` object.
    * @example
    *    cy.wrap(1).should('not.be.arguments')
    * @see http://chaijs.com/api/bdd/#method_arguments
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTarguments): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or not a `n` date greater than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('not.be.at.least', 10)
    * @see http://chaijs.com/api/bdd/#method_least
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTatDOTleast, value: Double): Chainable[Subject] = js.native
  def apply(chainer: notDOTbeDOTatDOTleast, value: Date): Chainable[Subject] = js.native
  // chai.not
  /**
    * Asserts that the target’s `type` is not equal to the given string type.
    * Types are case insensitive. See the `type-detect` project page for info on the type detection algorithm:
    * https://github.com/chaijs/type-detect.
    * @example
    *    cy.wrap('foo').should('not.be.a', 'number')
    * @see http://chaijs.com/api/bdd/#method_a
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTa, `type`: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or not a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('not.be.below', 1)
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTbelow, value: Double): Chainable[Subject] = js.native
  /**
    * `true` if the spy was not called at least once
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTcalled): Chainable[Subject] = js.native
  /**
    * Assert spy was not.called after `anotherSpy`
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledafteranotherspy
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTcalledAfter, spy: SinonSpy): Chainable[Subject] = js.native
  /**
    * Assert spy was not called before `anotherSpy`
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledbeforeanotherspy
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTcalledBefore, spy: SinonSpy): Chainable[Subject] = js.native
  /**
    * Assert spy was not called exactly once
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledonce
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTcalledOnce): Chainable[Subject] = js.native
  /**
    * Assert spy was not called at least once with `obj` as `this`. `calledOn` also accepts a matcher (see [matchers](http://sinonjs.org/releases/v4.1.3/spies/#matchers)).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledonobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTcalledOn, context: js.Any): Chainable[Subject] = js.native
  /**
    * Assert spy was not called exactly three times
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledthrice
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTcalledThrice): Chainable[Subject] = js.native
  /**
    * Assert spy was not called exactly twice
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledtwice
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTcalledTwice): Chainable[Subject] = js.native
  /**
    * Assert spy was not called at least once with the provided arguments and no others.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithexactlyarg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTcalledWithExactly, args: js.Any*): Chainable[Subject] = js.native
  /**
    * Assert spy was not called with matching arguments (and possibly others).
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithmatcharg1-arg2-
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTcalledWithMatch, args: js.Any*): Chainable[Subject] = js.native
  /**
    * Assert spy/stub was not called the `new` operator.
    * Beware that this is inferred based on the value of the this object and the spy function’s prototype, so it may give false positives if you actively return the right kind of object.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycalledwithnew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTcalledWithNew): Chainable[Subject] = js.native
  // jquery-chai.not
  /**
    * Assert that at least one element of the selection is not checked, using `.is(':checked')`.
    * @example
    *    cy.get('#result').should('not.be.checked')
    * @see http://chaijs.com/plugins/chai-jquery/#checked
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTchecked): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number that’s within a given +/- `delta` range of the given number `expected`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(5.1).should('not.be.closeTo', 6, 0.5)
    * @see http://chaijs.com/api/bdd/#method_closeto
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTcloseTo, value: Double, delta: Double): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is not disabled, using `.is(':disabled')`.
    * @example
    *    cy.get('#result').should('not.be.disabled')
    * @see http://chaijs.com/plugins/chai-jquery/#disabled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTdisabled): Chainable[Subject] = js.native
  /**
    * When the target is a not string or array, .empty asserts that the target’s length property is strictly (===) equal to 0
    * @example
    *    cy.wrap([1]).should('not.be.empty')
    *    cy.wrap('foo').should('not.be.empty')
    * @see http://chaijs.com/api/bdd/#method_empty
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTempty): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is not enabled, using `.is(':enabled')`.
    * @example
    *    cy.get('#result').should('not.be.enabled')
    * @see http://chaijs.com/plugins/chai-jquery/#enabled
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTenabled): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to `false`.
    * @example
    *    cy.wrap(true).should('not.be.false')
    * @see http://chaijs.com/api/bdd/#method_false
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTfalse): Chainable[Subject] = js.native
  /**
    * Assert that no element of the selection is focused.
    * @example
    *    cy.get('#result').should('not.be.focused')
    *    cy.get('#result').should('not.have.focus')
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTfocused): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a not number or a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('be.greaterThan', 7)
    * @alias above
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTgreaterThan, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a not number or a `n` date greater than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('not.be.gte', 7)
    * @alias least
    * @see http://chaijs.com/api/bdd/#method_least
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTgte, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is a not number or a date greater than the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(6).should('not.be.gt', 7)
    * @alias above
    * @see http://chaijs.com/api/bdd/#method_above
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTgt, value: Double): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is not hidden, using `.is(':hidden')`.
    * @example
    *    cy.get('#result').should('not.be.hidden')
    * @see http://chaijs.com/plugins/chai-jquery/#hidden
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOThidden): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not an instance of the given `constructor`.
    * @example
    *    cy.wrap([1, 2]).should('not.be.instanceOf', String)
    * @see http://chaijs.com/api/bdd/#method_instanceof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTinstanceOf, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('not.be.lessThan', 3)
    * @alias below
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTlessThan, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or a date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('not.be.lte', 3)
    * @alias most
    * @see http://chaijs.com/api/bdd/#method_most
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTlte, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or a `n` date less than or equal to the given number or date n respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(4).should('not.be.lt', 3)
    * @alias below
    * @see http://chaijs.com/api/bdd/#method_below
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTlt, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not loosely (`==`) equal to `true`. However, it’s often best to assert that the target is strictly (`===`) or deeply equal to its expected value.
    * @example
    *    cy.wrap(0).should('not.be.ok')
    * @see http://chaijs.com/api/bdd/#method_ok
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTok): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is not selected, using `.is(':selected')`.
    * @example
    *    cy.get('#result').should('not.be.selected')
    * @see http://chaijs.com/plugins/chai-jquery/#selected
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTselected): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to true.
    * @example
    *    cy.wrap(false).should('not.be.true')
    * @see http://chaijs.com/api/bdd/#method_true
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTtrue): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to undefined.
    * @example
    *    cy.wrap(true).should('not.be.undefined')
    * @see http://chaijs.com/api/bdd/#method_undefined
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTundefined): Chainable[Subject] = js.native
  /**
    * Assert that at least one element of the selection is not visible, using `.is(':visible')`.
    * @example
    *    cy.get('#result').should('not.be.visible')
    * @see http://chaijs.com/plugins/chai-jquery/#visible
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTvisible): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not a number or a date greater than or equal to the given number or date `start`, and less than or equal to the given number or date `finish` respectively.
    * However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(3).should('not.be.within', 5, 10)
    * @see http://chaijs.com/api/bdd/#method_within
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTbeDOTwithin, start: Double, end: Double): Chainable[Subject] = js.native
  def apply(chainer: notDOTbeDOTwithin, start: Date, end: Date): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.change` asserts that the given function `subject` returns a different value when it’s invoked before the target function compared to when it’s invoked afterward.
    * However, it’s often best to assert that `subject` is equal to its expected value.
    * @example
    *    let dots = ''
    *    function addDot() { dots += '.' }
    *    function getDots() { return dots }
    *    cy.wrap(() => {}).should('not.change', getDots)
    * @see http://chaijs.com/api/bdd/#method_change
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTchange, fn: js.Function1[/* repeated */ js.Any, _]): Chainable[Subject] = js.native
  /**
    * When two arguments are provided, `.change` asserts that the value of the given object `subject`'s `prop` property is different before invoking the target function compared to afterward.
    * @example
    *    const myObj = { dots: '' }
    *    function addDot() { myObj.dots += '.' }
    *    cy.wrap(() => {}).should('not.change', myObj, 'dots')
    * @see http://chaijs.com/api/bdd/#method_change
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTchange, obj: js.Object, prop: String): Chainable[Subject] = js.native
  /**
    * Assert that the html of the first element of the selection does not contain the given html, using `.html()`.
    * @example
    *    cy.get('#result').should('not.contain.html', '<em>John Doe</em>')
    * @see http://chaijs.com/plugins/chai-jquery/#htmlhtml
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTcontainDOThtml, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the text of the first element of the selection does not contain the given text, using `.text()`.
    * @example
    *    cy.get('#result').should('not.contain.text', 'John Doe')
    * @see http://chaijs.com/plugins/chai-jquery/#texttext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTcontainDOTtext, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not contain the given value, using `.val()`.
    * @example
    *    cy.get('textarea').should('not.contain.value', 'foo bar baz')
    * @see http://chaijs.com/plugins/chai-jquery/#valuevalue
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTcontainDOTvalue, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the selection does not contain the given text, using `:contains()`. If the object asserted against is not a jQuery object, or if `contain` is not called as a function, the original implementation will be called.
    * @example
    *    cy.get('#result').should('not.contain', 'text')
    * @see http://chaijs.com/plugins/chai-jquery/#containtext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTcontain, value: String): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string val is a substring of the target.
    * @example
    *    cy.wrap('tester').should('not.contain', 'foo')
    * @alias include
    * @see http://chaijs.com/api/bdd/#method_include
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTcontain, value: js.Any): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.decrease` asserts that the given function `subject` does not returns a lesser number when it’s invoked after invoking the target function compared to when it’s invoked beforehand.
    * `.decrease` also causes all `.by` assertions that follow in the chain to assert how much lesser of a number is returned. It’s often best to assert that the return value decreased by the expected amount, rather than asserting it decreased by any amount.
    * @example
    *    let val = 1
    *    function subtractTwo() { val -= 2 }
    *    function getVal() { return val }
    *    cy.wrap(() => {}).should('not.decrease', getVal)
    * @see http://chaijs.com/api/bdd/#method_decrease
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTdecrease, fn: js.Function1[/* repeated */ js.Any, _]): Chainable[Subject] = js.native
  /**
    * When two arguments are provided, `.decrease` asserts that the value of the given object `subject`'s `prop` property is not lesser after invoking the target function compared to beforehand.
    * @example
    *    const myObj = { val: 1 }
    *    function subtractTwo() { myObj.val -= 2 }
    *    cy.wrap(() => {}).should('not.decrease', myObj, 'val')
    * @see http://chaijs.com/api/bdd/#method_decrease
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTdecrease, obj: js.Object, prop: String): Chainable[Subject] = js.native
  /**
    * Causes all `.equal`, `.include`, `.members`, `.keys`, and `.property` assertions that follow in the chain to not use deep equality instead of strict (`===`) equality. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({ a: 1 }).should('not.deep.equal', { b: 1 })
    * @see http://chaijs.com/api/bdd/#method_deep
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTdeepDOTequal, value: Subject): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not deeply equal to the given `obj`. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({a: 1}).should('not.eql', {c: 1}).and('not.equal', {a: 1})
    * @see http://chaijs.com/api/bdd/#method_eql
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTeql, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to the given `val`.
    * @example
    *    cy.wrap(1).should('not.equal', 2)
    * @see http://chaijs.com/api/bdd/#method_equal
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTequal, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to the given `val`.
    * @example
    *    cy.wrap(1).should('not.eq', 2)
    * @alias equal
    * @see http://chaijs.com/api/bdd/#method_equal
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTeq, value: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target is not strictly (`===`) equal to either `null` or `undefined`. However, it’s often best to assert that the target is equal to its expected value.
    * @example
    *    cy.wrap(null).should('not.exist')
    * @see http://chaijs.com/api/bdd/#method_exist
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTexist): Chainable[Subject] = js.native
  /**
    * Causes all `.keys` assertions that follow in the chain to not require that the target have all of the given keys. This is the opposite of `.any`, which only requires that the target have at least one of the given keys.
    * @example
    *    cy.wrap({ a: 1, b: 2 }).should('not.have.all.keys', 'c', 'd')
    * @see http://chaijs.com/api/bdd/#method_all
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTallDOTkeys, value: String*): Chainable[Subject] = js.native
  /**
    * Assert spy did not always throw an exception.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyalwaysthrew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTalwaysDOTthrown): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTalwaysDOTthrown, value: String): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTalwaysDOTthrown, value: Error): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTalwaysDOTthrown, value: ErrorConstructor): Chainable[Subject] = js.native
  /**
    * Causes all `.keys` assertions that follow in the chain to only require that the target not have at least one of the given keys. This is the opposite of `.all`, which requires that the target have all of the given keys.
    * @example
    *    cy.wrap({ a: 1, b: 2 }).should('not.have.any.keys', 'c')
    * @see http://chaijs.com/api/bdd/#method_any
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTanyDOTkeys, value: String*): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given attribute, using `.attr()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('not.have.attr', 'role')
    *    cy.get('#result').should('not.have.attr', 'role', 'menu')
    * @see http://chaijs.com/plugins/chai-jquery/#attrname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTattr, value: String): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTattr, value: String, `match`: String): Chainable[Subject] = js.native
  /**
    * Assert not the number of calls.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spycallcount
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTcallCount, value: Double): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given attribute, using `.attr()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('not.have.class', 'success')
    * @see http://chaijs.com/plugins/chai-jquery/#classclassname
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTclass, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given CSS property, using `.css()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('not.have.css', 'display', 'none')
    * @see http://chaijs.com/plugins/chai-jquery/#cssname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTcss, value: String): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTcss, value: String, `match`: String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given data value, using `.data()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('not.have.data', 'foo', 'bar')
    * @see http://chaijs.com/plugins/chai-jquery/#dataname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTdata, value: String): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTdata, value: String, `match`: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target does not have a property with the given key `name`. See the `deep-eql` project page for info on the deep equality algorithm: https://github.com/chaijs/deep-eql.
    * @example
    *    cy.wrap({ x: {a: 1 }}).should('not.have.deep.property', 'y', { a: 1 })
    * @see http://chaijs.com/api/bdd/#method_property
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTdeepDOTproperty, value: String, obj: js.Object): Chainable[Subject] = js.native
  /**
    * Assert that the selection does not contain at least one element which has a descendant matching the given selector, using `.has()`.
    * @example
    *    cy.get('#result').should('not.have.descendants', 'h1')
    * @see http://chaijs.com/plugins/chai-jquery/#descendantsselector
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTdescendants, selector: String): Chainable[Subject] = js.native
  /**
    * Assert that no element of the selection is focused.
    * @example
    *    cy.get('#result').should('not.have.focus')
    *    cy.get('#result').should('not.be.focused')
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTfocus): Chainable[Subject] = js.native
  /**
    * Assert that the html of the first element of the selection is not equal to the given html, using `.html()`.
    * @example
    *    cy.get('#result').should('not.have.html', '<em>John Doe</em>')
    * @see http://chaijs.com/plugins/chai-jquery/#htmlhtml
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOThtml, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given id, using `.attr('id')`.
    * @example
    *    cy.get('#result').should('not.have.id', 'result')
    * @see http://chaijs.com/plugins/chai-jquery/#idid
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTid, value: String): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTid, value: String, `match`: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is not greater than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.length.greaterThan', 4)
    *    cy.wrap('foo').should('not.have.length.greaterThan', 4)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTlengthDOTgreaterThan, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is not greater than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.length.gt', 4)
    *    cy.wrap('foo').should('not.have.length.gt', 4)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTlengthDOTgt, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is less than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('have.length.lessThan', 2)
    *    cy.wrap('foo').should('have.length.lessThan', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTlengthDOTlessThan, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is not less than or equal to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.length.let', 2)
    *    cy.wrap('foo').should('not.have.length.lte', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTlengthDOTlte, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is not less than to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.length.lt', 2)
    *    cy.wrap('foo').should('not.have.length.lt', 2)
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTlengthDOTlt, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target’s `length` property is not equal to the given number `n`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.length', 2)
    * cy.wrap('foo').should('not.have.length', 2)
    * @alias lengthOf
    * @see http://chaijs.com/api/bdd/#method_lengthof
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTlength, value: Double): Chainable[Subject] = js.native
  /**
    * Asserts that the target array does not have the same members as the given array `set`.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.have.members', [4, 5, 6])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTmembers, values: js.Array[_]): Chainable[Subject] = js.native
  /**
    * Asserts that the target array does not have the same members as the given array where order matters.
    * @example
    *    cy.wrap([1, 2, 3]).should('not. have.ordered.members', [4, 5, 6])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTorderedDOTmembers, values: js.Array[_]): Chainable[Subject] = js.native
  /**
    * Causes all `.property` and `.include` assertions that follow in the chain to ignore inherited properties.
    * @example
    *    Object.prototype.b = 2
    *    cy.wrap({ a: 1 }).should('have.property', 'a').and('not.have.ownProperty', 'b')
    * @see http://chaijs.com/api/bdd/#method_ownproperty
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTownProperty, property: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target has a property with the given key `name`.
    * @example
    *    cy.wrap({ a: 1 }).should('not.have.property', 'b')
    *    cy.wrap({ a: 1 }).should('not.have.property', 'b', 1)
    * @see http://chaijs.com/api/bdd/#method_property
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTproperty, property: String): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTproperty, property: String, value: js.Any): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given property, using `.prop()`. Optionally, assert a particular value as well. The return value is available for chaining.
    * @example
    *    cy.get('#result').should('not.have.prop', 'disabled')
    *    cy.get('#result').should('not.have.prop', 'disabled', false)
    * @see http://chaijs.com/plugins/chai-jquery/#propname-value
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTprop, value: String): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTprop, value: String, `match`: js.Any): Chainable[Subject] = js.native
  /**
    * Asserts that the target string does not contains the given substring `str`.
    * @example
    *    cy.wrap('foobar').should('not.have.string', 'baz')
    * @see http://chaijs.com/api/bdd/#method_string
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTstring, `match`: String): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTstring, `match`: RegExp): Chainable[Subject] = js.native
  /**
    * Assert that the text of the first element of the selection is not equal to the given text, using `.text()`.
    * @example
    *    cy.get('#result').should('not.have.text', 'John Doe')
    * @see http://chaijs.com/plugins/chai-jquery/#texttext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTtext, value: String): Chainable[Subject] = js.native
  /**
    * Assert spy did not throw an exception at least once.
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spythrew
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTthrown): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTthrown, value: String): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTthrown, value: Error): Chainable[Subject] = js.native
  def apply(chainer: notDOThaveDOTthrown, value: ErrorConstructor): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not have the given value, using `.val()`.
    * @example
    *    cy.get('textarea').should('not.have.value', 'foo bar baz')
    * @see http://chaijs.com/plugins/chai-jquery/#valuevalue
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOThaveDOTvalue, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the html of the first element of the selection does not contain the given html, using `.html()`.
    * @example
    *    cy.get('#result').should('not.include.html', '<em>John Doe</em>')
    * @see http://chaijs.com/plugins/chai-jquery/#htmlhtml
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTincludeDOThtml, value: String): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string `val` is not a substring of the target.
    * @example
    *    cy.wrap([1, 2, 3]).should('not.include.members', [4, 5])
    * @see http://chaijs.com/api/bdd/#method_members
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTincludeDOTmembers, value: js.Array[_]): Chainable[Subject] = js.native
  /**
    * Assert that the text of the first element of the selection does not contain the given text, using `.text()`.
    * @example
    *    cy.get('#result').should('not.include.text', 'John Doe')
    * @see http://chaijs.com/plugins/chai-jquery/#texttext
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTincludeDOTtext, value: String): Chainable[Subject] = js.native
  /**
    * Assert that the first element of the selection does not contain the given value, using `.val()`.
    * @example
    *    cy.get('textarea').should('not.include.value', 'foo bar baz')
    * @see http://chaijs.com/plugins/chai-jquery/#valuevalue
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTincludeDOTvalue, value: String): Chainable[Subject] = js.native
  /**
    * When the target is a string, `.include` asserts that the given string `val` is not a substring of the target.
    * @example
    *    cy.wrap('foobar').should('not.include', 'baz')
    * @see http://chaijs.com/api/bdd/#method_include
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTinclude, value: js.Any): Chainable[Subject] = js.native
  /**
    * When one argument is provided, `.increase` asserts that the given function `subject` returns a greater number when it’s
    * invoked after invoking the target function compared to when it’s invoked beforehand.
    * `.increase` also causes all `.by` assertions that follow in the chain to assert how much greater of a number is returned.
    * It’s often best to assert that the return value increased by the expected amount, rather than asserting it increased by any amount.
    * @example
    *    let val = 1
    *    function addTwo() { val += 2 }
    *    function getVal() { return val }
    *    cy.wrap(() => {}).should('not.increase', getVal)
    * @see http://chaijs.com/api/bdd/#method_increase
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTincrease, value: js.Object, property: String): Chainable[Subject] = js.native
  /**
    * Assert that the selection does not match a given selector, using `.is()`. Note that this overrides the built-in chai assertion. If the object asserted against is not a jQuery object, the original implementation will be called.
    * @example
    *    cy.get('#result').should('not.match', ':empty')
    * @see http://chaijs.com/plugins/chai-jquery/#matchselector
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTmatch, value: String): Chainable[Subject] = js.native
  /**
    * Asserts that the target does not match the given regular expression `re`.
    * @example
    *    cy.wrap('foobar').should('not.match', /baz$/)
    * @see http://chaijs.com/api/bdd/#method_match
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTmatch, value: RegExp): Chainable[Subject] = js.native
  /**
    * When the target is a non-function object, `.respondTo` asserts that the target does not have a `method` with the given name method. The method can be own or inherited, and it can be enumerable or non-enumerable.
    * @example
    *    class Cat {
    *      meow() {}
    *    }
    *    cy.wrap(new Cat()).should('not.respondTo', 'bark')
    * @see http://chaijs.com/api/bdd/#method_respondto
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTrespondTo, value: String): Chainable[Subject] = js.native
  /**
    * Assert spy did not return the provided value at least once. (see [matchers](http://sinonjs.org/releases/v4.1.3/spies/#matchers))
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyreturnedobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTreturned, value: js.Any): Chainable[Subject] = js.native
  /**
    * Invokes the given `matcher` function with the target being passed as the first argument, and asserts that the value returned is falsy.
    * @example
    *    cy.wrap(1).should('not.satisfy', (num) => num < 0)
    * @see http://chaijs.com/api/bdd/#method_satisfy
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: notDOTsatisfy, fn: js.Function1[/* val */ js.Any, Boolean]): Chainable[Subject] = js.native
  /**
    * When the target is a non-function object, `.respondTo` asserts that the target has a `method` with the given name method. The method can be own or inherited, and it can be enumerable or non-enumerable.
    * @example
    *    class Cat {
    *      meow() {}
    *    }
    *    cy.wrap(new Cat()).should('respondTo', 'meow')
    * @see http://chaijs.com/api/bdd/#method_respondto
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: respondTo, value: String): Chainable[Subject] = js.native
  /**
    * Assert spy returned the provided value at least once. (see [matchers](http://sinonjs.org/releases/v4.1.3/spies/#matchers))
    * @see http://sinonjs.org/releases/v4.1.3/spies/#spyreturnedobj
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: returned, value: js.Any): Chainable[Subject] = js.native
  /**
    * Invokes the given `matcher` function with the target being passed as the first argument, and asserts that the value returned is truthy.
    * @example
    *    cy.wrap(1).should('satisfy', (num) => num > 0)
    * @see http://chaijs.com/api/bdd/#method_satisfy
    * @see https://on.cypress.io/assertions
    */
  def apply(chainer: satisfy, fn: js.Function1[/* val */ js.Any, Boolean]): Chainable[Subject] = js.native
  /**
    * Create an assertion. Assertions are automatically retried until they pass or time out.
    * Passing a function to `.should()` enables you to make multiple assertions on the yielded subject. This also gives you the opportunity to massage what you’d like to assert on.
    * Just be sure _not_ to include any code that has side effects in your callback function. The callback function will be retried over and over again until no assertions within it throw.
    * @example
    *    cy
    *      .get('p')
    *      .should(($p) => {
    *        // should have found 3 elements
    *        expect($p).to.have.length(3)
    *
    *        // make sure the first contains some text content
    *        expect($p.first()).to.contain('Hello World')
    *
    *        // use jquery's map to grab all of their classes
    *        // jquery's map returns a new jquery object
    *        const classes = $p.map((i, el) => {
    *          return Cypress.$(el).attr('class')
    *        })
    *
    *        // call classes.get() to make this a plain array
    *        expect(classes.get()).to.deep.eq([
    *          'text-primary',
    *          'text-danger',
    *          'text-default'
    *        ])
    *      })
    * @see https://on.cypress.io/should
    */
  def apply(fn: js.Function1[/* currentSubject */ Subject, Unit]): Chainable[Subject] = js.native
}

