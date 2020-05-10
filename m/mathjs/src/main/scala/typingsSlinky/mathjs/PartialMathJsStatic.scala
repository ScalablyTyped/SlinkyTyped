package typingsSlinky.mathjs

import typingsSlinky.mathjs.mathjsBooleans.`true`
import typingsSlinky.mathjs.mathjsStrings.asc
import typingsSlinky.mathjs.mathjsStrings.biased
import typingsSlinky.mathjs.mathjsStrings.dense
import typingsSlinky.mathjs.mathjsStrings.desc
import typingsSlinky.mathjs.mathjsStrings.natural
import typingsSlinky.mathjs.mathjsStrings.sparse
import typingsSlinky.mathjs.mathjsStrings.unbiased
import typingsSlinky.mathjs.mathjsStrings.uncorrected
import typingsSlinky.mathjs.mod.BigNumber
import typingsSlinky.mathjs.mod.Complex
import typingsSlinky.mathjs.mod.ConfigOptions
import typingsSlinky.mathjs.mod.CreateUnitOptions
import typingsSlinky.mathjs.mod.EvalFunction
import typingsSlinky.mathjs.mod.FactoryFunction
import typingsSlinky.mathjs.mod.FactoryFunctionMap
import typingsSlinky.mathjs.mod.FormatOptions
import typingsSlinky.mathjs.mod.Fraction
import typingsSlinky.mathjs.mod.Help
import typingsSlinky.mathjs.mod.ImportObject
import typingsSlinky.mathjs.mod.ImportOptions
import typingsSlinky.mathjs.mod.Index
import typingsSlinky.mathjs.mod.MathArray
import typingsSlinky.mathjs.mod.MathExpression
import typingsSlinky.mathjs.mod.MathJsChain
import typingsSlinky.mathjs.mod.MathJsFunctionName
import typingsSlinky.mathjs.mod.MathJsJson
import typingsSlinky.mathjs.mod.MathJsStatic
import typingsSlinky.mathjs.mod.MathNode
import typingsSlinky.mathjs.mod.MathType
import typingsSlinky.mathjs.mod.Matrix
import typingsSlinky.mathjs.mod.NoLiteralType
import typingsSlinky.mathjs.mod.Parser
import typingsSlinky.mathjs.mod.PolarCoordinates
import typingsSlinky.mathjs.mod.Unit
import typingsSlinky.mathjs.mod.UnitDefinition
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mathjs.mathjs.MathJsStatic> */
@js.native
trait PartialMathJsStatic extends js.Object {
  var AccessorNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ArrayNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var AssignmentNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var BigNumberDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var BlockNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ChainDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ComplexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ConditionalNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ConstantNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var DenseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var EDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var FibonacciHeapDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var FractionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var FunctionAssignmentNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var FunctionNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var HelpDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ImmutableDenseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var IndexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var IndexNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var Infinity: js.UndefOr[Double] = js.native
  var InfinityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var LN10: js.UndefOr[Double] = js.native
  var LN10Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var LN2: js.UndefOr[Double] = js.native
  var LN2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var LOG10E: js.UndefOr[Double] = js.native
  var LOG10EDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var LOG2E: js.UndefOr[Double] = js.native
  var LOG2EDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var MatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var NaN: js.UndefOr[Double] = js.native
  var NaNDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var NodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ObjectNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var OperatorNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var PIDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ParenthesisNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ParserDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var RangeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var RangeNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var RelationalNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ResultSetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var SQRT1_2: js.UndefOr[Double] = js.native
  var SQRT1_2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var SQRT2: js.UndefOr[Double] = js.native
  var SQRT2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var SpaDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var SparseMatrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var SymbolNodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var UnitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var abs: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var absDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acos: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acosDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acosh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acoshDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acot: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acoth: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acothDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acsc: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acscDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var acsch: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var acschDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var add: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
  var addDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var addScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var all: js.UndefOr[FactoryFunctionMap] = js.native
  var and: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.native
  var andDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var applyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var applyTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var arg: js.UndefOr[js.Function1[/* x */ Double | Complex, Double]] = js.native
  var argDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var asec: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var asecDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var asech: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var asechDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var asin: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var asinDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var asinh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var asinhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var atan: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var atan2: js.UndefOr[js.Function2[/* y */ Double, /* x */ Double, Double]] = js.native
  var atan2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var atanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var atanh: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var atanhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var atomicMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var avogadroDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bellNumbers: js.UndefOr[js.Function1[/* n */ Double, Double]] = js.native
  var bellNumbersDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bignumber: js.UndefOr[
    js.Function1[
      /* x */ js.UndefOr[Double | String | Fraction | BigNumber | MathArray | Matrix | Boolean | Null], 
      BigNumber
    ]
  ] = js.native
  var bignumberDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bitAnd: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.native
  var bitAndDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bitNot: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var bitNotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bitOr: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Double]] = js.native
  var bitOrDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bitXor: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.native
  var bitXorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bohrMagnetonDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var bohrRadiusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var boltzmannDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var boolean: js.UndefOr[
    js.Function1[
      /* x */ String | Double | Boolean | MathArray | Matrix | Null, 
      Boolean | MathArray | Matrix
    ]
  ] = js.native
  var booleanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var catalan: js.UndefOr[js.Function1[/* n */ Double, Double]] = js.native
  var catalanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cbrt: js.UndefOr[js.Function2[/* x */ Double, /* allRoots */ js.UndefOr[Boolean], Double]] = js.native
  var cbrtDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ceil: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var ceilDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var chain: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], MathJsChain]] = js.native
  var chainDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var classicalElectronRadiusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cloneDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  @JSName("clone")
  var clone_FPartialMathJsStatic: js.UndefOr[js.Function1[/* x */ js.Any, _]] = js.native
  var columnDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var columnTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var combinations: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.native
  var combinationsDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var compare: js.UndefOr[
    js.Function2[
      /* x */ MathType | String, 
      /* y */ MathType | String, 
      Double | BigNumber | Fraction | MathArray | Matrix
    ]
  ] = js.native
  var compareDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var compareNatural: js.UndefOr[js.Function2[/* x */ js.Any, /* y */ js.Any, Double]] = js.native
  var compareNaturalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var compareText: js.UndefOr[
    js.Function2[
      /* x */ String | MathArray | Matrix, 
      /* y */ String | MathArray | Matrix, 
      Double | MathArray | Matrix
    ]
  ] = js.native
  var compareTextDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var compile: js.UndefOr[js.Function1[/* expr */ MathExpression, EvalFunction]] = js.native
  var compileDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var complex: js.UndefOr[js.Function1[/* arg */ js.UndefOr[Complex | String | PolarCoordinates], Complex]] = js.native
  var complexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var composition: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.native
  var compositionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var concat: js.UndefOr[js.Function1[/* repeated */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var concatDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var concatTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var conductanceQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var config: js.UndefOr[js.Function1[/* options */ ConfigOptions, ConfigOptions]] = js.native
  var conj: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
    ]
  ] = js.native
  var conjDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cos: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var cosDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cosh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var coshDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cot: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var cotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var coth: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var cothDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var coulombDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var create: js.UndefOr[
    js.Function2[
      /* factories */ FactoryFunctionMap, 
      /* config */ ConfigOptions, 
      Partial[MathJsStatic]
    ]
  ] = js.native
  var createUnit: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* definition */ js.UndefOr[String | UnitDefinition], 
      /* options */ js.UndefOr[CreateUnitOptions], 
      Unit
    ]
  ] = js.native
  var createUnitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cross: js.UndefOr[
    js.Function2[/* x */ MathArray | Matrix, /* y */ MathArray | Matrix, Matrix | MathArray]
  ] = js.native
  var crossDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var csc: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var cscDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var csch: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var cschDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ctransposeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var cube: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var cubeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var deepEqual: js.UndefOr[
    js.Function2[
      /* x */ MathType, 
      /* y */ MathType, 
      Double | BigNumber | Fraction | Complex | Unit | MathArray | Matrix
    ]
  ] = js.native
  var deepEqualDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var derivative: js.UndefOr[
    js.Function3[
      /* expr */ MathNode | String, 
      /* variable */ MathNode | String, 
      /* options */ js.UndefOr[AnonSimplify], 
      MathNode
    ]
  ] = js.native
  var derivativeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var det: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, Double]] = js.native
  var detDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var deuteronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var diag: js.UndefOr[
    js.Function2[/* X */ MathArray | Matrix, /* format */ js.UndefOr[String], Matrix]
  ] = js.native
  var diagDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var distance: js.UndefOr[
    js.Function2[
      /* x */ MathArray | Matrix | js.Object, 
      /* y */ MathArray | Matrix | js.Object, 
      Double | BigNumber
    ]
  ] = js.native
  var distanceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var divide: js.UndefOr[js.Function2[/* x */ Unit, /* y */ Unit, Unit]] = js.native
  var divideDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var divideScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var dot: js.UndefOr[js.Function2[/* x */ MathArray | Matrix, /* y */ MathArray | Matrix, Double]] = js.native
  var dotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var dotDivide: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
  var dotDivideDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var dotMultiply: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
  var dotMultiplyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var dotPow: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
  var dotPowDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var e: js.UndefOr[Double] = js.native
  var eDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var efimovFactorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var electricConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var electronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var elementaryChargeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var equal: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var equalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var equalScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var equalText: js.UndefOr[
    js.Function2[
      /* x */ String | MathArray | Matrix, 
      /* y */ String | MathArray | Matrix, 
      Double | MathArray | Matrix
    ]
  ] = js.native
  var equalTextDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var erf: js.UndefOr[
    js.Function1[/* x */ Double | MathArray | Matrix, NoLiteralType[Double | MathArray | Matrix]]
  ] = js.native
  var erfDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var evalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var evaluate: js.UndefOr[
    js.Function2[
      /* expr */ MathExpression | js.Array[MathExpression] | Matrix, 
      /* scope */ js.UndefOr[js.Object], 
      _
    ]
  ] = js.native
  var evaluateDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var exp: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var expDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var expm: js.UndefOr[js.Function1[/* x */ Matrix, Matrix]] = js.native
  var expm1: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var expm1Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var expmDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var expression: js.UndefOr[MathNode] = js.native
  var eyeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var factorial: js.UndefOr[
    js.Function1[
      /* n */ Double | BigNumber | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.native
  var factorialDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var factory: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* dependencies */ js.Array[MathJsFunctionName], 
      /* create */ js.Function1[/* injected */ Partial[MathJsStatic], _], 
      /* meta */ js.UndefOr[js.Any], 
      FactoryFunction[_]
    ]
  ] = js.native
  var falseDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var faradayDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var fermiCouplingDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var filter: js.UndefOr[
    js.Function2[
      /* x */ Matrix | MathArray | js.Array[String], 
      /* test */ (js.Function3[
        /* value */ js.Any, 
        /* index */ js.Any, 
        /* matrix */ Matrix | MathArray | js.Array[String], 
        Boolean
      ]) | js.RegExp, 
      Matrix | MathArray
    ]
  ] = js.native
  var filterDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var filterTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var fineStructureDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var firstRadiationDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var fix: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var fixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var flatten: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var flattenDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var floor: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var floorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var forEach: js.UndefOr[
    js.Function2[
      /* x */ Matrix | MathArray, 
      /* callback */ js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix | MathArray, scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  var forEachDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var forEachTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var format: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* options */ js.UndefOr[FormatOptions | Double | (js.Function1[/* item */ js.Any, String])], 
      /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, String]], 
      String
    ]
  ] = js.native
  var formatDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var fraction: js.UndefOr[
    js.Function1[/* args */ Fraction | MathArray | Matrix, Fraction | MathArray | Matrix]
  ] = js.native
  var fractionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var gamma: js.UndefOr[js.Function1[/* n */ Double | MathArray | Matrix, Double | MathArray | Matrix]] = js.native
  var gammaDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var gasConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var gcd: js.UndefOr[js.Function1[/* repeated */ Double, Double]] = js.native
  var gcdDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var getMatrixDataTypeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var gravitationConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var gravityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var hartreeEnergyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var hasNumericValueDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var help: js.UndefOr[js.Function1[/* search */ js.Function0[_], Help]] = js.native
  var helpDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var hypot: js.UndefOr[js.Function1[/* repeated */ Double, Double]] = js.native
  var hypotDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var i: js.UndefOr[Double] = js.native
  var iDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var identity: js.UndefOr[
    js.Function2[
      /* size */ Double | js.Array[Double] | Matrix | MathArray, 
      /* format */ js.UndefOr[String], 
      Matrix | MathArray | Double
    ]
  ] = js.native
  var identityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var im: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      Double | BigNumber | MathArray | Matrix
    ]
  ] = js.native
  var imDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var `import`: js.UndefOr[
    js.Function2[
      /* object */ ImportObject | js.Array[ImportObject], 
      /* options */ ImportOptions, 
      scala.Unit
    ]
  ] = js.native
  var index: js.UndefOr[js.Function1[/* repeated */ js.Any, Index]] = js.native
  var indexDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var indexTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var intersect: js.UndefOr[
    js.Function4[
      /* w */ MathArray | Matrix, 
      /* x */ MathArray | Matrix, 
      /* y */ MathArray | Matrix, 
      /* z */ MathArray | Matrix, 
      MathArray
    ]
  ] = js.native
  var intersectDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var inv: js.UndefOr[
    js.Function1[
      /* x */ Double | Complex | MathArray | Matrix, 
      NoLiteralType[Double | Complex | MathArray | Matrix]
    ]
  ] = js.native
  var invDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var inverseConductanceQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isInteger: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix, Boolean]
  ] = js.native
  var isIntegerDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isNaN: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
  ] = js.native
  var isNaNDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isNegative: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
  ] = js.native
  var isNegativeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isNumeric: js.UndefOr[js.Function1[/* x */ js.Any, Boolean]] = js.native
  var isNumericDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isPositive: js.UndefOr[
    js.Function1[/* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit, Boolean]
  ] = js.native
  var isPositiveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isPrime: js.UndefOr[js.Function1[/* x */ Double | BigNumber | MathArray | Matrix, Boolean]] = js.native
  var isPrimeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var isZero: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Fraction | MathArray | Matrix | Unit | Complex, 
      Boolean
    ]
  ] = js.native
  var isZeroDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var json: js.UndefOr[MathJsJson] = js.native
  var kldivergence: js.UndefOr[js.Function2[/* q */ MathArray | Matrix, /* p */ MathArray | Matrix, Double]] = js.native
  var kldivergenceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var klitzingDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var kron: js.UndefOr[js.Function2[/* x */ Matrix | MathArray, /* y */ Matrix | MathArray, Matrix]] = js.native
  var kronDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var larger: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var largerDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var largerEq: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var largerEqDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var lcm: js.UndefOr[js.Function2[/* a */ Double, /* b */ Double, Double]] = js.native
  var lcmDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var leftShift: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.native
  var leftShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var log: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      /* base */ js.UndefOr[Double | BigNumber | Complex], 
      NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
    ]
  ] = js.native
  var log10: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var log10Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var log1p: js.UndefOr[
    js.Function2[/* x */ Double, /* base */ js.UndefOr[Double | BigNumber | Complex], Double]
  ] = js.native
  var log1pDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var log2: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var log2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var logDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var loschmidtDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var lsolve: js.UndefOr[
    js.Function2[/* L */ Matrix | MathArray, /* b */ Matrix | MathArray, Matrix | MathArray]
  ] = js.native
  var lsolveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var lup: js.UndefOr[js.Function1[/* A */ js.UndefOr[Matrix | MathArray], AnonL]] = js.native
  var lupDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var lusolve: js.UndefOr[
    js.Function4[
      /* A */ Matrix | MathArray | Double, 
      /* b */ Matrix | MathArray, 
      /* order */ js.UndefOr[Double], 
      /* threshold */ js.UndefOr[Double], 
      Matrix | MathArray
    ]
  ] = js.native
  var lusolveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var mad: js.UndefOr[js.Function1[/* array */ MathArray | Matrix, _]] = js.native
  var madDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var magneticConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var magneticFluxQuantumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var map: js.UndefOr[
    js.Function2[
      /* x */ Matrix | MathArray, 
      /* callback */ js.Function3[
        /* value */ js.Any, 
        /* index */ js.Any, 
        /* matrix */ Matrix | MathArray, 
        MathType | String
      ], 
      Matrix | MathArray
    ]
  ] = js.native
  var mapDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var mapTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var matrix: js.UndefOr[js.Function1[/* format */ js.UndefOr[sparse | dense], Matrix]] = js.native
  var matrixDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var max: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var maxDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var maxTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var mean: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var meanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var meanTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var median: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var medianDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var min: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var minDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var minTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var mod: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Fraction | MathArray | Matrix, 
      /* y */ Double | BigNumber | Fraction | MathArray | Matrix, 
      NoLiteralType[Double | BigNumber | Fraction | MathArray | Matrix]
    ]
  ] = js.native
  var modDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var mode: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var modeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var molarMassC12Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var molarMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var molarPlanckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var molarVolumeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var multinomial: js.UndefOr[
    js.Function1[/* a */ js.Array[Double | BigNumber], NoLiteralType[Double | BigNumber]]
  ] = js.native
  var multinomialDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var multiply: js.UndefOr[js.Function2[/* x */ Matrix | MathArray, /* y */ MathType, Matrix | MathArray]] = js.native
  var multiplyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var multiplyScalarDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var neutronMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var norm: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      /* p */ js.UndefOr[Double | BigNumber | String], 
      Double | BigNumber
    ]
  ] = js.native
  var normDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var not: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.native
  var notDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var nthRoot: js.UndefOr[
    js.Function2[
      /* a */ Double | BigNumber | MathArray | Matrix | Complex, 
      /* root */ js.UndefOr[Double | BigNumber], 
      Double | Complex | MathArray | Matrix
    ]
  ] = js.native
  var nthRootDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var nthRootsDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var nuclearMagnetonDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var `null`: js.UndefOr[Double] = js.native
  var nullDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var number: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[
        String | Double | BigNumber | Fraction | Boolean | MathArray | Matrix | Unit | Null
      ], 
      Double | MathArray | Matrix
    ]
  ] = js.native
  var numberDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var numericDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var ones: js.UndefOr[
    js.Function2[
      /* size */ Double | js.Array[Double], 
      /* format */ js.UndefOr[String], 
      MathArray | Matrix
    ]
  ] = js.native
  var onesDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var or: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.native
  var orDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var parse: js.UndefOr[
    js.Function2[/* expr */ MathExpression, /* options */ js.UndefOr[js.Any], MathNode]
  ] = js.native
  var parseDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var parser: js.UndefOr[js.Function0[Parser]] = js.native
  var parserDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var partitionSelect: js.UndefOr[
    js.Function3[
      /* x */ MathArray | Matrix, 
      /* k */ Double, 
      /* compare */ js.UndefOr[asc | desc | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])], 
      _
    ]
  ] = js.native
  var partitionSelectDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var permutations: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ js.UndefOr[Double | BigNumber], 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.native
  var permutationsDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var phi: js.UndefOr[Double] = js.native
  var phiDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var pi: js.UndefOr[Double] = js.native
  var piDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var pickRandom: js.UndefOr[
    js.Function3[
      /* array */ js.Array[Double], 
      /* number */ js.UndefOr[Double], 
      /* weights */ js.UndefOr[js.Array[Double]], 
      Double | js.Array[Double]
    ]
  ] = js.native
  var pickRandomDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckChargeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckLengthDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckTemperatureDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var planckTimeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var pow: js.UndefOr[js.Function2[/* x */ MathType, /* y */ Double | BigNumber | Complex, MathType]] = js.native
  var powDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var print: js.UndefOr[
    js.Function4[
      /* template */ String, 
      /* values */ js.Any, 
      /* precision */ js.UndefOr[Double], 
      /* options */ js.UndefOr[Double | js.Object], 
      scala.Unit
    ]
  ] = js.native
  var printDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var prod: js.UndefOr[js.Function1[/* repeated */ MathType, _]] = js.native
  var prodDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var protonMassDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var qr: js.UndefOr[js.Function1[/* A */ Matrix | MathArray, AnonQ]] = js.native
  var qrDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var quantileSeq: js.UndefOr[
    js.Function3[
      /* A */ MathArray | Matrix, 
      /* prob */ Double | BigNumber | MathArray, 
      /* sorted */ js.UndefOr[Boolean], 
      Double | BigNumber | Unit | MathArray
    ]
  ] = js.native
  var quantileSeqDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var quantumOfCirculationDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var random: js.UndefOr[js.Function2[/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], Double]] = js.native
  var randomDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var randomInt: js.UndefOr[js.Function2[/* min */ Double, /* max */ js.UndefOr[Double], Double]] = js.native
  var randomIntDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var range: js.UndefOr[js.Function2[/* str */ String, /* includeEnd */ js.UndefOr[Boolean], Matrix]] = js.native
  var rangeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rangeTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rationalize: js.UndefOr[
    js.Function3[
      /* expr */ MathNode | String, 
      /* optional */ js.UndefOr[js.Object | Boolean], 
      /* detailed */ js.UndefOr[`true`], 
      AnonCoefficients
    ]
  ] = js.native
  var rationalizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var re: js.UndefOr[
    js.Function1[
      /* x */ Double | BigNumber | Complex | MathArray | Matrix, 
      Double | BigNumber | MathArray | Matrix
    ]
  ] = js.native
  var reDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var reducedPlanckConstantDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var reshape: js.UndefOr[
    js.Function2[/* x */ MathArray | Matrix, /* sizes */ js.Array[Double], MathArray | Matrix]
  ] = js.native
  var reshapeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var resize: js.UndefOr[
    js.Function3[
      /* x */ MathArray | Matrix, 
      /* size */ MathArray | Matrix, 
      /* defaultValue */ js.UndefOr[Double | String], 
      MathArray | Matrix
    ]
  ] = js.native
  var resizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var reviverDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rightArithShift: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | MathArray | Matrix, 
      /* y */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ]
  ] = js.native
  var rightArithShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rightLogShift: js.UndefOr[
    js.Function2[
      /* x */ Double | MathArray | Matrix, 
      /* y */ Double, 
      NoLiteralType[Double | MathArray | Matrix]
    ]
  ] = js.native
  var rightLogShiftDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var round: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Fraction | Complex | MathArray | Matrix, 
      /* n */ js.UndefOr[Double | BigNumber | MathArray], 
      NoLiteralType[Double | BigNumber | Fraction | Complex | MathArray | Matrix]
    ]
  ] = js.native
  var roundDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rowDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rowTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var rydbergDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sackurTetrodeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sec: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var secDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sech: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var sechDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var secondRadiationDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setCartesian: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.native
  var setCartesianDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setDifference: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.native
  var setDifferenceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setDistinct: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var setDistinctDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setIntersect: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.native
  var setIntersectDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setIsSubset: js.UndefOr[js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, Boolean]] = js.native
  var setIsSubsetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setMultiplicity: js.UndefOr[
    js.Function2[/* e */ Double | BigNumber | Fraction | Complex, /* a */ MathArray | Matrix, Double]
  ] = js.native
  var setMultiplicityDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setPowerset: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var setPowersetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setSize: js.UndefOr[js.Function1[/* a */ MathArray | Matrix, Double]] = js.native
  var setSizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setSymDifference: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.native
  var setSymDifferenceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var setUnion: js.UndefOr[
    js.Function2[/* a1 */ MathArray | Matrix, /* a2 */ MathArray | Matrix, MathArray | Matrix]
  ] = js.native
  var setUnionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sign: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var signDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var simplify: js.UndefOr[
    js.Function3[
      /* expr */ MathNode | String, 
      /* rules */ js.UndefOr[js.Array[AnonR | String | (js.Function1[/* node */ MathNode, MathNode])]], 
      /* scope */ js.UndefOr[js.Object], 
      MathNode
    ]
  ] = js.native
  var simplifyDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sin: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var sinDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sinh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var sinhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var size: js.UndefOr[
    js.Function1[
      /* x */ Boolean | Double | Complex | Unit | String | MathArray | Matrix, 
      MathArray | Matrix
    ]
  ] = js.native
  var sizeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var slu: js.UndefOr[
    js.Function3[/* A */ Matrix, /* order */ Double, /* threshold */ Double, js.Object]
  ] = js.native
  var sluDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var smaller: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var smallerDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var smallerEq: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var smallerEqDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sort: js.UndefOr[
    js.Function2[
      /* x */ Matrix | MathArray, 
      /* compare */ (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) | asc | desc | natural, 
      Matrix | MathArray
    ]
  ] = js.native
  var sortDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sparse: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[MathArray | Matrix], /* dataType */ js.UndefOr[String], Matrix]
  ] = js.native
  var sparseDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var speedOfLightDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var splitUnit: js.UndefOr[js.Function2[/* unit */ Unit, /* parts */ js.Array[Unit], js.Array[Unit]]] = js.native
  var splitUnitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sqrt: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var sqrtDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sqrtm: js.UndefOr[js.Function1[/* A */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var sqrtmDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var square: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var squareDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var squeeze: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var squeezeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var std: js.UndefOr[
    js.Function2[
      /* array */ MathArray | Matrix, 
      /* normalization */ js.UndefOr[unbiased | uncorrected | biased], 
      Double
    ]
  ] = js.native
  var stdDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var stdTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var stefanBoltzmannDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var stirlingS2: js.UndefOr[
    js.Function2[
      /* n */ Double | BigNumber, 
      /* k */ Double | BigNumber, 
      NoLiteralType[Double | BigNumber]
    ]
  ] = js.native
  var stirlingS2Dependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var string: js.UndefOr[js.Function1[/* value */ MathType | Null, String | MathArray | Matrix]] = js.native
  var stringDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var subset: js.UndefOr[
    js.Function4[
      /* value */ MathArray | Matrix | String, 
      /* index */ Index, 
      /* replacement */ js.UndefOr[js.Any], 
      /* defaultValue */ js.UndefOr[js.Any], 
      MathArray | Matrix | String
    ]
  ] = js.native
  var subsetDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var subsetTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var subtract: js.UndefOr[js.Function2[/* x */ MathType, /* y */ MathType, MathType]] = js.native
  var subtractDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sum: js.UndefOr[js.Function1[/* repeated */ Double | BigNumber | Fraction, _]] = js.native
  var sumDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var sumTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var tan: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var tanDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var tanh: js.UndefOr[js.Function1[/* x */ Double | Unit, Double]] = js.native
  var tanhDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var tau: js.UndefOr[Double] = js.native
  var tauDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var thomsonCrossSectionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var to: js.UndefOr[
    js.Function2[
      /* x */ Unit | MathArray | Matrix, 
      /* unit */ Unit | String, 
      Unit | MathArray | Matrix
    ]
  ] = js.native
  var toDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var trace: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, Double]] = js.native
  var traceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var transpose: js.UndefOr[js.Function1[/* x */ MathArray | Matrix, MathArray | Matrix]] = js.native
  var transposeDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var trueDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var typeOf: js.UndefOr[js.Function1[/* x */ js.Any, String]] = js.native
  var typeOfDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var typed: js.UndefOr[
    js.Function2[
      /* name */ String, 
      /* signatures */ Record[String, js.Function1[/* repeated */ _, _]], 
      js.Function1[/* repeated */ _, _]
    ]
  ] = js.native
  var typedDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var typeofDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var unaryMinus: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var unaryMinusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var unaryPlus: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var unaryPlusDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var unequal: js.UndefOr[
    js.Function2[/* x */ MathType | String, /* y */ MathType | String, Boolean | MathArray | Matrix]
  ] = js.native
  var unequalDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var uninitialized: js.UndefOr[js.Any] = js.native
  var unit: js.UndefOr[js.Function1[/* unit */ String, Unit]] = js.native
  var unitDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var usolve: js.UndefOr[
    js.Function2[/* U */ Matrix | MathArray, /* b */ Matrix | MathArray, Matrix | MathArray]
  ] = js.native
  var usolveDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var vacuumImpedanceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var varDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var variance: js.UndefOr[js.Function1[/* repeated */ Double | BigNumber | Fraction, _]] = js.native
  var varianceDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var varianceTransformDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var version: js.UndefOr[String] = js.native
  var versionDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var weakMixingAngleDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var wienDisplacementDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var xgcd: js.UndefOr[js.Function2[/* a */ Double | BigNumber, /* b */ Double | BigNumber, MathArray]] = js.native
  var xgcdDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var xor: js.UndefOr[
    js.Function2[
      /* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix, 
      Boolean | MathArray | Matrix
    ]
  ] = js.native
  var xorDependencies: js.UndefOr[FactoryFunctionMap] = js.native
  var zeros: js.UndefOr[
    js.Function2[
      /* size */ Double | js.Array[Double], 
      /* format */ js.UndefOr[String], 
      MathArray | Matrix
    ]
  ] = js.native
  var zerosDependencies: js.UndefOr[FactoryFunctionMap] = js.native
}

