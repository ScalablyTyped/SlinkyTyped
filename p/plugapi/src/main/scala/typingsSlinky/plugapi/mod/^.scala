package typingsSlinky.plugapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plugapi", JSImport.Namespace)
@js.native
class ^ protected () extends PlugAPI {
  def this(login: PlugLogin) = this()
  def this(
    login: PlugLogin,
    callback: js.Function2[
        /* error */ js.Error, 
        /* bot */ PlugAPI, 
        Unit | (js.Function1[/* bot */ PlugAPI, Unit])
      ]
  ) = this()
}
@JSImport("plugapi", JSImport.Namespace)
@js.native
object ^ extends StObject
