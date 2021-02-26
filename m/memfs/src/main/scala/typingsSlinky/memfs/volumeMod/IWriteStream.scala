package typingsSlinky.memfs.volumeMod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWriteStream
  extends Writable
     with Instantiable2[/* path */ PathLike, /* options */ IWriteStreamOptions, js.Any] {
  
  var bytesWritten: Double = js.native
  
  def close(): js.Any = js.native
  
  def open(): js.Any = js.native
  
  var path: String = js.native
}
