package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionProvider extends DataProvider {
  var buildConnectionInfo: js.UndefOr[js.Function1[/* connectionString */ String, Thenable[ConnectionInfo]]] = js.native
  def cancelConnect(connectionUri: String): Thenable[Boolean] = js.native
  def changeDatabase(connectionUri: String, newDatabase: String): Thenable[Boolean] = js.native
  def connect(connectionUri: String, connectionInfo: ConnectionInfo): Thenable[Boolean] = js.native
  def disconnect(connectionUri: String): Thenable[Boolean] = js.native
  def getConnectionString(connectionUri: String, includePassword: Boolean): Thenable[String] = js.native
  def listDatabases(connectionUri: String): Thenable[ListDatabasesResult] = js.native
  def rebuildIntelliSenseCache(connectionUri: String): Thenable[Unit] = js.native
  def registerOnConnectionChanged(handler: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, _]): Unit = js.native
  def registerOnConnectionComplete(handler: js.Function1[/* connSummary */ ConnectionInfoSummary, _]): Unit = js.native
  def registerOnIntelliSenseCacheComplete(handler: js.Function1[/* connectionUri */ String, _]): Unit = js.native
}

object ConnectionProvider {
  @scala.inline
  def apply(
    cancelConnect: String => Thenable[Boolean],
    changeDatabase: (String, String) => Thenable[Boolean],
    connect: (String, ConnectionInfo) => Thenable[Boolean],
    disconnect: String => Thenable[Boolean],
    getConnectionString: (String, Boolean) => Thenable[String],
    listDatabases: String => Thenable[ListDatabasesResult],
    providerId: String,
    rebuildIntelliSenseCache: String => Thenable[Unit],
    registerOnConnectionChanged: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, _] => Unit,
    registerOnConnectionComplete: js.Function1[/* connSummary */ ConnectionInfoSummary, _] => Unit,
    registerOnIntelliSenseCacheComplete: js.Function1[/* connectionUri */ String, _] => Unit
  ): ConnectionProvider = {
    val __obj = js.Dynamic.literal(cancelConnect = js.Any.fromFunction1(cancelConnect), changeDatabase = js.Any.fromFunction2(changeDatabase), connect = js.Any.fromFunction2(connect), disconnect = js.Any.fromFunction1(disconnect), getConnectionString = js.Any.fromFunction2(getConnectionString), listDatabases = js.Any.fromFunction1(listDatabases), providerId = providerId.asInstanceOf[js.Any], rebuildIntelliSenseCache = js.Any.fromFunction1(rebuildIntelliSenseCache), registerOnConnectionChanged = js.Any.fromFunction1(registerOnConnectionChanged), registerOnConnectionComplete = js.Any.fromFunction1(registerOnConnectionComplete), registerOnIntelliSenseCacheComplete = js.Any.fromFunction1(registerOnIntelliSenseCacheComplete))
    __obj.asInstanceOf[ConnectionProvider]
  }
  @scala.inline
  implicit class ConnectionProviderOps[Self <: ConnectionProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelConnect(value: String => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelConnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChangeDatabase(value: (String, String) => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeDatabase")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConnect(value: (String, ConnectionInfo) => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDisconnect(value: String => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetConnectionString(value: (String, Boolean) => Thenable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectionString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListDatabases(value: String => Thenable[ListDatabasesResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDatabases")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRebuildIntelliSenseCache(value: String => Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuildIntelliSenseCache")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterOnConnectionChanged(value: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnConnectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterOnConnectionComplete(value: js.Function1[/* connSummary */ ConnectionInfoSummary, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnConnectionComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterOnIntelliSenseCacheComplete(value: js.Function1[/* connectionUri */ String, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnIntelliSenseCacheComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuildConnectionInfo(value: /* connectionString */ String => Thenable[ConnectionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildConnectionInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBuildConnectionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildConnectionInfo")(js.undefined)
        ret
    }
  }
  
}

