package typingsSlinky.gitRevisionWebpackPlugin

import typingsSlinky.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-revision-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends GitRevisionPlugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait GitRevisionPlugin extends Plugin {
    
    def branch(): String = js.native
    
    def commithash(): String = js.native
    
    def version(): String = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var branch: js.UndefOr[Boolean] = js.native
    
    var branchCommand: js.UndefOr[String] = js.native
    
    var commithashCommand: js.UndefOr[String] = js.native
    
    var gitWorkTree: js.UndefOr[String] = js.native
    
    var lightweightTags: js.UndefOr[Boolean] = js.native
    
    var versionCommand: js.UndefOr[String] = js.native
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
      def setBranch(value: Boolean): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchCommand(value: String): Self = StObject.set(x, "branchCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchCommandUndefined: Self = StObject.set(x, "branchCommand", js.undefined)
      
      @scala.inline
      def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      @scala.inline
      def setCommithashCommand(value: String): Self = StObject.set(x, "commithashCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommithashCommandUndefined: Self = StObject.set(x, "commithashCommand", js.undefined)
      
      @scala.inline
      def setGitWorkTree(value: String): Self = StObject.set(x, "gitWorkTree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitWorkTreeUndefined: Self = StObject.set(x, "gitWorkTree", js.undefined)
      
      @scala.inline
      def setLightweightTags(value: Boolean): Self = StObject.set(x, "lightweightTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightweightTagsUndefined: Self = StObject.set(x, "lightweightTags", js.undefined)
      
      @scala.inline
      def setVersionCommand(value: String): Self = StObject.set(x, "versionCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionCommandUndefined: Self = StObject.set(x, "versionCommand", js.undefined)
    }
  }
}
