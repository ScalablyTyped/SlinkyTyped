package typingsSlinky.mongoose.mongooseMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.bson.bsonMod.ObjectId
import typingsSlinky.mongodb.mongodbMod.MongoCallback
import typingsSlinky.mongodb.mongodbMod.MongoClient
import typingsSlinky.mongodb.mongodbMod.MongoClientOptions
import typingsSlinky.mongoose.TypeofClassBinary
import typingsSlinky.mongoose.TypeofClassDecimal128Bytes
import typingsSlinky.mongoose.TypeofClassLogger
import typingsSlinky.mongoose.TypeofClassLong
import typingsSlinky.mongoose.TypeofClassMongoClient
import typingsSlinky.mongoose.TypeofClassMongoError
import typingsSlinky.mongoose.TypeofClassObjectID
import typingsSlinky.mongoose.TypeofClassObjectIdCacheHexString
import typingsSlinky.mongoose.TypeofClassReadPreference
import typingsSlinky.mongoose.TypeofClassTimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "mongo")
@js.native
object mongo extends js.Object {
  @js.native
  class AggregationCursor[T] ()
    extends typingsSlinky.mongodb.mongodbMod.AggregationCursor[T]
  
  @js.native
  class ChangeStream protected ()
    extends typingsSlinky.mongodb.mongodbMod.ChangeStream {
    def this(changeDomain: typingsSlinky.mongodb.mongodbMod.Db, pipeline: js.Array[js.Object]) = this()
  }
  
  @js.native
  class Code protected ()
    extends typingsSlinky.mongodb.mongodbMod.Code {
    def this(code: String) = this()
  }
  
  @js.native
  class CommandCursor ()
    extends typingsSlinky.mongodb.mongodbMod.CommandCursor
  
  @js.native
  class Cursor[T] ()
    extends typingsSlinky.mongodb.mongodbMod.Cursor[T]
  
  @js.native
  class DBRef protected ()
    extends typingsSlinky.mongodb.mongodbMod.DBRef {
    /**
      * @param namespace The collection name.
      * @param oid The reference ObjectId.
      * @param db Optional db name, if omitted the reference is local to the current db
      */
    def this(namespace: String, oid: ObjectId) = this()
  }
  
  @js.native
  class Db protected ()
    extends typingsSlinky.mongodb.mongodbMod.Db {
    def this(databaseName: String, serverConfig: typingsSlinky.mongodb.mongodbMod.Server) = this()
  }
  
