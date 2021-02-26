package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.WRITE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait READ extends StObject {
  
  var READ: typingsSlinky.chromeApps.chromeAppsStrings.READ = js.native
  
  var WRITE: typingsSlinky.chromeApps.chromeAppsStrings.WRITE = js.native
}
object READ {
  
  @scala.inline
  def apply(READ: typingsSlinky.chromeApps.chromeAppsStrings.READ, WRITE: WRITE): READ = {
    val __obj = js.Dynamic.literal(READ = READ.asInstanceOf[js.Any], WRITE = WRITE.asInstanceOf[js.Any])
    __obj.asInstanceOf[READ]
  }
  
  @scala.inline
  implicit class READMutableBuilder[Self <: READ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setREAD(value: typingsSlinky.chromeApps.chromeAppsStrings.READ): Self = StObject.set(x, "READ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWRITE(value: WRITE): Self = StObject.set(x, "WRITE", value.asInstanceOf[js.Any])
  }
}
