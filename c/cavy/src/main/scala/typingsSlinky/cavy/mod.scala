package typingsSlinky.cavy

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.cavy.anon.GenerateTestHook
import typingsSlinky.cavy.cavyBooleans.`true`
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cavy", "TestHookStore")
  @js.native
  class TestHookStore () extends StObject
  
  @JSImport("cavy", "TestScope")
  @js.native
  class TestScope () extends StObject {
    
    def beforeEach(fn: js.Function0[Unit]): Unit = js.native
    
    var component: Tester = js.native
    
    def containsText(identifier: String, text: String): js.Promise[Unit] = js.native
    
    def describe(label: String, fn: js.Function0[Unit]): Unit = js.native
    
    def exists(identifier: String): js.Promise[`true`] = js.native
    
    def fillIn(identifier: String, str: String): js.Promise[Unit] = js.native
    
    def findComponent(identifier: String): js.Promise[ReactComponentClass[js.Object]] = js.native
    
    def focus(identifier: String): js.Promise[Unit] = js.native
    
    def it(label: String, fn: js.Function0[Unit]): Unit = js.native
    
    def notExists(identifier: String): js.Promise[`true`] = js.native
    
    def pause(time: Double): js.Promise[Unit] = js.native
    
    def press(identifier: String): js.Promise[Unit] = js.native
  }
  
  @JSImport("cavy", "Tester")
  @js.native
  class Tester protected ()
    extends Component[TesterProps, js.Object, js.Any] {
    def this(props: TesterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TesterProps, context: js.Any) = this()
    
    def clearAsync(): js.Promise[Unit] = js.native
    
    def reRender(): Unit = js.native
  }
  
  @JSImport("cavy", "hook")
  @js.native
  def hook[P /* <: js.Object */](WrappedComponent: ReactComponentClass[WithTestHook[P]]): ReactComponentClass[P] = js.native
  
  @JSImport("cavy", "useCavy")
  @js.native
  def useCavy(): TestHookGenerator = js.native
  
  @JSImport("cavy", "wrap")
  @js.native
  def wrap[P /* <: js.Object */](WrappedComponent: js.Object): ReactComponentClass[P] = js.native
  @JSImport("cavy", "wrap")
  @js.native
  def wrap[P /* <: js.Object */](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  
  type RefCallback = js.Function1[/* element */ ReactElement | Null, Unit]
  
  type TestHookGenerator = TestHookGeneratorWithRefCallback with TestHookGeneratorWithRefObject
  
  type TestHookGeneratorWithRefCallback = js.Function2[/* label */ String, /* ref */ js.UndefOr[RefCallback], RefCallback]
  
  type TestHookGeneratorWithRefObject = js.Function2[/* label */ String, /* ref */ js.UndefOr[ReactRef[js.Any]], ReactRef[js.Any]]
  
  @js.native
  trait TestReport extends StObject {
    
    var duration: Double = js.native
    
    var errorCount: Double = js.native
    
    var results: js.Array[TestResult] = js.native
  }
  object TestReport {
    
    @scala.inline
    def apply(duration: Double, errorCount: Double, results: js.Array[TestResult]): TestReport = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestReport]
    }
    
    @scala.inline
    implicit class TestReportMutableBuilder[Self <: TestReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: js.Array[TestResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: TestResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TestResult extends StObject {
    
    var message: String = js.native
    
    var passed: Boolean = js.native
  }
  object TestResult {
    
    @scala.inline
    def apply(message: String, passed: Boolean): TestResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestResult]
    }
    
    @scala.inline
    implicit class TestResultMutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TesterProps extends StObject {
    
    var clearAsyncStorage: js.UndefOr[Boolean] = js.native
    
    var reporter: js.UndefOr[js.Function1[/* report */ TestReport, Unit]] = js.native
    
    // Deprecated
    var sendReport: js.UndefOr[Boolean] = js.native
    
    var specs: js.Array[js.Function1[/* spec */ TestScope, Unit]] = js.native
    
    var startDelay: js.UndefOr[Double] = js.native
    
    var store: TestHookStore = js.native
    
    var waitTime: js.UndefOr[Double] = js.native
  }
  object TesterProps {
    
    @scala.inline
    def apply(specs: js.Array[js.Function1[/* spec */ TestScope, Unit]], store: TestHookStore): TesterProps = {
      val __obj = js.Dynamic.literal(specs = specs.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[TesterProps]
    }
    
    @scala.inline
    implicit class TesterPropsMutableBuilder[Self <: TesterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearAsyncStorage(value: Boolean): Self = StObject.set(x, "clearAsyncStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearAsyncStorageUndefined: Self = StObject.set(x, "clearAsyncStorage", js.undefined)
      
      @scala.inline
      def setReporter(value: /* report */ TestReport => Unit): Self = StObject.set(x, "reporter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      @scala.inline
      def setSendReport(value: Boolean): Self = StObject.set(x, "sendReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendReportUndefined: Self = StObject.set(x, "sendReport", js.undefined)
      
      @scala.inline
      def setSpecs(value: js.Array[js.Function1[/* spec */ TestScope, Unit]]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecsVarargs(value: (js.Function1[/* spec */ TestScope, Unit])*): Self = StObject.set(x, "specs", js.Array(value :_*))
      
      @scala.inline
      def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
      
      @scala.inline
      def setStore(value: TestHookStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitTime(value: Double): Self = StObject.set(x, "waitTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitTimeUndefined: Self = StObject.set(x, "waitTime", js.undefined)
    }
  }
  
  type WithTestHook[P /* <: js.Object */] = P with GenerateTestHook
}
