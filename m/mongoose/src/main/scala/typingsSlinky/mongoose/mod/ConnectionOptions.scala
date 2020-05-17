package typingsSlinky.mongoose.mod

import typingsSlinky.mongodb.mod.MongoClientOptions
import typingsSlinky.mongoose.anon.AutoIndex
import typingsSlinky.mongoose.anon.ExtraOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Connection optional settings.
  *
  * see
  *   https://mongoosejs.com/docs/api.html#mongoose_Mongoose-connect
  * and
  *   http://mongodb.github.io/node-mongodb-native/3.0/api/MongoClient.html
  * for all available options.
  *
  */
@js.native
trait ConnectionOptions extends MongoClientOptions {
  /** Before Mongoose builds indexes, it calls Model.createCollection()
    * to create the underlying collection in MongoDB if autoCreate
    * is set to true.(default: false) */
  var autoCreate: js.UndefOr[Boolean] = js.native
  /** Configure csfle as especified in MongoDB official guide */
  var autoEncryption: js.UndefOr[ExtraOptions] = js.native
  var autoIndex: js.UndefOr[Boolean] = js.native
  /** mongoose-specific options */
  /** See https://mongoosejs.com/docs/guide.html#bufferCommands */
  var bufferCommands: js.UndefOr[Boolean] = js.native
  var config: js.UndefOr[AutoIndex] = js.native
  /** passed to the connection db instance */
  var db: js.UndefOr[js.Any] = js.native
  /** database Name for Mongodb Atlas Connection */
  var dbName: js.UndefOr[String] = js.native
  /** Specify a journal write concern (default: false). */
  var journal: js.UndefOr[Boolean] = js.native
  // Legacy properties - passed to the connection server instance(s)
  var mongos: js.UndefOr[js.Any] = js.native
  /** The current value of the parameter native_parser */
  var nativeParser: js.UndefOr[Boolean] = js.native
  /** password for authentication */
  var pass: js.UndefOr[String] = js.native
  var replset: js.UndefOr[js.Any] = js.native
  var safe: js.UndefOr[js.Any] = js.native
  var server: js.UndefOr[js.Any] = js.native
  var slaveOk: js.UndefOr[Boolean] = js.native
  /** If true, this connection will use createIndex() instead of ensureIndex() for automatic index builds via Model.init(). */
  var useCreateIndex: js.UndefOr[Boolean] = js.native
  /** Set to false to make findOneAndUpdate() and findOneAndRemove() use native findOneAndUpdate() rather than findAndModify(). */
  var useFindAndModify: js.UndefOr[Boolean] = js.native
  /** See https://mongoosejs.com/docs/connections.html#use-mongo-client **/
  var useMongoClient: js.UndefOr[Boolean] = js.native
  /** username for authentication */
  var user: js.UndefOr[String] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoEncryption(value: ExtraOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferCommands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: AutoIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withDb(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(js.undefined)
        ret
    }
    @scala.inline
    def withDbName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbName")(js.undefined)
        ret
    }
    @scala.inline
    def withJournal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("journal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJournal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("journal")(js.undefined)
        ret
    }
    @scala.inline
    def withMongos(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mongos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMongos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mongos")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeParser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeParser")(js.undefined)
        ret
    }
    @scala.inline
    def withPass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(js.undefined)
        ret
    }
    @scala.inline
    def withReplset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replset")(js.undefined)
        ret
    }
    @scala.inline
    def withSafe(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
    @scala.inline
    def withSlaveOk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slaveOk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlaveOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slaveOk")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCreateIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCreateIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCreateIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCreateIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFindAndModify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFindAndModify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFindAndModify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFindAndModify")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMongoClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMongoClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMongoClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMongoClient")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

