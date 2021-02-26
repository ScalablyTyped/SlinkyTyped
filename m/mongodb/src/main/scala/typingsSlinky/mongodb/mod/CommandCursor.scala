package typingsSlinky.mongodb.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "CommandCursor")
@js.native
class CommandCursor () extends Readable {
  def this(opts: ReadableOptions) = this()
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#batchSize */
  def batchSize(value: scala.Double): CommandCursor = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#close */
  def close(): js.Promise[CommandCursorResult] = js.native
  def close(callback: MongoCallback[CommandCursorResult]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#each */
  def each(callback: MongoCallback[CommandCursorResult]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#hasNext */
  def hasNext(): js.Promise[Boolean] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#hasNext */
  def hasNext(callback: MongoCallback[Boolean]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#isClosed */
  def isClosed(): Boolean = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#maxTimeMS */
  def maxTimeMS(value: scala.Double): CommandCursor = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#next */
  def next(): js.Promise[CommandCursorResult] = js.native
  def next(callback: MongoCallback[CommandCursorResult]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#rewind */
  def rewind(): CommandCursor = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#setReadPreference */
  def setReadPreference(readPreference: ReadPreferenceOrMode): CommandCursor = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#toArray */
  def toArray(): js.Promise[js.Array[_]] = js.native
  def toArray(callback: MongoCallback[js.Array[_]]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/CommandCursor.html#unshift */
  def unshift(stream: Buffer): Unit = js.native
}
