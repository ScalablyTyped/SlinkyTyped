package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test of an Android application that can control an Android component
  * independently of its normal lifecycle.  See  for more information on types
  * of Android tests.
  */
@js.native
trait SchemaAndroidInstrumentationTest extends StObject {
  
  /**
    * The java package for the test to be executed. Required
    */
  var testPackageId: js.UndefOr[String] = js.native
  
  /**
    * The InstrumentationTestRunner class. Required
    */
  var testRunnerClass: js.UndefOr[String] = js.native
  
  /**
    * Each target must be fully qualified with the package name or class name,
    * in one of these formats: - &quot;package package_name&quot; - &quot;class
    * package_name.class_name&quot; - &quot;class
    * package_name.class_name#method_name&quot;  If empty, all targets in the
    * module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The flag indicates whether Android Test Orchestrator will be used to run
    * test or not.
    */
  var useOrchestrator: js.UndefOr[Boolean] = js.native
}
object SchemaAndroidInstrumentationTest {
  
  @scala.inline
  def apply(): SchemaAndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidInstrumentationTest]
  }
  
  @scala.inline
  implicit class SchemaAndroidInstrumentationTestMutableBuilder[Self <: SchemaAndroidInstrumentationTest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setUseOrchestrator(value: Boolean): Self = StObject.set(x, "useOrchestrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseOrchestratorUndefined: Self = StObject.set(x, "useOrchestrator", js.undefined)
  }
}
