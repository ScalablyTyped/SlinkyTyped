package typingsSlinky.mongoose.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.bson.mod.ObjectId
import typingsSlinky.mongodb.mod.MongoCallback
import typingsSlinky.mongodb.mod.MongoClient
import typingsSlinky.mongodb.mod.MongoClientOptions
import typingsSlinky.mongoose.anon.TypeofBinary
import typingsSlinky.mongoose.anon.TypeofDecimal128Instantiable
import typingsSlinky.mongoose.anon.TypeofLogger
import typingsSlinky.mongoose.anon.TypeofLong
import typingsSlinky.mongoose.anon.TypeofMongoClient
import typingsSlinky.mongoose.anon.TypeofMongoError
import typingsSlinky.mongoose.anon.TypeofObjectID_
import typingsSlinky.mongoose.anon.TypeofObjectIdInstantiable
import typingsSlinky.mongoose.anon.TypeofReadPreference
import typingsSlinky.mongoose.anon.TypeofTimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "mongo")
@js.native
object mongo extends js.Object {
  @js.native
  class AggregationCursor[T] ()
    extends typingsSlinky.mongodb.mod.AggregationCursor[T]
  
  @js.native
  class ChangeStream[TSchema /* <: StringDictionary[js.Any] */] protected ()
    extends typingsSlinky.mongodb.mod.ChangeStream[TSchema] {
    def this(parent: MongoClient, pipeline: js.Array[js.Object]) = this()
  }
  
  @js.native
  class Code protected ()
    extends typingsSlinky.mongodb.mod.Code {
    def this(code: String) = this()
  }
  
  @js.native
  class CommandCursor ()
    extends typingsSlinky.mongodb.mod.CommandCursor
  
  @js.native
  class Cursor[T] ()
    extends typingsSlinky.mongodb.mod.Cursor[T]
  
  @js.native
  class DBRef protected ()
    extends typingsSlinky.mongodb.mod.DBRef {
    /**
      * @param namespace The collection name.
      * @param oid The reference ObjectId.
      * @param db Optional db name, if omitted the reference is local to the current db
      */
    def this(namespace: String, oid: ObjectId) = this()
  }
  
  @js.native
  class Db protected ()
    extends typingsSlinky.mongodb.mod.Db {
    def this(databaseName: String, serverConfig: typingsSlinky.mongodb.mod.Server) = this()
  }
  
