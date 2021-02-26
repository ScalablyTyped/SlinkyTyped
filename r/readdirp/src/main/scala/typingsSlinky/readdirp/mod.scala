package typingsSlinky.readdirp

import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.readdirp.readdirpStrings.all
import typingsSlinky.readdirp.readdirpStrings.directories
import typingsSlinky.readdirp.readdirpStrings.files
import typingsSlinky.readdirp.readdirpStrings.files_directories
import typingsSlinky.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("readdirp", JSImport.Namespace)
  @js.native
  def apply(root: String): ReaddirpStream = js.native
  @JSImport("readdirp", JSImport.Namespace)
  @js.native
  def apply(root: String, options: ReaddirpOptions): ReaddirpStream = js.native
  
  @JSImport("readdirp", "promise")
  @js.native
  def promise(root: String): js.Promise[js.Array[EntryInfo]] = js.native
  @JSImport("readdirp", "promise")
  @js.native
  def promise(root: String, options: ReaddirpOptions): js.Promise[js.Array[EntryInfo]] = js.native
  
  @js.native
  trait EntryInfo extends StObject {
    
    var basename: String = js.native
    
    var dirent: js.UndefOr[Dirent] = js.native
    
    var fullPath: String = js.native
    
    var path: String = js.native
    
    var stats: js.UndefOr[Stats] = js.native
  }
  object EntryInfo {
    
    @scala.inline
    def apply(basename: String, fullPath: String, path: String): EntryInfo = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryInfo]
    }
    
    @scala.inline
    implicit class EntryInfoMutableBuilder[Self <: EntryInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirent(value: Dirent): Self = StObject.set(x, "dirent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirentUndefined: Self = StObject.set(x, "dirent", js.undefined)
      
      @scala.inline
      def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  @js.native
  trait ReaddirpOptions extends StObject {
    
    var alwaysStat: js.UndefOr[Boolean] = js.native
    
    var depth: js.UndefOr[Double] = js.native
    
    var directoryFilter: js.UndefOr[String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])] = js.native
    
    var fileFilter: js.UndefOr[String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])] = js.native
    
    var lstat: js.UndefOr[Boolean] = js.native
    
    var root: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[files | directories | files_directories | all] = js.native
  }
  object ReaddirpOptions {
    
    @scala.inline
    def apply(): ReaddirpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReaddirpOptions]
    }
    
    @scala.inline
    implicit class ReaddirpOptionsMutableBuilder[Self <: ReaddirpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysStat(value: Boolean): Self = StObject.set(x, "alwaysStat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysStatUndefined: Self = StObject.set(x, "alwaysStat", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setDirectoryFilter(value: String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])): Self = StObject.set(x, "directoryFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryFilterFunction1(value: /* entry */ EntryInfo => Boolean): Self = StObject.set(x, "directoryFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDirectoryFilterUndefined: Self = StObject.set(x, "directoryFilter", js.undefined)
      
      @scala.inline
      def setDirectoryFilterVarargs(value: String*): Self = StObject.set(x, "directoryFilter", js.Array(value :_*))
      
      @scala.inline
      def setFileFilter(value: String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])): Self = StObject.set(x, "fileFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileFilterFunction1(value: /* entry */ EntryInfo => Boolean): Self = StObject.set(x, "fileFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFileFilterUndefined: Self = StObject.set(x, "fileFilter", js.undefined)
      
      @scala.inline
      def setFileFilterVarargs(value: String*): Self = StObject.set(x, "fileFilter", js.Array(value :_*))
      
      @scala.inline
      def setLstat(value: Boolean): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setType(value: files | directories | files_directories | all): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ReaddirpStream
    extends Readable
       with AsyncIterable[EntryInfo] {
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
}
