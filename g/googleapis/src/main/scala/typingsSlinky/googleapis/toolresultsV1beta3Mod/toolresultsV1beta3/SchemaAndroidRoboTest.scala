package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test of an android application that explores the application on a virtual
  * or physical Android device, finding culprits and crashes as it goes.
  */
@js.native
trait SchemaAndroidRoboTest extends StObject {
  
  /**
    * The initial activity that should be used to start the app. Optional
    */
  var appInitialActivity: js.UndefOr[String] = js.native
  
  /**
    * The java package for the bootstrap. Optional
    */
  var bootstrapPackageId: js.UndefOr[String] = js.native
  
  /**
    * The runner class for the bootstrap. Optional
    */
  var bootstrapRunnerClass: js.UndefOr[String] = js.native
  
  /**
    * The max depth of the traversal stack Robo can explore. Optional
    */
  var maxDepth: js.UndefOr[Double] = js.native
  
  /**
    * The max number of steps/actions Robo can execute. Default is no limit
    * (0). Optional
    */
  var maxSteps: js.UndefOr[Double] = js.native
}
object SchemaAndroidRoboTest {
  
  @scala.inline
  def apply(): SchemaAndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidRoboTest]
  }
  
  @scala.inline
  implicit class SchemaAndroidRoboTestMutableBuilder[Self <: SchemaAndroidRoboTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInitialActivity(value: String): Self = StObject.set(x, "appInitialActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInitialActivityUndefined: Self = StObject.set(x, "appInitialActivity", js.undefined)
    
    @scala.inline
    def setBootstrapPackageId(value: String): Self = StObject.set(x, "bootstrapPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapPackageIdUndefined: Self = StObject.set(x, "bootstrapPackageId", js.undefined)
    
    @scala.inline
    def setBootstrapRunnerClass(value: String): Self = StObject.set(x, "bootstrapRunnerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapRunnerClassUndefined: Self = StObject.set(x, "bootstrapRunnerClass", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    @scala.inline
    def setMaxSteps(value: Double): Self = StObject.set(x, "maxSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStepsUndefined: Self = StObject.set(x, "maxSteps", js.undefined)
  }
}
