package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataReader extends js.Object {
  var _dataByteOffset: js.Any = js.native
  var _dataView: js.Any = js.native
  /**
    * The data buffer associated with this data reader.
    */
  val buffer: IDataBuffer = js.native
  /**
    * The current byte offset from the beginning of the data buffer.
    */
  var byteOffset: Double = js.native
  /**
    * Loads the given byte length.
    * @param byteLength The byte length to load
    * @returns A promise that resolves when the load is complete
    */
  def loadAsync(byteLength: Double): js.Promise[Unit] = js.native
  /**
    * Read a string from the currently loaded data range.
    * @param byteLength The byte length to read
    * @returns The string read
    */
  def readString(byteLength: Double): String = js.native
  /**
    * Read a unsigned 32-bit integer from the currently loaded data range.
    * @returns The 32-bit integer read
    */
  def readUint32(): Double = js.native
  /**
    * Read a byte array from the currently loaded data range.
    * @param byteLength The byte length to read
    * @returns The byte array read
    */
  def readUint8Array(byteLength: Double): js.typedarray.Uint8Array = js.native
  /**
    * Skips the given byte length the currently loaded data range.
    * @param byteLength The byte length to skip
    */
  def skipBytes(byteLength: Double): Unit = js.native
}

object DataReader {
  @scala.inline
  def apply(
    _dataByteOffset: js.Any,
    _dataView: js.Any,
    buffer: IDataBuffer,
    byteOffset: Double,
    loadAsync: Double => js.Promise[Unit],
    readString: Double => String,
    readUint32: () => Double,
    readUint8Array: Double => js.typedarray.Uint8Array,
    skipBytes: Double => Unit
  ): DataReader = {
    val __obj = js.Dynamic.literal(_dataByteOffset = _dataByteOffset.asInstanceOf[js.Any], _dataView = _dataView.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction1(loadAsync), readString = js.Any.fromFunction1(readString), readUint32 = js.Any.fromFunction0(readUint32), readUint8Array = js.Any.fromFunction1(readUint8Array), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[DataReader]
  }
  @scala.inline
  implicit class DataReaderOps[Self <: DataReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_dataByteOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dataByteOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_dataView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dataView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffer(value: IDataBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByteOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadAsync(value: Double => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadString(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadUint32(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readUint32")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadUint8Array(value: Double => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readUint8Array")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkipBytes(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBytes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

