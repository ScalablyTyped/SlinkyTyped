package typingsSlinky.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
interface LocalFileSystem {
  requestFileSystem: Function;
  resolveLocalFileSystemURI: Function;
}*/
@js.native
trait LocalFileSystem extends StObject {
  
  var PERSISTENT: Double = js.native
  
  var TEMPORARY: Double = js.native
}
object LocalFileSystem {
  
  @scala.inline
  def apply(PERSISTENT: Double, TEMPORARY: Double): LocalFileSystem = {
    val __obj = js.Dynamic.literal(PERSISTENT = PERSISTENT.asInstanceOf[js.Any], TEMPORARY = TEMPORARY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalFileSystem]
  }
  
  @scala.inline
  implicit class LocalFileSystemMutableBuilder[Self <: LocalFileSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPERSISTENT(value: Double): Self = StObject.set(x, "PERSISTENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEMPORARY(value: Double): Self = StObject.set(x, "TEMPORARY", value.asInstanceOf[js.Any])
  }
}
