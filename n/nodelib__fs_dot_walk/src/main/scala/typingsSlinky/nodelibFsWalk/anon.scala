package typingsSlinky.nodelibFsWalk

import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.nodelibFsScandir.anon.Typeoflstat
import typingsSlinky.nodelibFsScandir.anon.Typeofreaddir
import typingsSlinky.nodelibFsScandir.anon.Typeofstat
import typingsSlinky.nodelibFsScandir.mod.AsyncCallback
import typingsSlinky.nodelibFsScandir.settingsMod.Options
import typingsSlinky.nodelibFsScandir.settingsMod.default
import typingsSlinky.nodelibFsScandir.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: String): js.Array[Entry] = js.native
    def apply(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
    def apply(path: String, optionsOrSettings: default): js.Array[Entry] = js.native
  }
  
  /* Inlined std.Partial<@nodelib/fs.scandir.@nodelib/fs.scandir.FileSystemAdapter> */
  @js.native
  trait PartialFileSystemAdapter extends StObject {
    
    var lstat: js.UndefOr[Typeoflstat] = js.native
    
    var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
    
    var readdir: js.UndefOr[Typeofreaddir] = js.native
    
    var readdirSync: js.UndefOr[
        js.Function2[
          /* path */ PathLike, 
          /* options */ BaseEncodingOptionswithFiEncoding, 
          js.Array[Dirent]
        ]
      ] = js.native
    
    var stat: js.UndefOr[Typeofstat] = js.native
    
    var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
  }
  object PartialFileSystemAdapter {
    
    @scala.inline
    def apply(): PartialFileSystemAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileSystemAdapter]
    }
    
    @scala.inline
    implicit class PartialFileSystemAdapterMutableBuilder[Self <: PartialFileSystemAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLstat(value: Typeoflstat): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLstatSync(value: /* path */ PathLike => Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLstatSyncUndefined: Self = StObject.set(x, "lstatSync", js.undefined)
      
      @scala.inline
      def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      @scala.inline
      def setReaddir(value: Typeofreaddir): Self = StObject.set(x, "readdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReaddirSync(value: (/* path */ PathLike, /* options */ BaseEncodingOptionswithFiEncoding) => js.Array[Dirent]): Self = StObject.set(x, "readdirSync", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReaddirSyncUndefined: Self = StObject.set(x, "readdirSync", js.undefined)
      
      @scala.inline
      def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      @scala.inline
      def setStat(value: Typeofstat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatSync(value: /* path */ PathLike => Stats): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  @js.native
  trait Typeofscandir extends StObject {
    
    def apply(path: String, callback: AsyncCallback): Unit = js.native
    def apply(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
    def apply(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
  }
}
