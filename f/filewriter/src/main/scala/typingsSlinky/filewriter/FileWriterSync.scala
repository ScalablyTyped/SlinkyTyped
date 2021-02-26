package typingsSlinky.filewriter

import org.scalajs.dom.raw.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface lets users write, truncate, and append to files using simple synchronous calls.
  * This interface is specified to be used only within Web Workers (WorkerUtils [WEBWORKERS]).
  */
@js.native
trait FileWriterSync extends StObject {
  
  /**
    * The length of the file. If the user does not have read access to the file, this must be the highest byte offset at which the user has written.
    */
  var length: Double = js.native
  
  /**
    * The byte offset at which the next write to the file will occur. This must be no greater than length.
    */
  var position: Double = js.native
  
  /**
    * Seek sets the file position at which the next write will occur.
    * @param offset An absolute byte offset into the file. If offset is greater than length, length is used instead. If offset is less than zero, length is added to it, so that it is treated as an offset back from the end of the file. If it is still less than zero, zero is used.
    */
  def seek(offset: Double): Unit = js.native
  
  /**
    * Changes the length of the file to that specified. If shortening the file, data beyond the new length must be discarded. If extending the file, the existing data must be zero-padded up to the new length.
    * Upon successful completion:
    * <ul>
    *     <li>length must be equal to size.</li>
    *     <li>position must be the lesser of
    *          <ul>
    *              <li>its pre-truncate value,</li>
    *              <li>size.</li>
    *          </ul>
    *      </li>
    *  </ul>
    * @param size The size to which the length of the file is to be adjusted, measured in bytes.
    */
  def truncate(size: Double): Unit = js.native
  
  /**
    * Write the supplied data to the file at position. Upon completion, position will increase by data.size.
    * @param data The blob to write.
    */
  def write(data: Blob): Unit = js.native
}
object FileWriterSync {
  
  @scala.inline
  def apply(
    length: Double,
    position: Double,
    seek: Double => Unit,
    truncate: Double => Unit,
    write: Blob => Unit
  ): FileWriterSync = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), truncate = js.Any.fromFunction1(truncate), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[FileWriterSync]
  }
  
  @scala.inline
  implicit class FileWriterSyncMutableBuilder[Self <: FileWriterSync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTruncate(value: Double => Unit): Self = StObject.set(x, "truncate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: Blob => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
