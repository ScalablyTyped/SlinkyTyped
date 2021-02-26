package typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidInstrumentationTest extends StObject {
  
  /** The APK for the application under test. */
  var appApk: js.UndefOr[FileReference] = js.native
  
  /** A multi-apk app bundle for the application under test. */
  var appBundle: js.UndefOr[AppBundle] = js.native
  
  /** The java package for the application under test. The default value is determined by examining the application's manifest. */
  var appPackageId: js.UndefOr[String] = js.native
  
  /**
    * The option of whether running each test within its own invocation of instrumentation with Android Test Orchestrator or not. ** Orchestrator is only compatible with
    * AndroidJUnitRunner version 1.0 or higher! ** Orchestrator offers the following benefits: - No shared state - Crashes are isolated - Logs are scoped per test See for more information
    * about Android Test Orchestrator. If not set, the test will be run without the orchestrator.
    */
  var orchestratorOption: js.UndefOr[String] = js.native
  
  /** The option to run tests in multiple shards in parallel. */
  var shardingOption: js.UndefOr[ShardingOption] = js.native
  
  /** Required. The APK containing the test code to be executed. */
  var testApk: js.UndefOr[FileReference] = js.native
  
  /** The java package for the test to be executed. The default value is determined by examining the application's manifest. */
  var testPackageId: js.UndefOr[String] = js.native
  
  /** The InstrumentationTestRunner class. The default value is determined by examining the application's manifest. */
  var testRunnerClass: js.UndefOr[String] = js.native
  
  /**
    * Each target must be fully qualified with the package name or class name, in one of these formats: - "package package_name" - "class package_name.class_name" - "class
    * package_name.class_name#method_name" If empty, all targets in the module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
}
object AndroidInstrumentationTest {
  
  @scala.inline
  def apply(): AndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidInstrumentationTest]
  }
  
  @scala.inline
  implicit class AndroidInstrumentationTestMutableBuilder[Self <: AndroidInstrumentationTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppApk(value: FileReference): Self = StObject.set(x, "appApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppApkUndefined: Self = StObject.set(x, "appApk", js.undefined)
    
    @scala.inline
    def setAppBundle(value: AppBundle): Self = StObject.set(x, "appBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppBundleUndefined: Self = StObject.set(x, "appBundle", js.undefined)
    
    @scala.inline
    def setAppPackageId(value: String): Self = StObject.set(x, "appPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppPackageIdUndefined: Self = StObject.set(x, "appPackageId", js.undefined)
    
    @scala.inline
    def setOrchestratorOption(value: String): Self = StObject.set(x, "orchestratorOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrchestratorOptionUndefined: Self = StObject.set(x, "orchestratorOption", js.undefined)
    
    @scala.inline
    def setShardingOption(value: ShardingOption): Self = StObject.set(x, "shardingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardingOptionUndefined: Self = StObject.set(x, "shardingOption", js.undefined)
    
    @scala.inline
    def setTestApk(value: FileReference): Self = StObject.set(x, "testApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestApkUndefined: Self = StObject.set(x, "testApk", js.undefined)
    
    @scala.inline
    def setTestPackageId(value: String): Self = StObject.set(x, "testPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPackageIdUndefined: Self = StObject.set(x, "testPackageId", js.undefined)
    
    @scala.inline
    def setTestRunnerClass(value: String): Self = StObject.set(x, "testRunnerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRunnerClassUndefined: Self = StObject.set(x, "testRunnerClass", js.undefined)
    
    @scala.inline
    def setTestTargets(value: js.Array[String]): Self = StObject.set(x, "testTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTargetsUndefined: Self = StObject.set(x, "testTargets", js.undefined)
    
    @scala.inline
    def setTestTargetsVarargs(value: String*): Self = StObject.set(x, "testTargets", js.Array(value :_*))
  }
}
