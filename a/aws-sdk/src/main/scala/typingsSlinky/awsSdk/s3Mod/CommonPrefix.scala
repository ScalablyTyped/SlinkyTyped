package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonPrefix extends StObject {
  
  /**
    * Container for the specified common prefix.
    */
  var Prefix: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Prefix] = js.native
}
object CommonPrefix {
  
  @scala.inline
  def apply(): CommonPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonPrefix]
  }
  
  @scala.inline
  implicit class CommonPrefixMutableBuilder[Self <: CommonPrefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
