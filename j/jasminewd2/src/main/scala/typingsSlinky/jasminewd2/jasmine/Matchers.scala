package typingsSlinky.jasminewd2.jasmine

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matchers[T] extends js.Object {
  
  def toBe(expected: js.Any): js.Promise[Unit] = js.native
  def toBe(expected: js.Any, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toBeCloseTo(expected: js.Promise[Double]): js.Promise[Unit] = js.native
  def toBeCloseTo(expected: js.Promise[Double], precision: js.UndefOr[scala.Nothing], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  def toBeCloseTo(expected: js.Promise[Double], precision: js.Any): js.Promise[Unit] = js.native
  def toBeCloseTo(expected: js.Promise[Double], precision: js.Any, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  def toBeCloseTo(expected: Double): js.Promise[Unit] = js.native
  def toBeCloseTo(expected: Double, precision: js.UndefOr[scala.Nothing], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  def toBeCloseTo(expected: Double, precision: js.Any): js.Promise[Unit] = js.native
  def toBeCloseTo(expected: Double, precision: js.Any, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toBeDefined(): js.Promise[Unit] = js.native
  def toBeDefined(expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toBeFalsy(): js.Promise[Unit] = js.native
  def toBeFalsy(expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toBeGreaterThan(expected: js.Promise[Double]): js.Promise[Unit] = js.native
  def toBeGreaterThan(expected: js.Promise[Double], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  def toBeGreaterThan(expected: Double): js.Promise[Unit] = js.native
  def toBeGreaterThan(expected: Double, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toBeGreaterThanOrEqual(expected: js.Promise[Double]): js.Promise[Unit] = js.native
  def toBeGreaterThanOrEqual(expected: js.Promise[Double], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  def toBeGreaterThanOrEqual(expected: Double): js.Promise[Unit] = js.native
  def toBeGreaterThanOrEqual(expected: Double, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toBeLessThan(expected: js.Promise[Double]): js.Promise[Unit] = js.native
  def toBeLessThan(expected: js.Promise[Double], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  def toBeLessThan(expected: Double): js.Promise[Unit] = js.native
  def toBeLessThan(expected: Double, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toBeLessThanOrEqual(expected: js.Promise[Double]): js.Promise[Unit] = js.native
  def toBeLessThanOrEqual(expected: js.Promise[Double], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  def toBeLessThanOrEqual(expected: Double): js.Promise[Unit] = js.native
  def toBeLessThanOrEqual(expected: Double, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toBeNaN(): js.Promise[Unit] = js.native
  
  def toBeNull(): js.Promise[Unit] = js.native
  def toBeNull(expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toBeTruthy(): js.Promise[Unit] = js.native
  def toBeTruthy(expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toBeUndefined(): js.Promise[Unit] = js.native
  def toBeUndefined(expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toContain(expected: js.Any): js.Promise[Unit] = js.native
  def toContain(expected: js.Any, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toEqual(expected: js.Any): js.Promise[Unit] = js.native
  def toEqual(expected: js.Any, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toHaveBeenCalled(): js.Promise[Unit] = js.native
  
  def toHaveBeenCalledTimes(expected: js.Promise[Double]): js.Promise[Unit] = js.native
  def toHaveBeenCalledTimes(expected: Double): js.Promise[Unit] = js.native
  
  def toHaveBeenCalledWith(params: js.Any*): js.Promise[Unit] = js.native
  
  def toMatch(expected: String): js.Promise[Unit] = js.native
  def toMatch(expected: String, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  def toMatch(expected: js.Promise[String | js.RegExp]): js.Promise[Unit] = js.native
  def toMatch(expected: js.Promise[String | js.RegExp], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  def toMatch(expected: js.RegExp): js.Promise[Unit] = js.native
  def toMatch(expected: js.RegExp, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toThrow(): js.Promise[Unit] = js.native
  def toThrow(expected: js.Any): js.Promise[Unit] = js.native
  
  def toThrowError(): js.Promise[Unit] = js.native
  def toThrowError(expected: js.UndefOr[scala.Nothing], message: String): js.Promise[Unit] = js.native
  def toThrowError(expected: js.UndefOr[scala.Nothing], message: js.Promise[String | js.RegExp]): js.Promise[Unit] = js.native
  def toThrowError(expected: js.UndefOr[scala.Nothing], message: js.RegExp): js.Promise[Unit] = js.native
  def toThrowError(
    expected: Instantiable1[
      /* args (repeated) */ js.Any, 
      js.Error | (js.Promise[Instantiable1[/* args (repeated) */ js.Any, js.Error]])
    ]
  ): js.Promise[Unit] = js.native
  def toThrowError(
    expected: Instantiable1[
      /* args (repeated) */ js.Any, 
      js.Error | (js.Promise[Instantiable1[/* args (repeated) */ js.Any, js.Error]])
    ],
    message: String
  ): js.Promise[Unit] = js.native
  def toThrowError(
    expected: Instantiable1[
      /* args (repeated) */ js.Any, 
      js.Error | (js.Promise[Instantiable1[/* args (repeated) */ js.Any, js.Error]])
    ],
    message: js.Promise[String | js.RegExp]
  ): js.Promise[Unit] = js.native
  def toThrowError(
    expected: Instantiable1[
      /* args (repeated) */ js.Any, 
      js.Error | (js.Promise[Instantiable1[/* args (repeated) */ js.Any, js.Error]])
    ],
    message: js.RegExp
  ): js.Promise[Unit] = js.native
  def toThrowError(message: String): js.Promise[Unit] = js.native
  def toThrowError(message: js.Promise[String | js.RegExp]): js.Promise[Unit] = js.native
  def toThrowError(message: js.RegExp): js.Promise[Unit] = js.native
}
