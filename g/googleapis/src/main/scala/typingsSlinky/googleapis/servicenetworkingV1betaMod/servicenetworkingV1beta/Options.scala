package typingsSlinky.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import typingsSlinky.googleapis.googleapisStrings.v1beta
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends GlobalOptions {
  
  var version: v1beta = js.native
}
object Options {
  
  @scala.inline
  def apply(version: v1beta): Options = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: v1beta): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
