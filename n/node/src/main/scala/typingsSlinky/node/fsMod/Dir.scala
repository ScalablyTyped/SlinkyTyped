package typingsSlinky.node.fsMod

import typingsSlinky.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "Dir")
@js.native
class Dir () extends StObject {
  
  /**
    * Asynchronously close the directory's underlying resource handle.
    * Subsequent reads will result in errors.
    */
  def close(): js.Promise[Unit] = js.native
  def close(cb: NoParamCallback): Unit = js.native
  
  /**
    * Synchronously close the directory's underlying resource handle.
    * Subsequent reads will result in errors.
    */
  def closeSync(): Unit = js.native
  
  val path: String = js.native
  
  /**
    * Asynchronously read the next directory entry via `readdir(3)` as an `Dirent`.
    * After the read is completed, a value is returned that will be resolved with an `Dirent`, or `null` if there are no more directory entries to read.
    * Directory entries returned by this function are in no particular order as provided by the operating system's underlying directory mechanisms.
    */
  def read(): js.Promise[Dirent | Null] = js.native
  def read(cb: js.Function2[/* err */ ErrnoException | Null, /* dirEnt */ Dirent | Null, Unit]): Unit = js.native
  
  /**
    * Synchronously read the next directory entry via `readdir(3)` as a `Dirent`.
    * If there are no more directory entries to read, null will be returned.
    * Directory entries returned by this function are in no particular order as provided by the operating system's underlying directory mechanisms.
    */
  def readSync(): Dirent = js.native
}
