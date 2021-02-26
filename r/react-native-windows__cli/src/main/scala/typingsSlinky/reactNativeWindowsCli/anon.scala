package typingsSlinky.reactNativeWindowsCli

import typingsSlinky.reactNativeWindowsCli.dependencyConfigMod.NuGetPackageDependency
import typingsSlinky.reactNativeWindowsCli.dependencyConfigMod.ProjectDependency
import typingsSlinky.reactNativeWindowsCli.projectConfigMod.Project
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Latest extends StObject {
    
    var latest: js.UndefOr[Boolean] = js.native
    
    var requires: js.UndefOr[js.Array[String]] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object Latest {
    
    @scala.inline
    def apply(): Latest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Latest]
    }
    
    @scala.inline
    implicit class LatestMutableBuilder[Self <: Latest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      @scala.inline
      def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
      
      @scala.inline
      def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@react-native-windows/cli.@react-native-windows/cli/lib-commonjs/config/dependencyConfig.WindowsDependencyConfig> */
  @js.native
  trait PartialWindowsDependencyC extends StObject {
    
    var folder: js.UndefOr[String] = js.native
    
    var nugetPackages: js.UndefOr[js.Array[NuGetPackageDependency]] = js.native
    
    var projects: js.UndefOr[js.Array[ProjectDependency]] = js.native
    
    var solutionFile: js.UndefOr[String | Null] = js.native
    
    var sourceDir: js.UndefOr[String] = js.native
  }
  object PartialWindowsDependencyC {
    
    @scala.inline
    def apply(): PartialWindowsDependencyC = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWindowsDependencyC]
    }
    
    @scala.inline
    implicit class PartialWindowsDependencyCMutableBuilder[Self <: PartialWindowsDependencyC] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      @scala.inline
      def setNugetPackages(value: js.Array[NuGetPackageDependency]): Self = StObject.set(x, "nugetPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNugetPackagesUndefined: Self = StObject.set(x, "nugetPackages", js.undefined)
      
      @scala.inline
      def setNugetPackagesVarargs(value: NuGetPackageDependency*): Self = StObject.set(x, "nugetPackages", js.Array(value :_*))
      
      @scala.inline
      def setProjects(value: js.Array[ProjectDependency]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
      
      @scala.inline
      def setProjectsVarargs(value: ProjectDependency*): Self = StObject.set(x, "projects", js.Array(value :_*))
      
      @scala.inline
      def setSolutionFile(value: String): Self = StObject.set(x, "solutionFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionFileNull: Self = StObject.set(x, "solutionFile", null)
      
      @scala.inline
      def setSolutionFileUndefined: Self = StObject.set(x, "solutionFile", js.undefined)
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@react-native-windows/cli.@react-native-windows/cli/lib-commonjs/config/projectConfig.WindowsProjectConfig> */
  @js.native
  trait PartialWindowsProjectConf extends StObject {
    
    var folder: js.UndefOr[String] = js.native
    
    var project: js.UndefOr[Project] = js.native
    
    var solutionFile: js.UndefOr[String] = js.native
    
    var sourceDir: js.UndefOr[String] = js.native
  }
  object PartialWindowsProjectConf {
    
    @scala.inline
    def apply(): PartialWindowsProjectConf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWindowsProjectConf]
    }
    
    @scala.inline
    implicit class PartialWindowsProjectConfMutableBuilder[Self <: PartialWindowsProjectConf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      @scala.inline
      def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setSolutionFile(value: String): Self = StObject.set(x, "solutionFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionFileUndefined: Self = StObject.set(x, "solutionFile", js.undefined)
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
    }
  }
  
  @js.native
  trait Requires extends StObject {
    
    var requires: js.UndefOr[js.Array[String]] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object Requires {
    
    @scala.inline
    def apply(): Requires = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Requires]
    }
    
    @scala.inline
    implicit class RequiresMutableBuilder[Self <: Requires] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
      
      @scala.inline
      def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Verbose extends StObject {
    
    var verbose: Boolean = js.native
  }
  object Verbose {
    
    @scala.inline
    def apply(verbose: Boolean): Verbose = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Verbose]
    }
    
    @scala.inline
    implicit class VerboseMutableBuilder[Self <: Verbose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
}
