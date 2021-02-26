package typingsSlinky.relateurl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("relateurl", JSImport.Namespace)
  @js.native
  class ^ protected () extends RelateUrl {
    def this(from: String) = this()
    def this(from: String, options: Options) = this()
  }
  @JSImport("relateurl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("relateurl", "ABSOLUTE")
  @js.native
  def ABSOLUTE: String = js.native
  @scala.inline
  def ABSOLUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABSOLUTE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("relateurl", "PATH_RELATIVE")
  @js.native
  def PATH_RELATIVE: String = js.native
  @scala.inline
  def PATH_RELATIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_RELATIVE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("relateurl", "ROOT_RELATIVE")
  @js.native
  def ROOT_RELATIVE: String = js.native
  @scala.inline
  def ROOT_RELATIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_RELATIVE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("relateurl", "SHORTEST")
  @js.native
  def SHORTEST: String = js.native
  @scala.inline
  def SHORTEST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORTEST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("relateurl", "relate")
  @js.native
  def relate(from: String, to: String): String = js.native
  @JSImport("relateurl", "relate")
  @js.native
  def relate(from: String, to: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Type: Object
      * Default value: {ftp:21, http:80, https:443}
      *
      * Extend the list with any ports you need. Any URLs containing these default ports will have them removed. Example: http://example.com:80/ will become http://example.com/.
      */
    var defaultPorts: js.UndefOr[js.Object] = js.native
    
    /**
      * Type: Array
      * Default value: ["index.html"]
      *
      * Extend the list with any resources you need. Works with options.removeDirectoryIndexes.
      */
    var directoryIndexes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Type: Boolean
      * Default value: false
      *
      * This will, for example, consider any domains containing http://www.example.com/ to be related to any that contain http://example.com/.
      */
    var ignore_www: js.UndefOr[Boolean] = js.native
    
    /**
      * Type: constant or String
      * Choices: RelateUrl.ABSOLUTE,RelateUrl.PATH_RELATIVE,RelateUrl.ROOT_RELATIVE,RelateUrl.SHORTEST
      * Choices: "absolute","pathRelative","rootRelative","shortest"
      * Default value: RelateUrl.SHORTEST
      *
      * RelateUrl.ABSOLUTE will produce an absolute URL. Overrides options.schemeRelative with a value of false.
      * RelateUrl.PATH_RELATIVE will produce something like ../child-of-parent/etc/.
      * RelateUrl.ROOT_RELATIVE will produce something like /child-of-root/etc/.
      * RelateUrl.SHORTEST will choose whichever is shortest between root- and path-relative.
      */
    var output: js.UndefOr[String] = js.native
    
    /**
      * Type: Array
      * Default value: ["data","javascript","mailto"]
      *
      * Extend the list with any additional schemes. Example: javascript:something will not be modified.
      */
    var rejectedSchemes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Type: Boolean
      * Default value: false
      *
      * Remove user authentication information from the output URL.
      */
    var removeAuth: js.UndefOr[Boolean] = js.native
    
    /**
      * Type: Boolean
      * Default value: true
      *
      * Remove any resources that match any found in options.directoryIndexes.
      */
    var removeDirectoryIndexes: js.UndefOr[Boolean] = js.native
    
    /**
      * Type: Boolean
      * Default value: false
      *
      * Remove empty query variables. Example: http://domain.com/?var1&var2=&var3=asdf will become http://domain.com/?var3=adsf. This does not apply to unrelated URLs (with other protocols, auths, hosts and/or ports).
      */
    var removeEmptyQueries: js.UndefOr[Boolean] = js.native
    
    /**
      * Type: Boolean
      * Default value: true
      *
      * Remove trailing slashes from root paths. Example: http://domain.com/?var will become http://domain.com?var while http://domain.com/dir/?var will not be modified.
      */
    var removeRootTrailingSlash: js.UndefOr[Boolean] = js.native
    
    /**
      * Type: Boolean
      * Default value: true
      *
      * Output URLs relative to the scheme. Example: http://example.com/ will become //example.com/.
      */
    var schemeRelative: js.UndefOr[Boolean] = js.native
    
    /**
      * Type: String
      * Default value: undefined
      *
      * An options-based version of the from argument. If both are specified, from takes priority.
      */
    var site: js.UndefOr[String] = js.native
    
    /**
      * Type: Boolean
      * Default value: true
      *
      * Passed to Node's url.parse.
      */
    var slashesDenoteHost: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultPorts(value: js.Object): Self = StObject.set(x, "defaultPorts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPortsUndefined: Self = StObject.set(x, "defaultPorts", js.undefined)
      
      @scala.inline
      def setDirectoryIndexes(value: js.Array[String]): Self = StObject.set(x, "directoryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryIndexesUndefined: Self = StObject.set(x, "directoryIndexes", js.undefined)
      
      @scala.inline
      def setDirectoryIndexesVarargs(value: String*): Self = StObject.set(x, "directoryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setIgnore_www(value: Boolean): Self = StObject.set(x, "ignore_www", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnore_wwwUndefined: Self = StObject.set(x, "ignore_www", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setRejectedSchemes(value: js.Array[String]): Self = StObject.set(x, "rejectedSchemes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectedSchemesUndefined: Self = StObject.set(x, "rejectedSchemes", js.undefined)
      
      @scala.inline
      def setRejectedSchemesVarargs(value: String*): Self = StObject.set(x, "rejectedSchemes", js.Array(value :_*))
      
      @scala.inline
      def setRemoveAuth(value: Boolean): Self = StObject.set(x, "removeAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAuthUndefined: Self = StObject.set(x, "removeAuth", js.undefined)
      
      @scala.inline
      def setRemoveDirectoryIndexes(value: Boolean): Self = StObject.set(x, "removeDirectoryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveDirectoryIndexesUndefined: Self = StObject.set(x, "removeDirectoryIndexes", js.undefined)
      
      @scala.inline
      def setRemoveEmptyQueries(value: Boolean): Self = StObject.set(x, "removeEmptyQueries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveEmptyQueriesUndefined: Self = StObject.set(x, "removeEmptyQueries", js.undefined)
      
      @scala.inline
      def setRemoveRootTrailingSlash(value: Boolean): Self = StObject.set(x, "removeRootTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveRootTrailingSlashUndefined: Self = StObject.set(x, "removeRootTrailingSlash", js.undefined)
      
      @scala.inline
      def setSchemeRelative(value: Boolean): Self = StObject.set(x, "schemeRelative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeRelativeUndefined: Self = StObject.set(x, "schemeRelative", js.undefined)
      
      @scala.inline
      def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
      
      @scala.inline
      def setSlashesDenoteHost(value: Boolean): Self = StObject.set(x, "slashesDenoteHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashesDenoteHostUndefined: Self = StObject.set(x, "slashesDenoteHost", js.undefined)
    }
  }
  
  @js.native
  trait RelateUrl extends StObject {
    
    def relate(to: String): String = js.native
    def relate(to: String, options: Options): String = js.native
  }
}
