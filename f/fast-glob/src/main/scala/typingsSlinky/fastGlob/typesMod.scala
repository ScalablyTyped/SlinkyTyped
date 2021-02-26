package typingsSlinky.fastGlob

import typingsSlinky.nodelibFsWalk.anon.PartialFileSystemAdapter
import typingsSlinky.nodelibFsWalk.typesMod.Errno
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type DeepFilterFunction = typingsSlinky.nodelibFsWalk.settingsMod.DeepFilterFunction
  
  type Entry = typingsSlinky.nodelibFsWalk.typesMod.Entry
  
  type EntryFilterFunction = typingsSlinky.nodelibFsWalk.settingsMod.EntryFilterFunction
  
  type EntryItem = String | Entry
  
  type EntryTransformerFunction = js.Function1[/* entry */ Entry, EntryItem]
  
  type ErrnoException = typingsSlinky.node.NodeJS.ErrnoException
  
  type ErrorFilterFunction = typingsSlinky.nodelibFsWalk.settingsMod.ErrorFilterFunction
  
  type FileSystemAdapter = typingsSlinky.nodelibFsScandir.fsMod.FileSystemAdapter
  
  @js.native
  trait MicromatchOptions extends StObject {
    
    var dot: js.UndefOr[Boolean] = js.native
    
    var matchBase: js.UndefOr[Boolean] = js.native
    
    var nobrace: js.UndefOr[Boolean] = js.native
    
    var nocase: js.UndefOr[Boolean] = js.native
    
    var noext: js.UndefOr[Boolean] = js.native
    
    var noglobstar: js.UndefOr[Boolean] = js.native
    
    var posix: js.UndefOr[Boolean] = js.native
    
    var strictSlashes: js.UndefOr[Boolean] = js.native
  }
  object MicromatchOptions {
    
    @scala.inline
    def apply(): MicromatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicromatchOptions]
    }
    
    @scala.inline
    implicit class MicromatchOptionsMutableBuilder[Self <: MicromatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      @scala.inline
      def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      @scala.inline
      def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      @scala.inline
      def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      @scala.inline
      def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      @scala.inline
      def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      @scala.inline
      def setStrictSlashes(value: Boolean): Self = StObject.set(x, "strictSlashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictSlashesUndefined: Self = StObject.set(x, "strictSlashes", js.undefined)
    }
  }
  
  type Pattern = String
  
  type PatternRe = js.RegExp
  
  type PatternsGroup = Record[String, js.Array[Pattern]]
  
  /* Inlined @nodelib/fs.walk.@nodelib/fs.walk.Options & {transform (entry : fast-glob.fast-glob/out/types.Entry): fast-glob.fast-glob/out/types.EntryItem,   deepFilter :fast-glob.fast-glob/out/types.DeepFilterFunction,   entryFilter :fast-glob.fast-glob/out/types.EntryFilterFunction,   errorFilter :fast-glob.fast-glob/out/types.ErrorFilterFunction,   fs :fast-glob.fast-glob/out/types.FileSystemAdapter,   stats :boolean} */
  @js.native
  trait ReaderOptions extends StObject {
    
    var basePath: js.UndefOr[String] = js.native
    
    var concurrency: js.UndefOr[Double] = js.native
    
    def deepFilter(value: typingsSlinky.nodelibFsWalk.typesMod.Entry): Boolean = js.native
    @JSName("deepFilter")
    var deepFilter_Original: js.UndefOr[typingsSlinky.nodelibFsWalk.settingsMod.DeepFilterFunction] with DeepFilterFunction = js.native
    
    def entryFilter(value: typingsSlinky.nodelibFsWalk.typesMod.Entry): Boolean = js.native
    @JSName("entryFilter")
    var entryFilter_Original: js.UndefOr[typingsSlinky.nodelibFsWalk.settingsMod.EntryFilterFunction] with EntryFilterFunction = js.native
    
    def errorFilter(value: Errno): Boolean = js.native
    @JSName("errorFilter")
    var errorFilter_Original: js.UndefOr[typingsSlinky.nodelibFsWalk.settingsMod.ErrorFilterFunction] with ErrorFilterFunction = js.native
    
    var followSymbolicLinks: js.UndefOr[Boolean] = js.native
    
    var fs: js.UndefOr[PartialFileSystemAdapter] with FileSystemAdapter = js.native
    
    var pathSegmentSeparator: js.UndefOr[String] = js.native
    
    var stats: js.UndefOr[Boolean] with Boolean = js.native
    
    var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.native
    
    def transform(entry: Entry): EntryItem = js.native
  }
}
