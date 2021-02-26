package typingsSlinky.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The environment in which the test is run.
  */
@js.native
trait SchemaEnvironment extends StObject {
  
  /**
    * An Android device which must be used with an Android test.
    */
  var androidDevice: js.UndefOr[SchemaAndroidDevice] = js.native
  
  /**
    * An iOS device which must be used with an iOS test.
    */
  var iosDevice: js.UndefOr[SchemaIosDevice] = js.native
}
object SchemaEnvironment {
  
  @scala.inline
  def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  @scala.inline
  implicit class SchemaEnvironmentMutableBuilder[Self <: SchemaEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidDevice(value: SchemaAndroidDevice): Self = StObject.set(x, "androidDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDeviceUndefined: Self = StObject.set(x, "androidDevice", js.undefined)
    
    @scala.inline
    def setIosDevice(value: SchemaIosDevice): Self = StObject.set(x, "iosDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosDeviceUndefined: Self = StObject.set(x, "iosDevice", js.undefined)
  }
}
