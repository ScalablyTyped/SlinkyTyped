package typingsSlinky.nslog

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("nslog", JSImport.Namespace)
  @js.native
  val ^ : NSLog = js.native
  
  type NSLog = js.Function1[/* repeated */ js.Any, Unit]
  
  type _To = NSLog
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NSLog = ^
}
