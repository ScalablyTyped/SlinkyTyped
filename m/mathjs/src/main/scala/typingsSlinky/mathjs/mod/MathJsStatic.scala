package typingsSlinky.mathjs.mod

import typingsSlinky.decimalJs.mod.Decimal
import typingsSlinky.mathjs.anon.Coefficients
import typingsSlinky.mathjs.anon.L
import typingsSlinky.mathjs.anon.Q
import typingsSlinky.mathjs.anon.R
import typingsSlinky.mathjs.anon.Simplify
import typingsSlinky.mathjs.mathjsBooleans.`false`
import typingsSlinky.mathjs.mathjsBooleans.`true`
import typingsSlinky.mathjs.mathjsStrings.asc
import typingsSlinky.mathjs.mathjsStrings.biased
import typingsSlinky.mathjs.mathjsStrings.dense
import typingsSlinky.mathjs.mathjsStrings.desc
import typingsSlinky.mathjs.mathjsStrings.natural
import typingsSlinky.mathjs.mathjsStrings.sparse
import typingsSlinky.mathjs.mathjsStrings.unbiased
import typingsSlinky.mathjs.mathjsStrings.uncorrected
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathJsStatic extends FactoryDependencies {
  
  var Infinity: Double = js.native
  
  var LN10: Double = js.native
  
  var LN2: Double = js.native
  
  var LOG10E: Double = js.native
  
  var LOG2E: Double = js.native
  
  var NaN: Double = js.native
  
  var SQRT1_2: Double = js.native
  
  var SQRT2: Double = js.native
  
  /*************************************************************************
    * Arithmetic functions
    ************************************************************************/
  /**
    * Calculate the absolute value of a number. For matrices, the function
    * is evaluated element wise.
    * @param x A number or matrix for which to get the absolute value
    * @returns Absolute value of x
    */
  def abs(x: Double): Double = js.native
  def abs(x: BigNumber): BigNumber = js.native
  def abs(x: Complex): Complex = js.native
  def abs(x: Fraction): Fraction = js.native
  def abs(x: MathArray): MathArray = js.native
  def abs(x: Matrix): Matrix = js.native
  def abs(x: Unit): Unit = js.native
  
  /*************************************************************************
    * Trigonometry functions
    ************************************************************************/
  /**
    * Calculate the inverse cosine of a value. For matrices, the function
    * is evaluated element wise.
    * @param x Function input
    * @returns The arc cosine of x
    */
  def acos(x: Double): Double = js.native
  def acos(x: BigNumber): BigNumber = js.native
  def acos(x: Complex): Complex = js.native
  def acos(x: MathArray): MathArray = js.native
  def acos(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the hyperbolic arccos of a value, defined as acosh(x) =
    * ln(sqrt(x^2 - 1) + x). For matrices, the function is evaluated
    * element wise.
    * @param x Function input
    * @returns The hyperbolic arccosine of x
    */
  def acosh(x: Double): Double = js.native
  def acosh(x: BigNumber): BigNumber = js.native
  def acosh(x: Complex): Complex = js.native
  def acosh(x: MathArray): MathArray = js.native
  def acosh(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the inverse cotangent of a value. For matrices, the
    * function is evaluated element wise.
    * @param x Function input
    * @returns The arc cotangent of x
    */
  def acot(x: Double): Double = js.native
  def acot(x: BigNumber): BigNumber = js.native
  def acot(x: MathArray): MathArray = js.native
  def acot(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the hyperbolic arccotangent of a value, defined as acoth(x)
    * = (ln((x+1)/x) + ln(x/(x-1))) / 2. For matrices, the function is
    * evaluated element wise.
    * @param x Function input
    * @returns The hyperbolic arccotangent of x
    */
  def acoth(x: Double): Double = js.native
  def acoth(x: BigNumber): BigNumber = js.native
  def acoth(x: MathArray): MathArray = js.native
  def acoth(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the inverse cosecant of a value. For matrices, the function
    * is evaluated element wise.
    * @param x Function input
    * @returns The arc cosecant of x
    */
  def acsc(x: Double): Double = js.native
  def acsc(x: BigNumber): BigNumber = js.native
  def acsc(x: MathArray): MathArray = js.native
  def acsc(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the hyperbolic arccosecant of a value, defined as acsch(x)
    * = ln(1/x + sqrt(1/x^2 + 1)). For matrices, the function is evaluated
    * element wise.
    * @param x Function input
    * @returns The hyperbolic arccosecant of x
    */
  def acsch(x: Double): Double = js.native
  def acsch(x: BigNumber): BigNumber = js.native
  def acsch(x: MathArray): MathArray = js.native
  def acsch(x: Matrix): Matrix = js.native
  
  /**
    * Add two values, x + y. For matrices, the function is evaluated
    * element wise.
    * @param x First value to add
    * @param y Second value to add
    * @returns Sum of x and y
    */
  def add(x: MathType, y: MathType): MathType = js.native
  
  /*************************************************************************
    * Logical functions
    ************************************************************************/
  /**
    * Logical and. Test whether two values are both defined with a
    * nonzero/nonempty value. For matrices, the function is evaluated
    * element wise.
    * @param x First value to and
    * @param y Second value to and
    * @returns Returns true when both inputs are defined with a
    * nonzero/nonempty value.
    */
  def and(x: Double, y: Double): Boolean | MathArray | Matrix = js.native
  def and(x: Double, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def and(x: Double, y: Complex): Boolean | MathArray | Matrix = js.native
  def and(x: Double, y: MathArray): Boolean | MathArray | Matrix = js.native
  def and(x: Double, y: Matrix): Boolean | MathArray | Matrix = js.native
  def and(x: Double, y: Unit): Boolean | MathArray | Matrix = js.native
  def and(x: BigNumber, y: Double): Boolean | MathArray | Matrix = js.native
  def and(x: BigNumber, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def and(x: BigNumber, y: Complex): Boolean | MathArray | Matrix = js.native
  def and(x: BigNumber, y: MathArray): Boolean | MathArray | Matrix = js.native
  def and(x: BigNumber, y: Matrix): Boolean | MathArray | Matrix = js.native
  def and(x: BigNumber, y: Unit): Boolean | MathArray | Matrix = js.native
  def and(x: Complex, y: Double): Boolean | MathArray | Matrix = js.native
  def and(x: Complex, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def and(x: Complex, y: Complex): Boolean | MathArray | Matrix = js.native
  def and(x: Complex, y: MathArray): Boolean | MathArray | Matrix = js.native
  def and(x: Complex, y: Matrix): Boolean | MathArray | Matrix = js.native
  def and(x: Complex, y: Unit): Boolean | MathArray | Matrix = js.native
  def and(x: MathArray, y: Double): Boolean | MathArray | Matrix = js.native
  def and(x: MathArray, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def and(x: MathArray, y: Complex): Boolean | MathArray | Matrix = js.native
  def and(x: MathArray, y: MathArray): Boolean | MathArray | Matrix = js.native
  def and(x: MathArray, y: Matrix): Boolean | MathArray | Matrix = js.native
  def and(x: MathArray, y: Unit): Boolean | MathArray | Matrix = js.native
  def and(x: Matrix, y: Double): Boolean | MathArray | Matrix = js.native
  def and(x: Matrix, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def and(x: Matrix, y: Complex): Boolean | MathArray | Matrix = js.native
  def and(x: Matrix, y: MathArray): Boolean | MathArray | Matrix = js.native
  def and(x: Matrix, y: Matrix): Boolean | MathArray | Matrix = js.native
  def and(x: Matrix, y: Unit): Boolean | MathArray | Matrix = js.native
  def and(x: Unit, y: Double): Boolean | MathArray | Matrix = js.native
  def and(x: Unit, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def and(x: Unit, y: Complex): Boolean | MathArray | Matrix = js.native
  def and(x: Unit, y: MathArray): Boolean | MathArray | Matrix = js.native
  def and(x: Unit, y: Matrix): Boolean | MathArray | Matrix = js.native
  def and(x: Unit, y: Unit): Boolean | MathArray | Matrix = js.native
  
  /*************************************************************************
    * Complex functions
    ************************************************************************/
  /**
    * Compute the argument of a complex value. For a complex number a + bi,
    * the argument is computed as atan2(b, a). For matrices, the function
    * is evaluated element wise.
    * @param x A complex number or array with complex numbers
    * @returns The argument of x
    */
  def arg(x: Double): Double = js.native
  def arg(x: BigNumber): BigNumber = js.native
  def arg(x: Complex): Double = js.native
  def arg(x: MathArray): MathArray = js.native
  def arg(x: Matrix): Matrix = js.native
  @JSName("arg")
  def arg_BigNumber(x: Complex): BigNumber = js.native
  
  /**
    * Calculate the inverse secant of a value. For matrices, the function
    * is evaluated element wise.
    * @param x Function input
    * @returns The arc secant of x
    */
  def asec(x: Double): Double = js.native
  def asec(x: BigNumber): BigNumber = js.native
  def asec(x: MathArray): MathArray = js.native
  def asec(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the hyperbolic arcsecant of a value, defined as asech(x) =
    * ln(sqrt(1/x^2 - 1) + 1/x). For matrices, the function is evaluated
    * element wise.
    * @param x Function input
    * @returns The hyperbolic arcsecant of x
    */
  def asech(x: Double): Double = js.native
  def asech(x: BigNumber): BigNumber = js.native
  def asech(x: MathArray): MathArray = js.native
  def asech(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the inverse sine of a value. For matrices, the function is
    * evaluated element wise.
    * @param x Function input
    * @returns The arc sine of x
    */
  def asin(x: Double): Double = js.native
  def asin(x: BigNumber): BigNumber = js.native
  def asin(x: Complex): Complex = js.native
  def asin(x: MathArray): MathArray = js.native
  def asin(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the hyperbolic arcsine of a value, defined as asinh(x) =
    * ln(x + sqrt(x^2 + 1)). For matrices, the function is evaluated
    * element wise.
    * @param x Function input
    * @returns The hyperbolic arcsine of x
    */
  def asinh(x: Double): Double = js.native
  def asinh(x: BigNumber): BigNumber = js.native
  def asinh(x: MathArray): MathArray = js.native
  def asinh(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the inverse tangent of a value. For matrices, the function
    * is evaluated element wise.
    * @param x Function input
    * @returns The arc tangent of x
    */
  def atan(x: Double): Double = js.native
  def atan(x: BigNumber): BigNumber = js.native
  def atan(x: MathArray): MathArray = js.native
  def atan(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the inverse tangent function with two arguments, y/x. By
    * providing two arguments, the right quadrant of the computed angle can
    * be determined. For matrices, the function is evaluated element wise.
    * @param x Function input
    * @returns Four quadrant inverse tangent
    */
  def atan2(y: Double, x: Double): Double = js.native
  def atan2(y: MathArray, x: MathArray): MathArray | Matrix = js.native
  def atan2(y: MathArray, x: Matrix): MathArray | Matrix = js.native
  def atan2(y: Matrix, x: MathArray): MathArray | Matrix = js.native
  def atan2(y: Matrix, x: Matrix): MathArray | Matrix = js.native
  
  /**
    * Calculate the hyperbolic arctangent of a value, defined as atanh(x) =
    * ln((1 + x)/(1 - x)) / 2. For matrices, the function is evaluated
    * element wise.
    * @param x Function input
    * @returns The hyperbolic arctangent of x
    */
  def atanh(x: Double): Double = js.native
  def atanh(x: BigNumber): BigNumber = js.native
  def atanh(x: MathArray): MathArray = js.native
  def atanh(x: Matrix): Matrix = js.native
  
  /*************************************************************************
    * Combinatorics functions
    ************************************************************************/
  /**
    * The Bell Numbers count the number of partitions of a set. A partition
    * is a pairwise disjoint subset of S whose union is S. bellNumbers only
    * takes integer arguments. The following condition must be enforced: n
    * >= 0
    * @param n Total number of objects in the set
    * @returns B(n)
    */
  def bellNumbers(n: Double): Double = js.native
  def bellNumbers(n: BigNumber): BigNumber = js.native
  
  /*************************************************************************
    * Construction functions
    ************************************************************************/
  /**
    * Create a BigNumber, which can store numbers with arbitrary precision.
    * When a matrix is provided, all elements will be converted to
    * BigNumber.
    * @param x Value for the big number, 0 by default.
    * @returns The created bignumber
    */
  def bignumber(): BigNumber = js.native
  def bignumber(x: String): BigNumber = js.native
  def bignumber(x: Boolean): BigNumber = js.native
  def bignumber(x: Double): BigNumber = js.native
  def bignumber(x: BigNumber): BigNumber = js.native
  def bignumber(x: Fraction): BigNumber = js.native
  def bignumber(x: MathArray): BigNumber = js.native
  def bignumber(x: Matrix): BigNumber = js.native
  
  def bitAnd(x: js.Array[js.Array[Double] | Double], y: Double): NoLiteralType[js.Array[Double]] = js.native
  def bitAnd(x: js.Array[js.Array[Double] | Double], y: BigNumber): NoLiteralType[js.Array[Double]] = js.native
  def bitAnd(x: js.Array[js.Array[Double] | Double], y: MathArray): NoLiteralType[js.Array[Double]] = js.native
  def bitAnd(x: js.Array[js.Array[Double] | Double], y: Matrix): NoLiteralType[js.Array[Double]] = js.native
  /*************************************************************************
    * Bitwise functions
    ************************************************************************/
  /**
    * Bitwise AND two values, x & y. For matrices, the function is
    * evaluated element wise.
    * @param x First value to and
    * @param y Second value to and
    * @returns AND of x and y
    */
  def bitAnd(x: Double, y: Double): NoLiteralType[Double] = js.native
  def bitAnd(x: Double, y: BigNumber): NoLiteralType[Double] = js.native
  def bitAnd(x: Double, y: MathArray): NoLiteralType[Double] = js.native
  def bitAnd(x: Double, y: Matrix): NoLiteralType[Double] = js.native
  def bitAnd(x: Decimal, y: Double): NoLiteralType[Decimal] = js.native
  def bitAnd(x: Decimal, y: BigNumber): NoLiteralType[Decimal] = js.native
  def bitAnd(x: Decimal, y: MathArray): NoLiteralType[Decimal] = js.native
  def bitAnd(x: Decimal, y: Matrix): NoLiteralType[Decimal] = js.native
  def bitAnd(x: Matrix, y: Double): NoLiteralType[Matrix] = js.native
  def bitAnd(x: Matrix, y: BigNumber): NoLiteralType[Matrix] = js.native
  def bitAnd(x: Matrix, y: MathArray): NoLiteralType[Matrix] = js.native
  def bitAnd(x: Matrix, y: Matrix): NoLiteralType[Matrix] = js.native
  
  /**
    * Bitwise NOT value, ~x. For matrices, the function is evaluated
    * element wise. For units, the function is evaluated on the best prefix
    * base.
    * @param x Value to not
    * @returns NOT of x
    */
  def bitNot(x: Double): Double = js.native
  def bitNot(x: BigNumber): BigNumber = js.native
  def bitNot(x: MathArray): MathArray = js.native
  def bitNot(x: Matrix): Matrix = js.native
  
  /**
    * Bitwise OR two values, x | y. For matrices, the function is evaluated
    * element wise. For units, the function is evaluated on the lowest
    * print base.
    * @param x First value to or
    * @param y Second value to or
    * @returns OR of x and y
    */
  def bitOr(x: Double, y: Double): Double = js.native
  def bitOr(x: BigNumber, y: BigNumber): BigNumber = js.native
  def bitOr(x: MathArray, y: MathArray): MathArray = js.native
  def bitOr(x: Matrix, y: Matrix): Matrix = js.native
  
  def bitXor(x: js.Array[js.Array[Double] | Double], y: Double): NoLiteralType[js.Array[Double]] = js.native
  def bitXor(x: js.Array[js.Array[Double] | Double], y: BigNumber): NoLiteralType[js.Array[Double]] = js.native
  def bitXor(x: js.Array[js.Array[Double] | Double], y: MathArray): NoLiteralType[js.Array[Double]] = js.native
  def bitXor(x: js.Array[js.Array[Double] | Double], y: Matrix): NoLiteralType[js.Array[Double]] = js.native
  /**
    * Bitwise XOR two values, x ^ y. For matrices, the function is
    * evaluated element wise.
    * @param x First value to xor
    * @param y Second value to xor
    * @returns XOR of x and y
    */
  def bitXor(x: Double, y: Double): NoLiteralType[Double] = js.native
  def bitXor(x: Double, y: BigNumber): NoLiteralType[Double] = js.native
  def bitXor(x: Double, y: MathArray): NoLiteralType[Double] = js.native
  def bitXor(x: Double, y: Matrix): NoLiteralType[Double] = js.native
  def bitXor(x: Decimal, y: Double): NoLiteralType[Decimal] = js.native
  def bitXor(x: Decimal, y: BigNumber): NoLiteralType[Decimal] = js.native
  def bitXor(x: Decimal, y: MathArray): NoLiteralType[Decimal] = js.native
  def bitXor(x: Decimal, y: Matrix): NoLiteralType[Decimal] = js.native
  def bitXor(x: Matrix, y: Double): NoLiteralType[Matrix] = js.native
  def bitXor(x: Matrix, y: BigNumber): NoLiteralType[Matrix] = js.native
  def bitXor(x: Matrix, y: MathArray): NoLiteralType[Matrix] = js.native
  def bitXor(x: Matrix, y: Matrix): NoLiteralType[Matrix] = js.native
  
  /**
    * Create a boolean or convert a string or number to a boolean. In case
    * of a number, true is returned for non-zero numbers, and false in case
    * of zero. Strings can be 'true' or 'false', or can contain a number.
    * When value is a matrix, all elements will be converted to boolean.
    * @param x A value of any type
    * @returns The boolean value
    */
  def boolean(): Boolean | MathArray | Matrix = js.native
  def boolean(x: String): Boolean | MathArray | Matrix = js.native
  def boolean(x: Boolean): Boolean | MathArray | Matrix = js.native
  def boolean(x: Double): Boolean | MathArray | Matrix = js.native
  def boolean(x: MathArray): Boolean | MathArray | Matrix = js.native
  def boolean(x: Matrix): Boolean | MathArray | Matrix = js.native
  
  /**
    * The Catalan Numbers enumerate combinatorial structures of many
    * different types. catalan only takes integer arguments. The following
    * condition must be enforced: n >= 0
    * @param n nth Catalan number
    * @returns Cn(n)
    */
  def catalan(n: Double): Double = js.native
  def catalan(n: BigNumber): BigNumber = js.native
  
  /**
    * Calculate the cubic root of a value. For matrices, the function is
    * evaluated element wise.
    * @param x Value for which to calculate the cubic root.
    * @param allRoots Optional, false by default. Only applicable when x is
    * a number or complex number. If true, all complex roots are returned,
    * if false (default) the principal root is returned.
    * @returns Returns the cubic root of x
    */
  def cbrt(x: Double): Double = js.native
  def cbrt(x: Double, allRoots: Boolean): Double = js.native
  def cbrt(x: BigNumber): BigNumber = js.native
  def cbrt(x: BigNumber, allRoots: Boolean): BigNumber = js.native
  def cbrt(x: Complex): Complex = js.native
  def cbrt(x: Complex, allRoots: Boolean): Complex = js.native
  def cbrt(x: Fraction): Fraction = js.native
  def cbrt(x: Fraction, allRoots: Boolean): Fraction = js.native
  def cbrt(x: MathArray): MathArray = js.native
  def cbrt(x: MathArray, allRoots: Boolean): MathArray = js.native
  def cbrt(x: Matrix): Matrix = js.native
  def cbrt(x: Matrix, allRoots: Boolean): Matrix = js.native
  def cbrt(x: Unit): Unit = js.native
  def cbrt(x: Unit, allRoots: Boolean): Unit = js.native
  
  /**
    * Round a value towards plus infinity If x is complex, both real and
    * imaginary part are rounded towards plus infinity. For matrices, the
    * function is evaluated element wise.
    * @param x Number to be rounded
    * @returns Rounded value
    */
  def ceil(x: Double): Double = js.native
  def ceil(x: BigNumber): BigNumber = js.native
  def ceil(x: Complex): Complex = js.native
  def ceil(x: Fraction): Fraction = js.native
  def ceil(x: MathArray): MathArray = js.native
  def ceil(x: Matrix): Matrix = js.native
  def ceil(x: Unit): Unit = js.native
  
  /**
    * Wrap any value in a chain, allowing to perform chained operations on
    * the value. All methods available in the math.js library can be called
    * upon the chain, and then will be evaluated with the value itself as
    * first argument. The chain can be closed by executing chain.done(),
    * which returns the final value. The chain has a number of special
    * functions: done() Finalize the chain and return the chain's value.
    * valueOf() The same as done() toString() Executes math.format() onto
    * the chain's value, returning a string representation of the value.
    * @param value A value of any type on which to start a chained
    * operation.
    * @returns The created chain
    */
  def chain(): MathJsChain = js.native
  def chain(value: js.Any): MathJsChain = js.native
  
  /*************************************************************************
    * Utils functions
    ************************************************************************/
  /**
    * Clone an object.
    * @param x Object to be cloned
    * @returns A clone of object x
    */
  def clone(x: js.Any): js.Any = js.native
  
  /*************************************************************************
    * Probability functions
    ************************************************************************/
  /**
    * Compute the number of ways of picking k unordered outcomes from n
    * possibilities. Combinations only takes integer arguments. The
    * following condition must be enforced: k <= n.
    * @param n Total number of objects in the set
    * @param k Number of objects in the subset
    * @returns Number of possible combinations
    */
  def combinations(n: Double, k: Double): NoLiteralType[Double] = js.native
  def combinations(n: Double, k: BigNumber): NoLiteralType[Double] = js.native
  def combinations(n: Decimal, k: Double): NoLiteralType[Decimal] = js.native
  def combinations(n: Decimal, k: BigNumber): NoLiteralType[Decimal] = js.native
  
  def compare(x: String, y: String): Double | BigNumber | Fraction | MathArray | Matrix = js.native
  def compare(x: String, y: MathType): Double | BigNumber | Fraction | MathArray | Matrix = js.native
  def compare(x: MathType, y: String): Double | BigNumber | Fraction | MathArray | Matrix = js.native
  /*************************************************************************
    * Relational functions
    ************************************************************************/
  /**
    * Compare two values. Returns 1 when x > y, -1 when x < y, and 0 when x
    * == y. x and y are considered equal when the relative difference
    * between x and y is smaller than the configured epsilon. The function
    * cannot be used to compare values smaller than approximately 2.22e-16.
    * For matrices, the function is evaluated element wise.
    * @param x First value to compare
    * @param y Second value to compare
    * @returns Returns the result of the comparison: 1 when x > y, -1 when
    * x < y, and 0 when x == y.
    */
  def compare(x: MathType, y: MathType): Double | BigNumber | Fraction | MathArray | Matrix = js.native
  
  /**
    * Compare two values of any type in a deterministic, natural way. For
    * numeric values, the function works the same as math.compare. For
    * types of values that can’t be compared mathematically, the function
    * compares in a natural way.
    * @param x First value to compare
    * @param y Second value to compare
    * @returns Returns the result of the comparison: 1 when x > y, -1 when
    * x < y, and 0 when x == y.
    */
  def compareNatural(x: js.Any, y: js.Any): Double = js.native
  
  /**
    * Compare two strings lexically. Comparison is case sensitive. Returns
    * 1 when x > y, -1 when x < y, and 0 when x == y. For matrices, the
    * function is evaluated element wise.
    * @param x First string to compare
    * @param y Second string to compare
    * @returns Returns the result of the comparison: 1 when x > y, -1 when
    * x < y, and 0 when x == y.
    */
  def compareText(x: String, y: String): Double | MathArray | Matrix = js.native
  def compareText(x: String, y: MathArray): Double | MathArray | Matrix = js.native
  def compareText(x: String, y: Matrix): Double | MathArray | Matrix = js.native
  def compareText(x: MathArray, y: String): Double | MathArray | Matrix = js.native
  def compareText(x: MathArray, y: MathArray): Double | MathArray | Matrix = js.native
  def compareText(x: MathArray, y: Matrix): Double | MathArray | Matrix = js.native
  def compareText(x: Matrix, y: String): Double | MathArray | Matrix = js.native
  def compareText(x: Matrix, y: MathArray): Double | MathArray | Matrix = js.native
  def compareText(x: Matrix, y: Matrix): Double | MathArray | Matrix = js.native
  
  /**
    * @param exprs The expressions to be compiled
    * @returns An array of objects with the compiled expressions
    */
  def compile(exprs: js.Array[MathExpression]): js.Array[EvalFunction] = js.native
  /*************************************************************************
    * Expression functions
    ************************************************************************/
  /**
    * Parse and compile an expression. Returns a an object with a function
    * evaluate([scope]) to evaluate the compiled expression.
    * @param expr The expression to be compiled
    * @returns An object with the compiled expression
    */
  def compile(expr: MathExpression): EvalFunction = js.native
  
  def complex(): MathArray | Matrix = js.native
  def complex(arg: String): Complex = js.native
  def complex(arg: Complex): Complex = js.native
  def complex(arg: MathArray): MathArray | Matrix = js.native
  def complex(arg: Matrix): MathArray | Matrix = js.native
  def complex(arg: PolarCoordinates): Complex = js.native
  /**
    * @param re Argument specifying the real part of the complex number
    * @param im Argument specifying the imaginary part of the complex
    * number
    * @returns Returns a complex value
    */
  def complex(re: Double, im: Double): Complex = js.native
  /**
    * Create a complex value or convert a value to a complex value.
    * @param args Arguments specifying the real and imaginary part of the
    * complex number
    * @returns Returns a complex value
    */
  @JSName("complex")
  def complex_Complex(): Complex = js.native
  
  /**
    * The composition counts of n into k parts. Composition only takes
    * integer arguments. The following condition must be enforced: k <= n.
    * @param n Total number of objects in the set
    * @param k Number of objects in the subset
    * @returns Returns the composition counts of n into k parts.
    */
  def composition(n: Double, k: Double): NoLiteralType[Double] = js.native
  def composition(n: Double, k: BigNumber): NoLiteralType[Double] = js.native
  def composition(n: Decimal, k: Double): NoLiteralType[Decimal] = js.native
  def composition(n: Decimal, k: BigNumber): NoLiteralType[Decimal] = js.native
  
  /*************************************************************************
    * Matrix functions
    ************************************************************************/
  /**
    * Concatenate two or more matrices. dim: number is a zero-based
    * dimension over which to concatenate the matrices. By default the last
    * dimension of the matrices.
    * @param args Two or more matrices
    * @returns Concatenated matrix
    */
  def concat(args: (MathArray | Matrix)*): MathArray | Matrix = js.native
  
  /*************************************************************************
    * Core functions
    ************************************************************************/
  /**
    * Set configuration options for math.js, and get current options. Will
    * emit a ‘config’ event, with arguments (curr, prev, changes).
    * @param options Available options: {number} epsilon Minimum relative
    * difference between two compared values, used by all comparison
    * functions. {string} matrix A string ‘Matrix’ (default) or ‘Array’.
    * {string} number A string ‘number’ (default), ‘BigNumber’, or
    * ‘Fraction’ {number} precision The number of significant digits for
    * BigNumbers. Not applicable for Numbers. {string} parenthesis How to
    * display parentheses in LaTeX and string output. {string} randomSeed
    * Random seed for seeded pseudo random number generator. Set to null to
    * randomly seed.
    * @returns Returns the current configuration
    */
  def config(options: ConfigOptions): ConfigOptions = js.native
  
  def conj(x: js.Array[js.Array[Double] | Double]): NoLiteralType[js.Array[Double]] = js.native
  /**
    * Compute the complex conjugate of a complex value. If x = a+bi, the
    * complex conjugate of x is a - bi. For matrices, the function is
    * evaluated element wise.
    * @param x A complex number or array with complex numbers
    * @returns The complex conjugate of x
    */
  def conj(x: Double): NoLiteralType[Double] = js.native
  def conj(x: Decimal): NoLiteralType[Decimal] = js.native
  def conj(x: Complex): NoLiteralType[Complex] = js.native
  def conj(x: Matrix): NoLiteralType[Matrix] = js.native
  
  /**
    * Calculate the cosine of a value. For matrices, the function is
    * evaluated element wise.
    * @param x Function input
    * @returns The cosine of x
    */
  def cos(x: Double): Double = js.native
  def cos(x: BigNumber): BigNumber = js.native
  def cos(x: Complex): Complex = js.native
  def cos(x: MathArray): MathArray = js.native
  def cos(x: Matrix): Matrix = js.native
  def cos(x: Unit): Double = js.native
  
  /**
    * Calculate the hyperbolic cosine of a value, defined as cosh(x) = 1/2
    * * (exp(x) + exp(-x)). For matrices, the function is evaluated element
    * wise.
    * @param x Function input
    * @returns The hyperbolic cosine of x
    */
  def cosh(x: Double): Double = js.native
  def cosh(x: BigNumber): BigNumber = js.native
  def cosh(x: Complex): Complex = js.native
  def cosh(x: MathArray): MathArray = js.native
  def cosh(x: Matrix): Matrix = js.native
  def cosh(x: Unit): Double = js.native
  
  /**
    * Calculate the cotangent of a value. cot(x) is defined as 1 / tan(x).
    * For matrices, the function is evaluated element wise.
    * @param x Function input
    * @returns The cotangent of x
    */
  def cot(x: Double): Double = js.native
  def cot(x: Complex): Complex = js.native
  def cot(x: MathArray): MathArray = js.native
  def cot(x: Matrix): Matrix = js.native
  def cot(x: Unit): Double = js.native
  
  /**
    * Calculate the hyperbolic cotangent of a value, defined as coth(x) = 1
    * / tanh(x). For matrices, the function is evaluated element wise.
    * @param x Function input
    * @returns The hyperbolic cotangent of x
    */
  def coth(x: Double): Double = js.native
  def coth(x: Complex): Complex = js.native
  def coth(x: MathArray): MathArray = js.native
  def coth(x: Matrix): Matrix = js.native
  def coth(x: Unit): Double = js.native
  
  /**
    * Create a user-defined unit and register it with the Unit type.
    * @param name The name of the new unit. Must be unique. Example: ‘knot’
    * @param definition Definition of the unit in terms of existing units.
    * For example, ‘0.514444444 m / s’.
    * @param options (optional) An object containing any of the following
    * properties:</br>- prefixes {string} “none”, “short”, “long”,
    * “binary_short”, or “binary_long”. The default is “none”.</br>-
    * aliases {Array} Array of strings. Example: [‘knots’, ‘kt’,
    * ‘kts’]</br>- offset {Numeric} An offset to apply when converting from
    * the unit. For example, the offset for celsius is 273.15. Default is
    * 0.
    * @returns The new unit
    */
  def createUnit(name: String): Unit = js.native
  def createUnit(name: String, definition: js.UndefOr[scala.Nothing], options: CreateUnitOptions): Unit = js.native
  def createUnit(name: String, definition: String): Unit = js.native
  def createUnit(name: String, definition: String, options: CreateUnitOptions): Unit = js.native
  def createUnit(name: String, definition: UnitDefinition): Unit = js.native
  def createUnit(name: String, definition: UnitDefinition, options: CreateUnitOptions): Unit = js.native
  /**
    * Create a user-defined unit and register it with the Unit type.
    * @param units Definition of the unit
    * @param options
    * @returns The new unit
    */
  def createUnit(units: Record[String, String | UnitDefinition]): Unit = js.native
  def createUnit(units: Record[String, String | UnitDefinition], options: CreateUnitOptions): Unit = js.native
  
  /**
    * Calculate the cross product for two vectors in three dimensional
    * space. The cross product of A = [a1, a2, a3] and B =[b1, b2, b3] is
    * defined as: cross(A, B) = [ a2 * b3 - a3 * b2, a3 * b1 - a1 * b3, a1
    * * b2 - a2 * b1 ]
    * @param x First vector
    * @param y Second vector
    * @returns Returns the cross product of x and y
    */
  def cross(x: MathArray, y: MathArray): Matrix | MathArray = js.native
  def cross(x: MathArray, y: Matrix): Matrix | MathArray = js.native
  def cross(x: Matrix, y: MathArray): Matrix | MathArray = js.native
  def cross(x: Matrix, y: Matrix): Matrix | MathArray = js.native
  
  /**
    * Calculate the cosecant of a value, defined as csc(x) = 1/sin(x). For
    * matrices, the function is evaluated element wise.
    * @param x Function input
    * @returns The cosecant hof x
    */
  def csc(x: Double): Double = js.native
  def csc(x: Complex): Complex = js.native
  def csc(x: MathArray): MathArray = js.native
  def csc(x: Matrix): Matrix = js.native
  def csc(x: Unit): Double = js.native
  
  /**
    * Calculate the hyperbolic cosecant of a value, defined as csch(x) = 1
    * / sinh(x). For matrices, the function is evaluated element wise.
    * @param x Function input
    * @returns The hyperbolic cosecant of x
    */
  def csch(x: Double): Double = js.native
  def csch(x: Complex): Complex = js.native
  def csch(x: MathArray): MathArray = js.native
  def csch(x: Matrix): Matrix = js.native
  def csch(x: Unit): Double = js.native
  
  /**
    * Compute the cube of a value, x * x * x. For matrices, the function is
    * evaluated element wise.
    * @param x Number for which to calculate the cube
    * @returns Cube of x
    */
  def cube(x: Double): Double = js.native
  def cube(x: BigNumber): BigNumber = js.native
  def cube(x: Complex): Complex = js.native
  def cube(x: Fraction): Fraction = js.native
  def cube(x: MathArray): MathArray = js.native
  def cube(x: Matrix): Matrix = js.native
  def cube(x: Unit): Unit = js.native
  
  /**
    * Test element wise whether two matrices are equal. The function
    * accepts both matrices and scalar values.
    * @param x First matrix to compare
    * @param y Second amtrix to compare
    * @returns Returns true when the input matrices have the same size and
    * each of their elements is equal.
    */
  def deepEqual(x: MathType, y: MathType): Double | BigNumber | Fraction | Complex | Unit | MathArray | Matrix = js.native
  
  def derivative(expr: String, variable: String): MathNode = js.native
  def derivative(expr: String, variable: String, options: Simplify): MathNode = js.native
  def derivative(expr: String, variable: MathNode): MathNode = js.native
  def derivative(expr: String, variable: MathNode, options: Simplify): MathNode = js.native
  def derivative(expr: MathNode, variable: String): MathNode = js.native
  def derivative(expr: MathNode, variable: String, options: Simplify): MathNode = js.native
  /*************************************************************************
    * Algebra functions
    ************************************************************************/
  /**
    * @param expr The expression to differentiate
    * @param variable The variable over which to differentiate
    * @param options There is one option available, simplify, which is true
    * by default. When false, output will not be simplified.
    * @returns The derivative of expr
    */
  def derivative(expr: MathNode, variable: MathNode): MathNode = js.native
  def derivative(expr: MathNode, variable: MathNode, options: Simplify): MathNode = js.native
  
  /**
    * Calculate the determinant of a matrix.
    * @param x A Matrix
    * @returns the determinant of x
    */
  def det(x: MathArray): Double = js.native
  def det(x: Matrix): Double = js.native
  
  /**
    * Create a diagonal matrix or retrieve the diagonal of a matrix. When x
    * is a vector, a matrix with vector x on the diagonal will be returned.
    * When x is a two dimensional matrix, the matrixes kth diagonal will be
    * returned as vector. When k is positive, the values are placed on the
    * super diagonal. When k is negative, the values are placed on the sub
    * diagonal.
    * @param X A two dimensional matrix or a vector
    * @param k The diagonal where the vector will be filled in or
    * retrieved. Default value: 0.
    * @param format The matrix storage format. Default value: 'dense'.
    * @returns Diagonal matrix from input vector, or diagonal from input
    * matrix
    */
  def diag(X: MathArray): Matrix = js.native
  def diag(X: MathArray, format: String): Matrix = js.native
  def diag(X: MathArray, k: Double): Matrix | MathArray = js.native
  def diag(X: MathArray, k: Double, format: String): Matrix | MathArray = js.native
  def diag(X: MathArray, k: BigNumber): Matrix | MathArray = js.native
  def diag(X: MathArray, k: BigNumber, format: String): Matrix | MathArray = js.native
  def diag(X: Matrix): Matrix = js.native
  def diag(X: Matrix, format: String): Matrix = js.native
  def diag(X: Matrix, k: Double): Matrix | MathArray = js.native
  def diag(X: Matrix, k: Double, format: String): Matrix | MathArray = js.native
  def diag(X: Matrix, k: BigNumber): Matrix | MathArray = js.native
  def diag(X: Matrix, k: BigNumber, format: String): Matrix | MathArray = js.native
  
  def distance(x: js.Object, y: js.Object): Double | BigNumber = js.native
  def distance(x: js.Object, y: MathArray): Double | BigNumber = js.native
  def distance(x: js.Object, y: Matrix): Double | BigNumber = js.native
  def distance(x: MathArray, y: js.Object): Double | BigNumber = js.native
  /*************************************************************************
    * Geometry functions
    ************************************************************************/
  /**
    * Calculates: The eucledian distance between two points in 2 and 3
    * dimensional spaces. Distance between point and a line in 2 and 3
    * dimensional spaces. Pairwise distance between a set of 2D or 3D
    * points NOTE: When substituting coefficients of a line(a, b and c),
    * use ax + by + c = 0 instead of ax + by = c For parametric equation of
    * a 3D line, x0, y0, z0, a, b, c are from: (x−x0, y−y0, z−z0) = t(a, b,
    * c)
    * @param x Coordinates of the first point
    * @param y Coordinates of the second point
    * @returns Returns the distance from two/three points
    */
  def distance(x: MathArray, y: MathArray): Double | BigNumber = js.native
  def distance(x: MathArray, y: Matrix): Double | BigNumber = js.native
  def distance(x: Matrix, y: js.Object): Double | BigNumber = js.native
  def distance(x: Matrix, y: MathArray): Double | BigNumber = js.native
  def distance(x: Matrix, y: Matrix): Double | BigNumber = js.native
  
  def divide(x: Double, y: Double): Double = js.native
  def divide(x: MathType, y: MathType): MathType = js.native
  /**
    * Divide two values, x / y. To divide matrices, x is multiplied with
    * the inverse of y: x * inv(y).
    * @param x Numerator
    * @param y Denominator
    * @returns Quotient, x / y
    */
  def divide(x: Unit, y: Unit): Unit = js.native
  
  /**
    * Calculate the dot product of two vectors. The dot product of A = [a1,
    * a2, a3, ..., an] and B = [b1, b2, b3, ..., bn] is defined as: dot(A,
    * B) = a1 * b1 + a2 * b2 + a3 * b3 + ... + an * bn
    * @param x First vector
    * @param y Second vector
    * @returns Returns the dot product of x and y
    */
  def dot(x: MathArray, y: MathArray): Double = js.native
  def dot(x: MathArray, y: Matrix): Double = js.native
  def dot(x: Matrix, y: MathArray): Double = js.native
  def dot(x: Matrix, y: Matrix): Double = js.native
  
  /**
    * Divide two matrices element wise. The function accepts both matrices
    * and scalar values.
    * @param x Numerator
    * @param y Denominator
    * @returns Quotient, x ./ y
    */
  def dotDivide(x: MathType, y: MathType): MathType = js.native
  
  /**
    * Multiply two matrices element wise. The function accepts both
    * matrices and scalar values.
    * @param x Left hand value
    * @param y Right hand value
    * @returns Multiplication of x and y
    */
  def dotMultiply(x: MathType, y: MathType): MathType = js.native
  
  /**
    * Calculates the power of x to y element wise.
    * @param x The base
    * @param y The exponent
    * @returns The value of x to the power y
    */
  def dotPow(x: MathType, y: MathType): MathType = js.native
  
  var e: Double = js.native
  
  def equal(x: String, y: String): Boolean | MathArray | Matrix = js.native
  def equal(x: String, y: MathType): Boolean | MathArray | Matrix = js.native
  def equal(x: MathType, y: String): Boolean | MathArray | Matrix = js.native
  /**
    * Test whether two values are equal.
    *
    * The function tests whether the relative difference between x and y is
    * smaller than the configured epsilon. The function cannot be used to
    * compare values smaller than approximately 2.22e-16. For matrices, the
    * function is evaluated element wise. In case of complex numbers, x.re
    * must equal y.re, and x.im must equal y.im. Values null and undefined
    * are compared strictly, thus null is only equal to null and nothing
    * else, and undefined is only equal to undefined and nothing else.
    * @param x First value to compare
    * @param y Second value to compare
    * @returns Returns true when the compared values are equal, else
    * returns false
    */
  def equal(x: MathType, y: MathType): Boolean | MathArray | Matrix = js.native
  
  /**
    * Check equality of two strings. Comparison is case sensitive. For
    * matrices, the function is evaluated element wise.
    * @param x First string to compare
    * @param y Second string to compare
    * @returns Returns true if the values are equal, and false if not.
    */
  def equalText(x: String, y: String): Double | MathArray | Matrix = js.native
  def equalText(x: String, y: MathArray): Double | MathArray | Matrix = js.native
  def equalText(x: String, y: Matrix): Double | MathArray | Matrix = js.native
  def equalText(x: MathArray, y: String): Double | MathArray | Matrix = js.native
  def equalText(x: MathArray, y: MathArray): Double | MathArray | Matrix = js.native
  def equalText(x: MathArray, y: Matrix): Double | MathArray | Matrix = js.native
  def equalText(x: Matrix, y: String): Double | MathArray | Matrix = js.native
  def equalText(x: Matrix, y: MathArray): Double | MathArray | Matrix = js.native
  def equalText(x: Matrix, y: Matrix): Double | MathArray | Matrix = js.native
  
  def erf(x: js.Array[js.Array[Double] | Double]): NoLiteralType[js.Array[Double]] = js.native
  /*************************************************************************
    * Special functions
    ************************************************************************/
  /**
    * Compute the erf function of a value using a rational Chebyshev
    * approximations for different intervals of x.
    * @param x A real number
    * @returns The erf of x
    */
  def erf(x: Double): NoLiteralType[Double] = js.native
  def erf(x: Matrix): NoLiteralType[Matrix] = js.native
  
  def evaluate(expr: js.Array[MathExpression]): js.Any = js.native
  def evaluate(expr: js.Array[MathExpression], scope: js.Object): js.Any = js.native
  /**
    * Evaluate an expression.
    * @param expr The expression to be evaluated
    * @param scope Scope to read/write variables
    * @returns The result of the expression
    */
  def evaluate(expr: MathExpression): js.Any = js.native
  def evaluate(expr: MathExpression, scope: js.Object): js.Any = js.native
  def evaluate(expr: Matrix): js.Any = js.native
  def evaluate(expr: Matrix, scope: js.Object): js.Any = js.native
  
  /**
    * Calculate the exponent of a value. For matrices, the function is
    * evaluated element wise.
    * @param x A number or matrix to exponentiate
    * @returns Exponent of x
    */
  def exp(x: Double): Double = js.native
  def exp(x: BigNumber): BigNumber = js.native
  def exp(x: Complex): Complex = js.native
  def exp(x: MathArray): MathArray = js.native
  def exp(x: Matrix): Matrix = js.native
  
  /**
    * Compute the matrix exponential, expm(A) = e^A. The matrix must be
    * square. Not to be confused with exp(a), which performs element-wise
    * exponentiation. The exponential is calculated using the Padé
    * approximant with scaling and squaring; see “Nineteen Dubious Ways to
    * Compute the Exponential of a Matrix,” by Moler and Van Loan.
    * @param x A square matrix
    * @returns The exponential of x
    */
  def expm(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the value of subtracting 1 from the exponential value. For
    * matrices, the function is evaluated element wise.
    * @param x A number or matrix to apply expm1
    * @returns Exponent of x
    */
  def expm1(x: Double): Double = js.native
  def expm1(x: BigNumber): BigNumber = js.native
  def expm1(x: Complex): Complex = js.native
  def expm1(x: MathArray): MathArray = js.native
  def expm1(x: Matrix): Matrix = js.native
  
  var expression: MathNode = js.native
  
  def factorial(n: js.Array[js.Array[Double] | Double]): NoLiteralType[js.Array[Double]] = js.native
  /**
    * Compute the factorial of a value Factorial only supports an integer
    * value as argument. For matrices, the function is evaluated element
    * wise.
    * @param n An integer number
    * @returns The factorial of n
    */
  def factorial(n: Double): NoLiteralType[Double] = js.native
  def factorial(n: Decimal): NoLiteralType[Decimal] = js.native
  def factorial(n: Matrix): NoLiteralType[Matrix] = js.native
  
  def filter(
    x: js.Array[String] | MathArray,
    test: js.Function3[/* value */ js.Any, /* index */ js.Any, js.Array[String] | MathArray | Matrix, Boolean]
  ): Matrix | MathArray = js.native
  def filter(x: js.Array[String] | MathArray, test: js.RegExp): Matrix | MathArray = js.native
  /**
    * Filter the items in an array or one dimensional matrix.
    * @param x A one dimensional matrix or array to filter
    * @param test A function or regular expression to test items. All
    * entries for which test returns true are returned. When test is a
    * function, it is invoked with three parameters: the value of the
    * element, the index of the element, and the matrix/array being
    * traversed. The function must return a boolean.
    */
  def filter(
    x: Matrix,
    test: js.Function3[
      /* value */ js.Any, 
      /* index */ js.Any, 
      /* matrix */ Matrix | MathArray | js.Array[String], 
      Boolean
    ]
  ): Matrix | MathArray = js.native
  def filter(x: Matrix, test: js.RegExp): Matrix | MathArray = js.native
  
  /**
    * Round a value towards zero. For matrices, the function is evaluated
    * element wise.
    * @param x Number to be rounded
    * @returns Rounded value
    */
  def fix(x: Double): Double = js.native
  def fix(x: BigNumber): BigNumber = js.native
  def fix(x: Complex): Complex = js.native
  def fix(x: Fraction): Fraction = js.native
  def fix(x: MathArray): MathArray = js.native
  def fix(x: Matrix): Matrix = js.native
  
  /**
    * Flatten a multi dimensional matrix into a single dimensional matrix.
    * @param x Matrix to be flattened
    * @returns Returns the flattened matrix
    */
  def flatten(x: js.Array[js.Array[Double] | Double]): js.Array[Double] = js.native
  def flatten(x: Matrix): Matrix = js.native
  
  /**
    * Round a value towards minus infinity. For matrices, the function is
    * evaluated element wise.
    * @param Number to be rounded
    * @returns Rounded value
    */
  def floor(x: Double): Double = js.native
  def floor(x: BigNumber): BigNumber = js.native
  def floor(x: Complex): Complex = js.native
  def floor(x: Fraction): Fraction = js.native
  def floor(x: MathArray): MathArray = js.native
  def floor(x: Matrix): Matrix = js.native
  
  def forEach(
    x: js.Array[js.Array[Double] | Double],
    callback: js.Function3[
      /* value */ js.Any, 
      /* index */ js.Any, 
      /* matrix */ js.Array[js.Array[Double] | Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Iterate over all elements of a matrix/array, and executes the given
    * callback function.
    * @param x The matrix to iterate on.
    * @param callback The callback function is invoked with three
    * parameters: the value of the element, the index of the element, and
    * the Matrix/array being traversed.
    */
  def forEach(
    x: Matrix,
    callback: js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix, scala.Unit]
  ): scala.Unit = js.native
  
  /*************************************************************************
    * String functions
    ************************************************************************/
  /**
    * Format a value of any type into a string.
    * @param value The value to be formatted
    * @param options An object with formatting options.
    * @param callback A custom formatting function, invoked for all numeric
    * elements in value, for example all elements of a matrix, or the real
    * and imaginary parts of a complex number. This callback can be used to
    * override the built-in numeric notation with any type of formatting.
    * Function callback is called with value as parameter and must return a
    * string.
    * @see http://mathjs.org/docs/reference/functions/format.html
    * @returns The formatted value
    */
  def format(value: js.Any): String = js.native
  def format(
    value: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* value */ js.Any, String]
  ): String = js.native
  def format(value: js.Any, options: js.Function1[/* item */ js.Any, String]): String = js.native
  def format(
    value: js.Any,
    options: js.Function1[/* item */ js.Any, String],
    callback: js.Function1[/* value */ js.Any, String]
  ): String = js.native
  def format(value: js.Any, options: Double): String = js.native
  def format(value: js.Any, options: Double, callback: js.Function1[/* value */ js.Any, String]): String = js.native
  def format(value: js.Any, options: FormatOptions): String = js.native
  def format(value: js.Any, options: FormatOptions, callback: js.Function1[/* value */ js.Any, String]): String = js.native
  
  /**
    * Create a fraction convert a value to a fraction.
    * @param args Arguments specifying the numerator and denominator of the
    * fraction
    * @returns Returns a fraction
    */
  def fraction(args: Fraction): Fraction | MathArray | Matrix = js.native
  def fraction(args: MathArray): Fraction | MathArray | Matrix = js.native
  def fraction(args: Matrix): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: String): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: String, denominator: String): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: String, denominator: Double): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: String, denominator: MathArray): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: String, denominator: Matrix): Fraction | MathArray | Matrix = js.native
  /**
    * @param numerator Argument specifying the numerator of the fraction
    * @param denominator Argument specifying the denominator of the
    * fraction
    * @returns Returns a fraction
    */
  def fraction(numerator: Double): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: Double, denominator: String): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: Double, denominator: Double): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: Double, denominator: MathArray): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: Double, denominator: Matrix): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: MathArray, denominator: String): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: MathArray, denominator: Double): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: MathArray, denominator: MathArray): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: MathArray, denominator: Matrix): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: Matrix, denominator: String): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: Matrix, denominator: Double): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: Matrix, denominator: MathArray): Fraction | MathArray | Matrix = js.native
  def fraction(numerator: Matrix, denominator: Matrix): Fraction | MathArray | Matrix = js.native
  
  /**
    * Compute the gamma function of a value using Lanczos approximation for
    * small values, and an extended Stirling approximation for large
    * values. For matrices, the function is evaluated element wise.
    * @param n A real or complex number
    * @returns The gamma of n
    */
  def gamma(n: Double): Double | MathArray | Matrix = js.native
  def gamma(n: MathArray): Double | MathArray | Matrix = js.native
  def gamma(n: Matrix): Double | MathArray | Matrix = js.native
  
  def gcd(args: MathArray*): MathArray = js.native
  @JSName("gcd")
  def gcd_BigNumber(args: BigNumber*): BigNumber = js.native
  /**
    * Calculate the greatest common divisor for two or more values or
    * arrays. For matrices, the function is evaluated element wise.
    * @param args Two or more integer numbers
    * @returns The greatest common divisor
    */
  @JSName("gcd")
  def gcd_Double(args: Double*): Double = js.native
  @JSName("gcd")
  def gcd_Fraction(args: Fraction*): Fraction = js.native
  @JSName("gcd")
  def gcd_Matrix(args: Matrix*): Matrix = js.native
  
  /**
    * Retrieve help on a function or data type. Help files are retrieved
    * from the documentation in math.expression.docs.
    * @param search A function or function name for which to get help
    * @returns A help object
    */
  def help(search: js.Function0[_]): Help = js.native
  
  /**
    * Calculate the hypotenusa of a list with values. The hypotenusa is
    * defined as: hypot(a, b, c, ...) = sqrt(a^2 + b^2 + c^2 + ...) For
    * matrix input, the hypotenusa is calculated for all values in the
    * matrix.
    * @param args A list with numeric values or an Array or Matrix. Matrix
    * and Array input is flattened and returns a single number for the
    * whole matrix.
    * @returns Returns the hypothenuse of the input values.
    */
  def hypot(args: Double*): Double = js.native
  @JSName("hypot")
  def hypot_BigNumber(args: BigNumber*): BigNumber = js.native
  
  var i: Double = js.native
  
  /**
    * @param m The x dimension for the matrix
    * @param n The y dimension for the matrix
    * @param format The Matrix storage format
    * @returns A matrix with ones on the diagonal
    */
  def identity(m: Double, n: Double): Matrix | MathArray | Double = js.native
  def identity(m: Double, n: Double, format: String): Matrix | MathArray | Double = js.native
  def identity(size: js.Array[Double] | MathArray): Matrix | MathArray | Double = js.native
  def identity(size: js.Array[Double] | MathArray, format: String): Matrix | MathArray | Double = js.native
  /**
    * Create a 2-dimensional identity matrix with size m x n or n x n. The
    * matrix has ones on the diagonal and zeros elsewhere.
    * @param size The size for the matrix
    * @param format The Matrix storage format
    * @returns A matrix with ones on the diagonal
    */
  def identity(size: Double): Matrix | MathArray | Double = js.native
  def identity(size: Double, format: String): Matrix | MathArray | Double = js.native
  def identity(size: Matrix): Matrix | MathArray | Double = js.native
  def identity(size: Matrix, format: String): Matrix | MathArray | Double = js.native
  
  /**
    * Get the imaginary part of a complex number. For a complex number a +
    * bi, the function returns b. For matrices, the function is evaluated
    * element wise.
    * @param x A complex number or array with complex numbers
    * @returns The imaginary part of x
    */
  def im(x: Double): Double | BigNumber | MathArray | Matrix = js.native
  def im(x: BigNumber): Double | BigNumber | MathArray | Matrix = js.native
  def im(x: Complex): Double | BigNumber | MathArray | Matrix = js.native
  def im(x: MathArray): Double | BigNumber | MathArray | Matrix = js.native
  def im(x: Matrix): Double | BigNumber | MathArray | Matrix = js.native
  
  def `import`(`object`: js.Array[ImportObject], options: ImportOptions): scala.Unit = js.native
  /**
    * Import functions from an object or a module
    * To avoid errors when using one of the imported functions extend module like this:
    *
    * @example
    * // imported_math_functions.ts
    * declare module 'mathjs' {
    *      interface MathJsStatic {
    *          hello(a: number): number;
    *      }
    * }
    *
    * @param object An object with functions to be imported.
    * @param options An object with import options.
    */
  def `import`(`object`: ImportObject, options: ImportOptions): scala.Unit = js.native
  
  /**
    * Create an index. An Index can store ranges having start, step, and
    * end for multiple dimensions. Matrix.get, Matrix.set, and math.subset
    * accept an Index as input.
    * @param ranges Zero or more ranges or numbers.
    * @returns Returns the created index
    */
  def index(ranges: js.Any*): Index = js.native
  
  /**
    * Calculates the point of intersection of two lines in two or three
    * dimensions and of a line and a plane in three dimensions. The inputs
    * are in the form of arrays or 1 dimensional matrices. The line
    * intersection functions return null if the lines do not meet. Note:
    * Fill the plane coefficients as x + y + z = c and not as x + y + z + c
    * = 0.
    * @param w Co-ordinates of first end-point of first line
    * @param x Co-ordinates of second end-point of first line
    * @param y Co-ordinates of first end-point of second line OR
    * Coefficients of the plane's equation
    * @param z Co-ordinates of second end-point of second line OR null if
    * the calculation is for line and plane
    * @returns Returns the point of intersection of lines/lines-planes
    */
  def intersect(w: MathArray, x: MathArray, y: MathArray, z: MathArray): MathArray = js.native
  def intersect(w: MathArray, x: MathArray, y: MathArray, z: Matrix): MathArray = js.native
  def intersect(w: MathArray, x: MathArray, y: Matrix, z: MathArray): MathArray = js.native
  def intersect(w: MathArray, x: MathArray, y: Matrix, z: Matrix): MathArray = js.native
  def intersect(w: MathArray, x: Matrix, y: MathArray, z: MathArray): MathArray = js.native
  def intersect(w: MathArray, x: Matrix, y: MathArray, z: Matrix): MathArray = js.native
  def intersect(w: MathArray, x: Matrix, y: Matrix, z: MathArray): MathArray = js.native
  def intersect(w: MathArray, x: Matrix, y: Matrix, z: Matrix): MathArray = js.native
  def intersect(w: Matrix, x: MathArray, y: MathArray, z: MathArray): MathArray = js.native
  def intersect(w: Matrix, x: MathArray, y: MathArray, z: Matrix): MathArray = js.native
  def intersect(w: Matrix, x: MathArray, y: Matrix, z: MathArray): MathArray = js.native
  def intersect(w: Matrix, x: MathArray, y: Matrix, z: Matrix): MathArray = js.native
  def intersect(w: Matrix, x: Matrix, y: MathArray, z: MathArray): MathArray = js.native
  def intersect(w: Matrix, x: Matrix, y: MathArray, z: Matrix): MathArray = js.native
  def intersect(w: Matrix, x: Matrix, y: Matrix, z: MathArray): MathArray = js.native
  def intersect(w: Matrix, x: Matrix, y: Matrix, z: Matrix): MathArray = js.native
  
  def inv(x: js.Array[js.Array[Double] | Double]): NoLiteralType[js.Array[Double]] = js.native
  /**
    * Calculate the inverse of a square matrix.
    * @param x Matrix to be inversed
    * @returns The inverse of x
    */
  def inv(x: Double): NoLiteralType[Double] = js.native
  def inv(x: Complex): NoLiteralType[Complex] = js.native
  def inv(x: Matrix): NoLiteralType[Matrix] = js.native
  
  /**
    * Test whether a value is an integer number. The function supports
    * number, BigNumber, and Fraction. The function is evaluated
    * element-wise in case of Array or Matrix input.
    * @param x Value to be tested
    * @returns Returns true when x contains a numeric, integer value.
    * Throws an error in case of an unknown data type.
    */
  def isInteger(x: Double): Boolean = js.native
  def isInteger(x: BigNumber): Boolean = js.native
  def isInteger(x: Fraction): Boolean = js.native
  def isInteger(x: MathArray): Boolean = js.native
  def isInteger(x: Matrix): Boolean = js.native
  
  /**
    * Test whether a value is NaN (not a number). The function supports
    * types number, BigNumber, Fraction, Unit and Complex. The function is
    * evaluated element-wise in case of Array or Matrix input.
    * @param x Value to be tested
    * @returns Returns true when x is NaN. Throws an error in case of an
    * unknown data type.
    */
  def isNaN(x: Double): Boolean = js.native
  def isNaN(x: BigNumber): Boolean = js.native
  def isNaN(x: Fraction): Boolean = js.native
  def isNaN(x: MathArray): Boolean = js.native
  def isNaN(x: Matrix): Boolean = js.native
  def isNaN(x: Unit): Boolean = js.native
  
  /**
    * Test whether a value is negative: smaller than zero. The function
    * supports types number, BigNumber, Fraction, and Unit. The function is
    * evaluated element-wise in case of Array or Matrix input.
    * @param x Value to be tested
    * @returns Returns true when x is larger than zero. Throws an error in
    * case of an unknown data type.
    */
  def isNegative(x: Double): Boolean = js.native
  def isNegative(x: BigNumber): Boolean = js.native
  def isNegative(x: Fraction): Boolean = js.native
  def isNegative(x: MathArray): Boolean = js.native
  def isNegative(x: Matrix): Boolean = js.native
  def isNegative(x: Unit): Boolean = js.native
  
  /**
    * Test whether a value is an numeric value. The function is evaluated
    * element-wise in case of Array or Matrix input.
    * @param x Value to be tested
    * @returns Returns true when x is a number, BigNumber, Fraction, or
    * boolean. Returns false for other types. Throws an error in case of
    * unknown types.
    */
  def isNumeric(x: js.Any): Boolean = js.native
  
  /**
    * Test whether a value is positive: larger than zero. The function
    * supports types number, BigNumber, Fraction, and Unit. The function is
    * evaluated element-wise in case of Array or Matrix input.
    * @param x Value to be tested
    * @returns Returns true when x is larger than zero. Throws an error in
    * case of an unknown data type.
    */
  def isPositive(x: Double): Boolean = js.native
  def isPositive(x: BigNumber): Boolean = js.native
  def isPositive(x: Fraction): Boolean = js.native
  def isPositive(x: MathArray): Boolean = js.native
  def isPositive(x: Matrix): Boolean = js.native
  def isPositive(x: Unit): Boolean = js.native
  
  /**
    * Test whether a value is prime: has no divisors other than itself and
    * one. The function supports type number, bignumber. The function is
    * evaluated element-wise in case of Array or Matrix input.
    * @param x Value to be tested
    * @returns Returns true when x is larger than zero. Throws an error in
    * case of an unknown data type.
    */
  def isPrime(x: Double): Boolean = js.native
  def isPrime(x: BigNumber): Boolean = js.native
  def isPrime(x: MathArray): Boolean = js.native
  def isPrime(x: Matrix): Boolean = js.native
  
  /**
    * Test whether a value is zero. The function can check for zero for
    * types number, BigNumber, Fraction, Complex, and Unit. The function is
    * evaluated element-wise in case of Array or Matrix input.
    * @param x Value to be tested
    * @returns Returns true when x is zero. Throws an error in case of an
    * unknown data type.
    */
  def isZero(x: Double): Boolean = js.native
  def isZero(x: BigNumber): Boolean = js.native
  def isZero(x: Complex): Boolean = js.native
  def isZero(x: Fraction): Boolean = js.native
  def isZero(x: MathArray): Boolean = js.native
  def isZero(x: Matrix): Boolean = js.native
  def isZero(x: Unit): Boolean = js.native
  
  var json: MathJsJson = js.native
  
  /**
    * Calculate the Kullback-Leibler (KL) divergence between two
    * distributions
    * @param q First vector
    * @param p Second vector
    * @returns Returns disance between q and p
    */
  def kldivergence(q: MathArray, p: MathArray): Double = js.native
  def kldivergence(q: MathArray, p: Matrix): Double = js.native
  def kldivergence(q: Matrix, p: MathArray): Double = js.native
  def kldivergence(q: Matrix, p: Matrix): Double = js.native
  
  def kron(x: MathArray, y: MathArray): Matrix = js.native
  def kron(x: MathArray, y: Matrix): Matrix = js.native
  def kron(x: Matrix, y: MathArray): Matrix = js.native
  /**
    * Calculate the kronecker product of two matrices or vectors
    * @param x First vector
    * @param y Second vector
    * @returns Returns the kronecker product of x and y
    */
  def kron(x: Matrix, y: Matrix): Matrix = js.native
  
  def larger(x: String, y: String): Boolean | MathArray | Matrix = js.native
  def larger(x: String, y: MathType): Boolean | MathArray | Matrix = js.native
  def larger(x: MathType, y: String): Boolean | MathArray | Matrix = js.native
  /**
    * Test whether value x is larger than y. The function returns true when
    * x is larger than y and the relative difference between x and y is
    * larger than the configured epsilon. The function cannot be used to
    * compare values smaller than approximately 2.22e-16. For matrices, the
    * function is evaluated element wise.
    * @param x First value to compare
    * @param y Second value to vcompare
    * @returns Returns true when x is larger than y, else returns false
    */
  def larger(x: MathType, y: MathType): Boolean | MathArray | Matrix = js.native
  
  def largerEq(x: String, y: String): Boolean | MathArray | Matrix = js.native
  def largerEq(x: String, y: MathType): Boolean | MathArray | Matrix = js.native
  def largerEq(x: MathType, y: String): Boolean | MathArray | Matrix = js.native
  /**
    * Test whether value x is larger or equal to y. The function returns
    * true when x is larger than y or the relative difference between x and
    * y is smaller than the configured epsilon. The function cannot be used
    * to compare values smaller than approximately 2.22e-16. For matrices,
    * the function is evaluated element wise.
    * @param x First value to compare
    * @param y Second value to vcompare
    * @returns Returns true when x is larger than or equal to y, else
    * returns false
    */
  def largerEq(x: MathType, y: MathType): Boolean | MathArray | Matrix = js.native
  
  /**
    * Calculate the least common multiple for two or more values or arrays.
    * lcm is defined as: lcm(a, b) = abs(a * b) / gcd(a, b) For matrices,
    * the function is evaluated element wise.
    * @param a An integer number
    * @param b An integer number
    * @returns The least common multiple
    */
  def lcm(a: Double, b: Double): Double = js.native
  def lcm(a: BigNumber, b: BigNumber): BigNumber = js.native
  def lcm(a: MathArray, b: MathArray): MathArray = js.native
  def lcm(a: Matrix, b: Matrix): Matrix = js.native
  
  def leftShift(x: js.Array[js.Array[Double] | Double], y: Double): NoLiteralType[js.Array[Double]] = js.native
  def leftShift(x: js.Array[js.Array[Double] | Double], y: BigNumber): NoLiteralType[js.Array[Double]] = js.native
  /**
    * Bitwise left logical shift of a value x by y number of bits, x << y.
    * For matrices, the function is evaluated element wise. For units, the
    * function is evaluated on the best prefix base.
    * @param x Value to be shifted
    * @param y Amount of shifts
    * @returns x shifted left y times
    */
  def leftShift(x: Double, y: Double): NoLiteralType[Double] = js.native
  def leftShift(x: Double, y: BigNumber): NoLiteralType[Double] = js.native
  def leftShift(x: Decimal, y: Double): NoLiteralType[Decimal] = js.native
  def leftShift(x: Decimal, y: BigNumber): NoLiteralType[Decimal] = js.native
  def leftShift(x: Matrix, y: Double): NoLiteralType[Matrix] = js.native
  def leftShift(x: Matrix, y: BigNumber): NoLiteralType[Matrix] = js.native
  
  def log(x: js.Array[js.Array[Double] | Double]): NoLiteralType[js.Array[Double]] = js.native
  def log(x: js.Array[js.Array[Double] | Double], base: Double): NoLiteralType[js.Array[Double]] = js.native
  def log(x: js.Array[js.Array[Double] | Double], base: BigNumber): NoLiteralType[js.Array[Double]] = js.native
  def log(x: js.Array[js.Array[Double] | Double], base: Complex): NoLiteralType[js.Array[Double]] = js.native
  /**
    * Calculate the logarithm of a value. For matrices, the function is
    * evaluated element wise.
    * @param x Value for which to calculate the logarithm.
    * @param base Optional base for the logarithm. If not provided, the
    * natural logarithm of x is calculated. Default value: e.
    * @returns Returns the logarithm of x
    */
  def log(x: Double): NoLiteralType[Double] = js.native
  def log(x: Double, base: Double): NoLiteralType[Double] = js.native
  def log(x: Double, base: BigNumber): NoLiteralType[Double] = js.native
  def log(x: Double, base: Complex): NoLiteralType[Double] = js.native
  def log(x: Decimal): NoLiteralType[Decimal] = js.native
  def log(x: Decimal, base: Double): NoLiteralType[Decimal] = js.native
  def log(x: Decimal, base: BigNumber): NoLiteralType[Decimal] = js.native
  def log(x: Decimal, base: Complex): NoLiteralType[Decimal] = js.native
  def log(x: Complex): NoLiteralType[Complex] = js.native
  def log(x: Complex, base: Double): NoLiteralType[Complex] = js.native
  def log(x: Complex, base: BigNumber): NoLiteralType[Complex] = js.native
  def log(x: Complex, base: Complex): NoLiteralType[Complex] = js.native
  def log(x: Matrix): NoLiteralType[Matrix] = js.native
  def log(x: Matrix, base: Double): NoLiteralType[Matrix] = js.native
  def log(x: Matrix, base: BigNumber): NoLiteralType[Matrix] = js.native
  def log(x: Matrix, base: Complex): NoLiteralType[Matrix] = js.native
  
  /**
    * Calculate the 10-base of a value. This is the same as calculating
    * log(x, 10). For matrices, the function is evaluated element wise.
    * @param x Value for which to calculate the logarithm.
    * @returns Returns the 10-base logarithm of x
    */
  def log10(x: Double): Double = js.native
  def log10(x: BigNumber): BigNumber = js.native
  def log10(x: Complex): Complex = js.native
  def log10(x: MathArray): MathArray = js.native
  def log10(x: Matrix): Matrix = js.native
  
  /**
    * Calculate the logarithm of a value+1. For matrices, the function is
    * evaluated element wise.
    * @param x Value for which to calculate the logarithm.
    * @returns Returns the logarithm of x+1
    */
  def log1p(x: Double): Double = js.native
  def log1p(x: Double, base: Double): Double = js.native
  def log1p(x: Double, base: BigNumber): Double = js.native
  def log1p(x: Double, base: Complex): Double = js.native
  def log1p(x: BigNumber): BigNumber = js.native
  def log1p(x: BigNumber, base: Double): BigNumber = js.native
  def log1p(x: BigNumber, base: BigNumber): BigNumber = js.native
  def log1p(x: BigNumber, base: Complex): BigNumber = js.native
  def log1p(x: Complex): Complex = js.native
  def log1p(x: Complex, base: Double): Complex = js.native
  def log1p(x: Complex, base: BigNumber): Complex = js.native
  def log1p(x: Complex, base: Complex): Complex = js.native
  def log1p(x: MathArray): MathArray = js.native
  def log1p(x: MathArray, base: Double): MathArray = js.native
  def log1p(x: MathArray, base: BigNumber): MathArray = js.native
  def log1p(x: MathArray, base: Complex): MathArray = js.native
  def log1p(x: Matrix): Matrix = js.native
  def log1p(x: Matrix, base: Double): Matrix = js.native
  def log1p(x: Matrix, base: BigNumber): Matrix = js.native
  def log1p(x: Matrix, base: Complex): Matrix = js.native
  
  /**
    * Calculate the 2-base of a value. This is the same as calculating
    * log(x, 2). For matrices, the function is evaluated element wise.
    * @param x Value for which to calculate the logarithm.
    * @returns Returns the 2-base logarithm of x
    */
  def log2(x: Double): Double = js.native
  def log2(x: BigNumber): BigNumber = js.native
  def log2(x: Complex): Complex = js.native
  def log2(x: MathArray): MathArray = js.native
  def log2(x: Matrix): Matrix = js.native
  
  def lsolve(L: MathArray, b: MathArray): Matrix | MathArray = js.native
  def lsolve(L: MathArray, b: Matrix): Matrix | MathArray = js.native
  def lsolve(L: Matrix, b: MathArray): Matrix | MathArray = js.native
  /**
    * Solves the linear equation system by forwards substitution. Matrix
    * must be a lower triangular matrix.
    * @param L A N x N matrix or array (L)
    * @param b A column vector with the b values
    * @returns A column vector with the linear system solution (x)
    */
  def lsolve(L: Matrix, b: Matrix): Matrix | MathArray = js.native
  
  /**
    * Calculate the Matrix LU decomposition with partial pivoting. Matrix A
    * is decomposed in two matrices (L, U) and a row permutation vector p
    * where A[p,:] = L * U
    * @param A A two dimensional matrix or array for which to get the LUP
    * decomposition.
    * @returns The lower triangular matrix, the upper triangular matrix and
    * the permutation matrix.
    */
  def lup(): L = js.native
  def lup(A: MathArray): L = js.native
  def lup(A: Matrix): L = js.native
  
  def lusolve(A: Double, b: MathArray): Matrix | MathArray = js.native
  def lusolve(A: Double, b: MathArray, order: js.UndefOr[scala.Nothing], threshold: Double): Matrix | MathArray = js.native
  def lusolve(A: Double, b: MathArray, order: Double): Matrix | MathArray = js.native
  def lusolve(A: Double, b: MathArray, order: Double, threshold: Double): Matrix | MathArray = js.native
  def lusolve(A: Double, b: Matrix): Matrix | MathArray = js.native
  def lusolve(A: Double, b: Matrix, order: js.UndefOr[scala.Nothing], threshold: Double): Matrix | MathArray = js.native
  def lusolve(A: Double, b: Matrix, order: Double): Matrix | MathArray = js.native
  def lusolve(A: Double, b: Matrix, order: Double, threshold: Double): Matrix | MathArray = js.native
  def lusolve(A: MathArray, b: MathArray): Matrix | MathArray = js.native
  def lusolve(A: MathArray, b: MathArray, order: js.UndefOr[scala.Nothing], threshold: Double): Matrix | MathArray = js.native
  def lusolve(A: MathArray, b: MathArray, order: Double): Matrix | MathArray = js.native
  def lusolve(A: MathArray, b: MathArray, order: Double, threshold: Double): Matrix | MathArray = js.native
  def lusolve(A: MathArray, b: Matrix): Matrix | MathArray = js.native
  def lusolve(A: MathArray, b: Matrix, order: js.UndefOr[scala.Nothing], threshold: Double): Matrix | MathArray = js.native
  def lusolve(A: MathArray, b: Matrix, order: Double): Matrix | MathArray = js.native
  def lusolve(A: MathArray, b: Matrix, order: Double, threshold: Double): Matrix | MathArray = js.native
  def lusolve(A: Matrix, b: MathArray): Matrix | MathArray = js.native
  def lusolve(A: Matrix, b: MathArray, order: js.UndefOr[scala.Nothing], threshold: Double): Matrix | MathArray = js.native
  def lusolve(A: Matrix, b: MathArray, order: Double): Matrix | MathArray = js.native
  def lusolve(A: Matrix, b: MathArray, order: Double, threshold: Double): Matrix | MathArray = js.native
  /**
    * Solves the linear system A * x = b where A is an [n x n] matrix and b
    * is a [n] column vector.
    * @param A Invertible Matrix or the Matrix LU decomposition
    * @param b Column Vector
    * @param order The Symbolic Ordering and Analysis order, see slu for
    * details. Matrix must be a SparseMatrix
    * @param threshold Partial pivoting threshold (1 for partial pivoting),
    * see slu for details. Matrix must be a SparseMatrix.
    * @returns Column vector with the solution to the linear system A * x =
    * b
    */
  def lusolve(A: Matrix, b: Matrix): Matrix | MathArray = js.native
  def lusolve(A: Matrix, b: Matrix, order: js.UndefOr[scala.Nothing], threshold: Double): Matrix | MathArray = js.native
  def lusolve(A: Matrix, b: Matrix, order: Double): Matrix | MathArray = js.native
  def lusolve(A: Matrix, b: Matrix, order: Double, threshold: Double): Matrix | MathArray = js.native
  
  /*************************************************************************
    * Statistics functions
    ************************************************************************/
  /**
    * Compute the median absolute deviation of a matrix or a list with
    * values. The median absolute deviation is defined as the median of the
    * absolute deviations from the median.
    * @param array A single matrix or multiple scalar values.
    * @returns The median absolute deviation
    */
  def mad(array: MathArray): js.Any = js.native
  def mad(array: Matrix): js.Any = js.native
  
  def map(
    x: js.Array[js.Array[Double] | Double],
    callback: js.Function3[
      /* value */ js.Any, 
      /* index */ js.Any, 
      /* matrix */ js.Array[js.Array[Double] | Double], 
      MathType | String
    ]
  ): js.Array[Double] = js.native
  /**
    * Iterate over all elements of a matrix/array, and executes the given
    * callback function.
    * @param x The matrix to iterate on.
    * @param callback The callback function is invoked with three
    * parameters: the value of the element, the index of the element, and
    * the Matrix/array being traversed.
    * @returns Transformed map of x
    */
  def map(
    x: Matrix,
    callback: js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix, MathType | String]
  ): Matrix = js.native
  
  /**
    * Create a Matrix. The function creates a new math.type.Matrix object
    * from an Array. A Matrix has utility functions to manipulate the data
    * in the matrix, like getting the size and getting or setting values in
    * the matrix. Supported storage formats are 'dense' and 'sparse'.
    * @param format The Matrix storage format
    * @returns The created Matrix
    */
  def matrix(): Matrix = js.native
  /**
    * @param data A multi dimensional array
    * @param format The Matrix storage format
    * @param dataType The Matrix data type
    * @returns The created Matrix
    */
  def matrix(data: MathArray): Matrix = js.native
  def matrix(data: MathArray, format: js.UndefOr[scala.Nothing], dataType: String): Matrix = js.native
  def matrix(data: Matrix): Matrix = js.native
  def matrix(data: Matrix, format: js.UndefOr[scala.Nothing], dataType: String): Matrix = js.native
  @JSName("matrix")
  def matrix_dense(data: MathArray, format: dense): Matrix = js.native
  @JSName("matrix")
  def matrix_dense(data: MathArray, format: dense, dataType: String): Matrix = js.native
  @JSName("matrix")
  def matrix_dense(data: Matrix, format: dense): Matrix = js.native
  @JSName("matrix")
  def matrix_dense(data: Matrix, format: dense, dataType: String): Matrix = js.native
  @JSName("matrix")
  def matrix_dense(format: dense): Matrix = js.native
  @JSName("matrix")
  def matrix_sparse(data: MathArray, format: sparse): Matrix = js.native
  @JSName("matrix")
  def matrix_sparse(data: MathArray, format: sparse, dataType: String): Matrix = js.native
  @JSName("matrix")
  def matrix_sparse(data: Matrix, format: sparse): Matrix = js.native
  @JSName("matrix")
  def matrix_sparse(data: Matrix, format: sparse, dataType: String): Matrix = js.native
  @JSName("matrix")
  def matrix_sparse(format: sparse): Matrix = js.native
  
  /**
    * @param A A single matrix
    * @param dim The maximum over the selected dimension
    * @returns The maximum value
    */
  def max(A: MathArray): js.Any = js.native
  def max(A: MathArray, dim: Double): js.Any = js.native
  def max(A: Matrix): js.Any = js.native
  def max(A: Matrix, dim: Double): js.Any = js.native
  /**
    * Compute the maximum value of a matrix or a list with values. In case
    * of a multi dimensional array, the maximum of the flattened array will
    * be calculated. When dim is provided, the maximum over the selected
    * dimension will be calculated. Parameter dim is zero-based.
    * @param args A single matrix or multiple scalar values
    * @returns The maximum value
    */
  def max(args: MathType*): js.Any = js.native
  
  /**
    * @param A A single matrix
    * @param dim The mean over the selected dimension
    * @returns The mean of all values
    */
  def mean(A: MathArray): js.Any = js.native
  def mean(A: MathArray, dim: Double): js.Any = js.native
  def mean(A: Matrix): js.Any = js.native
  def mean(A: Matrix, dim: Double): js.Any = js.native
  /**
    * Compute the mean value of matrix or a list with values. In case of a
    * multi dimensional array, the mean of the flattened array will be
    * calculated. When dim is provided, the maximum over the selected
    * dimension will be calculated. Parameter dim is zero-based.
    * @param args A single matrix or multiple scalar values
    * @returns The mean of all values
    */
  def mean(args: MathType*): js.Any = js.native
  
  /**
    * Compute the median of a matrix or a list with values. The values are
    * sorted and the middle value is returned. In case of an even number of
    * values, the average of the two middle values is returned. Supported
    * types of values are: Number, BigNumber, Unit In case of a (multi
    * dimensional) array or matrix, the median of all elements will be
    * calculated.
    * @param args A single matrix or or multiple scalar values
    * @returns The median
    */
  def median(args: MathType*): js.Any = js.native
  
  /**
    * @param A A single matrix
    * @param dim The minimum over the selected dimension
    * @returns The minimum value
    */
  def min(A: MathArray): js.Any = js.native
  def min(A: MathArray, dim: Double): js.Any = js.native
  def min(A: Matrix): js.Any = js.native
  def min(A: Matrix, dim: Double): js.Any = js.native
  /**
    * Compute the maximum value of a matrix or a list of values. In case of
    * a multi dimensional array, the maximum of the flattened array will be
    * calculated. When dim is provided, the maximum over the selected
    * dimension will be calculated. Parameter dim is zero-based.
    * @param args A single matrix or or multiple scalar values
    * @returns The minimum value
    */
  def min(args: MathType*): js.Any = js.native
  
  def mod(x: js.Array[js.Array[Double] | Double], y: Double): NoLiteralType[js.Array[Double]] = js.native
  def mod(x: js.Array[js.Array[Double] | Double], y: BigNumber): NoLiteralType[js.Array[Double]] = js.native
  def mod(x: js.Array[js.Array[Double] | Double], y: Fraction): NoLiteralType[js.Array[Double]] = js.native
  def mod(x: js.Array[js.Array[Double] | Double], y: MathArray): NoLiteralType[js.Array[Double]] = js.native
  def mod(x: js.Array[js.Array[Double] | Double], y: Matrix): NoLiteralType[js.Array[Double]] = js.native
  /**
    * Calculates the modulus, the remainder of an integer division. For
    * matrices, the function is evaluated element wise. The modulus is
    * defined as: x - y * floor(x / y)
    * @see http://en.wikipedia.org/wiki/Modulo_operation.
    * @param x Dividend
    * @param y Divisor
    * @returns Returns the remainder of x divided by y
    */
  def mod(x: Double, y: Double): NoLiteralType[Double] = js.native
  def mod(x: Double, y: BigNumber): NoLiteralType[Double] = js.native
  def mod(x: Double, y: Fraction): NoLiteralType[Double] = js.native
  def mod(x: Double, y: MathArray): NoLiteralType[Double] = js.native
  def mod(x: Double, y: Matrix): NoLiteralType[Double] = js.native
  def mod(x: Decimal, y: Double): NoLiteralType[Decimal] = js.native
  def mod(x: Decimal, y: BigNumber): NoLiteralType[Decimal] = js.native
  def mod(x: Decimal, y: Fraction): NoLiteralType[Decimal] = js.native
  def mod(x: Decimal, y: MathArray): NoLiteralType[Decimal] = js.native
  def mod(x: Decimal, y: Matrix): NoLiteralType[Decimal] = js.native
  def mod(x: Fraction, y: Double): NoLiteralType[Fraction] = js.native
  def mod(x: Fraction, y: BigNumber): NoLiteralType[Fraction] = js.native
  def mod(x: Fraction, y: Fraction): NoLiteralType[Fraction] = js.native
  def mod(x: Fraction, y: MathArray): NoLiteralType[Fraction] = js.native
  def mod(x: Fraction, y: Matrix): NoLiteralType[Fraction] = js.native
  def mod(x: Matrix, y: Double): NoLiteralType[Matrix] = js.native
  def mod(x: Matrix, y: BigNumber): NoLiteralType[Matrix] = js.native
  def mod(x: Matrix, y: Fraction): NoLiteralType[Matrix] = js.native
  def mod(x: Matrix, y: MathArray): NoLiteralType[Matrix] = js.native
  def mod(x: Matrix, y: Matrix): NoLiteralType[Matrix] = js.native
  
  /**
    * Computes the mode of a set of numbers or a list with values(numbers
    * or characters). If there are more than one modes, it returns a list
    * of those values.
    * @param args A single matrix
    * @returns The mode of all values
    */
  def mode(args: MathType*): js.Any = js.native
  
  /**
    * Multinomial Coefficients compute the number of ways of picking a1,
    * a2, ..., ai unordered outcomes from n possibilities. multinomial
    * takes one array of integers as an argument. The following condition
    * must be enforced: every ai <= 0
    * @param a Integer number of objects in the subset
    * @returns multinomial coefficent
    */
  def multinomial[T /* <: Double | BigNumber */](a: js.Array[T]): NoLiteralType[T] = js.native
  
  def multiply(x: js.Array[js.Array[Double] | Double], y: MathType): js.Array[Double] = js.native
  def multiply(x: Double, y: Double): Double = js.native
  def multiply(x: MathType, y: MathType): MathType = js.native
  /**
    * Multiply two values, x * y. The result is squeezed. For matrices, the
    * matrix product is calculated.
    * @param x The first value to multiply
    * @param y The second value to multiply
    * @returns Multiplication of x and y
    */
  def multiply(x: Matrix, y: MathType): Matrix = js.native
  def multiply(x: Unit, y: Unit): Unit = js.native
  
  /**
    * Calculate the norm of a number, vector or matrix. The second
    * parameter p is optional. If not provided, it defaults to 2.
    * @param x Value for which to calculate the norm
    * @param p Vector space. Supported numbers include Infinity and
    * -Infinity. Supported strings are: 'inf', '-inf', and 'fro' (The
    * Frobenius norm) Default value: 2.
    * @returns the p-norm
    */
  def norm(x: Double): Double | BigNumber = js.native
  def norm(x: Double, p: String): Double | BigNumber = js.native
  def norm(x: Double, p: Double): Double | BigNumber = js.native
  def norm(x: Double, p: BigNumber): Double | BigNumber = js.native
  def norm(x: BigNumber): Double | BigNumber = js.native
  def norm(x: BigNumber, p: String): Double | BigNumber = js.native
  def norm(x: BigNumber, p: Double): Double | BigNumber = js.native
  def norm(x: BigNumber, p: BigNumber): Double | BigNumber = js.native
  def norm(x: Complex): Double | BigNumber = js.native
  def norm(x: Complex, p: String): Double | BigNumber = js.native
  def norm(x: Complex, p: Double): Double | BigNumber = js.native
  def norm(x: Complex, p: BigNumber): Double | BigNumber = js.native
  def norm(x: MathArray): Double | BigNumber = js.native
  def norm(x: MathArray, p: String): Double | BigNumber = js.native
  def norm(x: MathArray, p: Double): Double | BigNumber = js.native
  def norm(x: MathArray, p: BigNumber): Double | BigNumber = js.native
  def norm(x: Matrix): Double | BigNumber = js.native
  def norm(x: Matrix, p: String): Double | BigNumber = js.native
  def norm(x: Matrix, p: Double): Double | BigNumber = js.native
  def norm(x: Matrix, p: BigNumber): Double | BigNumber = js.native
  
  /**
    * Logical not. Flips boolean value of a given parameter. For matrices,
    * the function is evaluated element wise.
    * @param x First value to not
    * @returns Returns true when input is a zero or empty value.
    */
  def not(x: Double): Boolean | MathArray | Matrix = js.native
  def not(x: BigNumber): Boolean | MathArray | Matrix = js.native
  def not(x: Complex): Boolean | MathArray | Matrix = js.native
  def not(x: MathArray): Boolean | MathArray | Matrix = js.native
  def not(x: Matrix): Boolean | MathArray | Matrix = js.native
  def not(x: Unit): Boolean | MathArray | Matrix = js.native
  
  /**
    * Calculate the nth root of a value. The principal nth root of a
    * positive real number A, is the positive real solution of the equation
    * x^root = A For matrices, the function is evaluated element wise.
    * @param a Value for which to calculate the nth root
    * @param root The root. Default value: 2.
    * @return The nth root of a
    */
  def nthRoot(a: Double): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: Double, root: Double): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: Double, root: BigNumber): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: BigNumber): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: BigNumber, root: Double): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: BigNumber, root: BigNumber): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: Complex): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: Complex, root: Double): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: Complex, root: BigNumber): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: MathArray): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: MathArray, root: Double): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: MathArray, root: BigNumber): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: Matrix): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: Matrix, root: Double): Double | Complex | MathArray | Matrix = js.native
  def nthRoot(a: Matrix, root: BigNumber): Double | Complex | MathArray | Matrix = js.native
  
  var `null`: Double = js.native
  
  /**
    * Create a number or convert a string, boolean, or unit to a number.
    * When value is a matrix, all elements will be converted to number.
    * @param value Value to be converted
    * @returns The created number
    */
  def number(): Double | MathArray | Matrix = js.native
  def number(unit: Unit, valuelessUnit: String): Double = js.native
  /**
    * @param value Value to be converted
    * @param valuelessUnit A valueless unit, used to convert a unit to a
    * number
    * @returns The created number
    */
  def number(unit: Unit, valuelessUnit: Unit): Double = js.native
  def number(value: String): Double | MathArray | Matrix = js.native
  def number(value: Boolean): Double | MathArray | Matrix = js.native
  def number(value: Double): Double | MathArray | Matrix = js.native
  def number(value: BigNumber): Double | MathArray | Matrix = js.native
  def number(value: Fraction): Double | MathArray | Matrix = js.native
  def number(value: MathArray): Double | MathArray | Matrix = js.native
  def number(value: Matrix): Double | MathArray | Matrix = js.native
  def number(value: Unit): Double | MathArray | Matrix = js.native
  
  /**
    * @param m The x dimension of the matrix
    * @param n The y dimension of the amtrix
    * @param format The matrix storage format
    * @returns A matrix filled with ones
    */
  def ones(m: Double, n: Double): MathArray | Matrix = js.native
  def ones(m: Double, n: Double, format: String): MathArray | Matrix = js.native
  def ones(size: js.Array[Double]): MathArray | Matrix = js.native
  def ones(size: js.Array[Double], format: String): MathArray | Matrix = js.native
  /**
    * Create a matrix filled with ones. The created matrix can have one or
    * multiple dimensions.
    * @param size The size of each dimension of the matrix
    * @param format The matrix storage format
    * @returns A matrix filled with ones
    */
  def ones(size: Double): MathArray | Matrix = js.native
  def ones(size: Double, format: String): MathArray | Matrix = js.native
  
  /**
    * Logical or. Test if at least one value is defined with a
    * nonzero/nonempty value. For matrices, the function is evaluated
    * element wise.
    * @param x First value to or
    * @param y Second value to or
    * @returns Returns true when one of the inputs is defined with a
    * nonzero/nonempty value.
    */
  def or(x: Double, y: Double): Boolean | MathArray | Matrix = js.native
  def or(x: Double, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def or(x: Double, y: Complex): Boolean | MathArray | Matrix = js.native
  def or(x: Double, y: MathArray): Boolean | MathArray | Matrix = js.native
  def or(x: Double, y: Matrix): Boolean | MathArray | Matrix = js.native
  def or(x: Double, y: Unit): Boolean | MathArray | Matrix = js.native
  def or(x: BigNumber, y: Double): Boolean | MathArray | Matrix = js.native
  def or(x: BigNumber, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def or(x: BigNumber, y: Complex): Boolean | MathArray | Matrix = js.native
  def or(x: BigNumber, y: MathArray): Boolean | MathArray | Matrix = js.native
  def or(x: BigNumber, y: Matrix): Boolean | MathArray | Matrix = js.native
  def or(x: BigNumber, y: Unit): Boolean | MathArray | Matrix = js.native
  def or(x: Complex, y: Double): Boolean | MathArray | Matrix = js.native
  def or(x: Complex, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def or(x: Complex, y: Complex): Boolean | MathArray | Matrix = js.native
  def or(x: Complex, y: MathArray): Boolean | MathArray | Matrix = js.native
  def or(x: Complex, y: Matrix): Boolean | MathArray | Matrix = js.native
  def or(x: Complex, y: Unit): Boolean | MathArray | Matrix = js.native
  def or(x: MathArray, y: Double): Boolean | MathArray | Matrix = js.native
  def or(x: MathArray, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def or(x: MathArray, y: Complex): Boolean | MathArray | Matrix = js.native
  def or(x: MathArray, y: MathArray): Boolean | MathArray | Matrix = js.native
  def or(x: MathArray, y: Matrix): Boolean | MathArray | Matrix = js.native
  def or(x: MathArray, y: Unit): Boolean | MathArray | Matrix = js.native
  def or(x: Matrix, y: Double): Boolean | MathArray | Matrix = js.native
  def or(x: Matrix, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def or(x: Matrix, y: Complex): Boolean | MathArray | Matrix = js.native
  def or(x: Matrix, y: MathArray): Boolean | MathArray | Matrix = js.native
  def or(x: Matrix, y: Matrix): Boolean | MathArray | Matrix = js.native
  def or(x: Matrix, y: Unit): Boolean | MathArray | Matrix = js.native
  def or(x: Unit, y: Double): Boolean | MathArray | Matrix = js.native
  def or(x: Unit, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def or(x: Unit, y: Complex): Boolean | MathArray | Matrix = js.native
  def or(x: Unit, y: MathArray): Boolean | MathArray | Matrix = js.native
  def or(x: Unit, y: Matrix): Boolean | MathArray | Matrix = js.native
  def or(x: Unit, y: Unit): Boolean | MathArray | Matrix = js.native
  
  /**
    * @param exprs Expressions to be parsed
    * @param options Available options: nodes - a set of custome nodes
    * @returns An arry of nodes
    */
  def parse(exprs: js.Array[MathExpression]): js.Array[MathNode] = js.native
  def parse(exprs: js.Array[MathExpression], options: js.Any): js.Array[MathNode] = js.native
  /**
    * Parse an expression. Returns a node tree, which can be evaluated by
    * invoking node.evaluate();
    * @param expr Expression to be parsed
    * @param options Available options: nodes - a set of custome nodes
    * @returns A node
    */
  def parse(expr: MathExpression): MathNode = js.native
  def parse(expr: MathExpression, options: js.Any): MathNode = js.native
  
  /**
    * Create a parser. The function creates a new math.expression.Parser
    * object.
    * @returns A Parser object
    */
  def parser(): Parser = js.native
  
  /**
    * Partition-based selection of an array or 1D matrix. Will find the kth
    * smallest value, and mutates the input array. Uses Quickselect.
    * @param x A one dimensional matrix or array to sort
    * @param k The kth smallest value to be retrieved; zero-based index
    * @param compare  An optional comparator function. The function is
    * called as compare(a, b), and must return 1 when a > b, -1 when a < b,
    * and 0 when a == b. Default value: 'asc'.
    * @returns Returns the kth lowest value.
    */
  def partitionSelect(x: MathArray, k: Double): js.Any = js.native
  def partitionSelect(x: MathArray, k: Double, compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): js.Any = js.native
  def partitionSelect(x: Matrix, k: Double): js.Any = js.native
  def partitionSelect(x: Matrix, k: Double, compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): js.Any = js.native
  @JSName("partitionSelect")
  def partitionSelect_asc(x: MathArray, k: Double, compare: asc): js.Any = js.native
  @JSName("partitionSelect")
  def partitionSelect_asc(x: Matrix, k: Double, compare: asc): js.Any = js.native
  @JSName("partitionSelect")
  def partitionSelect_desc(x: MathArray, k: Double, compare: desc): js.Any = js.native
  @JSName("partitionSelect")
  def partitionSelect_desc(x: Matrix, k: Double, compare: desc): js.Any = js.native
  
  /**
    * Compute the number of ways of obtaining an ordered subset of k
    * elements from a set of n elements. Permutations only takes integer
    * arguments. The following condition must be enforced: k <= n.
    * @param n The number of objects in total
    * @param k The number of objects in the subset
    * @returns The number of permutations
    */
  def permutations(n: Double): NoLiteralType[Double] = js.native
  def permutations(n: Double, k: Double): NoLiteralType[Double] = js.native
  def permutations(n: Double, k: BigNumber): NoLiteralType[Double] = js.native
  def permutations(n: Decimal): NoLiteralType[Decimal] = js.native
  def permutations(n: Decimal, k: Double): NoLiteralType[Decimal] = js.native
  def permutations(n: Decimal, k: BigNumber): NoLiteralType[Decimal] = js.native
  
  var phi: Double = js.native
  
  var pi: Double = js.native
  
  /**
    * Random pick a value from a one dimensional array. Array element is
    * picked using a random function with uniform distribution.
    * @param array A one dimensional array
    * @param number An int or float
    * @param weights An array of ints or floats
    * @returns Returns a single random value from array when number is 1 or
    * undefined. Returns an array with the configured number of elements
    * when number is > 1.
    */
  def pickRandom(array: js.Array[Double]): Double | js.Array[Double] = js.native
  def pickRandom(array: js.Array[Double], number: js.UndefOr[scala.Nothing], weights: js.Array[Double]): Double | js.Array[Double] = js.native
  def pickRandom(array: js.Array[Double], number: Double): Double | js.Array[Double] = js.native
  def pickRandom(array: js.Array[Double], number: Double, weights: js.Array[Double]): Double | js.Array[Double] = js.native
  
  /**
    * Calculates the power of x to y, x ^ y. Matrix exponentiation is
    * supported for square matrices x, and positive integer exponents y.
    * @param x The base
    * @param y The exponent
    * @returns x to the power y
    */
  def pow(x: MathType, y: Double): MathType = js.native
  def pow(x: MathType, y: BigNumber): MathType = js.native
  def pow(x: MathType, y: Complex): MathType = js.native
  
  /**
    * Interpolate values into a string template.
    * @param template A string containing variable placeholders.
    * @param values An object containing variables which will be filled in
    * in the template.
    * @param precision Number of digits to format numbers. If not provided,
    * the value will not be rounded.
    * @param options Formatting options, or the number of digits to format
    * numbers. See function math.format for a description of all options.
    * @returns Interpolated string
    */
  def print(template: String, values: js.Any): scala.Unit = js.native
  def print(template: String, values: js.Any, precision: js.UndefOr[scala.Nothing], options: js.Object): scala.Unit = js.native
  def print(template: String, values: js.Any, precision: js.UndefOr[scala.Nothing], options: Double): scala.Unit = js.native
  def print(template: String, values: js.Any, precision: Double): scala.Unit = js.native
  def print(template: String, values: js.Any, precision: Double, options: js.Object): scala.Unit = js.native
  def print(template: String, values: js.Any, precision: Double, options: Double): scala.Unit = js.native
  
  /**
    * Compute the product of a matrix or a list with values. In case of a
    * (multi dimensional) array or matrix, the sum of all elements will be
    * calculated.
    * @param args A single matrix or multiple scalar values
    * @returns The product of all values
    */
  def prod(args: MathType*): js.Any = js.native
  
  def qr(A: MathArray): Q = js.native
  /**
    * Calculate the Matrix QR decomposition. Matrix A is decomposed in two
    * matrices (Q, R) where Q is an orthogonal matrix and R is an upper
    * triangular matrix.
    * @param A A two dimensional matrix or array for which to get the QR
    * decomposition.
    * @returns Q: the orthogonal matrix and R: the upper triangular matrix
    */
  def qr(A: Matrix): Q = js.native
  
  /**
    * Compute the prob order quantile of a matrix or a list with values.
    * The sequence is sorted and the middle value is returned. Supported
    * types of sequence values are: Number, BigNumber, Unit Supported types
    * of probability are: Number, BigNumber In case of a (multi
    * dimensional) array or matrix, the prob order quantile of all elements
    * will be calculated.
    * @param A A single matrix or array
    * @param probOrN prob is the order of the quantile, while N is the
    * amount of evenly distributed steps of probabilities; only one of
    * these options can be provided
    * @param sorted =false is data sorted in ascending order
    * @returns Quantile(s)
    */
  def quantileSeq(A: MathArray, prob: Double): Double | BigNumber | Unit | MathArray = js.native
  def quantileSeq(A: MathArray, prob: Double, sorted: Boolean): Double | BigNumber | Unit | MathArray = js.native
  def quantileSeq(A: MathArray, prob: BigNumber): Double | BigNumber | Unit | MathArray = js.native
  def quantileSeq(A: MathArray, prob: BigNumber, sorted: Boolean): Double | BigNumber | Unit | MathArray = js.native
  def quantileSeq(A: MathArray, prob: MathArray): Double | BigNumber | Unit | MathArray = js.native
  def quantileSeq(A: MathArray, prob: MathArray, sorted: Boolean): Double | BigNumber | Unit | MathArray = js.native
  def quantileSeq(A: Matrix, prob: Double): Double | BigNumber | Unit | MathArray = js.native
  def quantileSeq(A: Matrix, prob: Double, sorted: Boolean): Double | BigNumber | Unit | MathArray = js.native
  def quantileSeq(A: Matrix, prob: BigNumber): Double | BigNumber | Unit | MathArray = js.native
  def quantileSeq(A: Matrix, prob: BigNumber, sorted: Boolean): Double | BigNumber | Unit | MathArray = js.native
  def quantileSeq(A: Matrix, prob: MathArray): Double | BigNumber | Unit | MathArray = js.native
  def quantileSeq(A: Matrix, prob: MathArray, sorted: Boolean): Double | BigNumber | Unit | MathArray = js.native
  
  /**
    * Return a random number larger or equal to min and smaller than max
    * using a uniform distribution.
    * @param size If provided, an array or matrix with given size and
    * filled with random values is returned
    * @param min Minimum boundary for the random value, included
    * @param max Maximum boundary for the random value, excluded
    * @returns A random number
    */
  def random(): Double = js.native
  def random(min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
  def random(min: Double): Double = js.native
  def random(min: Double, max: Double): Double = js.native
  def random(size: js.Array[js.Array[Double] | Double]): js.Array[Double] = js.native
  def random(size: js.Array[js.Array[Double] | Double], min: js.UndefOr[scala.Nothing], max: Double): js.Array[Double] = js.native
  def random(size: js.Array[js.Array[Double] | Double], min: Double): js.Array[Double] = js.native
  def random(size: js.Array[js.Array[Double] | Double], min: Double, max: Double): js.Array[Double] = js.native
  def random(size: Matrix): Matrix = js.native
  def random(size: Matrix, min: js.UndefOr[scala.Nothing], max: Double): Matrix = js.native
  def random(size: Matrix, min: Double): Matrix = js.native
  def random(size: Matrix, min: Double, max: Double): Matrix = js.native
  
  /**
    * Return a random integer number larger or equal to min and smaller
    * than max using a uniform distribution.
    * @param size If provided, an array or matrix with given size and
    * filled with random values is returned
    * @param min Minimum boundary for the random value, included
    * @param max Maximum boundary for the random value, excluded
    * @returns A random number
    */
  def randomInt(min: Double): Double = js.native
  def randomInt(min: Double, max: Double): Double = js.native
  def randomInt(size: js.Array[js.Array[Double] | Double]): js.Array[Double] = js.native
  def randomInt(size: js.Array[js.Array[Double] | Double], min: js.UndefOr[scala.Nothing], max: Double): js.Array[Double] = js.native
  def randomInt(size: js.Array[js.Array[Double] | Double], min: Double): js.Array[Double] = js.native
  def randomInt(size: js.Array[js.Array[Double] | Double], min: Double, max: Double): js.Array[Double] = js.native
  def randomInt(size: Matrix): Matrix = js.native
  def randomInt(size: Matrix, min: js.UndefOr[scala.Nothing], max: Double): Matrix = js.native
  def randomInt(size: Matrix, min: Double): Matrix = js.native
  def randomInt(size: Matrix, min: Double, max: Double): Matrix = js.native
  
  def range(start: Double, end: Double): Matrix = js.native
  def range(start: Double, end: Double, includeEnd: Boolean): Matrix = js.native
  def range(start: Double, end: Double, step: Double): Matrix = js.native
  def range(start: Double, end: Double, step: Double, includeEnd: Boolean): Matrix = js.native
  def range(start: Double, end: Double, step: BigNumber): Matrix = js.native
  def range(start: Double, end: Double, step: BigNumber, includeEnd: Boolean): Matrix = js.native
  def range(start: Double, end: BigNumber): Matrix = js.native
  def range(start: Double, end: BigNumber, includeEnd: Boolean): Matrix = js.native
  def range(start: Double, end: BigNumber, step: Double): Matrix = js.native
  def range(start: Double, end: BigNumber, step: Double, includeEnd: Boolean): Matrix = js.native
  def range(start: Double, end: BigNumber, step: BigNumber): Matrix = js.native
  def range(start: Double, end: BigNumber, step: BigNumber, includeEnd: Boolean): Matrix = js.native
  def range(start: BigNumber, end: Double): Matrix = js.native
  def range(start: BigNumber, end: Double, includeEnd: Boolean): Matrix = js.native
  def range(start: BigNumber, end: Double, step: Double): Matrix = js.native
  def range(start: BigNumber, end: Double, step: Double, includeEnd: Boolean): Matrix = js.native
  def range(start: BigNumber, end: Double, step: BigNumber): Matrix = js.native
  def range(start: BigNumber, end: Double, step: BigNumber, includeEnd: Boolean): Matrix = js.native
  def range(start: BigNumber, end: BigNumber): Matrix = js.native
  def range(start: BigNumber, end: BigNumber, includeEnd: Boolean): Matrix = js.native
  def range(start: BigNumber, end: BigNumber, step: Double): Matrix = js.native
  def range(start: BigNumber, end: BigNumber, step: Double, includeEnd: Boolean): Matrix = js.native
  def range(start: BigNumber, end: BigNumber, step: BigNumber): Matrix = js.native
  def range(start: BigNumber, end: BigNumber, step: BigNumber, includeEnd: Boolean): Matrix = js.native
  /**
    * Create an array from a range. By default, the range end is excluded.
    * This can be customized by providing an extra parameter includeEnd.
    * @param str A string 'start:end' or 'start:step:end'
    * @param start Start of the range
    * @param end End of the range, excluded by default, included when
    * parameter includeEnd=true
    * @param step Step size. Default value is 1.
    * @param includeEnd: Option to specify whether to include the end or
    * not. False by default
    * @returns Parameters describing the ranges start, end, and optional
    * step.
    */
  def range(str: String): Matrix = js.native
  def range(str: String, includeEnd: Boolean): Matrix = js.native
  
  def rationalize(expr: String): Coefficients = js.native
  def rationalize(expr: String, optional: js.Object): Coefficients = js.native
  def rationalize(expr: String, optional: Boolean): Coefficients = js.native
  /**
    * Transform a rationalizable expression in a rational fraction. If
    * rational fraction is one variable polynomial then converts the
    * numerator and denominator in canonical form, with decreasing
    * exponents, returning the coefficients of numerator.
    * @param expr The expression to check if is a polynomial expression
    * @param optional scope of expression or true for already evaluated
    * rational expression at input
    * @param detailed  optional True if return an object, false if return
    * expression node (default)
    * @returns The rational polynomial of expr
    */
  def rationalize(expr: MathNode): Coefficients = js.native
  def rationalize(expr: MathNode, optional: js.Object): Coefficients = js.native
  def rationalize(expr: MathNode, optional: Boolean): Coefficients = js.native
  @JSName("rationalize")
  def rationalize_MathNode(expr: String): MathNode = js.native
  @JSName("rationalize")
  def rationalize_MathNode(expr: String, optional: js.Object): MathNode = js.native
  @JSName("rationalize")
  def rationalize_MathNode(expr: String, optional: Boolean): MathNode = js.native
  @JSName("rationalize")
  def rationalize_MathNode(expr: MathNode): MathNode = js.native
  @JSName("rationalize")
  def rationalize_MathNode(expr: MathNode, optional: js.Object): MathNode = js.native
  @JSName("rationalize")
  def rationalize_MathNode(expr: MathNode, optional: Boolean): MathNode = js.native
  @JSName("rationalize")
  def rationalize_false(expr: String, optional: js.UndefOr[scala.Nothing], detailed: `false`): MathNode = js.native
  @JSName("rationalize")
  def rationalize_false(expr: String, optional: js.Object, detailed: `false`): MathNode = js.native
  @JSName("rationalize")
  def rationalize_false(expr: String, optional: Boolean, detailed: `false`): MathNode = js.native
  @JSName("rationalize")
  def rationalize_false(expr: MathNode, optional: js.UndefOr[scala.Nothing], detailed: `false`): MathNode = js.native
  @JSName("rationalize")
  def rationalize_false(expr: MathNode, optional: js.Object, detailed: `false`): MathNode = js.native
  @JSName("rationalize")
  def rationalize_false(expr: MathNode, optional: Boolean, detailed: `false`): MathNode = js.native
  @JSName("rationalize")
  def rationalize_true(expr: String, optional: js.UndefOr[scala.Nothing], detailed: `true`): Coefficients = js.native
  @JSName("rationalize")
  def rationalize_true(expr: String, optional: js.Object, detailed: `true`): Coefficients = js.native
  @JSName("rationalize")
  def rationalize_true(expr: String, optional: Boolean, detailed: `true`): Coefficients = js.native
  @JSName("rationalize")
  def rationalize_true(expr: MathNode, optional: js.UndefOr[scala.Nothing], detailed: `true`): Coefficients = js.native
  @JSName("rationalize")
  def rationalize_true(expr: MathNode, optional: js.Object, detailed: `true`): Coefficients = js.native
  @JSName("rationalize")
  def rationalize_true(expr: MathNode, optional: Boolean, detailed: `true`): Coefficients = js.native
  
  /**
    * Get the real part of a complex number. For a complex number a + bi,
    * the function returns a. For matrices, the function is evaluated
    * element wise.
    * @param x A complex number or array of complex numbers
    * @returns The real part of x
    */
  def re(x: Double): Double | BigNumber | MathArray | Matrix = js.native
  def re(x: BigNumber): Double | BigNumber | MathArray | Matrix = js.native
  def re(x: Complex): Double | BigNumber | MathArray | Matrix = js.native
  def re(x: MathArray): Double | BigNumber | MathArray | Matrix = js.native
  def re(x: Matrix): Double | BigNumber | MathArray | Matrix = js.native
  
  /**
    * Reshape a multi dimensional array to fit the specified dimensions
    * @param x Matrix to be reshaped
    * @param sizes One dimensional array with integral sizes for each
    * dimension
    * @returns A reshaped clone of matrix x
    */
  def reshape(x: js.Array[js.Array[Double] | Double], sizes: js.Array[Double]): js.Array[Double] = js.native
  def reshape(x: Matrix, sizes: js.Array[Double]): Matrix = js.native
  
  /**
    * Resize a matrix
    * @param x Matrix to be resized
    * @param size One dimensional array with numbers
    * @param defaultValue Zero by default, except in case of a string, in
    * that case defaultValue = ' ' Default value: 0.
    * @returns A resized clone of matrix x
    */
  def resize(x: js.Array[js.Array[Double] | Double], size: MathArray): js.Array[Double] = js.native
  def resize(x: js.Array[js.Array[Double] | Double], size: MathArray, defaultValue: String): js.Array[Double] = js.native
  def resize(x: js.Array[js.Array[Double] | Double], size: MathArray, defaultValue: Double): js.Array[Double] = js.native
  def resize(x: js.Array[js.Array[Double] | Double], size: Matrix): js.Array[Double] = js.native
  def resize(x: js.Array[js.Array[Double] | Double], size: Matrix, defaultValue: String): js.Array[Double] = js.native
  def resize(x: js.Array[js.Array[Double] | Double], size: Matrix, defaultValue: Double): js.Array[Double] = js.native
  def resize(x: Matrix, size: MathArray): Matrix = js.native
  def resize(x: Matrix, size: MathArray, defaultValue: String): Matrix = js.native
  def resize(x: Matrix, size: MathArray, defaultValue: Double): Matrix = js.native
  def resize(x: Matrix, size: Matrix): Matrix = js.native
  def resize(x: Matrix, size: Matrix, defaultValue: String): Matrix = js.native
  def resize(x: Matrix, size: Matrix, defaultValue: Double): Matrix = js.native
  
  def rightArithShift(x: js.Array[js.Array[Double] | Double], y: Double): NoLiteralType[js.Array[Double]] = js.native
  def rightArithShift(x: js.Array[js.Array[Double] | Double], y: BigNumber): NoLiteralType[js.Array[Double]] = js.native
  /**
    * Bitwise right arithmetic shift of a value x by y number of bits, x >>
    * y. For matrices, the function is evaluated element wise. For units,
    * the function is evaluated on the best prefix base.
    * @param x Value to be shifted
    * @param y Amount of shifts
    * @returns x sign-filled shifted right y times
    */
  def rightArithShift(x: Double, y: Double): NoLiteralType[Double] = js.native
  def rightArithShift(x: Double, y: BigNumber): NoLiteralType[Double] = js.native
  def rightArithShift(x: Decimal, y: Double): NoLiteralType[Decimal] = js.native
  def rightArithShift(x: Decimal, y: BigNumber): NoLiteralType[Decimal] = js.native
  def rightArithShift(x: Matrix, y: Double): NoLiteralType[Matrix] = js.native
  def rightArithShift(x: Matrix, y: BigNumber): NoLiteralType[Matrix] = js.native
  
  def rightLogShift(x: js.Array[js.Array[Double] | Double], y: Double): NoLiteralType[js.Array[Double]] = js.native
  /**
    * Bitwise right logical shift of value x by y number of bits, x >>> y.
    * For matrices, the function is evaluated element wise. For units, the
    * function is evaluated on the best prefix base.
    * @param x Value to be shifted
    * @param y Amount of shifts
    * @returns x zero-filled shifted right y times
    */
  def rightLogShift(x: Double, y: Double): NoLiteralType[Double] = js.native
  def rightLogShift(x: Matrix, y: Double): NoLiteralType[Matrix] = js.native
  
  def round(x: js.Array[js.Array[Double] | Double]): NoLiteralType[js.Array[Double]] = js.native
  def round(x: js.Array[js.Array[Double] | Double], n: Double): NoLiteralType[js.Array[Double]] = js.native
  def round(x: js.Array[js.Array[Double] | Double], n: BigNumber): NoLiteralType[js.Array[Double]] = js.native
  def round(x: js.Array[js.Array[Double] | Double], n: MathArray): NoLiteralType[js.Array[Double]] = js.native
  /**
    * Round a value towards the nearest integer. For matrices, the function
    * is evaluated element wise.
    * @param x Number to be rounded
    * @param n Number of decimals Default value: 0.
    * @returns Rounded value of x
    */
  def round(x: Double): NoLiteralType[Double] = js.native
  def round(x: Double, n: Double): NoLiteralType[Double] = js.native
  def round(x: Double, n: BigNumber): NoLiteralType[Double] = js.native
  def round(x: Double, n: MathArray): NoLiteralType[Double] = js.native
  def round(x: Decimal): NoLiteralType[Decimal] = js.native
  def round(x: Decimal, n: Double): NoLiteralType[Decimal] = js.native
  def round(x: Decimal, n: BigNumber): NoLiteralType[Decimal] = js.native
  def round(x: Decimal, n: MathArray): NoLiteralType[Decimal] = js.native
  def round(x: Complex): NoLiteralType[Complex] = js.native
  def round(x: Complex, n: Double): NoLiteralType[Complex] = js.native
  def round(x: Complex, n: BigNumber): NoLiteralType[Complex] = js.native
  def round(x: Complex, n: MathArray): NoLiteralType[Complex] = js.native
  def round(x: Fraction): NoLiteralType[Fraction] = js.native
  def round(x: Fraction, n: Double): NoLiteralType[Fraction] = js.native
  def round(x: Fraction, n: BigNumber): NoLiteralType[Fraction] = js.native
  def round(x: Fraction, n: MathArray): NoLiteralType[Fraction] = js.native
  def round(x: Matrix): NoLiteralType[Matrix] = js.native
  def round(x: Matrix, n: Double): NoLiteralType[Matrix] = js.native
  def round(x: Matrix, n: BigNumber): NoLiteralType[Matrix] = js.native
  def round(x: Matrix, n: MathArray): NoLiteralType[Matrix] = js.native
  
  /**
    * Calculate the secant of a value, defined as sec(x) = 1/cos(x). For
    * matrices, the function is evaluated element wise.
    * @param x Function input
    * @returns The secant of x
    */
  def sec(x: Double): Double = js.native
  def sec(x: Complex): Complex = js.native
  def sec(x: MathArray): MathArray = js.native
  def sec(x: Matrix): Matrix = js.native
  def sec(x: Unit): Double = js.native
  
  /**
    * Calculate the hyperbolic secant of a value, defined as sech(x) = 1 /
    * cosh(x). For matrices, the function is evaluated element wise.
    * @param x Function input
    * @returns The hyperbolic secant of x
    */
  def sech(x: Double): Double = js.native
  def sech(x: Complex): Complex = js.native
  def sech(x: MathArray): MathArray = js.native
  def sech(x: Matrix): Matrix = js.native
  def sech(x: Unit): Double = js.native
  
  /*************************************************************************
    * Set functions
    ************************************************************************/
  /**
    * Create the cartesian product of two (multi)sets. Multi-dimension
    * arrays will be converted to single-dimension arrays before the
    * operation.
    * @param a1 A (multi)set
    * @param a2 A (multi)set
    * @returns The cartesian product of two (multi)sets
    */
  def setCartesian(a1: js.Array[js.Array[Double] | Double], a2: MathArray): js.Array[Double] = js.native
  def setCartesian(a1: js.Array[js.Array[Double] | Double], a2: Matrix): js.Array[Double] = js.native
  def setCartesian(a1: Matrix, a2: MathArray): Matrix = js.native
  def setCartesian(a1: Matrix, a2: Matrix): Matrix = js.native
  
  /**
    * Create the difference of two (multi)sets: every element of set1, that
    * is not the element of set2. Multi-dimension arrays will be converted
    * to single-dimension arrays before the operation
    * @param a1 A (multi)set
    * @param a2 A (multi)set
    * @returns The difference of two (multi)sets
    */
  def setDifference(a1: js.Array[js.Array[Double] | Double], a2: MathArray): js.Array[Double] = js.native
  def setDifference(a1: js.Array[js.Array[Double] | Double], a2: Matrix): js.Array[Double] = js.native
  def setDifference(a1: Matrix, a2: MathArray): Matrix = js.native
  def setDifference(a1: Matrix, a2: Matrix): Matrix = js.native
  
  /**
    * Collect the distinct elements of a multiset. A multi-dimension array
    * will be converted to a single-dimension array before the operation.
    * @param a A multiset
    * @returns A set containing the distinct elements of the multiset
    */
  def setDistinct(a: js.Array[js.Array[Double] | Double]): js.Array[Double] = js.native
  def setDistinct(a: Matrix): Matrix = js.native
  
  /**
    * Create the intersection of two (multi)sets. Multi-dimension arrays
    * will be converted to single-dimension arrays before the operation.
    * @param a1 A (multi)set
    * @param a2 A (multi)set
    * @returns The intersection of two (multi)sets
    */
  def setIntersect(a1: js.Array[js.Array[Double] | Double], a2: MathArray): js.Array[Double] = js.native
  def setIntersect(a1: js.Array[js.Array[Double] | Double], a2: Matrix): js.Array[Double] = js.native
  def setIntersect(a1: Matrix, a2: MathArray): Matrix = js.native
  def setIntersect(a1: Matrix, a2: Matrix): Matrix = js.native
  
  /**
    * Check whether a (multi)set is a subset of another (multi)set. (Every
    * element of set1 is the element of set2.) Multi-dimension arrays will
    * be converted to single-dimension arrays before the operation.
    * @param a1 A (multi)set
    * @param a2 A (multi)set
    * @returns True if a1 is subset of a2, else false
    */
  def setIsSubset(a1: MathArray, a2: MathArray): Boolean = js.native
  def setIsSubset(a1: MathArray, a2: Matrix): Boolean = js.native
  def setIsSubset(a1: Matrix, a2: MathArray): Boolean = js.native
  def setIsSubset(a1: Matrix, a2: Matrix): Boolean = js.native
  
  /**
    * Count the multiplicity of an element in a multiset. A multi-dimension
    * array will be converted to a single-dimension array before the
    * operation.
    * @param e An element in the multiset
    * @param a A multiset
    * @returns The number of how many times the multiset contains the
    * element
    */
  def setMultiplicity(e: Double, a: MathArray): Double = js.native
  def setMultiplicity(e: Double, a: Matrix): Double = js.native
  def setMultiplicity(e: BigNumber, a: MathArray): Double = js.native
  def setMultiplicity(e: BigNumber, a: Matrix): Double = js.native
  def setMultiplicity(e: Complex, a: MathArray): Double = js.native
  def setMultiplicity(e: Complex, a: Matrix): Double = js.native
  def setMultiplicity(e: Fraction, a: MathArray): Double = js.native
  def setMultiplicity(e: Fraction, a: Matrix): Double = js.native
  
  /**
    * Create the powerset of a (multi)set. (The powerset contains very
    * possible subsets of a (multi)set.) A multi-dimension array will be
    * converted to a single-dimension array before the operation.
    * @param a A multiset
    * @returns The powerset of the (multi)set
    */
  def setPowerset(a: js.Array[js.Array[Double] | Double]): js.Array[Double] = js.native
  def setPowerset(a: Matrix): Matrix = js.native
  
  /**
    * Count the number of elements of a (multi)set. When a second parameter
    * is ‘true’, count only the unique values. A multi-dimension array will
    * be converted to a single-dimension array before the operation.
    * @param a A multiset
    * @returns The number of elements of the (multi)set
    */
  def setSize(a: MathArray): Double = js.native
  def setSize(a: Matrix): Double = js.native
  
  /**
    * Create the symmetric difference of two (multi)sets. Multi-dimension
    * arrays will be converted to single-dimension arrays before the
    * operation.
    * @param a1 A (multi)set
    * @param a2 A (multi)set
    * @returns The symmetric difference of two (multi)sets
    */
  def setSymDifference(a1: js.Array[js.Array[Double] | Double], a2: MathArray): js.Array[Double] = js.native
  def setSymDifference(a1: js.Array[js.Array[Double] | Double], a2: Matrix): js.Array[Double] = js.native
  def setSymDifference(a1: Matrix, a2: MathArray): Matrix = js.native
  def setSymDifference(a1: Matrix, a2: Matrix): Matrix = js.native
  
  /**
    * Create the union of two (multi)sets. Multi-dimension arrays will be
    * converted to single-dimension arrays before the operation.
    * @param a1 A (multi)set
    * @param a2 A (multi)set
    * @returns The union of two (multi)sets
    */
  def setUnion(a1: js.Array[js.Array[Double] | Double], a2: MathArray): js.Array[Double] = js.native
  def setUnion(a1: js.Array[js.Array[Double] | Double], a2: Matrix): js.Array[Double] = js.native
  def setUnion(a1: Matrix, a2: MathArray): Matrix = js.native
  def setUnion(a1: Matrix, a2: Matrix): Matrix = js.native
  
  /**
    * Compute the sign of a value. The sign of a value x is: 1 when x > 1
    * -1 when x < 0 0 when x == 0 For matrices, the function is evaluated
    * element wise.
    * @param x The number for which to determine the sign
    * @returns The sign of x
    */
  def sign(x: Double): Double = js.native
  def sign(x: BigNumber): BigNumber = js.native
  def sign(x: Complex): Complex = js.native
  def sign(x: Fraction): Fraction = js.native
  def sign(x: MathArray): MathArray = js.native
  def sign(x: Matrix): Matrix = js.native
  def sign(x: Unit): Unit = js.native
  
  def simplify(expr: String): MathNode = js.native
  def simplify(expr: String, rules: js.UndefOr[scala.Nothing], scope: js.Object): MathNode = js.native
  def simplify(expr: String, rules: js.Array[R | String | (js.Function1[/* node */ MathNode, MathNode])]): MathNode = js.native
  def simplify(
    expr: String,
    rules: js.Array[R | String | (js.Function1[/* node */ MathNode, MathNode])],
    scope: js.Object
  ): MathNode = js.native
  /**
    * Simplify an expression tree.
    * @param expr The expression to be simplified
    * @param rules A list of rules are applied to an expression, repeating
    * over the list until no further changes are made. It’s possible to
    * pass a custom set of rules to the function as second argument. A rule
    * can be specified as an object, string, or function.
    * @param scope Scope to variables
    * @returns Returns the simplified form of expr
    */
  def simplify(expr: MathNode): MathNode = js.native
  def simplify(expr: MathNode, rules: js.UndefOr[scala.Nothing], scope: js.Object): MathNode = js.native
  def simplify(expr: MathNode, rules: js.Array[R | String | (js.Function1[/* node */ MathNode, MathNode])]): MathNode = js.native
  def simplify(
    expr: MathNode,
    rules: js.Array[R | String | (js.Function1[/* node */ MathNode, MathNode])],
    scope: js.Object
  ): MathNode = js.native
  
  /**
    * Calculate the sine of a value. For matrices, the function is
    * evaluated element wise.
    * @param x Function input
    * @returns The sine of x
    */
  def sin(x: Double): Double = js.native
  def sin(x: BigNumber): BigNumber = js.native
  def sin(x: Complex): Complex = js.native
  def sin(x: MathArray): MathArray = js.native
  def sin(x: Matrix): Matrix = js.native
  def sin(x: Unit): Double = js.native
  
  /**
    * Calculate the hyperbolic sine of a value, defined as sinh(x) = 1/2 *
    * (exp(x) - exp(-x)). For matrices, the function is evaluated element
    * wise.
    * @param x Function input
    * @returns The hyperbolic sine of x
    */
  def sinh(x: Double): Double = js.native
  def sinh(x: BigNumber): BigNumber = js.native
  def sinh(x: Complex): Complex = js.native
  def sinh(x: MathArray): MathArray = js.native
  def sinh(x: Matrix): Matrix = js.native
  def sinh(x: Unit): Double = js.native
  
  def size(x: String): MathArray | Matrix = js.native
  /**
    * Calculate the size of a matrix or scalar.
    * @param A matrix
    * @returns A vector with the size of x
    */
  def size(x: Boolean): MathArray | Matrix = js.native
  def size(x: Double): MathArray | Matrix = js.native
  def size(x: Complex): MathArray | Matrix = js.native
  def size(x: MathArray): MathArray | Matrix = js.native
  def size(x: Matrix): MathArray | Matrix = js.native
  def size(x: Unit): MathArray | Matrix = js.native
  
  /**
    * Calculate the Sparse Matrix LU decomposition with full pivoting.
    * Sparse Matrix A is decomposed in two matrices (L, U) and two
    * permutation vectors (pinv, q) where P * A * Q = L * U
    * @param A A two dimensional sparse matrix for which to get the LU
    * decomposition.
    * @param order The Symbolic Ordering and Analysis order: 0 - Natural
    * ordering, no permutation vector q is returned 1 - Matrix must be
    * square, symbolic ordering and analisis is performed on M = A + A' 2 -
    * Symbolic ordering and analysis is performed on M = A' * A. Dense
    * columns from A' are dropped, A recreated from A'. This is appropriate
    * for LU factorization of non-symmetric matrices. 3 - Symbolic ordering
    * and analysis is performed on M = A' * A. This is best used for LU
    * factorization is matrix M has no dense rows. A dense row is a row
    * with more than 10*sqr(columns) entries.
    * @param threshold Partial pivoting threshold (1 for partial pivoting)
    * @returns The lower triangular matrix, the upper triangular matrix and
    * the permutation vectors.
    */
  def slu(A: Matrix, order: Double, threshold: Double): js.Object = js.native
  
  def smaller(x: String, y: String): Boolean | MathArray | Matrix = js.native
  def smaller(x: String, y: MathType): Boolean | MathArray | Matrix = js.native
  def smaller(x: MathType, y: String): Boolean | MathArray | Matrix = js.native
  /**
    * Test whether value x is smaller than y. The function returns true
    * when x is smaller than y and the relative difference between x and y
    * is smaller than the configured epsilon. The function cannot be used
    * to compare values smaller than approximately 2.22e-16. For matrices,
    * the function is evaluated element wise.
    * @param x First value to compare
    * @param y Second value to vcompare
    * @returns Returns true when x is smaller than y, else returns false
    */
  def smaller(x: MathType, y: MathType): Boolean | MathArray | Matrix = js.native
  
  def smallerEq(x: String, y: String): Boolean | MathArray | Matrix = js.native
  def smallerEq(x: String, y: MathType): Boolean | MathArray | Matrix = js.native
  def smallerEq(x: MathType, y: String): Boolean | MathArray | Matrix = js.native
  /**
    * Test whether value x is smaller or equal to y. The function returns
    * true when x is smaller than y or the relative difference between x
    * and y is smaller than the configured epsilon. The function cannot be
    * used to compare values smaller than approximately 2.22e-16. For
    * matrices, the function is evaluated element wise.
    * @param x First value to compare
    * @param y Second value to vcompare
    * @returns Returns true when x is smaller than or equal to y, else
    * returns false
    */
  def smallerEq(x: MathType, y: MathType): Boolean | MathArray | Matrix = js.native
  
  def sort(
    x: js.Array[js.Array[Double] | Double],
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]
  ): js.Array[Double] = js.native
  /**
    * Sort the items in a matrix
    * @param x A one dimensional matrix or array to sort
    * @param compare An optional _comparator function or name. The function
    * is called as compare(a, b), and must return 1 when a > b, -1 when a <
    * b, and 0 when a == b. Default value: ‘asc’
    * @returns Returns the sorted matrix
    */
  def sort(x: Matrix, compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): Matrix = js.native
  @JSName("sort")
  def sort_asc(x: js.Array[js.Array[Double] | Double], compare: asc): js.Array[Double] = js.native
  @JSName("sort")
  def sort_asc(x: Matrix, compare: asc): Matrix = js.native
  @JSName("sort")
  def sort_desc(x: js.Array[js.Array[Double] | Double], compare: desc): js.Array[Double] = js.native
  @JSName("sort")
  def sort_desc(x: Matrix, compare: desc): Matrix = js.native
  @JSName("sort")
  def sort_natural(x: js.Array[js.Array[Double] | Double], compare: natural): js.Array[Double] = js.native
  @JSName("sort")
  def sort_natural(x: Matrix, compare: natural): Matrix = js.native
  
  /**
    * Create a Sparse Matrix. The function creates a new math.type.Matrix
    * object from an Array. A Matrix has utility functions to manipulate
    * the data in the matrix, like getting the size and getting or setting
    * values in the matrix.
    * @param data A two dimensional array
    * @param dataType Sparse Matrix data type
    * @returns The created matrix
    */
  def sparse(): Matrix = js.native
  def sparse(data: js.UndefOr[scala.Nothing], dataType: String): Matrix = js.native
  def sparse(data: MathArray): Matrix = js.native
  def sparse(data: MathArray, dataType: String): Matrix = js.native
  def sparse(data: Matrix): Matrix = js.native
  def sparse(data: Matrix, dataType: String): Matrix = js.native
  
  /**
    * Split a unit in an array of units whose sum is equal to the original
    * unit.
    * @param unit A unit to be split
    * @param parts An array of strings or valueless units
    * @returns An array of units
    */
  def splitUnit(unit: Unit, parts: js.Array[Unit]): js.Array[Unit] = js.native
  
  /**
    * Calculate the square root of a value. For matrices, the function is
    * evaluated element wise.
    * @param x Value for which to calculate the square root
    * @returns Returns the square root of x
    */
  def sqrt(x: Double): Double = js.native
  def sqrt(x: BigNumber): BigNumber = js.native
  def sqrt(x: Complex): Complex = js.native
  def sqrt(x: MathArray): MathArray = js.native
  def sqrt(x: Matrix): Matrix = js.native
  def sqrt(x: Unit): Unit = js.native
  
  /**
    * Calculate the principal square root of a square matrix. The principal
    * square root matrix X of another matrix A is such that X * X = A.
    * @param A The square matrix A
    * @returns The principal square root of matrix A
    */
  def sqrtm(A: js.Array[js.Array[Double] | Double]): js.Array[Double] = js.native
  def sqrtm(A: Matrix): Matrix = js.native
  
  /**
    * Compute the square of a value, x * x. For matrices, the function is
    * evaluated element wise.
    * @param x Number for which to calculate the square
    * @returns Squared value
    */
  def square(x: Double): Double = js.native
  def square(x: BigNumber): BigNumber = js.native
  def square(x: Complex): Complex = js.native
  def square(x: Fraction): Fraction = js.native
  def square(x: MathArray): MathArray = js.native
  def square(x: Matrix): Matrix = js.native
  def square(x: Unit): Unit = js.native
  
  /**
    * Squeeze a matrix, remove inner and outer singleton dimensions from a
    * matrix.
    * @param x Matrix to be squeezed
    * @returns Squeezed matrix
    */
  def squeeze(x: js.Array[js.Array[Double] | Double]): js.Array[Double] = js.native
  def squeeze(x: Matrix): Matrix = js.native
  
  /**
    * Compute the standard deviation of a matrix or a list with values. The
    * standard deviations is defined as the square root of the variance:
    * std(A) = sqrt(variance(A)). In case of a (multi dimensional) array or
    * matrix, the standard deviation over all elements will be calculated.
    * Optionally, the type of normalization can be specified as second
    * parameter. The parameter normalization can be one of the following
    * values: 'unbiased' (default) The sum of squared errors is divided by
    * (n - 1) 'uncorrected' The sum of squared errors is divided by n
    * 'biased' The sum of squared errors is divided by (n + 1)
    * @param array A single matrix or multiple scalar values
    * @param normalization Determines how to normalize the variance. Choose
    * ‘unbiased’ (default), ‘uncorrected’, or ‘biased’. Default value:
    * ‘unbiased’.
    * @returns The standard deviation
    */
  def std(array: MathArray): Double = js.native
  def std(array: Matrix): Double = js.native
  @JSName("std")
  def std_biased(array: MathArray, normalization: biased): Double = js.native
  @JSName("std")
  def std_biased(array: Matrix, normalization: biased): Double = js.native
  @JSName("std")
  def std_unbiased(array: MathArray, normalization: unbiased): Double = js.native
  @JSName("std")
  def std_unbiased(array: Matrix, normalization: unbiased): Double = js.native
  @JSName("std")
  def std_uncorrected(array: MathArray, normalization: uncorrected): Double = js.native
  @JSName("std")
  def std_uncorrected(array: Matrix, normalization: uncorrected): Double = js.native
  
  /**
    * The Stirling numbers of the second kind, counts the number of ways to
    * partition a set of n labelled objects into k nonempty unlabelled
    * subsets. stirlingS2 only takes integer arguments. The following
    * condition must be enforced: k <= n. If n = k or k = 1, then s(n,k) =
    * 1
    * @param n Total number of objects in the set
    * @param k Number of objects in the subset
    * @returns S(n,k)
    */
  def stirlingS2(n: Double, k: Double): NoLiteralType[Double] = js.native
  def stirlingS2(n: Double, k: BigNumber): NoLiteralType[Double] = js.native
  def stirlingS2(n: Decimal, k: Double): NoLiteralType[Decimal] = js.native
  def stirlingS2(n: Decimal, k: BigNumber): NoLiteralType[Decimal] = js.native
  
  /**
    * Create a string or convert any object into a string. Elements of
    * Arrays and Matrices are processed element wise.
    * @param value A value to convert to a string
    * @returns The created string
    */
  def string(): String | MathArray | Matrix = js.native
  def string(value: MathType): String | MathArray | Matrix = js.native
  
  def subset(value: String, index: Index): String = js.native
  def subset(value: String, index: Index, replacement: js.UndefOr[scala.Nothing], defaultValue: js.Any): String = js.native
  def subset(value: String, index: Index, replacement: js.Any): String = js.native
  def subset(value: String, index: Index, replacement: js.Any, defaultValue: js.Any): String = js.native
  /**
    * Get or set a subset of a matrix or string.
    * @param value An array, matrix, or string
    * @param index An index containing ranges for each dimension
    * @param replacement An array, matrix, or scalar. If provided, the
    * subset is replaced with replacement. If not provided, the subset is
    * returned
    * @param defaultValue Default value, filled in on new entries when the
    * matrix is resized. If not provided, math.matrix elements will be left
    * undefined. Default value: undefined.
    * @returns Either the retrieved subset or the updated matrix
    */
  def subset(value: js.Array[js.Array[Double] | Double], index: Index): js.Array[Double] = js.native
  def subset(
    value: js.Array[js.Array[Double] | Double],
    index: Index,
    replacement: js.UndefOr[scala.Nothing],
    defaultValue: js.Any
  ): js.Array[Double] = js.native
  def subset(value: js.Array[js.Array[Double] | Double], index: Index, replacement: js.Any): js.Array[Double] = js.native
  def subset(
    value: js.Array[js.Array[Double] | Double],
    index: Index,
    replacement: js.Any,
    defaultValue: js.Any
  ): js.Array[Double] = js.native
  def subset(value: Matrix, index: Index): Matrix = js.native
  def subset(value: Matrix, index: Index, replacement: js.UndefOr[scala.Nothing], defaultValue: js.Any): Matrix = js.native
  def subset(value: Matrix, index: Index, replacement: js.Any): Matrix = js.native
  def subset(value: Matrix, index: Index, replacement: js.Any, defaultValue: js.Any): Matrix = js.native
  
  /**
    * Subtract two values, x - y. For matrices, the function is evaluated
    * element wise.
    * @param x Initial value
    * @param y Value to subtract from x
    * @returns Subtraction of x and y
    */
  def subtract(x: MathType, y: MathType): MathType = js.native
  
  /**
    * Compute the sum of a matrix or a list with values. In case of a
    * (multi dimensional) array or matrix, the sum of all elements will be
    * calculated.
    * @param args A single matrix or multiple scalar values
    * @returns The sum of all values
    */
  def sum(args: (Double | BigNumber | Fraction)*): js.Any = js.native
  /**
    * @param array A single matrix
    * @returns The sum of all values
    */
  def sum(array: MathArray): js.Any = js.native
  def sum(array: Matrix): js.Any = js.native
  
  /**
    * Calculate the tangent of a value. tan(x) is equal to sin(x) / cos(x).
    * For matrices, the function is evaluated element wise.
    * @param x Function input
    * @returns The tangent of x
    */
  def tan(x: Double): Double = js.native
  def tan(x: BigNumber): BigNumber = js.native
  def tan(x: Complex): Complex = js.native
  def tan(x: MathArray): MathArray = js.native
  def tan(x: Matrix): Matrix = js.native
  def tan(x: Unit): Double = js.native
  
  /**
    * Calculate the hyperbolic tangent of a value, defined as tanh(x) =
    * (exp(2 * x) - 1) / (exp(2 * x) + 1). For matrices, the function is
    * evaluated element wise.
    * @param x Function input
    * @returns The hyperbolic tangent of x
    */
  def tanh(x: Double): Double = js.native
  def tanh(x: BigNumber): BigNumber = js.native
  def tanh(x: Complex): Complex = js.native
  def tanh(x: MathArray): MathArray = js.native
  def tanh(x: Matrix): Matrix = js.native
  def tanh(x: Unit): Double = js.native
  
  var tau: Double = js.native
  
  def to(x: MathArray, unit: String): Unit | MathArray | Matrix = js.native
  def to(x: MathArray, unit: Unit): Unit | MathArray | Matrix = js.native
  def to(x: Matrix, unit: String): Unit | MathArray | Matrix = js.native
  def to(x: Matrix, unit: Unit): Unit | MathArray | Matrix = js.native
  def to(x: Unit, unit: String): Unit | MathArray | Matrix = js.native
  /*************************************************************************
    * Unit functions
    ************************************************************************/
  /**
    * Change the unit of a value. For matrices, the function is evaluated
    * element wise.
    * @param x The unit to be converted.
    * @param unit New unit. Can be a string like "cm" or a unit without
    * value.
    * @returns Value with changed, fixed unit
    */
  def to(x: Unit, unit: Unit): Unit | MathArray | Matrix = js.native
  
  /**
    * Calculate the trace of a matrix: the sum of the elements on the main
    * diagonal of a square matrix.
    * @param x A matrix
    * @returns The trace of x
    */
  def trace(x: MathArray): Double = js.native
  def trace(x: Matrix): Double = js.native
  
  /**
    * Transpose a matrix. All values of the matrix are reflected over its
    * main diagonal. Only two dimensional matrices are supported.
    * @param x Matrix to be transposed
    * @returns The transposed matrix
    */
  def transpose(x: js.Array[js.Array[Double] | Double]): js.Array[Double] = js.native
  def transpose(x: Matrix): Matrix = js.native
  
  /**
    * Determine the type of a variable.
    * @param x The variable for which to test the type
    * @returns Returns the name of the type. Primitive types are lower
    * case, non-primitive types are upper-camel-case. For example ‘number’,
    * ‘string’, ‘Array’, ‘Date’.
    */
  def typeOf(x: js.Any): String = js.native
  
  /**
    * Create a typed-function which checks the types of the arguments and
    * can match them against multiple provided signatures. The
    * typed-function automatically converts inputs in order to find a
    * matching signature. Typed functions throw informative errors in case
    * of wrong input arguments.
    * @param name Optional name for the typed-function
    * @param signatures Object with one or multiple function signatures
    * @returns The created typed-function.
    */
  def typed(name: String, signatures: Record[String, js.Function1[/* repeated */ _, _]]): js.Function1[/* repeated */ js.Any, _] = js.native
  
  /**
    * Inverse the sign of a value, apply a unary minus operation. For
    * matrices, the function is evaluated element wise. Boolean values and
    * strings will be converted to a number. For complex numbers, both real
    * and complex value are inverted.
    * @param x Number to be inverted
    * @returns Retursn the value with inverted sign
    */
  def unaryMinus(x: Double): Double = js.native
  def unaryMinus(x: BigNumber): BigNumber = js.native
  def unaryMinus(x: Complex): Complex = js.native
  def unaryMinus(x: Fraction): Fraction = js.native
  def unaryMinus(x: MathArray): MathArray = js.native
  def unaryMinus(x: Matrix): Matrix = js.native
  def unaryMinus(x: Unit): Unit = js.native
  
  def unaryPlus(x: String): String = js.native
  /**
    * Unary plus operation. Boolean values and strings will be converted to
    * a number, numeric values will be returned as is. For matrices, the
    * function is evaluated element wise.
    * @param x Input value
    * @returns Returns the input value when numeric, converts to a number
    * when input is non-numeric.
    */
  def unaryPlus(x: Double): Double = js.native
  def unaryPlus(x: BigNumber): BigNumber = js.native
  def unaryPlus(x: Complex): Complex = js.native
  def unaryPlus(x: Fraction): Fraction = js.native
  def unaryPlus(x: MathArray): MathArray = js.native
  def unaryPlus(x: Matrix): Matrix = js.native
  def unaryPlus(x: Unit): Unit = js.native
  
  def unequal(x: String, y: String): Boolean | MathArray | Matrix = js.native
  def unequal(x: String, y: MathType): Boolean | MathArray | Matrix = js.native
  def unequal(x: MathType, y: String): Boolean | MathArray | Matrix = js.native
  /**
    * Test whether two values are unequal. The function tests whether the
    * relative difference between x and y is larger than the configured
    * epsilon. The function cannot be used to compare values smaller than
    * approximately 2.22e-16. For matrices, the function is evaluated
    * element wise. In case of complex numbers, x.re must unequal y.re, or
    * x.im must unequal y.im. Values null and undefined are compared
    * strictly, thus null is unequal with everything except null, and
    * undefined is unequal with everything except undefined.
    * @param x First value to compare
    * @param y Second value to vcompare
    * @returns Returns true when the compared values are unequal, else
    * returns false
    */
  def unequal(x: MathType, y: MathType): Boolean | MathArray | Matrix = js.native
  
  var uninitialized: js.Any = js.native
  
  /**
    * Create a unit. Depending on the passed arguments, the function will
    * create and return a new math.type.Unit object. When a matrix is
    * provided, all elements will be converted to units.
    * @param unit The unit to be created
    * @returns The created unit
    */
  def unit(unit: String): Unit = js.native
  /**
    * @param value The value of the unit to be created
    * @param unit The unit to be created
    * @returns The created unit
    */
  def unit(value: Double, unit: String): Unit = js.native
  def unit(value: MathArray, unit: String): Unit = js.native
  def unit(value: Matrix, unit: String): Unit = js.native
  
  def usolve(U: MathArray, b: MathArray): Matrix | MathArray = js.native
  def usolve(U: MathArray, b: Matrix): Matrix | MathArray = js.native
  def usolve(U: Matrix, b: MathArray): Matrix | MathArray = js.native
  /**
    * Solves the linear equation system by backward substitution. Matrix
    * must be an upper triangular matrix. U * x = b
    * @param U A N x N matrix or array (U)
    * @param b A column vector with the b values
    * @returns A column vector with the linear system solution (x)
    */
  def usolve(U: Matrix, b: Matrix): Matrix | MathArray = js.native
  
  /**
    * Compute the variance of a matrix or a list with values. In case of a
    * (multi dimensional) array or matrix, the variance over all elements
    * will be calculated. Optionally, the type of normalization can be
    * specified as second parameter. The parameter normalization can be one
    * of the following values: 'unbiased' (default) The sum of squared
    * errors is divided by (n - 1) 'uncorrected' The sum of squared errors
    * is divided by n 'biased' The sum of squared errors is divided by (n +
    * 1) Note that older browser may not like the variable name var. In
    * that case, the function can be called as math['var'](...) instead of
    * math.variance(...).
    * @param args A single matrix or multiple scalar values
    * @returns The variance
    */
  def variance(args: (Double | BigNumber | Fraction)*): js.Any = js.native
  /**
    * @param array A single matrix
    * @param normalization normalization Determines how to normalize the
    * variance. Choose ‘unbiased’ (default), ‘uncorrected’, or ‘biased’.
    * Default value: ‘unbiased’.
    * @returns The variance
    */
  def variance(array: MathArray): js.Any = js.native
  def variance(array: Matrix): js.Any = js.native
  @JSName("variance")
  def variance_biased(array: MathArray, normalization: biased): js.Any = js.native
  @JSName("variance")
  def variance_biased(array: Matrix, normalization: biased): js.Any = js.native
  @JSName("variance")
  def variance_unbiased(array: MathArray, normalization: unbiased): js.Any = js.native
  @JSName("variance")
  def variance_unbiased(array: Matrix, normalization: unbiased): js.Any = js.native
  @JSName("variance")
  def variance_uncorrected(array: MathArray, normalization: uncorrected): js.Any = js.native
  @JSName("variance")
  def variance_uncorrected(array: Matrix, normalization: uncorrected): js.Any = js.native
  
  var version: String = js.native
  
  /**
    * Calculate the extended greatest common divisor for two values. See
    * http://en.wikipedia.org/wiki/Extended_Euclidean_algorithm.
    * @param a An integer number
    * @param b An integer number
    * @returns Returns an array containing 3 integers [div, m, n] where div
    * = gcd(a, b) and a*m + b*n = div
    */
  def xgcd(a: Double, b: Double): MathArray = js.native
  def xgcd(a: Double, b: BigNumber): MathArray = js.native
  def xgcd(a: BigNumber, b: Double): MathArray = js.native
  def xgcd(a: BigNumber, b: BigNumber): MathArray = js.native
  
  /**
    * Logical xor. Test whether one and only one value is defined with a
    * nonzero/nonempty value. For matrices, the function is evaluated
    * element wise.
    * @param x First value to xor
    * @param y Second value to xor
    * @returns Returns true when one and only one input is defined with a
    * nonzero/nonempty value.
    */
  def xor(x: Double, y: Double): Boolean | MathArray | Matrix = js.native
  def xor(x: Double, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def xor(x: Double, y: Complex): Boolean | MathArray | Matrix = js.native
  def xor(x: Double, y: MathArray): Boolean | MathArray | Matrix = js.native
  def xor(x: Double, y: Matrix): Boolean | MathArray | Matrix = js.native
  def xor(x: Double, y: Unit): Boolean | MathArray | Matrix = js.native
  def xor(x: BigNumber, y: Double): Boolean | MathArray | Matrix = js.native
  def xor(x: BigNumber, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def xor(x: BigNumber, y: Complex): Boolean | MathArray | Matrix = js.native
  def xor(x: BigNumber, y: MathArray): Boolean | MathArray | Matrix = js.native
  def xor(x: BigNumber, y: Matrix): Boolean | MathArray | Matrix = js.native
  def xor(x: BigNumber, y: Unit): Boolean | MathArray | Matrix = js.native
  def xor(x: Complex, y: Double): Boolean | MathArray | Matrix = js.native
  def xor(x: Complex, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def xor(x: Complex, y: Complex): Boolean | MathArray | Matrix = js.native
  def xor(x: Complex, y: MathArray): Boolean | MathArray | Matrix = js.native
  def xor(x: Complex, y: Matrix): Boolean | MathArray | Matrix = js.native
  def xor(x: Complex, y: Unit): Boolean | MathArray | Matrix = js.native
  def xor(x: MathArray, y: Double): Boolean | MathArray | Matrix = js.native
  def xor(x: MathArray, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def xor(x: MathArray, y: Complex): Boolean | MathArray | Matrix = js.native
  def xor(x: MathArray, y: MathArray): Boolean | MathArray | Matrix = js.native
  def xor(x: MathArray, y: Matrix): Boolean | MathArray | Matrix = js.native
  def xor(x: MathArray, y: Unit): Boolean | MathArray | Matrix = js.native
  def xor(x: Matrix, y: Double): Boolean | MathArray | Matrix = js.native
  def xor(x: Matrix, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def xor(x: Matrix, y: Complex): Boolean | MathArray | Matrix = js.native
  def xor(x: Matrix, y: MathArray): Boolean | MathArray | Matrix = js.native
  def xor(x: Matrix, y: Matrix): Boolean | MathArray | Matrix = js.native
  def xor(x: Matrix, y: Unit): Boolean | MathArray | Matrix = js.native
  def xor(x: Unit, y: Double): Boolean | MathArray | Matrix = js.native
  def xor(x: Unit, y: BigNumber): Boolean | MathArray | Matrix = js.native
  def xor(x: Unit, y: Complex): Boolean | MathArray | Matrix = js.native
  def xor(x: Unit, y: MathArray): Boolean | MathArray | Matrix = js.native
  def xor(x: Unit, y: Matrix): Boolean | MathArray | Matrix = js.native
  def xor(x: Unit, y: Unit): Boolean | MathArray | Matrix = js.native
  
  /**
    * @param m The x dimension of the matrix
    * @param n The y dimension of the matrix
    * @param format The matrix storage format
    * @returns A matrix filled with zeros
    */
  def zeros(m: Double, n: Double): MathArray | Matrix = js.native
  def zeros(m: Double, n: Double, format: String): MathArray | Matrix = js.native
  def zeros(size: js.Array[Double]): MathArray | Matrix = js.native
  def zeros(size: js.Array[Double], format: String): MathArray | Matrix = js.native
  /**
    * Create a matrix filled with zeros. The created matrix can have one or
    * multiple dimensions.
    * @param size The size of each dimension of the matrix
    * @param format The matrix storage format
    * @returns A matrix filled with zeros
    */
  def zeros(size: Double): MathArray | Matrix = js.native
  def zeros(size: Double, format: String): MathArray | Matrix = js.native
}
