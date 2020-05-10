package typingsSlinky.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env extends js.Object {
  var clearInterval: Unit = js.native
  var clearTimeout: Unit = js.native
  var currentSpec: Spec = js.native
  var matchersClass: Matchers = js.native
  var setInterval: js.Any = js.native
  var setTimeout: js.Any = js.native
  var updateInterval: Double = js.native
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = js.native
  def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
  def addReporter(reporter: Reporter): Unit = js.native
  def afterAll(afterAllFunction: js.Function0[Unit]): Unit = js.native
  def afterEach(afterEachFunction: js.Function0[Unit]): Unit = js.native
  def beforeAll(beforeAllFunction: js.Function0[Unit]): Unit = js.native
  // ddescribe(description: string, specDefinitions: () => void): Suite; Not a part of jasmine. Angular team adds these
  def beforeEach(beforeEachFunction: js.Function0[Unit]): Unit = js.native
  def compareObjects_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  def compareRegExps_(a: js.RegExp, b: js.RegExp, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  def contains_(haystack: js.Any, needle: js.Any): Boolean = js.native
  def currentRunner(): Runner = js.native
  def describe(description: String, specDefinitions: js.Function0[Unit]): Suite = js.native
  def equals_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean = js.native
  def execute(): Unit = js.native
  def it(description: String, func: js.Function0[Unit]): Spec = js.native
  def nextSpecId(): Double = js.native
  def specFilter(spec: Spec): Boolean = js.native
  def version(): js.Any = js.native
  def versionString(): String = js.native
  def xdescribe(desc: String, specDefinitions: js.Function0[Unit]): XSuite = js.native
  // iit(description: string, func: () => void): Spec; Not a part of jasmine. Angular team adds these
  def xit(desc: String, func: js.Function0[Unit]): XSpec = js.native
}

object Env {
  @scala.inline
  def apply(
    addCustomEqualityTester: CustomEqualityTester => Unit,
    addMatchers: CustomMatcherFactories => Unit,
    addReporter: Reporter => Unit,
    afterAll: js.Function0[Unit] => Unit,
    afterEach: js.Function0[Unit] => Unit,
    beforeAll: js.Function0[Unit] => Unit,
    beforeEach: js.Function0[Unit] => Unit,
    clearInterval: Unit,
    clearTimeout: Unit,
    compareObjects_ : (js.Any, js.Any, js.Array[String], js.Array[String]) => Boolean,
    compareRegExps_ : (js.RegExp, js.RegExp, js.Array[String], js.Array[String]) => Boolean,
    contains_ : (js.Any, js.Any) => Boolean,
    currentRunner: () => Runner,
    currentSpec: Spec,
    describe: (String, js.Function0[Unit]) => Suite,
    equals_ : (js.Any, js.Any, js.Array[String], js.Array[String]) => Boolean,
    execute: () => Unit,
    it: (String, js.Function0[Unit]) => Spec,
    matchersClass: Matchers,
    nextSpecId: () => Double,
    setInterval: js.Any,
    setTimeout: js.Any,
    specFilter: Spec => Boolean,
    updateInterval: Double,
    version: () => js.Any,
    versionString: () => String,
    xdescribe: (String, js.Function0[Unit]) => XSuite,
    xit: (String, js.Function0[Unit]) => XSpec
  ): Env = {
    val __obj = js.Dynamic.literal(addCustomEqualityTester = js.Any.fromFunction1(addCustomEqualityTester), addMatchers = js.Any.fromFunction1(addMatchers), addReporter = js.Any.fromFunction1(addReporter), afterAll = js.Any.fromFunction1(afterAll), afterEach = js.Any.fromFunction1(afterEach), beforeAll = js.Any.fromFunction1(beforeAll), beforeEach = js.Any.fromFunction1(beforeEach), clearInterval = clearInterval.asInstanceOf[js.Any], clearTimeout = clearTimeout.asInstanceOf[js.Any], compareObjects_ = js.Any.fromFunction4(compareObjects_), compareRegExps_ = js.Any.fromFunction4(compareRegExps_), contains_ = js.Any.fromFunction2(contains_), currentRunner = js.Any.fromFunction0(currentRunner), currentSpec = currentSpec.asInstanceOf[js.Any], describe = js.Any.fromFunction2(describe), equals_ = js.Any.fromFunction4(equals_), execute = js.Any.fromFunction0(execute), it = js.Any.fromFunction2(it), matchersClass = matchersClass.asInstanceOf[js.Any], nextSpecId = js.Any.fromFunction0(nextSpecId), setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any], specFilter = js.Any.fromFunction1(specFilter), updateInterval = updateInterval.asInstanceOf[js.Any], version = js.Any.fromFunction0(version), versionString = js.Any.fromFunction0(versionString), xdescribe = js.Any.fromFunction2(xdescribe), xit = js.Any.fromFunction2(xit))
    __obj.asInstanceOf[Env]
  }
  @scala.inline
  implicit class EnvOps[Self <: Env] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCustomEqualityTester(value: CustomEqualityTester => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCustomEqualityTester")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddMatchers(value: CustomMatcherFactories => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMatchers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddReporter(value: Reporter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addReporter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterAll(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterEach(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeAll(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeEach(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearInterval(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearTimeout(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompareObjects_(value: (js.Any, js.Any, js.Array[String], js.Array[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareObjects_")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCompareRegExps_(value: (js.RegExp, js.RegExp, js.Array[String], js.Array[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareRegExps_")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withContains_(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains_")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCurrentRunner(value: () => Runner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRunner")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrentSpec(value: Spec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescribe(value: (String, js.Function0[Unit]) => Suite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEquals_(value: (js.Any, js.Any, js.Array[String], js.Array[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals_")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withExecute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIt(value: (String, js.Function0[Unit]) => Spec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("it")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMatchersClass(value: Matchers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchersClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextSpecId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSpecId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetInterval(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetTimeout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecFilter(value: Spec => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVersionString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withXdescribe(value: (String, js.Function0[Unit]) => XSuite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xdescribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withXit(value: (String, js.Function0[Unit]) => XSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

