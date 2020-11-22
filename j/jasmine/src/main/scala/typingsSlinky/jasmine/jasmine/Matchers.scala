package typingsSlinky.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matchers[T]
  extends Instantiable3[/* env */ Env, /* actual */ T, /* spec */ Env, js.Any]
     with Instantiable4[/* env */ Env, /* actual */ T, /* spec */ Env, /* isNot */ Boolean, js.Any] {
  
  var actual: T = js.native
  
  var env: Env = js.native
  
  var isNot: js.UndefOr[Boolean] = js.native
  
  def message(): js.Any = js.native
  
  /**
    * Invert the matcher following this expect.
    */
  var not: Matchers[T] = js.native
  
  var spec: Env = js.native
  
  /**
    * Expect the actual value to be `===` to the expected value.
    *
    * @param expected The expected value to compare against.
    * @param expectationFailOutput
    * @example
    * expect(thing).toBe(realThing);
    */
  def toBe(expected: Expected[T]): Boolean = js.native
  def toBe(expected: Expected[T], expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeCloseTo(expected: Double): Boolean = js.native
  def toBeCloseTo(expected: Double, precision: js.UndefOr[scala.Nothing], expectationFailOutput: js.Any): Boolean = js.native
  def toBeCloseTo(expected: Double, precision: js.Any): Boolean = js.native
  def toBeCloseTo(expected: Double, precision: js.Any, expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeDefined(): Boolean = js.native
  def toBeDefined(expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeFalse(): Boolean = js.native
  
  def toBeFalsy(): Boolean = js.native
  def toBeFalsy(expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeGreaterThan(expected: Double): Boolean = js.native
  def toBeGreaterThan(expected: Double, expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeGreaterThanOrEqual(expected: Double): Boolean = js.native
  def toBeGreaterThanOrEqual(expected: Double, expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeInstanceOf(expected: Constructor): Boolean = js.native
  
  def toBeLessThan(expected: Double): Boolean = js.native
  def toBeLessThan(expected: Double, expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeLessThanOrEqual(expected: Double): Boolean = js.native
  def toBeLessThanOrEqual(expected: Double, expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeNaN(): Boolean = js.native
  
  def toBeNegativeInfinity(): Boolean = js.native
  def toBeNegativeInfinity(expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeNull(): Boolean = js.native
  def toBeNull(expectationFailOutput: js.Any): Boolean = js.native
  
  def toBePositiveInfinity(): Boolean = js.native
  def toBePositiveInfinity(expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeTrue(): Boolean = js.native
  
  def toBeTruthy(): Boolean = js.native
  def toBeTruthy(expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeUndefined(): Boolean = js.native
  def toBeUndefined(expectationFailOutput: js.Any): Boolean = js.native
  
  def toContain(expected: js.Any): Boolean = js.native
  def toContain(expected: js.Any, expectationFailOutput: js.Any): Boolean = js.native
  
  /**
    * Expect the actual value to be equal to the expected, using deep equality comparison.
    * @param expected Expected value.
    * @param expectationFailOutput
    * @example
    * expect(bigObject).toEqual({ "foo": ['bar', 'baz'] });
    */
  def toEqual(expected: Expected[T]): Boolean = js.native
  def toEqual(expected: Expected[T], expectationFailOutput: js.Any): Boolean = js.native
  
  def toHaveBeenCalled(): Boolean = js.native
  
  def toHaveBeenCalledBefore(expected: Func): Boolean = js.native
  
  def toHaveBeenCalledOnceWith(params: js.Any*): Boolean = js.native
  
  def toHaveBeenCalledTimes(expected: Double): Boolean = js.native
  
  def toHaveBeenCalledWith(params: js.Any*): Boolean = js.native
  
  /**
    * Expect the actual value to be a DOM element that has the expected class.
    * @since 3.0.0
    * @param expected The class name to test for.
    * @example
    * var el = document.createElement('div');
    * el.className = 'foo bar baz';
    * expect(el).toHaveClass('bar');
    */
  def toHaveClass(expected: String): Boolean = js.native
  def toHaveClass(expected: String, expectationFailOutput: js.Any): Boolean = js.native
  
  /**
    * Expect the actual size to be equal to the expected, using array-like
    * length or object keys size.
    * @since 3.6.0
    * @param expected The expected size
    * @example
    * array = [1,2];
    * expect(array).toHaveSize(2);
    */
  def toHaveSize(expected: Double): Boolean = js.native
  
  /**
    * Expect the actual value to match a regular expression.
    * @param expected Value to look for in the string.
    * @example
    * expect("my string").toMatch(/string$/);
    * expect("other string").toMatch("her");
    */
  def toMatch(expected: String): Boolean = js.native
  def toMatch(expected: String, expectationFailOutput: js.Any): Boolean = js.native
  def toMatch(expected: js.RegExp): Boolean = js.native
  def toMatch(expected: js.RegExp, expectationFailOutput: js.Any): Boolean = js.native
  
  def toThrow(): Boolean = js.native
  def toThrow(expected: js.Any): Boolean = js.native
  
  def toThrowError(): Boolean = js.native
  def toThrowError(expected: js.UndefOr[scala.Nothing], message: String): Boolean = js.native
  def toThrowError(expected: js.UndefOr[scala.Nothing], message: js.RegExp): Boolean = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ js.Any, js.Error]): Boolean = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ js.Any, js.Error], message: String): Boolean = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ js.Any, js.Error], message: js.RegExp): Boolean = js.native
  def toThrowError(message: String): Boolean = js.native
  def toThrowError(message: js.RegExp): Boolean = js.native
  
  def toThrowMatching(predicate: js.Function1[/* thrown */ js.Any, Boolean]): Boolean = js.native
  
  /**
    * Add some context for an expect.
    * @param message Additional context to show when the matcher fails
    */
  def withContext(message: String): Matchers[T] = js.native
}