  @js.native
  class Double protected ()
    extends typingsSlinky.mongodb.mongodbMod.Double {
    /**
      * @param value The number we want to represent as a double.
      */
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class GridFSBucket protected ()
    extends typingsSlinky.mongodb.mongodbMod.GridFSBucket {
    def this(db: typingsSlinky.mongodb.mongodbMod.Db) = this()
  }
  
  @js.native
  class GridFSBucketReadStream protected ()
    extends typingsSlinky.mongodb.mongodbMod.GridFSBucketReadStream {
    def this(
      chunks: typingsSlinky.mongodb.mongodbMod.Collection[_],
      files: typingsSlinky.mongodb.mongodbMod.Collection[_],
      readPreference: js.Object,
      filter: js.Object
    ) = this()
  }
  
  @js.native
  class GridFSBucketWriteStream protected ()
    extends typingsSlinky.mongodb.mongodbMod.GridFSBucketWriteStream {
    def this(bucket: typingsSlinky.mongodb.mongodbMod.GridFSBucket, filename: String) = this()
  }
  
  @js.native
  class Int32 protected ()
    extends typingsSlinky.mongodb.mongodbMod.Int32 {
    /**
      * @param value The number we want to represent as an int32.
      */
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class MaxKey ()
    extends typingsSlinky.mongodb.mongodbMod.MaxKey
  
  @js.native
  class MinKey ()
    extends typingsSlinky.mongodb.mongodbMod.MinKey
  
  @js.native
  class MongoNetworkError protected ()
    extends typingsSlinky.mongodb.mongodbMod.MongoNetworkError {
    def this(message: String) = this()
  }
  
  @js.native
  class MongoParseError protected ()
    extends typingsSlinky.mongodb.mongodbMod.MongoParseError {
    def this(message: String) = this()
  }
  
  @js.native
  class Mongos protected ()
    extends typingsSlinky.mongodb.mongodbMod.Mongos {
    def this(servers: js.Array[typingsSlinky.mongodb.mongodbMod.Server]) = this()
  }
  
  @js.native
  class ReplSet protected ()
    extends typingsSlinky.mongodb.mongodbMod.ReplSet {
    def this(servers: js.Array[typingsSlinky.mongodb.mongodbMod.Server]) = this()
  }
  
  @js.native
  class ResumeToken ()
    extends typingsSlinky.mongodb.mongodbMod.ResumeToken
  
  @js.native
  class Server protected ()
    extends typingsSlinky.mongodb.mongodbMod.Server {
    def this(host: String, port: scala.Double) = this()
  }
  
  var Binary: TypeofClassBinary = js.native
  var Decimal128: TypeofClassDecimal128Bytes = js.native
  var Logger: TypeofClassLogger = js.native
  var Long: TypeofClassLong = js.native
  var MongoClient: TypeofClassMongoClient = js.native
  var MongoError: TypeofClassMongoError = js.native
  var ObjectID: TypeofClassObjectID = js.native
  var ObjectId: TypeofClassObjectIdCacheHexString = js.native
  var ReadPreference: TypeofClassReadPreference = js.native
  var Timestamp: TypeofClassTimestamp = js.native
  def connect(uri: String): js.Promise[MongoClient] = js.native
  def connect(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
  def connect(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def connect(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
  @js.native
  object AggregationCursor
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mongodbMod.AggregationCursor[js.Object]]]
  
  @js.native
  object ChangeStream
    extends TopLevel[
          Instantiable2[
            /* changeDomain */ typingsSlinky.mongodb.mongodbMod.Db, 
            /* pipeline */ js.Array[js.Object], 
            typingsSlinky.mongodb.mongodbMod.ChangeStream
          ]
        ]
  
  @js.native
  object Code
    extends TopLevel[Instantiable1[/* code */ String, typingsSlinky.mongodb.mongodbMod.Code]]
  
  @js.native
  object CommandCursor
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mongodbMod.CommandCursor]]
  
  @js.native
  object Cursor
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mongodbMod.Cursor[js.Object]]]
  
  @js.native
  object DBRef
    extends TopLevel[
          Instantiable2[/* namespace */ String, /* oid */ ObjectId, typingsSlinky.mongodb.mongodbMod.DBRef]
        ]
  
  @js.native
  object Db
    extends TopLevel[
          Instantiable2[
            /* databaseName */ String, 
            /* serverConfig */ typingsSlinky.mongodb.mongodbMod.Server, 
            typingsSlinky.mongodb.mongodbMod.Db
          ]
        ]
  
  @js.native
  object Double
    extends TopLevel[Instantiable1[/* value */ scala.Double, typingsSlinky.mongodb.mongodbMod.Double]]
  
  @js.native
  object GridFSBucket
    extends TopLevel[
          Instantiable1[
            /* db */ typingsSlinky.mongodb.mongodbMod.Db, 
            typingsSlinky.mongodb.mongodbMod.GridFSBucket
          ]
        ]
  
  @js.native
  object GridFSBucketReadStream
    extends TopLevel[
          Instantiable4[
            /* chunks */ typingsSlinky.mongodb.mongodbMod.Collection[js.Any], 
            /* files */ typingsSlinky.mongodb.mongodbMod.Collection[js.Any], 
            /* readPreference */ js.Object, 
            /* filter */ js.Object, 
            typingsSlinky.mongodb.mongodbMod.GridFSBucketReadStream
          ]
        ]
  
  @js.native
  object GridFSBucketWriteStream
    extends TopLevel[
          Instantiable2[
            /* bucket */ typingsSlinky.mongodb.mongodbMod.GridFSBucket, 
            /* filename */ String, 
            typingsSlinky.mongodb.mongodbMod.GridFSBucketWriteStream
          ]
        ]
  
  @js.native
  object Int32
    extends TopLevel[Instantiable1[/* value */ scala.Double, typingsSlinky.mongodb.mongodbMod.Int32]]
  
  @js.native
  object MaxKey
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mongodbMod.MaxKey]]
  
  @js.native
  object MinKey
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mongodbMod.MinKey]]
  
  @js.native
  object MongoNetworkError
    extends TopLevel[
          Instantiable1[/* message */ String, typingsSlinky.mongodb.mongodbMod.MongoNetworkError]
        ]
  
  @js.native
  object MongoParseError
    extends TopLevel[
          Instantiable1[/* message */ String, typingsSlinky.mongodb.mongodbMod.MongoParseError]
        ]
  
  @js.native
  object Mongos
    extends TopLevel[
          Instantiable1[
            /* servers */ js.Array[typingsSlinky.mongodb.mongodbMod.Server], 
            typingsSlinky.mongodb.mongodbMod.Mongos
          ]
        ]
  
  @js.native
  object ReplSet
    extends TopLevel[
          Instantiable1[
            /* servers */ js.Array[typingsSlinky.mongodb.mongodbMod.Server], 
            typingsSlinky.mongodb.mongodbMod.ReplSet
          ]
        ]
  
  @js.native
  object ResumeToken
    extends TopLevel[Instantiable0[typingsSlinky.mongodb.mongodbMod.ResumeToken]]
  
  @js.native
  object Server
    extends TopLevel[
          Instantiable2[/* host */ String, /* port */ scala.Double, typingsSlinky.mongodb.mongodbMod.Server]
        ]
  
}

