package typingsSlinky.elm

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elm extends js.Object {
  
  def embed[P](elmModule: ElmModule[P], element: Node): ElmComponent[P] = js.native
  def embed[P](elmModule: ElmModule[P], element: Node, initialValues: js.Object): ElmComponent[P] = js.native
  
  def fullscreen[P](elmModule: ElmModule[P]): ElmComponent[P] = js.native
  def fullscreen[P](elmModule: ElmModule[P], initialValues: js.Object): ElmComponent[P] = js.native
  
  def worker[P](elmModule: ElmModule[P]): ElmComponent[P] = js.native
  def worker[P](elmModule: ElmModule[P], initialValues: js.Object): ElmComponent[P] = js.native
}
