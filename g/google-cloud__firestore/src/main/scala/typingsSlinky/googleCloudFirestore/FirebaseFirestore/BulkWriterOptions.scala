package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import typingsSlinky.googleCloudFirestore.anon.InitialOpsPerSecond
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriterOptions extends StObject {
  
  /**
    * Whether to disable or configure throttling. By default, throttling is
    * enabled. This field can be set to either a boolean or a config
    * object. Setting it to `true` will use default values. You can override
    * the defaults by setting it to `false` to disable throttling, or by
    * setting the config values to enable throttling with the provided values.
    *
    * @param initialOpsPerSecond The initial maximum number of operations per
    * second allowed by the throttler. If this field is not set, the default
    * is 500 operations per second.
    * @param maxOpsPerSecond The maximum number of operations per second
    * allowed by the throttler. If this field is set, the throttler's allowed
    * operations per second does not ramp up past the specified operations per
    * second.
    */
  val throttling: js.UndefOr[Boolean | InitialOpsPerSecond] = js.native
}
object BulkWriterOptions {
  
  @scala.inline
  def apply(): BulkWriterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkWriterOptions]
  }
  
  @scala.inline
  implicit class BulkWriterOptionsMutableBuilder[Self <: BulkWriterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThrottling(value: Boolean | InitialOpsPerSecond): Self = StObject.set(x, "throttling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottlingUndefined: Self = StObject.set(x, "throttling", js.undefined)
  }
}
