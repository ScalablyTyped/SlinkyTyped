package typingsSlinky.mongodb.mod

import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientSession extends EventEmitter {
  
  /**
    * Aborts the currently active transaction in this session.
    * @param cb Optional callback for completion of this operation
    */
  def abortTransaction(): js.Promise[Unit] = js.native
  def abortTransaction(cb: MongoCallback[Unit]): js.Promise[Unit] = js.native
  
  /**
    * Advances the operationTime for a ClientSession.
    */
  def advanceOperationTime(operamtionTime: typingsSlinky.bson.mod.Timestamp): Unit = js.native
  
  /**
    * Commits the currently active transaction in this session.
    * @param cb Optional callback for completion of this operation
    */
  def commitTransaction(): js.Promise[Unit] = js.native
  def commitTransaction(cb: MongoCallback[Unit]): js.Promise[Unit] = js.native
  
  /**
    * Ends this session on the server
    * @param cb Optional callback for completion of this operation
    */
  def endSession(): Unit = js.native
  def endSession(cb: MongoCallback[Unit]): Unit = js.native
  /**
    * Ends this session on the server
    * @param options Optional settings. Currently reserved for future use
    * @param cb Optional callback for completion of this operation
    */
  def endSession(options: js.Any): Unit = js.native
  def endSession(options: js.Any, cb: MongoCallback[Unit]): Unit = js.native
  
  /**
    * Used to determine if this session equals another
    *
    * @param session A class representing a client session on the server
    * @returns Whether the sessions are equal
    */
  def equals(session: ClientSession): Boolean = js.native
  
  /** The server id associated with this session */
  var id: js.Any = js.native
  
  /**
    * @returns Whether this session is currently in a transaction or not
    */
  def inTransaction(): Boolean = js.native
  
  /** Increment the transaction number on the internal ServerSession */
  def incrementTransactionNumber(): Unit = js.native
  
  /**
    * Starts a new transaction with the given options.
    */
  def startTransaction(): Unit = js.native
  def startTransaction(options: TransactionOptions): Unit = js.native
  
  /**
    * Runs a provided lambda within a transaction, retrying either the commit operation
    * or entire transaction as needed (and when the error permits) to better ensure that
    * the transaction can complete successfully.
    *
    * IMPORTANT: This method requires the user to return a Promise, all lambdas that do not
    * return a Promise will result in undefined behavior.
    *
    * @param fn Function to execute with the new session.
    * @param options Optional settings for the transaction
    */
  def withTransaction[T](fn: WithTransactionCallback[T]): js.Promise[Unit] = js.native
  def withTransaction[T](fn: WithTransactionCallback[T], options: TransactionOptions): js.Promise[Unit] = js.native
}
