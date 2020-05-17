package typingsSlinky.doublearray.doublearray

import typingsSlinky.doublearray.anon.All
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAndCheck extends js.Object {
  def calc(): All = js.native
  def dump(): String = js.native
  def getBase(): Double = js.native
  def getBaseBuffer(): js.Any = js.native
  def getCheck(): Double = js.native
     // Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
  def getCheckBuffer(): js.Any = js.native
  def getFirstUnusedNode(): Double = js.native
  def loadBaseBuffer(base_buffer: js.typedarray.Int16Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: js.typedarray.Int32Array): BaseAndCheck = js.native
    // Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
  def loadBaseBuffer(base_buffer: js.typedarray.Int8Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: js.typedarray.Uint16Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: js.typedarray.Uint32Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: js.typedarray.Uint8Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: js.typedarray.Int16Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: js.typedarray.Int32Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: js.typedarray.Int8Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: js.typedarray.Uint16Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: js.typedarray.Uint32Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: js.typedarray.Uint8Array): BaseAndCheck = js.native
  def setBase(index: Double, base_value: Double): Unit = js.native
  def setCheck(index: Double, check_value: Double): Unit = js.native
  def setFirstUnusedNode(index: Double): Unit = js.native
  def shrink(): Unit = js.native
  def size(): Double = js.native
}