  @js.native
  class Double protected ()
    extends typingsSlinky.mongodb.mod.Double {
    /**
      * @param value The number we want to represent as a double.
      */
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class GridFSBucket protected ()
    extends typingsSlinky.mongodb.mod.GridFSBucket {
    def this(db: typingsSlinky.mongodb.mod.Db) = this()
  }
  
  @js.native
  class GridFSBucketReadStream protected ()
    extends typingsSlinky.mongodb.mod.GridFSBucketReadStream {
    def this(
      chunks: typingsSlinky.mongodb.mod.Collection[_],
      files: typingsSlinky.mongodb.mod.Collection[_],
      readPreference: js.Object,
      filter: js.Object
    ) = this()
  }
  
  @js.native
  class GridFSBucketWriteStream protected ()
    extends typingsSlinky.mongodb.mod.GridFSBucketWriteStream {
    def this(bucket: typingsSlinky.mongodb.mod.GridFSBucket, filename: String) = this()
  }
  
  @js.native
  class Int32 protected ()
    extends typingsSlinky.mongodb.mod.Int32 {
    /**
      * @param value The number we want to represent as an int32.
      */
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class MaxKey ()
    extends typingsSlinky.mongodb.mod.MaxKey
  
  @js.native
  class MinKey ()
    extends typingsSlinky.mongodb.mod.MinKey
  
  @js.native
  class MongoNetworkError protected ()
    extends typingsSlinky.mongodb.mod.MongoNetworkError {
    def this(message: String) = this()
  }
  
  @js.native
  class MongoParseError protected ()
    extends typingsSlinky.mongodb.mod.MongoParseError {
    def this(message: String) = this()
  }
  
  @js.native
  class Mongos protected ()
    extends typingsSlinky.mongodb.mod.Mongos {
    def this(servers: js.Array[typingsSlinky.mongodb.mod.Server]) = this()
  }
  
  @js.native
  class ReplSet protected ()
    extends typingsSlinky.mongodb.mod.ReplSet {
    def this(servers: js.Array[typingsSlinky.mongodb.mod.Server]) = this()
  }
  
  @js.native
  class ResumeToken ()
    extends typingsSlinky.mongodb.mod.ResumeToken
  
  @js.native
  class Server protected ()
    extends typingsSlinky.mongodb.mod.Server {
    def this(host: String, port: scala.Double) = this()
  }
  
  var Binary: TypeofBinary = js.native
  var Decimal128: TypeofDecimal128Instantiable = js.native
  var Logger: TypeofLogger = js.native
  var Long: TypeofLong = js.native
  var MongoClient: TypeofMongoClient = js.native
  var MongoError: TypeofMongoError = js.native
  var ObjectID: TypeofObjectID_ = js.native
  var ObjectId: TypeofObjectIdInstantiable = js.native
  var ReadPreference: TypeofReadPreference = js.native
  var Timestamp: TypeofTimestamp = js.native
  def connect(uri: String): js.Promise[MongoClient] = js.native
  def connect(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
  def connect(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def connect(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
  @js.native
  object AggregationCursor
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mod.AggregationCursor[js.Object]]]
  
  @js.native
  object ChangeStream
    extends TopLevel[
          Instantiable2[
            /* parent */ MongoClient, 
            /* pipeline */ js.Array[js.Object], 
            typingsSlinky.mongodb.mod.ChangeStream[StringDictionary[js.Any]]
          ]
        ]
  
  @js.native
  object Code
    extends TopLevel[Instantiable1[/* code */ String, typingsSlinky.mongodb.mod.Code]]
  
  @js.native
  object CommandCursor
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mod.CommandCursor]]
  
  @js.native
  object Cursor
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mod.Cursor[js.Object]]]
  
  @js.native
  object DBRef
    extends TopLevel[
          Instantiable2[/* namespace */ String, /* oid */ ObjectId, typingsSlinky.mongodb.mod.DBRef]
        ]
  
  @js.native
  object Db
    extends TopLevel[
          Instantiable2[
            /* databaseName */ String, 
            /* serverConfig */ typingsSlinky.mongodb.mod.Server, 
            typingsSlinky.mongodb.mod.Db
          ]
        ]
  
  @js.native
  object Double
    extends TopLevel[Instantiable1[/* value */ scala.Double, typingsSlinky.mongodb.mod.Double]]
  
  @js.native
  object GridFSBucket
    extends TopLevel[
          Instantiable1[/* db */ typingsSlinky.mongodb.mod.Db, typingsSlinky.mongodb.mod.GridFSBucket]
        ]
  
  @js.native
  object GridFSBucketReadStream
    extends TopLevel[
          Instantiable4[
            /* chunks */ typingsSlinky.mongodb.mod.Collection[js.Any], 
            /* files */ typingsSlinky.mongodb.mod.Collection[js.Any], 
            /* readPreference */ js.Object, 
            /* filter */ js.Object, 
            typingsSlinky.mongodb.mod.GridFSBucketReadStream
          ]
        ]
  
  @js.native
  object GridFSBucketWriteStream
    extends TopLevel[
          Instantiable2[
            /* bucket */ typingsSlinky.mongodb.mod.GridFSBucket, 
            /* filename */ String, 
            typingsSlinky.mongodb.mod.GridFSBucketWriteStream
          ]
        ]
  
  @js.native
  object Int32
    extends TopLevel[Instantiable1[/* value */ scala.Double, typingsSlinky.mongodb.mod.Int32]]
  
  @js.native
  object MaxKey
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mod.MaxKey]]
  
  @js.native
  object MinKey
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mod.MinKey]]
  
  @js.native
  object MongoNetworkError
    extends TopLevel[Instantiable1[/* message */ String, typingsSlinky.mongodb.mod.MongoNetworkError]]
  
  @js.native
  object MongoParseError
    extends TopLevel[Instantiable1[/* message */ String, typingsSlinky.mongodb.mod.MongoParseError]]
  
  @js.native
  object Mongos
    extends TopLevel[
          Instantiable1[
            /* servers */ js.Array[typingsSlinky.mongodb.mod.Server], 
            typingsSlinky.mongodb.mod.Mongos
          ]
        ]
  
  @js.native
  object ReplSet
    extends TopLevel[
          Instantiable1[
            /* servers */ js.Array[typingsSlinky.mongodb.mod.Server], 
            typingsSlinky.mongodb.mod.ReplSet
          ]
        ]
  
  @js.native
  object ResumeToken
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mod.ResumeToken]]
  
  @js.native
  object Server
    extends TopLevel[
          Instantiable2[/* host */ String, /* port */ scala.Double, typingsSlinky.mongodb.mod.Server]
        ]
  
}

