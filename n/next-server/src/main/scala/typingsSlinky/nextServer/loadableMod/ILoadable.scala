package typingsSlinky.nextServer.loadableMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoadable extends js.Object {
  
  def apply[P](opts: js.Any): ReactComponentClass[P] = js.native
  
  def Map[P](opts: js.Any): ReactComponentClass[P] = js.native
  
  def preloadAll(): js.Promise[_] = js.native
}
