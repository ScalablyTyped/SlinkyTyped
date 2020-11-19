package typingsSlinky.polymer.mod.global.polymer

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomApiStatic extends js.Object {
  
  def apply(obj: Base): DomApi = js.native
  def apply(obj: Event): EventApi = js.native
  def apply(obj: Node): DomApi = js.native
  
  def flush(): Unit = js.native
}
