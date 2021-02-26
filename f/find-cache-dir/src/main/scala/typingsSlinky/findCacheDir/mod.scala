package typingsSlinky.findCacheDir

import typingsSlinky.findCacheDir.findCacheDirBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-cache-dir", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.UndefOr[String] = js.native
  /**
    * Finds the cache directory using the supplied options.
    * The algorithm tries to find a `package.json` file, searching every parent directory of the `cwd` specified
    * (or implied from other options). It returns a `string` containing the absolute path to the cache directory,
    * or `undefined` if `package.json` was never found or if the `node_modules` directory is unwritable.
    */
  @JSImport("find-cache-dir", JSImport.Namespace)
  @js.native
  def apply(options: OptionsWithThunk): js.UndefOr[js.Function1[/* repeated */ String, String]] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * If `true`, the directory will be created synchronously before returning.
      * @default false
      */
    var create: js.UndefOr[Boolean] = js.native
    
    /**
      * Directory to start searching for a `package.json` from.
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * An array of files that will be searched for a common parent directory.
      * This common parent directory will be used in lieu of the `cwd` option below.
      */
    var files: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Should be the same as your project name in `package.json`.
      */
    var name: String = js.native
    
    /**
      * If `true`, this modifies the return type to be a function that is a thunk for `path.join(theFoundCacheDirectory)`.
      * @default false
      */
    var thunk: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(name: String): Options = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThunk(value: Boolean): Self = StObject.set(x, "thunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThunkUndefined: Self = StObject.set(x, "thunk", js.undefined)
    }
  }
  
  @js.native
  trait OptionsWithThunk extends Options {
    
    /**
      * If `true`, this modifies the return type to be a function that is a thunk for `path.join(theFoundCacheDirectory)`.
      * @default false
      */
    @JSName("thunk")
    var thunk_OptionsWithThunk: `true` = js.native
  }
  object OptionsWithThunk {
    
    @scala.inline
    def apply(name: String, thunk: `true`): OptionsWithThunk = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], thunk = thunk.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithThunk]
    }
    
    @scala.inline
    implicit class OptionsWithThunkMutableBuilder[Self <: OptionsWithThunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThunk(value: `true`): Self = StObject.set(x, "thunk", value.asInstanceOf[js.Any])
    }
  }
}
