package typingsSlinky.commonErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("common-errors", "data")
@js.native
object data extends js.Object {
  
  /**
    * Applicable when an error occurs on or with an external data source.
    *
    * @example throw new errors.data.DataError('Too many rows returned from database', err)
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @js.native
  class DataError protected () extends js.Object {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /**
    * Applicable when an error occurs while using memcached.
    *
    * @example throw new errors.data.MemcachedError('Expected value not found', err)
    */
  @js.native
  class MemcachedError protected () extends DataError {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /**
    * Applicable when an error occurs while using MongoDB.
    *
    * @example throw new errors.data.MongoDBError('Retrieved value not in expected format', err)
    */
  @js.native
  class MongoDBError protected () extends DataError {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /**
    * Applicable when an error occurs while using redis.
    *
    * @example throw new errors.data.RedisError('expected value not found in redis', err)
    */
  @js.native
  class RedisError protected () extends DataError {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /**
    * Applicable when a transaction was unexpectedly rolled back.
    *
    * @example throw new errors.data.RollbackError('database transaction was unexpectedly rolled back', err)
    */
  @js.native
  class RollbackError protected () extends DataError {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /**
    * Applicable when an error occurs while using a SQL database.
    *
    * @example throw new errors.data.SQLError('foreign key constraint violated', err)
    */
  @js.native
  class SQLError protected () extends DataError {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /**
    * Applicable when an error unexpectedly interrupts a transaction.
    *
    * @example throw new errors.data.TransactionError('transaction already complete', err)
    */
  @js.native
  class TransactionError protected () extends DataError {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
}
