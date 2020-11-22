package typingsSlinky.node

import typingsSlinky.node.anon.Data
import typingsSlinky.node.cryptoMod._KeyLike
import typingsSlinky.node.fsMod._PathLike
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Raw data is stored in instances of the Buffer class.
  * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
  * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
  */
@js.native
trait Buffer
  extends Uint8Array
     with _KeyLike
     with _PathLike {
  
  def compare(otherBuffer: js.typedarray.Uint8Array): Double = js.native
  def compare(
    otherBuffer: js.typedarray.Uint8Array,
    targetStart: js.UndefOr[scala.Nothing],
    targetEnd: js.UndefOr[scala.Nothing],
    sourceStart: js.UndefOr[scala.Nothing],
    sourceEnd: Double
  ): Double = js.native
  def compare(
    otherBuffer: js.typedarray.Uint8Array,
    targetStart: js.UndefOr[scala.Nothing],
    targetEnd: js.UndefOr[scala.Nothing],
    sourceStart: Double
  ): Double = js.native
  def compare(
    otherBuffer: js.typedarray.Uint8Array,
    targetStart: js.UndefOr[scala.Nothing],
    targetEnd: js.UndefOr[scala.Nothing],
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: js.typedarray.Uint8Array, targetStart: js.UndefOr[scala.Nothing], targetEnd: Double): Double = js.native
  def compare(
    otherBuffer: js.typedarray.Uint8Array,
    targetStart: js.UndefOr[scala.Nothing],
    targetEnd: Double,
    sourceStart: js.UndefOr[scala.Nothing],
    sourceEnd: Double
  ): Double = js.native
  def compare(
    otherBuffer: js.typedarray.Uint8Array,
    targetStart: js.UndefOr[scala.Nothing],
    targetEnd: Double,
    sourceStart: Double
  ): Double = js.native
  def compare(
    otherBuffer: js.typedarray.Uint8Array,
    targetStart: js.UndefOr[scala.Nothing],
    targetEnd: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: js.typedarray.Uint8Array, targetStart: Double): Double = js.native
  def compare(
    otherBuffer: js.typedarray.Uint8Array,
    targetStart: Double,
    targetEnd: js.UndefOr[scala.Nothing],
    sourceStart: js.UndefOr[scala.Nothing],
    sourceEnd: Double
  ): Double = js.native
  def compare(
    otherBuffer: js.typedarray.Uint8Array,
    targetStart: Double,
    targetEnd: js.UndefOr[scala.Nothing],
    sourceStart: Double
  ): Double = js.native
  def compare(
    otherBuffer: js.typedarray.Uint8Array,
    targetStart: Double,
    targetEnd: js.UndefOr[scala.Nothing],
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: js.typedarray.Uint8Array, targetStart: Double, targetEnd: Double): Double = js.native
  def compare(
    otherBuffer: js.typedarray.Uint8Array,
    targetStart: Double,
    targetEnd: Double,
    sourceStart: js.UndefOr[scala.Nothing],
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: js.typedarray.Uint8Array, targetStart: Double, targetEnd: Double, sourceStart: Double): Double = js.native
  def compare(
    otherBuffer: js.typedarray.Uint8Array,
    targetStart: Double,
    targetEnd: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  
  def copy(targetBuffer: js.typedarray.Uint8Array): Double = js.native
  def copy(
    targetBuffer: js.typedarray.Uint8Array,
    targetStart: js.UndefOr[scala.Nothing],
    sourceStart: js.UndefOr[scala.Nothing],
    sourceEnd: Double
  ): Double = js.native
  def copy(
    targetBuffer: js.typedarray.Uint8Array,
    targetStart: js.UndefOr[scala.Nothing],
    sourceStart: Double
  ): Double = js.native
  def copy(
    targetBuffer: js.typedarray.Uint8Array,
    targetStart: js.UndefOr[scala.Nothing],
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def copy(targetBuffer: js.typedarray.Uint8Array, targetStart: Double): Double = js.native
  def copy(
    targetBuffer: js.typedarray.Uint8Array,
    targetStart: Double,
    sourceStart: js.UndefOr[scala.Nothing],
    sourceEnd: Double
  ): Double = js.native
  def copy(targetBuffer: js.typedarray.Uint8Array, targetStart: Double, sourceStart: Double): Double = js.native
  def copy(
    targetBuffer: js.typedarray.Uint8Array,
    targetStart: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  
  def equals(otherBuffer: js.typedarray.Uint8Array): Boolean = js.native
  
  def fill(value: java.lang.String): this.type = js.native
  def fill(
    value: java.lang.String,
    offset: js.UndefOr[scala.Nothing],
    end: js.UndefOr[scala.Nothing],
    encoding: BufferEncoding
  ): this.type = js.native
  def fill(value: java.lang.String, offset: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
  def fill(value: java.lang.String, offset: js.UndefOr[scala.Nothing], end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: java.lang.String, offset: Double): this.type = js.native
  def fill(value: java.lang.String, offset: Double, end: js.UndefOr[scala.Nothing], encoding: BufferEncoding): this.type = js.native
  def fill(value: java.lang.String, offset: Double, end: Double): this.type = js.native
  def fill(value: java.lang.String, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(
    value: Double,
    offset: js.UndefOr[scala.Nothing],
    end: js.UndefOr[scala.Nothing],
    encoding: BufferEncoding
  ): this.type = js.native
  def fill(value: Double, offset: js.UndefOr[scala.Nothing], end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Double, end: js.UndefOr[scala.Nothing], encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: js.typedarray.Uint8Array): this.type = js.native
  def fill(
    value: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    end: js.UndefOr[scala.Nothing],
    encoding: BufferEncoding
  ): this.type = js.native
  def fill(value: js.typedarray.Uint8Array, offset: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
  def fill(
    value: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    end: Double,
    encoding: BufferEncoding
  ): this.type = js.native
  def fill(value: js.typedarray.Uint8Array, offset: Double): this.type = js.native
  def fill(
    value: js.typedarray.Uint8Array,
    offset: Double,
    end: js.UndefOr[scala.Nothing],
    encoding: BufferEncoding
  ): this.type = js.native
  def fill(value: js.typedarray.Uint8Array, offset: Double, end: Double): this.type = js.native
  def fill(value: js.typedarray.Uint8Array, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  
  def includes(value: java.lang.String): Boolean = js.native
  def includes(value: java.lang.String, byteOffset: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Boolean = js.native
  def includes(value: java.lang.String, byteOffset: Double): Boolean = js.native
  def includes(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Double, byteOffset: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Boolean = js.native
  def includes(value: Double, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Buffer): Boolean = js.native
  def includes(value: Buffer, byteOffset: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Boolean = js.native
  def includes(value: Buffer, byteOffset: Double): Boolean = js.native
  def includes(value: Buffer, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  
  def indexOf(value: java.lang.String): Double = js.native
  def indexOf(value: java.lang.String, byteOffset: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
  def indexOf(value: java.lang.String, byteOffset: Double): Double = js.native
  def indexOf(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Double, byteOffset: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
  def indexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array, byteOffset: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  
  def lastIndexOf(value: java.lang.String): Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: Double): Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Double, byteOffset: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: js.typedarray.Uint8Array): Double = js.native
  def lastIndexOf(value: js.typedarray.Uint8Array, byteOffset: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: js.typedarray.Uint8Array, byteOffset: Double): Double = js.native
  def lastIndexOf(value: js.typedarray.Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  
  def readBigInt64BE(): js.BigInt = js.native
  def readBigInt64BE(offset: Double): js.BigInt = js.native
  
  def readBigInt64LE(): js.BigInt = js.native
  def readBigInt64LE(offset: Double): js.BigInt = js.native
  
  def readBigUInt64BE(): js.BigInt = js.native
  def readBigUInt64BE(offset: Double): js.BigInt = js.native
  
  def readBigUInt64LE(): js.BigInt = js.native
  def readBigUInt64LE(offset: Double): js.BigInt = js.native
  
  def readDoubleBE(): Double = js.native
  def readDoubleBE(offset: Double): Double = js.native
  
  def readDoubleLE(): Double = js.native
  def readDoubleLE(offset: Double): Double = js.native
  
  def readFloatBE(): Double = js.native
  def readFloatBE(offset: Double): Double = js.native
  
  def readFloatLE(): Double = js.native
  def readFloatLE(offset: Double): Double = js.native
  
  def readInt16BE(): Double = js.native
  def readInt16BE(offset: Double): Double = js.native
  
  def readInt16LE(): Double = js.native
  def readInt16LE(offset: Double): Double = js.native
  
  def readInt32BE(): Double = js.native
  def readInt32BE(offset: Double): Double = js.native
  
  def readInt32LE(): Double = js.native
  def readInt32LE(offset: Double): Double = js.native
  
  def readInt8(): Double = js.native
  def readInt8(offset: Double): Double = js.native
  
  def readIntBE(offset: Double, byteLength: Double): Double = js.native
  
  def readIntLE(offset: Double, byteLength: Double): Double = js.native
  
  def readUInt16BE(): Double = js.native
  def readUInt16BE(offset: Double): Double = js.native
  
  def readUInt16LE(): Double = js.native
  def readUInt16LE(offset: Double): Double = js.native
  
  def readUInt32BE(): Double = js.native
  def readUInt32BE(offset: Double): Double = js.native
  
  def readUInt32LE(): Double = js.native
  def readUInt32LE(offset: Double): Double = js.native
  
  def readUInt8(): Double = js.native
  def readUInt8(offset: Double): Double = js.native
  
  def readUIntBE(offset: Double, byteLength: Double): Double = js.native
  
  def readUIntLE(offset: Double, byteLength: Double): Double = js.native
  
  def swap16(): Buffer = js.native
  
  def swap32(): Buffer = js.native
  
  def swap64(): Buffer = js.native
  
  def toJSON(): Data = js.native
  
  def toString(encoding: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): java.lang.String = js.native
  def toString(encoding: js.UndefOr[scala.Nothing], start: Double): java.lang.String = js.native
  def toString(encoding: js.UndefOr[scala.Nothing], start: Double, end: Double): java.lang.String = js.native
  def toString(encoding: BufferEncoding): java.lang.String = js.native
  def toString(encoding: BufferEncoding, start: js.UndefOr[scala.Nothing], end: Double): java.lang.String = js.native
  def toString(encoding: BufferEncoding, start: Double): java.lang.String = js.native
  def toString(encoding: BufferEncoding, start: Double, end: Double): java.lang.String = js.native
  
  def write(string: java.lang.String): Double = js.native
  def write(string: java.lang.String, encoding: BufferEncoding): Double = js.native
  def write(string: java.lang.String, offset: Double): Double = js.native
  def write(string: java.lang.String, offset: Double, encoding: BufferEncoding): Double = js.native
  def write(string: java.lang.String, offset: Double, length: Double): Double = js.native
  def write(string: java.lang.String, offset: Double, length: Double, encoding: BufferEncoding): Double = js.native
  
  def writeBigInt64BE(value: js.BigInt): Double = js.native
  def writeBigInt64BE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeBigInt64LE(value: js.BigInt): Double = js.native
  def writeBigInt64LE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeBigUInt64BE(value: js.BigInt): Double = js.native
  def writeBigUInt64BE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeBigUInt64LE(value: js.BigInt): Double = js.native
  def writeBigUInt64LE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeDoubleBE(value: Double): Double = js.native
  def writeDoubleBE(value: Double, offset: Double): Double = js.native
  
  def writeDoubleLE(value: Double): Double = js.native
  def writeDoubleLE(value: Double, offset: Double): Double = js.native
  
  def writeFloatBE(value: Double): Double = js.native
  def writeFloatBE(value: Double, offset: Double): Double = js.native
  
  def writeFloatLE(value: Double): Double = js.native
  def writeFloatLE(value: Double, offset: Double): Double = js.native
  
  def writeInt16BE(value: Double): Double = js.native
  def writeInt16BE(value: Double, offset: Double): Double = js.native
  
  def writeInt16LE(value: Double): Double = js.native
  def writeInt16LE(value: Double, offset: Double): Double = js.native
  
  def writeInt32BE(value: Double): Double = js.native
  def writeInt32BE(value: Double, offset: Double): Double = js.native
  
  def writeInt32LE(value: Double): Double = js.native
  def writeInt32LE(value: Double, offset: Double): Double = js.native
  
  def writeInt8(value: Double): Double = js.native
  def writeInt8(value: Double, offset: Double): Double = js.native
  
  def writeIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  def writeIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  def writeUInt16BE(value: Double): Double = js.native
  def writeUInt16BE(value: Double, offset: Double): Double = js.native
  
  def writeUInt16LE(value: Double): Double = js.native
  def writeUInt16LE(value: Double, offset: Double): Double = js.native
  
  def writeUInt32BE(value: Double): Double = js.native
  def writeUInt32BE(value: Double, offset: Double): Double = js.native
  
  def writeUInt32LE(value: Double): Double = js.native
  def writeUInt32LE(value: Double, offset: Double): Double = js.native
  
  def writeUInt8(value: Double): Double = js.native
  def writeUInt8(value: Double, offset: Double): Double = js.native
  
  def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
}
