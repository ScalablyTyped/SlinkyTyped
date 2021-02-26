package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.fridaGumStrings.unix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.TcpListenOptions
  - typingsSlinky.fridaGum.UnixListenOptions
*/
trait SocketListenOptions extends StObject
object SocketListenOptions {
  
  @scala.inline
  def TcpListenOptions(): typingsSlinky.fridaGum.TcpListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.fridaGum.TcpListenOptions]
  }
  
  @scala.inline
  def UnixListenOptions(family: unix, path: String): typingsSlinky.fridaGum.UnixListenOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.UnixListenOptions]
  }
}
