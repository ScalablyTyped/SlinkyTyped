package typingsSlinky.orientjs.mod

import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "OResult")
@js.native
class OResult[R] protected () extends Readable {
  def this(db: ODatabase, pageSize: Double) = this()
  
  /**
    *
    * @return
    */
  def all(): js.Promise[js.Array[R]] = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def one(): js.Promise[R] = js.native
}
