package typingsSlinky.googleapis.reportsV1Mod.adminReportsV1

import typingsSlinky.googleapis.googleapisStrings.reports_v1
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends GlobalOptions {
  
  var version: reports_v1 = js.native
}
object Options {
  
  @scala.inline
  def apply(version: reports_v1): Options = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: reports_v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
