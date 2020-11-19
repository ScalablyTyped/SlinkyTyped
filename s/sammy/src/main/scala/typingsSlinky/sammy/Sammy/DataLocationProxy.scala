package typingsSlinky.sammy.Sammy

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataLocationProxy
  extends Instantiable1[/* app */ js.Any, DataLocationProxy]
     with Instantiable2[/* app */ js.Any, /* run_interval_every */ js.Any, DataLocationProxy]
     with Instantiable3[
      /* app */ js.Any, 
      /* data_name */ js.Any, 
      /* href_attribute */ js.Any, 
      DataLocationProxy
    ] {
  
  def _startPolling(every: Double): Unit = js.native
  
  def bind(): Unit = js.native
  
  def fullPath(location_obj: js.Any): String = js.native
  
  def setLocation(new_location: String): String = js.native
  
  def unbind(): Unit = js.native
}
