package typingsSlinky.jest.mod.jest

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// should be R extends void|Promise<void> but getting dtslint error
@js.native
trait Matchers[R, T] extends StObject {
  
  /**
    * Ensures the last call to a mock function was provided specific args.
    *
    * Optionally, you can provide a type for the expected arguments via a generic.
    * Note that the type must be either an array or a tuple.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def lastCalledWith[E /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type E is not an array type */ args: E
  ): R = js.native
  
  /**
    * Ensure that the last call to a mock function has returned a specified value.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def lastReturnedWith[E](value: E): R = js.native
  
  /**
    * Ensure that a mock function is called with specific arguments on an Nth call.
    *
    * Optionally, you can provide a type for the expected arguments via a generic.
    * Note that the type must be either an array or a tuple.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def nthCalledWith[E /* <: js.Array[_] */](
    nthCall: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type E is not an array type */ params: E
  ): R = js.native
  
  /**
    * Ensure that the nth call to a mock function has returned a specified value.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def nthReturnedWith[E](n: Double, value: E): R = js.native
  
  /**
    * Checks that a value is what you expect. It uses `Object.is` to check strict equality.
    * Don't use `toBe` with floating-point numbers.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toBe[E](expected: E): R = js.native
  
  /**
    * Ensures that a mock function is called.
    */
  def toBeCalled(): R = js.native
  
  /**
    * Ensures that a mock function is called an exact number of times.
    */
  def toBeCalledTimes(expected: Double): R = js.native
  
  /**
    * Ensure that a mock function is called with specific arguments.
    *
    * Optionally, you can provide a type for the expected arguments via a generic.
    * Note that the type must be either an array or a tuple.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toBeCalledWith[E /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type E is not an array type */ args: E
  ): R = js.native
  
  /**
    * Using exact equality with floating point numbers is a bad idea.
    * Rounding means that intuitive things fail.
    * The default for numDigits is 2.
    */
  def toBeCloseTo(expected: Double): R = js.native
  def toBeCloseTo(expected: Double, numDigits: Double): R = js.native
  
  /**
    * Ensure that a variable is not undefined.
    */
  def toBeDefined(): R = js.native
  
  /**
    * When you don't care what a value is, you just want to
    * ensure a value is false in a boolean context.
    */
  def toBeFalsy(): R = js.native
  
  def toBeGreaterThan(expected: js.BigInt): R = js.native
  /**
    * For comparing floating point or big integer numbers.
    */
  def toBeGreaterThan(expected: Double): R = js.native
  
  def toBeGreaterThanOrEqual(expected: js.BigInt): R = js.native
  /**
    * For comparing floating point or big integer numbers.
    */
  def toBeGreaterThanOrEqual(expected: Double): R = js.native
  
  /**
    * Ensure that an object is an instance of a class.
    * This matcher uses `instanceof` underneath.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toBeInstanceOf[E](expected: E): R = js.native
  
  def toBeLessThan(expected: js.BigInt): R = js.native
  /**
    * For comparing floating point or big integer numbers.
    */
  def toBeLessThan(expected: Double): R = js.native
  
  def toBeLessThanOrEqual(expected: js.BigInt): R = js.native
  /**
    * For comparing floating point or big integer numbers.
    */
  def toBeLessThanOrEqual(expected: Double): R = js.native
  
  /**
    * Used to check that a variable is NaN.
    */
  def toBeNaN(): R = js.native
  
  /**
    * This is the same as `.toBe(null)` but the error messages are a bit nicer.
    * So use `.toBeNull()` when you want to check that something is null.
    */
  def toBeNull(): R = js.native
  
  /**
    * Use when you don't care what a value is, you just want to ensure a value
    * is true in a boolean context. In JavaScript, there are six falsy values:
    * `false`, `0`, `''`, `null`, `undefined`, and `NaN`. Everything else is truthy.
    */
  def toBeTruthy(): R = js.native
  
  /**
    * Used to check that a variable is undefined.
    */
  def toBeUndefined(): R = js.native
  
  /**
    * Used when you want to check that an item is in a list.
    * For testing the items in the list, this uses `===`, a strict equality check.
    * It can also check whether a string is a substring of another string.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toContain[E](expected: E): R = js.native
  
  /**
    * Used when you want to check that an item is in a list.
    * For testing the items in the list, this matcher recursively checks the
    * equality of all fields, rather than checking for object identity.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toContainEqual[E](expected: E): R = js.native
  
  /**
    * Used when you want to check that two objects have the same value.
    * This matcher recursively checks the equality of all fields, rather than checking for object identity.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toEqual[E](expected: E): R = js.native
  
  /**
    * Ensures that a mock function is called.
    */
  def toHaveBeenCalled(): R = js.native
  
  /**
    * Ensures that a mock function is called an exact number of times.
    */
  def toHaveBeenCalledTimes(expected: Double): R = js.native
  
  /**
    * Ensure that a mock function is called with specific arguments.
    *
    * Optionally, you can provide a type for the expected arguments via a generic.
    * Note that the type must be either an array or a tuple.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toHaveBeenCalledWith[E /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type E is not an array type */ params: E
  ): R = js.native
  
  /**
    * If you have a mock function, you can use `.toHaveBeenLastCalledWith`
    * to test what arguments it was last called with.
    *
    * Optionally, you can provide a type for the expected arguments via a generic.
    * Note that the type must be either an array or a tuple.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toHaveBeenLastCalledWith[E /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type E is not an array type */ params: E
  ): R = js.native
  
  /**
    * Ensure that a mock function is called with specific arguments on an Nth call.
    *
    * Optionally, you can provide a type for the expected arguments via a generic.
    * Note that the type must be either an array or a tuple.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toHaveBeenNthCalledWith[E /* <: js.Array[_] */](
    nthCall: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type E is not an array type */ params: E
  ): R = js.native
  
  /**
    * Use to test the specific value that a mock function last returned.
    * If the last call to the mock function threw an error, then this matcher will fail
    * no matter what value you provided as the expected return value.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toHaveLastReturnedWith[E](expected: E): R = js.native
  
  /**
    * Used to check that an object has a `.length` property
    * and it is set to a certain numeric value.
    */
  def toHaveLength(expected: Double): R = js.native
  
  /**
    * Use to test the specific value that a mock function returned for the nth call.
    * If the nth call to the mock function threw an error, then this matcher will fail
    * no matter what value you provided as the expected return value.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toHaveNthReturnedWith[E](nthCall: Double, expected: E): R = js.native
  
  /**
    * Use to check if property at provided reference keyPath exists for an object.
    * For checking deeply nested properties in an object you may use dot notation or an array containing
    * the keyPath for deep references.
    *
    * Optionally, you can provide a value to check if it's equal to the value present at keyPath
    * on the target object. This matcher uses 'deep equality' (like `toEqual()`) and recursively checks
    * the equality of all fields.
    *
    * @example
    *
    * expect(houseForSale).toHaveProperty('kitchen.area', 20);
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toHaveProperty[E](propertyPath: String): R = js.native
  def toHaveProperty[E](propertyPath: String, value: E): R = js.native
  def toHaveProperty[E](propertyPath: js.Array[_]): R = js.native
  def toHaveProperty[E](propertyPath: js.Array[_], value: E): R = js.native
  
  /**
    * Use to test that the mock function successfully returned (i.e., did not throw an error) at least one time
    */
  def toHaveReturned(): R = js.native
  
  /**
    * Use to ensure that a mock function returned successfully (i.e., did not throw an error) an exact number of times.
    * Any calls to the mock function that throw an error are not counted toward the number of times the function returned.
    */
  def toHaveReturnedTimes(expected: Double): R = js.native
  
  /**
    * Use to ensure that a mock function returned a specific value.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toHaveReturnedWith[E](expected: E): R = js.native
  
  /**
    * Check that a string matches a regular expression.
    */
  def toMatch(expected: String): R = js.native
  def toMatch(expected: js.RegExp): R = js.native
  
  /**
    * This ensures that a value matches the most recent snapshot with property matchers.
    * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
    * Check out [the Snapshot Testing guide](http://facebook.github.io/jest/docs/snapshot-testing.html) for more information.
    */
  def toMatchInlineSnapshot(): R = js.native
  def toMatchInlineSnapshot(snapshot: String): R = js.native
  /**
    * This ensures that a value matches the most recent snapshot with property matchers.
    * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
    * Check out [the Snapshot Testing guide](http://facebook.github.io/jest/docs/snapshot-testing.html) for more information.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toMatchInlineSnapshot[U /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsSlinky.jest.jestStrings.Matchers with TopLevel[js.Any] */](propertyMatchers: Partial[U]): R = js.native
  def toMatchInlineSnapshot[U /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsSlinky.jest.jestStrings.Matchers with TopLevel[js.Any] */](propertyMatchers: Partial[U], snapshot: String): R = js.native
  
  /**
    * Used to check that a JavaScript object matches a subset of the properties of an object
    *
    * Optionally, you can provide an object to use as Generic type for the expected value.
    * This ensures that the matching object matches the structure of the provided object-like type.
    *
    * @example
    *
    * type House = {
    *   bath: boolean;
    *   bedrooms: number;
    *   kitchen: {
    *     amenities: string[];
    *     area: number;
    *     wallColor: string;
    *   }
    * };
    *
    * expect(desiredHouse).toMatchObject<House>(...standardHouse, kitchen: {area: 20}) // wherein standardHouse is some base object of type House
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toMatchObject[E /* <: js.Object | js.Array[_] */](expected: E): R = js.native
  
  /**
    * This ensures that a value matches the most recent snapshot.
    * Check out [the Snapshot Testing guide](http://facebook.github.io/jest/docs/snapshot-testing.html) for more information.
    */
  def toMatchSnapshot(): R = js.native
  def toMatchSnapshot(snapshotName: String): R = js.native
  /**
    * This ensures that a value matches the most recent snapshot with property matchers.
    * Check out [the Snapshot Testing guide](http://facebook.github.io/jest/docs/snapshot-testing.html) for more information.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toMatchSnapshot[U /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsSlinky.jest.jestStrings.Matchers with TopLevel[js.Any] */](propertyMatchers: Partial[U]): R = js.native
  def toMatchSnapshot[U /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsSlinky.jest.jestStrings.Matchers with TopLevel[js.Any] */](propertyMatchers: Partial[U], snapshotName: String): R = js.native
  
  /**
    * Ensure that a mock function has returned (as opposed to thrown) at least once.
    */
  def toReturn(): R = js.native
  
  /**
    * Ensure that a mock function has returned (as opposed to thrown) a specified number of times.
    */
  def toReturnTimes(count: Double): R = js.native
  
  /**
    * Ensure that a mock function has returned a specified value at least once.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toReturnWith[E](value: E): R = js.native
  
  /**
    * Use to test that objects have the same types as well as structure.
    *
    * Optionally, you can provide a type for the expected value via a generic.
    * This is particularly useful for ensuring expected objects have the right structure.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def toStrictEqual[E](expected: E): R = js.native
  
  /**
    * Used to test that a function throws when it is called.
    */
  def toThrow(): R = js.native
  def toThrow(error: String): R = js.native
  def toThrow(error: js.Error): R = js.native
  def toThrow(error: js.RegExp): R = js.native
  def toThrow(error: Constructable): R = js.native
  
  /**
    * If you want to test that a specific error is thrown inside a function.
    */
  def toThrowError(): R = js.native
  def toThrowError(error: String): R = js.native
  def toThrowError(error: js.Error): R = js.native
  def toThrowError(error: js.RegExp): R = js.native
  def toThrowError(error: Constructable): R = js.native
  
  /**
    * Used to test that a function throws a error matching the most recent snapshot when it is called.
    * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
    */
  def toThrowErrorMatchingInlineSnapshot(): R = js.native
  def toThrowErrorMatchingInlineSnapshot(snapshot: String): R = js.native
  
  /**
    * Used to test that a function throws a error matching the most recent snapshot when it is called.
    */
  def toThrowErrorMatchingSnapshot(): R = js.native
  def toThrowErrorMatchingSnapshot(snapshotName: String): R = js.native
}
