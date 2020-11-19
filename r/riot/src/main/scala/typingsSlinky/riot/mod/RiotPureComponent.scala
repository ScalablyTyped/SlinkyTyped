package typingsSlinky.riot.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RiotPureComponent[Context] extends js.Object {
  
  def mount(element: HTMLElement): RiotPureComponent[Context] = js.native
  def mount(element: HTMLElement, context: Context): RiotPureComponent[Context] = js.native
  
  def unmount(keepRootElement: Boolean): RiotPureComponent[Context] = js.native
  
  def update(): RiotPureComponent[Context] = js.native
  def update(context: Context): RiotPureComponent[Context] = js.native
}
