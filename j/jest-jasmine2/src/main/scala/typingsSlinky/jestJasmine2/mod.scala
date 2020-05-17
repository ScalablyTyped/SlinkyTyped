package typingsSlinky.jestJasmine2

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expect.anon.Expected
import typingsSlinky.expect.typesMod.AsymmetricMatcher
import typingsSlinky.expect.typesMod.Expect
import typingsSlinky.expect.typesMod.MatcherState
import typingsSlinky.expect.typesMod.Matchers
import typingsSlinky.jestEnvironment.mod.JestEnvironment
import typingsSlinky.jestJasmine2.anon.CurrentSpies
import typingsSlinky.jestJasmine2.anon.Instantiable
import typingsSlinky.jestJasmine2.anon.Now
import typingsSlinky.jestJasmine2.anon.Timer
import typingsSlinky.jestJasmine2.anon.TypeofSpec
import typingsSlinky.jestJasmine2.createSpyMod.Fn
import typingsSlinky.jestJasmine2.jestJasmine2Strings.jasmineDone
import typingsSlinky.jestJasmine2.jestJasmine2Strings.jasmineStarted
import typingsSlinky.jestJasmine2.jestJasmine2Strings.specDone
import typingsSlinky.jestJasmine2.jestJasmine2Strings.specStarted
import typingsSlinky.jestJasmine2.jestJasmine2Strings.suiteDone
import typingsSlinky.jestJasmine2.jestJasmine2Strings.suiteStarted
import typingsSlinky.jestJasmine2.jsApiReporterMod.default
import typingsSlinky.jestJasmine2.suiteMod.Attributes
import typingsSlinky.jestJasmine2.typesMod.Spy
import typingsSlinky.jestRuntime.mod.^
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.std.Record
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* Inlined jest-jasmine2.jest-jasmine2/build/types.Jasmine */
  @js.native
  trait Jasmine extends /* id */ StringDictionary[AsymmetricMatcher] {
    var DEFAULT_TIMEOUT_INTERVAL: Double = js.native
    var Env: ReturnType[js.Function1[/* j$ */ this.type, Instantiable]] = js.native
    var JsApiReporter: Instantiable1[/* options */ Timer, default] = js.native
    var ReportDispatcher: Instantiable1[
        /* methods */ js.Array[
          /* keyof jest-jasmine2.jest-jasmine2/build/types.Reporter */ jasmineDone | jasmineStarted | specDone | specStarted | suiteDone | suiteStarted
        ], 
        typingsSlinky.jestJasmine2.reportDispatcherMod.default
      ] = js.native
    var Spec: TypeofSpec = js.native
    var SpyRegistry: Instantiable1[
        js.UndefOr[/* hasCurrentSpies */ CurrentSpies], 
        typingsSlinky.jestJasmine2.spyRegistryMod.default
      ] = js.native
    var Suite: Instantiable1[/* attrs */ Attributes, typingsSlinky.jestJasmine2.suiteMod.default] = js.native
    var Timer: Instantiable1[js.UndefOr[/* options */ Now], typingsSlinky.jestJasmine2.timerMod.default] = js.native
    var _DEFAULT_TIMEOUT_INTERVAL: Double = js.native
    var addMatchers: js.Function = js.native
    var createSpy: js.Function2[/* name */ String, /* originalFn */ Fn, Spy] = js.native
    var currentEnv_ : /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : jest-jasmine2.jest-jasmine2/build/types.Jasmine): jest-jasmine2.anon.Instantiable>['prototype'] */ js.Any = js.native
    var expect: Expect = js.native
    var not: StringDictionary[AsymmetricMatcher] = js.native
    var testPath: Path = js.native
    var version: String = js.native
    def apply[T](actual: T): Matchers[T] = js.native
    def addSnapshotSerializer(arg0: js.Any): Unit = js.native
    def any(expectedObject: js.Any): AsymmetricMatcher = js.native
    def anything(): AsymmetricMatcher = js.native
    def arrayContaining(sample: js.Array[_]): AsymmetricMatcher = js.native
    def assertions(arg0: Double): Unit = js.native
    def extend(arg0: js.Any): Unit = js.native
    def extractExpectedAssertionsErrors(): js.Array[Expected] = js.native
    def getEnv(): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : jest-jasmine2.jest-jasmine2/build/types.Jasmine): jest-jasmine2.anon.Instantiable>['prototype'] */ js.Any = js.native
    def getEnv(options: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : jest-jasmine2.jest-jasmine2/build/types.Jasmine): jest-jasmine2.anon.Instantiable>['prototype'] */ js.Any = js.native
    def getState(): MatcherState = js.native
    def hasAssertions(): Unit = js.native
    def objectContaining(sample: Record[String, _]): AsymmetricMatcher = js.native
    def setState(arg0: js.Any): Unit = js.native
    def stringContaining(expected: String): AsymmetricMatcher = js.native
    def stringMatching(expected: String): AsymmetricMatcher = js.native
    def stringMatching(expected: js.RegExp): AsymmetricMatcher = js.native
  }
  
  def apply(
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    environment: JestEnvironment,
    runtime: ^,
    testPath: String
  ): js.Promise[TestResult] = js.native
}

