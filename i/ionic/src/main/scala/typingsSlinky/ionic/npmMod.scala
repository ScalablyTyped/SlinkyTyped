package typingsSlinky.ionic

import typingsSlinky.ionic.anon.PartialPkgManagerOptions
import typingsSlinky.ionic.definitionsMod.NpmClient
import typingsSlinky.ionicCliFramework.definitionsMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmMod {
  
  @JSImport("ionic/lib/utils/npm", "pkgFromRegistry")
  @js.native
  def pkgFromRegistry(npmClient: NpmClient, options: PartialPkgManagerOptions): js.Promise[js.UndefOr[PackageJson]] = js.native
  
  @JSImport("ionic/lib/utils/npm", "pkgManagerArgs")
  @js.native
  def pkgManagerArgs(npmClient: NpmClient, options: PkgManagerOptions): js.Promise[js.Array[String]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ionic.ionicStrings.dedupe
    - typingsSlinky.ionic.ionicStrings.rebuild
    - typingsSlinky.ionic.ionicStrings.install
    - typingsSlinky.ionic.ionicStrings.uninstall
    - typingsSlinky.ionic.ionicStrings.run
    - typingsSlinky.ionic.ionicStrings.info
  */
  trait PkgManagerCommand extends StObject
  object PkgManagerCommand {
    
    @scala.inline
    def dedupe: typingsSlinky.ionic.ionicStrings.dedupe = "dedupe".asInstanceOf[typingsSlinky.ionic.ionicStrings.dedupe]
    
    @scala.inline
    def info: typingsSlinky.ionic.ionicStrings.info = "info".asInstanceOf[typingsSlinky.ionic.ionicStrings.info]
    
    @scala.inline
    def install: typingsSlinky.ionic.ionicStrings.install = "install".asInstanceOf[typingsSlinky.ionic.ionicStrings.install]
    
    @scala.inline
    def rebuild: typingsSlinky.ionic.ionicStrings.rebuild = "rebuild".asInstanceOf[typingsSlinky.ionic.ionicStrings.rebuild]
    
    @scala.inline
    def run: typingsSlinky.ionic.ionicStrings.run = "run".asInstanceOf[typingsSlinky.ionic.ionicStrings.run]
    
    @scala.inline
    def uninstall: typingsSlinky.ionic.ionicStrings.uninstall = "uninstall".asInstanceOf[typingsSlinky.ionic.ionicStrings.uninstall]
  }
  
  @js.native
  trait PkgManagerOptions extends StObject {
    
    var command: PkgManagerCommand = js.native
    
    var global: js.UndefOr[Boolean] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    var pkg: js.UndefOr[String] = js.native
    
    var save: js.UndefOr[Boolean] = js.native
    
    var saveDev: js.UndefOr[Boolean] = js.native
    
    var saveExact: js.UndefOr[Boolean] = js.native
    
    var script: js.UndefOr[String] = js.native
    
    var scriptArgs: js.UndefOr[js.Array[String]] = js.native
  }
  object PkgManagerOptions {
    
    @scala.inline
    def apply(command: PkgManagerCommand): PkgManagerOptions = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[PkgManagerOptions]
    }
    
    @scala.inline
    implicit class PkgManagerOptionsMutableBuilder[Self <: PkgManagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: PkgManagerCommand): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      @scala.inline
      def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveDev(value: Boolean): Self = StObject.set(x, "saveDev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveDevUndefined: Self = StObject.set(x, "saveDev", js.undefined)
      
      @scala.inline
      def setSaveExact(value: Boolean): Self = StObject.set(x, "saveExact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveExactUndefined: Self = StObject.set(x, "saveExact", js.undefined)
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptArgs(value: js.Array[String]): Self = StObject.set(x, "scriptArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptArgsUndefined: Self = StObject.set(x, "scriptArgs", js.undefined)
      
      @scala.inline
      def setScriptArgsVarargs(value: String*): Self = StObject.set(x, "scriptArgs", js.Array(value :_*))
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    }
  }
}
