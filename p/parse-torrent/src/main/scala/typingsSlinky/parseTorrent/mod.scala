package typingsSlinky.parseTorrent

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import typingsSlinky.parseTorrentFile.mod.ParsedFile
import typingsSlinky.parseTorrentFile.mod.TorrentInfo
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("parse-torrent", JSImport.Namespace)
  @js.native
  val ^ : ParseTorrent = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.std.Object because Already inherited
  - typingsSlinky.parseTorrentFile.mod.Instance because var conflicts: announce, constructor, infoHash, infoHashBuffer, name, urlList. Inlined pieceLength, `private`, files, pieces, info, createdBy, lastPieceLength, created, length, infoBuffer */ @js.native
  trait Instance
    extends typingsSlinky.magnetUri.mod.Instance {
    
    var created: js.UndefOr[js.Date] = js.native
    
    var createdBy: js.UndefOr[String] = js.native
    
    var files: js.UndefOr[js.Array[ParsedFile]] = js.native
    
    var info: js.UndefOr[TorrentInfo] = js.native
    
    var infoBuffer: js.UndefOr[Buffer] = js.native
    
    var lastPieceLength: js.UndefOr[Double] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var pieceLength: js.UndefOr[Double] = js.native
    
    var pieces: js.UndefOr[js.Array[String]] = js.native
    
    var `private`: js.UndefOr[Boolean] = js.native
  }
  object Instance {
    
    @scala.inline
    def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean
    ): Instance = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[ParsedFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: ParsedFile*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setInfo(value: TorrentInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoBuffer(value: Buffer): Self = StObject.set(x, "infoBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoBufferUndefined: Self = StObject.set(x, "infoBuffer", js.undefined)
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setLastPieceLength(value: Double): Self = StObject.set(x, "lastPieceLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPieceLengthUndefined: Self = StObject.set(x, "lastPieceLength", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setPieceLength(value: Double): Self = StObject.set(x, "pieceLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPieceLengthUndefined: Self = StObject.set(x, "pieceLength", js.undefined)
      
      @scala.inline
      def setPieces(value: js.Array[String]): Self = StObject.set(x, "pieces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPiecesUndefined: Self = StObject.set(x, "pieces", js.undefined)
      
      @scala.inline
      def setPiecesVarargs(value: String*): Self = StObject.set(x, "pieces", js.Array(value :_*))
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    }
  }
  
  @js.native
  trait ParseTorrent extends StObject {
    
    def apply(torrent: String): typingsSlinky.magnetUri.mod.Instance = js.native
    def apply(torrent: typingsSlinky.magnetUri.mod.Instance): Instance = js.native
    def apply(torrent: Buffer): typingsSlinky.magnetUri.mod.Instance | typingsSlinky.parseTorrentFile.mod.Instance = js.native
    def apply(torrent: Instance): Instance = js.native
    def apply(torrent: typingsSlinky.parseTorrentFile.mod.Instance): Instance = js.native
    
    def remote(torrent: String): Unit = js.native
    def remote(torrent: String, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
    def remote(torrent: Blob): Unit = js.native
    def remote(torrent: Blob, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
    def remote(torrent: typingsSlinky.magnetUri.mod.Instance): Unit = js.native
    def remote(
      torrent: typingsSlinky.magnetUri.mod.Instance,
      cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]
    ): Unit = js.native
    def remote(torrent: Buffer): Unit = js.native
    def remote(torrent: Buffer, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
    def remote(torrent: Instance): Unit = js.native
    def remote(torrent: Instance, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
    def remote(torrent: typingsSlinky.parseTorrentFile.mod.Instance): Unit = js.native
    def remote(
      torrent: typingsSlinky.parseTorrentFile.mod.Instance,
      cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]
    ): Unit = js.native
    
    def toMagnetURI(parsed: typingsSlinky.magnetUri.mod.Instance): String = js.native
    @JSName("toMagnetURI")
    var toMagnetURI_Original: js.Function1[/* parsed */ typingsSlinky.magnetUri.mod.Instance, String] = js.native
    
    def toTorrentFile(parsed: typingsSlinky.parseTorrentFile.mod.Instance): Buffer = js.native
    @JSName("toTorrentFile")
    var toTorrentFile_Original: js.Function1[/* parsed */ typingsSlinky.parseTorrentFile.mod.Instance, Buffer] = js.native
  }
  
  type _To = ParseTorrent
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ParseTorrent = ^
}
