package typingsSlinky.firebaseFirestore.platformMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Window
import typingsSlinky.firebaseFirestore.connectionMod.Connection
import typingsSlinky.firebaseFirestore.connectivityMonitorMod.ConnectivityMonitor
import typingsSlinky.firebaseFirestore.databaseInfoMod.DatabaseId
import typingsSlinky.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typingsSlinky.firebaseFirestore.serializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platform extends js.Object {
  /** True if and only if the Base64 conversion functions are available. */
  val base64Available: Boolean = js.native
  /** The Platform's 'document' implementation or null if not available. */
  val document: Document | Null = js.native
  /** The Platform's 'window' implementation or null if not available. */
  val window: Window | Null = js.native
  /** Converts a Base64 encoded string to a binary string. */
  def atob(encoded: String): String = js.native
  /** Converts a binary string to a Base64 encoded string. */
  def btoa(raw: String): String = js.native
  /** Formats an object as a JSON string, suitable for logging. */
  def formatJSON(value: js.Any): String = js.native
  def loadConnection(databaseInfo: DatabaseInfo): js.Promise[Connection] = js.native
  def newConnectivityMonitor(): ConnectivityMonitor = js.native
  def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = js.native
}

object Platform {
  @scala.inline
  def apply(
    atob: String => String,
    base64Available: Boolean,
    btoa: String => String,
    formatJSON: js.Any => String,
    loadConnection: DatabaseInfo => js.Promise[Connection],
    newConnectivityMonitor: () => ConnectivityMonitor,
    newSerializer: DatabaseId => JsonProtoSerializer
  ): Platform = {
    val __obj = js.Dynamic.literal(atob = js.Any.fromFunction1(atob), base64Available = base64Available.asInstanceOf[js.Any], btoa = js.Any.fromFunction1(btoa), formatJSON = js.Any.fromFunction1(formatJSON), loadConnection = js.Any.fromFunction1(loadConnection), newConnectivityMonitor = js.Any.fromFunction0(newConnectivityMonitor), newSerializer = js.Any.fromFunction1(newSerializer))
    __obj.asInstanceOf[Platform]
  }
  @scala.inline
  implicit class PlatformOps[Self <: Platform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtob(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBase64Available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64Available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBtoa(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btoa")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatJSON(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadConnection(value: DatabaseInfo => js.Promise[Connection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadConnection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewConnectivityMonitor(value: () => ConnectivityMonitor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConnectivityMonitor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSerializer(value: DatabaseId => JsonProtoSerializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSerializer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDocument(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(null)
        ret
    }
    @scala.inline
    def withWindow(value: Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(null)
        ret
    }
  }
  
}

