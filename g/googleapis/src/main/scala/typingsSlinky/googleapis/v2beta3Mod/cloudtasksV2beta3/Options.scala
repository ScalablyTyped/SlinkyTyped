package typingsSlinky.googleapis.v2beta3Mod.cloudtasksV2beta3

import typingsSlinky.googleapis.googleapisStrings.v2beta3
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends GlobalOptions {
  
  var version: v2beta3 = js.native
}
object Options {
  
  @scala.inline
  def apply(version: v2beta3): Options = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: v2beta3): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