object PartialMathJsStatic {
  @scala.inline
  def apply(): PartialMathJsStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMathJsStatic]
  }
  @scala.inline
  implicit class PartialMathJsStaticOps[Self <: PartialMathJsStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessorNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessorNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessorNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessorNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withBigNumberDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BigNumberDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigNumberDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BigNumberDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withChainDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChainDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChainDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChainDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withComplexDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplexDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplexDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplexDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withConstantNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstantNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstantNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstantNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDenseMatrixDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DenseMatrixDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDenseMatrixDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DenseMatrixDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withEDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFibonacciHeapDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FibonacciHeapDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFibonacciHeapDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FibonacciHeapDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFractionDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FractionDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFractionDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FractionDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionAssignmentNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionAssignmentNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionAssignmentNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionAssignmentNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutableDenseMatrixDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImmutableDenseMatrixDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutableDenseMatrixDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImmutableDenseMatrixDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Infinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Infinity")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinityDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfinityDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinityDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfinityDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withLN10(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLN10: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN10")(js.undefined)
        ret
    }
    @scala.inline
    def withLN10Dependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN10Dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLN10Dependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN10Dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withLN2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLN2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN2")(js.undefined)
        ret
    }
    @scala.inline
    def withLN2Dependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN2Dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLN2Dependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN2Dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withLOG10E(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG10E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLOG10E: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG10E")(js.undefined)
        ret
    }
    @scala.inline
    def withLOG10EDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG10EDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLOG10EDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG10EDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withLOG2E(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG2E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLOG2E: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG2E")(js.undefined)
        ret
    }
    @scala.inline
    def withLOG2EDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG2EDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLOG2EDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG2EDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withMatrixDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatrixDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatrixDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatrixDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withNaN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NaN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNaN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NaN")(js.undefined)
        ret
    }
    @scala.inline
    def withNaNDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NaNDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNaNDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NaNDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatorNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatorNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatorNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatorNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withPIDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PIDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPIDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PIDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withParenthesisNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParenthesisNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParenthesisNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParenthesisNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withParserDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParserDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParserDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParserDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationalNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelationalNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationalNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelationalNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withResultSetDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultSetDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSetDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultSetDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withSQRT1_2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQRT1_2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSQRT1_2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQRT1_2")(js.undefined)
        ret
    }
    @scala.inline
    def withSQRT1_2Dependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQRT1_2Dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSQRT1_2Dependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQRT1_2Dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withSQRT2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQRT2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSQRT2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQRT2")(js.undefined)
        ret
    }
    @scala.inline
    def withSQRT2Dependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQRT2Dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSQRT2Dependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQRT2Dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withSparseMatrixDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SparseMatrixDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSparseMatrixDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SparseMatrixDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolNodeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SymbolNodeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolNodeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SymbolNodeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnitDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnitDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAbs(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abs")(js.undefined)
        ret
    }
    @scala.inline
    def withAbsDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAcos(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acos")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAcos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acos")(js.undefined)
        ret
    }
    @scala.inline
    def withAcosDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acosDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcosDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acosDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAcosh(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acosh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAcosh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acosh")(js.undefined)
        ret
    }
    @scala.inline
    def withAcoshDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acoshDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcoshDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acoshDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAcot(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAcot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acot")(js.undefined)
        ret
    }
    @scala.inline
    def withAcotDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acotDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcotDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acotDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAcoth(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acoth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAcoth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acoth")(js.undefined)
        ret
    }
    @scala.inline
    def withAcothDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acothDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcothDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acothDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAcsc(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acsc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAcsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acsc")(js.undefined)
        ret
    }
    @scala.inline
    def withAcscDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acscDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcscDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acscDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAcsch(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acsch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAcsch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acsch")(js.undefined)
        ret
    }
    @scala.inline
    def withAcschDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acschDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcschDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acschDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAdd(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAddDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAddScalarDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addScalarDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddScalarDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addScalarDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAll(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withAnd(
      value: (/* x */ Double | BigNumber | Complex | Unit | MathArray | Matrix, /* y */ Double | BigNumber | Complex | Unit | MathArray | Matrix) => Boolean | MathArray | Matrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.undefined)
        ret
    }
    @scala.inline
    def withAndDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("andDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("andDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyTransformDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTransformDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyTransformDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTransformDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withArg(value: /* x */ Double | Complex => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutArg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arg")(js.undefined)
        ret
    }
    @scala.inline
    def withArgDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAsec(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asec")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asec")(js.undefined)
        ret
    }
    @scala.inline
    def withAsecDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asecDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsecDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asecDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAsech(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asech")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAsech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asech")(js.undefined)
        ret
    }
    @scala.inline
    def withAsechDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asechDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsechDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asechDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAsin(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAsin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asin")(js.undefined)
        ret
    }
    @scala.inline
    def withAsinDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asinDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsinDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asinDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAsinh(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asinh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAsinh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asinh")(js.undefined)
        ret
    }
    @scala.inline
    def withAsinhDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asinhDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsinhDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asinhDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAtan(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAtan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atan")(js.undefined)
        ret
    }
    @scala.inline
    def withAtan2(value: (/* y */ Double, /* x */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atan2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAtan2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atan2")(js.undefined)
        ret
    }
    @scala.inline
    def withAtan2Dependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atan2Dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtan2Dependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atan2Dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAtanDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atanDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtanDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atanDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAtanh(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atanh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAtanh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atanh")(js.undefined)
        ret
    }
    @scala.inline
    def withAtanhDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atanhDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtanhDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atanhDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAtomicMassDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atomicMassDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtomicMassDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atomicMassDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withAvogadroDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avogadroDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvogadroDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avogadroDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withBellNumbers(value: /* n */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bellNumbers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBellNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bellNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withBellNumbersDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bellNumbersDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBellNumbersDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bellNumbersDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withBignumber(
      value: /* x */ js.UndefOr[Double | String | Fraction | BigNumber | MathArray | Matrix | Boolean | Null] => BigNumber
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bignumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBignumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bignumber")(js.undefined)
        ret
    }
    @scala.inline
    def withBitAnd(
      value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber | MathArray | Matrix) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitAnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBitAnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitAnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBitAndDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitAndDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitAndDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitAndDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withBitNot(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitNot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBitNot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitNot")(js.undefined)
        ret
    }
    @scala.inline
    def withBitNotDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitNotDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitNotDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitNotDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withBitOr(value: (/* x */ Double, /* y */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitOr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBitOr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitOr")(js.undefined)
        ret
    }
    @scala.inline
    def withBitOrDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitOrDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitOrDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitOrDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withBitXor(
      value: (/* x */ Double | BigNumber | MathArray | Matrix, /* y */ Double | BigNumber | MathArray | Matrix) => NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitXor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBitXor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitXor")(js.undefined)
        ret
    }
    @scala.inline
    def withBitXorDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitXorDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitXorDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitXorDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withBohrMagnetonDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bohrMagnetonDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBohrMagnetonDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bohrMagnetonDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withBohrRadiusDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bohrRadiusDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBohrRadiusDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bohrRadiusDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withBoltzmannDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boltzmannDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoltzmannDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boltzmannDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withBoolean(
      value: /* x */ String | Double | Boolean | MathArray | Matrix | Null => Boolean | MathArray | Matrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCatalan(value: /* n */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCatalan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalan")(js.undefined)
        ret
    }
    @scala.inline
    def withCatalanDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalanDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalanDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalanDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCbrt(value: (/* x */ Double, /* allRoots */ js.UndefOr[Boolean]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbrt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCbrt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbrt")(js.undefined)
        ret
    }
    @scala.inline
    def withCbrtDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbrtDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCbrtDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbrtDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCeil(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceil")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCeil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceil")(js.undefined)
        ret
    }
    @scala.inline
    def withCeilDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceilDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCeilDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceilDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withChain(value: /* value */ js.UndefOr[js.Any] => MathJsChain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chain")(js.undefined)
        ret
    }
    @scala.inline
    def withClassicalElectronRadiusDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classicalElectronRadiusDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassicalElectronRadiusDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classicalElectronRadiusDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: /* x */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withCloneDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnTransformDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTransformDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnTransformDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTransformDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCombinations(
      value: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinations")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCombinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinations")(js.undefined)
        ret
    }
    @scala.inline
    def withCombinationsDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinationsDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombinationsDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinationsDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCompare(
      value: (/* x */ MathType | String, /* y */ MathType | String) => Double | BigNumber | Fraction | MathArray | Matrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCompare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareNatural(value: (/* x */ js.Any, /* y */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareNatural")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCompareNatural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareNatural")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareNaturalDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareNaturalDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareNaturalDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareNaturalDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareText(
      value: (/* x */ String | MathArray | Matrix, /* y */ String | MathArray | Matrix) => Double | MathArray | Matrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCompareText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareText")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareTextDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareTextDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareTextDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareTextDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCompile(value: /* expr */ MathExpression => EvalFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.undefined)
        ret
    }
    @scala.inline
    def withCompileDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompileDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withComplex(value: /* arg */ js.UndefOr[Complex | String | PolarCoordinates] => Complex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complex")(js.undefined)
        ret
    }
    @scala.inline
    def withComposition(
      value: (/* n */ Double | BigNumber, /* k */ Double | BigNumber) => NoLiteralType[Double | BigNumber]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composition")(js.undefined)
        ret
    }
    @scala.inline
    def withCompositionDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositionDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompositionDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositionDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withConcat(value: /* repeated */ MathArray | Matrix => MathArray | Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConcat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concat")(js.undefined)
        ret
    }
    @scala.inline
    def withConcatDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcatDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withConcatTransformDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatTransformDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcatTransformDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatTransformDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withConductanceQuantumDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conductanceQuantumDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConductanceQuantumDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conductanceQuantumDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: /* options */ ConfigOptions => ConfigOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withConj(
      value: /* x */ Double | BigNumber | Complex | MathArray | Matrix => NoLiteralType[Double | BigNumber | Complex | MathArray | Matrix]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conj")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConj: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conj")(js.undefined)
        ret
    }
    @scala.inline
    def withConjDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConjDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCos(value: /* x */ Double | Unit => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cos")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cos")(js.undefined)
        ret
    }
    @scala.inline
    def withCosDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cosDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCosDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cosDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCosh(value: /* x */ Double | Unit => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cosh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCosh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cosh")(js.undefined)
        ret
    }
    @scala.inline
    def withCoshDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coshDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoshDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coshDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCot(value: /* x */ Double | Unit => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cot")(js.undefined)
        ret
    }
    @scala.inline
    def withCotDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cotDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCotDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cotDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCoth(value: /* x */ Double | Unit => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCoth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coth")(js.undefined)
        ret
    }
    @scala.inline
    def withCothDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cothDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCothDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cothDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCoulombDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coulombDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoulombDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coulombDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: (/* factories */ FactoryFunctionMap, /* config */ ConfigOptions) => Partial[MathJsStatic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateUnit(
      value: (/* name */ String, /* definition */ js.UndefOr[String | UnitDefinition], /* options */ js.UndefOr[CreateUnitOptions]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUnit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreateUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateUnitDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUnitDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateUnitDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUnitDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCross(value: (/* x */ MathArray | Matrix, /* y */ MathArray | Matrix) => Matrix | MathArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCross: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCsc(value: /* x */ Double | Unit => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csc")(js.undefined)
        ret
    }
    @scala.inline
    def withCscDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCscDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCsch(value: /* x */ Double | Unit => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCsch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csch")(js.undefined)
        ret
    }
    @scala.inline
    def withCschDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cschDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCschDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cschDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCtransposeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctransposeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtransposeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctransposeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withCube(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCube: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(js.undefined)
        ret
    }
    @scala.inline
    def withCubeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCubeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepEqual(
      value: (/* x */ MathType, /* y */ MathType) => Double | BigNumber | Fraction | Complex | Unit | MathArray | Matrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepEqual")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeepEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepEqualDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepEqualDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepEqualDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepEqualDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDerivative(
      value: (/* expr */ MathNode | String, /* variable */ MathNode | String, /* options */ js.UndefOr[AnonSimplify]) => MathNode
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivative")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDerivative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivative")(js.undefined)
        ret
    }
    @scala.inline
    def withDerivativeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivativeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDerivativeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivativeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDet(value: /* x */ MathArray | Matrix => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("det")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("det")(js.undefined)
        ret
    }
    @scala.inline
    def withDetDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDeuteronMassDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deuteronMassDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeuteronMassDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deuteronMassDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDiag(value: (/* X */ MathArray | Matrix, /* format */ js.UndefOr[String]) => Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDiag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diag")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(
      value: (/* x */ MathArray | Matrix | js.Object, /* y */ MathArray | Matrix | js.Object) => Double | BigNumber
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDivide(value: (/* x */ Unit, /* y */ Unit) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDivide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divide")(js.undefined)
        ret
    }
    @scala.inline
    def withDivideDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divideDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivideDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divideDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDivideScalarDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divideScalarDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivideScalarDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divideScalarDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDot(value: (/* x */ MathArray | Matrix, /* y */ MathArray | Matrix) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.undefined)
        ret
    }
    @scala.inline
    def withDotDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDotDivide(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotDivide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDotDivide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotDivide")(js.undefined)
        ret
    }
    @scala.inline
    def withDotDivideDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotDivideDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotDivideDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotDivideDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDotMultiply(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotMultiply")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDotMultiply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotMultiply")(js.undefined)
        ret
    }
    @scala.inline
    def withDotMultiplyDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotMultiplyDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotMultiplyDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotMultiplyDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDotPow(value: (/* x */ MathType, /* y */ MathType) => MathType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotPow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDotPow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotPow")(js.undefined)
        ret
    }
    @scala.inline
    def withDotPowDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotPowDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotPowDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotPowDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(js.undefined)
        ret
    }
    @scala.inline
    def withEfimovFactorDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("efimovFactorDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEfimovFactorDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("efimovFactorDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withElectricConstantDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electricConstantDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectricConstantDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electricConstantDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withElectronMassDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronMassDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectronMassDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronMassDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withElementaryChargeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementaryChargeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementaryChargeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementaryChargeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withEqual(value: (/* x */ MathType | String, /* y */ MathType | String) => Boolean | MathArray | Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualScalarDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalScalarDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualScalarDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalScalarDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualText(
      value: (/* x */ String | MathArray | Matrix, /* y */ String | MathArray | Matrix) => Double | MathArray | Matrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEqualText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalText")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualTextDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalTextDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualTextDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalTextDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withErf(value: /* x */ Double | MathArray | Matrix => NoLiteralType[Double | MathArray | Matrix]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("erf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("erf")(js.undefined)
        ret
    }
    @scala.inline
    def withErfDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("erfDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErfDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("erfDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withEvalDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvalDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluate(
      value: (/* expr */ MathExpression | js.Array[MathExpression] | Matrix, /* scope */ js.UndefOr[js.Object]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEvaluate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluateDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluateDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluateDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluateDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withExp(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(js.undefined)
        ret
    }
    @scala.inline
    def withExpDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withExpm(value: /* x */ Matrix => Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expm")(js.undefined)
        ret
    }
    @scala.inline
    def withExpm1(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expm1")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpm1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expm1")(js.undefined)
        ret
    }
    @scala.inline
    def withExpm1Dependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expm1Dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpm1Dependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expm1Dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withExpmDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expmDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpmDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expmDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withExpression(value: MathNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.undefined)
        ret
    }
    @scala.inline
    def withEyeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEyeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFactorial(
      value: /* n */ Double | BigNumber | MathArray | Matrix => NoLiteralType[Double | BigNumber | MathArray | Matrix]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factorial")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFactorial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factorial")(js.undefined)
        ret
    }
    @scala.inline
    def withFactorialDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factorialDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactorialDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factorialDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFactory(
      value: (/* name */ String, /* dependencies */ js.Array[MathJsFunctionName], /* create */ js.Function1[/* injected */ Partial[MathJsStatic], _], /* meta */ js.UndefOr[js.Any]) => FactoryFunction[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(js.undefined)
        ret
    }
    @scala.inline
    def withFalseDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFalseDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFaradayDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faradayDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaradayDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faradayDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFermiCouplingDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fermiCouplingDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFermiCouplingDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fermiCouplingDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(
      value: (/* x */ Matrix | MathArray | js.Array[String], /* test */ (js.Function3[
          /* value */ js.Any, 
          /* index */ js.Any, 
          /* matrix */ Matrix | MathArray | js.Array[String], 
          Boolean
        ]) | js.RegExp) => Matrix | MathArray
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTransformDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTransformDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterTransformDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTransformDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFineStructureDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fineStructureDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFineStructureDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fineStructureDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstRadiationDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRadiationDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstRadiationDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRadiationDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFix(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(js.undefined)
        ret
    }
    @scala.inline
    def withFixDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFlatten(value: /* x */ MathArray | Matrix => MathArray | Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFlatten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(js.undefined)
        ret
    }
    @scala.inline
    def withFlattenDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlattenDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFloor(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFloor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(js.undefined)
        ret
    }
    @scala.inline
    def withFloorDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloorDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withForEach(
      value: (/* x */ Matrix | MathArray, /* callback */ js.Function3[/* value */ js.Any, /* index */ js.Any, /* matrix */ Matrix | MathArray, scala.Unit]) => scala.Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutForEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.undefined)
        ret
    }
    @scala.inline
    def withForEachDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEachDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForEachDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEachDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withForEachTransformDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEachTransformDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForEachTransformDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEachTransformDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(
      value: (/* value */ js.Any, /* options */ js.UndefOr[FormatOptions | Double | (js.Function1[/* item */ js.Any, String])], /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, String]]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withFraction(value: /* args */ Fraction | MathArray | Matrix => Fraction | MathArray | Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraction")(js.undefined)
        ret
    }
    @scala.inline
    def withGamma(value: /* n */ Double | MathArray | Matrix => Double | MathArray | Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGamma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(js.undefined)
        ret
    }
    @scala.inline
    def withGammaDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gammaDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGammaDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gammaDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withGasConstantDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasConstantDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGasConstantDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasConstantDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withGcd(value: /* repeated */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGcd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcd")(js.undefined)
        ret
    }
    @scala.inline
    def withGcdDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcdDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcdDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcdDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMatrixDataTypeDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMatrixDataTypeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetMatrixDataTypeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMatrixDataTypeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withGravitationConstantDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravitationConstantDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravitationConstantDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravitationConstantDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withGravityDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravityDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withHartreeEnergyDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hartreeEnergyDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHartreeEnergyDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hartreeEnergyDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withHasNumericValueDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNumericValueDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasNumericValueDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNumericValueDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withHelp(value: /* search */ js.Function0[_] => Help): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.undefined)
        ret
    }
    @scala.inline
    def withHypot(value: /* repeated */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hypot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHypot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hypot")(js.undefined)
        ret
    }
    @scala.inline
    def withHypotDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hypotDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHypotDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hypotDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(js.undefined)
        ret
    }
    @scala.inline
    def withIDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentity(
      value: (/* size */ Double | js.Array[Double] | Matrix | MathArray, /* format */ js.UndefOr[String]) => Matrix | MathArray | Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withIm(
      value: /* x */ Double | BigNumber | Complex | MathArray | Matrix => Double | BigNumber | MathArray | Matrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("im")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("im")(js.undefined)
        ret
    }
    @scala.inline
    def withImDependencies(value: FactoryFunctionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withImport(
      value: (/* object */ ImportObject | js.Array[ImportObject], /* options */ ImportOptions) => scala.Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: /* repeated */ js.Any => Index): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

