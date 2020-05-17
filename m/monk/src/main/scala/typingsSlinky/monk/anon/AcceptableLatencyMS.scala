package typingsSlinky.monk.anon

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptableLatencyMS extends js.Object {
  var acceptableLatencyMS: js.UndefOr[Double] = js.native
  var authSource: js.UndefOr[String] = js.native
  var autoReconnect: js.UndefOr[Boolean] = js.native
  var bufferMaxEntries: js.UndefOr[Double] = js.native
  var collectionOptions: js.UndefOr[js.Object] = js.native
  var connectTimeoutMS: js.UndefOr[Double] = js.native
  var connectWithNoPrimary: js.UndefOr[Boolean] = js.native
  var forceServerObjectId: js.UndefOr[Boolean] = js.native
  var ha: js.UndefOr[Boolean] = js.native
  var haInterval: js.UndefOr[Double] = js.native
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
  var j: js.UndefOr[Boolean] = js.native
  var keepAlive: js.UndefOr[Double] = js.native
  var noDelay: js.UndefOr[Boolean] = js.native
  var pkFactory: js.UndefOr[js.Object | Null] = js.native
  var poolSize: js.UndefOr[Double] = js.native
  var promiseLibrary: js.UndefOr[js.Object | Null] = js.native
  var promoteLongs: js.UndefOr[Boolean] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var readConcern: js.UndefOr[js.Object | Null] = js.native
  var readPreference: js.UndefOr[js.Object | Null] = js.native
  var reconnectInterval: js.UndefOr[Double] = js.native
  var reconnectTries: js.UndefOr[Double] = js.native
  var replicaSet: js.UndefOr[String] = js.native
  var secondaryAcceptableLatencyMS: js.UndefOr[Double] = js.native
  var serializeFunctions: js.UndefOr[Boolean] = js.native
  var socketTimeoutMS: js.UndefOr[Double] = js.native
  var ssl: js.UndefOr[Boolean] = js.native
  var sslCA: js.UndefOr[js.Array[String | Buffer]] = js.native
  var sslCert: js.UndefOr[String | Buffer] = js.native
  var sslKey: js.UndefOr[String | Buffer] = js.native
  var sslPass: js.UndefOr[String | Buffer] = js.native
  var sslValidate: js.UndefOr[Boolean] = js.native
  var w: js.UndefOr[String | Double] = js.native
  var wtimeout: js.UndefOr[Double] = js.native
}

object AcceptableLatencyMS {
  @scala.inline
  def apply(): AcceptableLatencyMS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptableLatencyMS]
  }
  @scala.inline
  implicit class AcceptableLatencyMSOps[Self <: AcceptableLatencyMS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptableLatencyMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptableLatencyMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptableLatencyMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptableLatencyMS")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSource")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferMaxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferMaxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeoutMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeoutMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeoutMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeoutMS")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectWithNoPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectWithNoPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectWithNoPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectWithNoPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withForceServerObjectId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceServerObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceServerObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceServerObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withHa(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ha")(js.undefined)
        ret
    }
    @scala.inline
    def withHaInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHaInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUndefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefined")(js.undefined)
        ret
    }
    @scala.inline
    def withJ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("j")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("j")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAlive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDelay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withPkFactory(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPkFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withPkFactoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkFactory")(null)
        ret
    }
    @scala.inline
    def withPoolSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseLibrary(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromiseLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseLibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseLibraryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseLibrary")(null)
        ret
    }
    @scala.inline
    def withPromoteLongs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteLongs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromoteLongs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteLongs")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withReadConcern(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readConcern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadConcern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readConcern")(js.undefined)
        ret
    }
    @scala.inline
    def withReadConcernNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readConcern")(null)
        ret
    }
    @scala.inline
    def withReadPreference(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withReadPreferenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(null)
        ret
    }
    @scala.inline
    def withReconnectInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectTries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectTries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTries")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaSet")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryAcceptableLatencyMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryAcceptableLatencyMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryAcceptableLatencyMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryAcceptableLatencyMS")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializeFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketTimeoutMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketTimeoutMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketTimeoutMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketTimeoutMS")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withSslCA(value: js.Array[String | Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCA")(js.undefined)
        ret
    }
    @scala.inline
    def withSslCert(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCert")(js.undefined)
        ret
    }
    @scala.inline
    def withSslKey(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSslPass(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslPass")(js.undefined)
        ret
    }
    @scala.inline
    def withSslValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withW(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(js.undefined)
        ret
    }
    @scala.inline
    def withWtimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wtimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWtimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wtimeout")(js.undefined)
        ret
    }
  }
  
}

