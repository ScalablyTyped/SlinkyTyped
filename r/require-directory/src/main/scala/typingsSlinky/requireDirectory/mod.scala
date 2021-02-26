package typingsSlinky.requireDirectory

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @description function for requiring directory content as hash of modules
    * @param m module for which has will be created
    * @param path path to directory, if you want to build hash for another one (default to __dirname)
    * @param options object with options for require-directory call
    * @returns hash of modules in specified directory
    */
  @JSImport("require-directory", JSImport.Namespace)
  @js.native
  def apply[T, U](m: NodeModule): RequireDirectoryResult[U] = js.native
  @JSImport("require-directory", JSImport.Namespace)
  @js.native
  def apply[T, U](m: NodeModule, path: js.UndefOr[scala.Nothing], options: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = js.native
  @JSImport("require-directory", JSImport.Namespace)
  @js.native
  def apply[T, U](m: NodeModule, path: String): RequireDirectoryResult[U] = js.native
  @JSImport("require-directory", JSImport.Namespace)
  @js.native
  def apply[T, U](m: NodeModule, path: String, options: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = js.native
  @JSImport("require-directory", JSImport.Namespace)
  @js.native
  def apply[T, U](m: NodeModule, path: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = js.native
  @JSImport("require-directory", JSImport.Namespace)
  @js.native
  def apply[T, U](m: NodeModule, path: RequireDirectoryOptions[T, U], options: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = js.native
  
  /**
    * @description default options that is used for "require-directory" module
    */
  @JSImport("require-directory", "defaults")
  @js.native
  val defaults: RequireDirectoryOptions[js.Any, js.Any] = js.native
  
  /**
    * @description function that checks path for whitelisting/blacklisting
    * @param path path of required module
    * @returns true if path have to be whitelisted/blacklisted, false otherwise
    */
  type CheckPathFn = js.Function1[/* path */ String, Boolean]
  
  @js.native
  trait RequireDirectoryOptions[T, U] extends StObject {
    
    /**
      * @description RegExp or function for blacklisting modules
      * @default undefined
      */
    var exclude: js.UndefOr[js.RegExp | CheckPathFn] = js.native
    
    /**
      * @description array of file extensions that will be included in resulting hash as modules
      * @default "['js', 'json', 'coffee']"
      */
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * @description RegExp or function for whitelisting modules
      * @default undefined
      */
    var include: js.UndefOr[js.RegExp | CheckPathFn] = js.native
    
    /**
      * @description option to include subdirectories
      * @default true
      */
    var recurse: js.UndefOr[Boolean] = js.native
    
    /**
      * @description function for renaming modules in resulting hash
      * @param name name of required module
      * @returns transformed name of module
      * @default "change nothing"
      */
    var rename: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
    
    /**
      * @description function that will be called for each required module
      * @param obj required module
      * @returns transformed module OR nothing (in second case module itself will be added to hash)
      * @default "change nothing"
      */
    var visit: js.UndefOr[js.Function1[/* obj */ T, U | Unit]] = js.native
  }
  object RequireDirectoryOptions {
    
    @scala.inline
    def apply[T, U](): RequireDirectoryOptions[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequireDirectoryOptions[T, U]]
    }
    
    @scala.inline
    implicit class RequireDirectoryOptionsMutableBuilder[Self <: RequireDirectoryOptions[_, _], T, U] (val x: Self with (RequireDirectoryOptions[T, U])) extends AnyVal {
      
      @scala.inline
      def setExclude(value: js.RegExp | CheckPathFn): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeFunction1(value: /* path */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExcludeRegExp(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: js.RegExp | CheckPathFn): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeFunction1(value: /* path */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncludeRegExp(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
      
      @scala.inline
      def setRename(value: /* name */ String => String): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      @scala.inline
      def setVisit(value: /* obj */ T => U | Unit): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
    }
  }
  
  @js.native
  trait RequireDirectoryResult[T] extends /**
    * @description module itself or hash of modules in subdirectory with name of this directory
    */
  /* index */ StringDictionary[RequireDirectoryResult[T] | T]
  object RequireDirectoryResult {
    
    @scala.inline
    def apply[T](): RequireDirectoryResult[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequireDirectoryResult[T]]
    }
  }
}
