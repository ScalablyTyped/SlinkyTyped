package typingsSlinky.bl.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferList extends Duplex {
  
  def append(buffer: String): Unit = js.native
  def append(buffer: js.Array[Buffer | BufferList]): Unit = js.native
  def append(buffer: BufferList): Unit = js.native
  def append(buffer: Buffer): Unit = js.native
  
  def consume(): Unit = js.native
  def consume(bytes: Double): Unit = js.native
  
  def copy(dest: Buffer): Unit = js.native
  def copy(
    dest: Buffer,
    destStart: js.UndefOr[scala.Nothing],
    srcStart: js.UndefOr[scala.Nothing],
    srcEnd: Double
  ): Unit = js.native
  def copy(dest: Buffer, destStart: js.UndefOr[scala.Nothing], srcStart: Double): Unit = js.native
  def copy(dest: Buffer, destStart: js.UndefOr[scala.Nothing], srcStart: Double, srcEnd: Double): Unit = js.native
  def copy(dest: Buffer, destStart: Double): Unit = js.native
  def copy(dest: Buffer, destStart: Double, srcStart: js.UndefOr[scala.Nothing], srcEnd: Double): Unit = js.native
  def copy(dest: Buffer, destStart: Double, srcStart: Double): Unit = js.native
  def copy(dest: Buffer, destStart: Double, srcStart: Double, srcEnd: Double): Unit = js.native
  
  def duplicate(): BufferList = js.native
  
  def get(index: Double): Double = js.native
  
  def indexOf(value: String): Double = js.native
  def indexOf(value: String, byteOffset: js.UndefOr[scala.Nothing], encoding: String): Double = js.native
  def indexOf(value: String, byteOffset: Double): Double = js.native
  def indexOf(value: String, byteOffset: Double, encoding: String): Double = js.native
  def indexOf(value: Double): Double = js.native
  def indexOf(value: Double, byteOffset: js.UndefOr[scala.Nothing], encoding: String): Double = js.native
  def indexOf(value: Double, byteOffset: Double): Double = js.native
  def indexOf(value: Double, byteOffset: Double, encoding: String): Double = js.native
  def indexOf(value: BufferList): Double = js.native
  def indexOf(value: BufferList, byteOffset: js.UndefOr[scala.Nothing], encoding: String): Double = js.native
  def indexOf(value: BufferList, byteOffset: Double): Double = js.native
  def indexOf(value: BufferList, byteOffset: Double, encoding: String): Double = js.native
  def indexOf(value: Buffer): Double = js.native
  def indexOf(value: Buffer, byteOffset: js.UndefOr[scala.Nothing], encoding: String): Double = js.native
  def indexOf(value: Buffer, byteOffset: Double): Double = js.native
  def indexOf(value: Buffer, byteOffset: Double, encoding: String): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array, byteOffset: js.UndefOr[scala.Nothing], encoding: String): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double, encoding: String): Double = js.native
  
  var length: Double = js.native
  
  def readDoubleBE(offset: Double): Double = js.native
  def readDoubleBE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readDoubleLE(offset: Double): Double = js.native
  def readDoubleLE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readFloatBE(offset: Double): Double = js.native
  def readFloatBE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readFloatLE(offset: Double): Double = js.native
  def readFloatLE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readInt16BE(offset: Double): Double = js.native
  def readInt16BE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readInt16LE(offset: Double): Double = js.native
  def readInt16LE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readInt32BE(offset: Double): Double = js.native
  def readInt32BE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readInt32LE(offset: Double): Double = js.native
  def readInt32LE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readInt8(offset: Double): Double = js.native
  def readInt8(offset: Double, noAssert: Boolean): Double = js.native
  
  def readUInt16BE(offset: Double): Double = js.native
  def readUInt16BE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readUInt16LE(offset: Double): Double = js.native
  def readUInt16LE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readUInt32BE(offset: Double): Double = js.native
  def readUInt32BE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readUInt32LE(offset: Double): Double = js.native
  def readUInt32LE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readUInt8(offset: Double): Double = js.native
  def readUInt8(offset: Double, noAssert: Boolean): Double = js.native
  
  def shallowSlice(): BufferList = js.native
  def shallowSlice(start: js.UndefOr[scala.Nothing], end: Double): BufferList = js.native
  def shallowSlice(start: Double): BufferList = js.native
  def shallowSlice(start: Double, end: Double): BufferList = js.native
  
  def slice(): Buffer = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): Buffer = js.native
  def slice(start: Double): Buffer = js.native
  def slice(start: Double, end: Double): Buffer = js.native
  
  def toString(encoding: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): String = js.native
  def toString(encoding: js.UndefOr[scala.Nothing], start: Double): String = js.native
  def toString(encoding: js.UndefOr[scala.Nothing], start: Double, end: Double): String = js.native
  def toString(encoding: String): String = js.native
  def toString(encoding: String, start: js.UndefOr[scala.Nothing], end: Double): String = js.native
  def toString(encoding: String, start: Double): String = js.native
  def toString(encoding: String, start: Double, end: Double): String = js.native
}
