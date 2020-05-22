package typingsSlinky.firebaseFirestore

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Window
import typingsSlinky.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typingsSlinky.firebaseFirestore.coreDatabaseInfoMod.DatabaseInfo
import typingsSlinky.firebaseFirestore.platformPlatformMod.Platform
import typingsSlinky.firebaseFirestore.remoteConnectionMod.Connection
import typingsSlinky.firebaseFirestore.remoteConnectivityMonitorMod.ConnectivityMonitor
import typingsSlinky.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform_node/node_platform", JSImport.Namespace)
@js.native
object platformNodeNodePlatformMod extends js.Object {
  @js.native
  class NodePlatform () extends Platform {
    /** True if and only if the Base64 conversion functions are available. */
    /* CompleteClass */
    override val base64Available: Boolean = js.native
    /** The Platform's 'document' implementation or null if not available. */
    /* CompleteClass */
    override val document: Document | Null = js.native
    @JSName("document")
    val document_NodePlatform: Null = js.native
    /** The Platform's 'window' implementation or null if not available. */
    /* CompleteClass */
    override val window: Window | Null = js.native
    /** Converts a Base64 encoded string to a binary string. */
    /* CompleteClass */
    override def atob(encoded: String): String = js.native
    /** Converts a binary string to a Base64 encoded string. */
    /* CompleteClass */
    override def btoa(raw: String): String = js.native
    /** Formats an object as a JSON string, suitable for logging. */
    /* CompleteClass */
    override def formatJSON(value: js.Any): String = js.native
    /* CompleteClass */
    override def loadConnection(databaseInfo: DatabaseInfo): js.Promise[Connection] = js.native
    /* CompleteClass */
    override def newConnectivityMonitor(): ConnectivityMonitor = js.native
    /* CompleteClass */
    override def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = js.native
    /**
      * Generates `nBytes` of random bytes.
      *
      * If `nBytes < 0` , an error will be thrown.
      */
    /* CompleteClass */
    override def randomBytes(nBytes: Double): js.typedarray.Uint8Array = js.native
    @JSName("window")
    def window_MNodePlatform: Window | Null = js.native
  }
  
}

