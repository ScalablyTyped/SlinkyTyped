package typingsSlinky.reactNativeWindowsCli

import typingsSlinky.reactNativeWindowsCli.anon.PartialWindowsDependencyC
import typingsSlinky.reactNativeWindowsCli.reactNativeWindowsCliStrings.cpp
import typingsSlinky.reactNativeWindowsCli.reactNativeWindowsCliStrings.cs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependencyConfigMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/dependencyConfig", "dependencyConfigWindows")
  @js.native
  def dependencyConfigWindows(folder: String): WindowsDependencyConfig | Null = js.native
  @JSImport("@react-native-windows/cli/lib-commonjs/config/dependencyConfig", "dependencyConfigWindows")
  @js.native
  def dependencyConfigWindows(folder: String, userConfig: PartialWindowsDependencyC): WindowsDependencyConfig | Null = js.native
  
  @js.native
  trait NuGetPackageDependency extends StObject {
    
    var cppHeaders: js.Array[String] = js.native
    
    var cppPackageProviders: js.Array[String] = js.native
    
    var csNamespaces: js.Array[String] = js.native
    
    var csPackageProviders: js.Array[String] = js.native
    
    var packageName: String = js.native
    
    var packageVersion: String = js.native
  }
  object NuGetPackageDependency {
    
    @scala.inline
    def apply(
      cppHeaders: js.Array[String],
      cppPackageProviders: js.Array[String],
      csNamespaces: js.Array[String],
      csPackageProviders: js.Array[String],
      packageName: String,
      packageVersion: String
    ): NuGetPackageDependency = {
      val __obj = js.Dynamic.literal(cppHeaders = cppHeaders.asInstanceOf[js.Any], cppPackageProviders = cppPackageProviders.asInstanceOf[js.Any], csNamespaces = csNamespaces.asInstanceOf[js.Any], csPackageProviders = csPackageProviders.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], packageVersion = packageVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[NuGetPackageDependency]
    }
    
    @scala.inline
    implicit class NuGetPackageDependencyMutableBuilder[Self <: NuGetPackageDependency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCppHeaders(value: js.Array[String]): Self = StObject.set(x, "cppHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCppHeadersVarargs(value: String*): Self = StObject.set(x, "cppHeaders", js.Array(value :_*))
      
      @scala.inline
      def setCppPackageProviders(value: js.Array[String]): Self = StObject.set(x, "cppPackageProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCppPackageProvidersVarargs(value: String*): Self = StObject.set(x, "cppPackageProviders", js.Array(value :_*))
      
      @scala.inline
      def setCsNamespaces(value: js.Array[String]): Self = StObject.set(x, "csNamespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsNamespacesVarargs(value: String*): Self = StObject.set(x, "csNamespaces", js.Array(value :_*))
      
      @scala.inline
      def setCsPackageProviders(value: js.Array[String]): Self = StObject.set(x, "csPackageProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsPackageProvidersVarargs(value: String*): Self = StObject.set(x, "csPackageProviders", js.Array(value :_*))
      
      @scala.inline
      def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageVersion(value: String): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProjectDependency extends StObject {
    
    var cppHeaders: js.Array[String] = js.native
    
    var cppPackageProviders: js.Array[String] = js.native
    
    var csNamespaces: js.Array[String] = js.native
    
    var csPackageProviders: js.Array[String] = js.native
    
    var directDependency: Boolean = js.native
    
    var projectFile: String = js.native
    
    var projectGuid: String | Null = js.native
    
    var projectLang: cpp | cs | Null = js.native
    
    var projectName: String = js.native
  }
  object ProjectDependency {
    
    @scala.inline
    def apply(
      cppHeaders: js.Array[String],
      cppPackageProviders: js.Array[String],
      csNamespaces: js.Array[String],
      csPackageProviders: js.Array[String],
      directDependency: Boolean,
      projectFile: String,
      projectName: String
    ): ProjectDependency = {
      val __obj = js.Dynamic.literal(cppHeaders = cppHeaders.asInstanceOf[js.Any], cppPackageProviders = cppPackageProviders.asInstanceOf[js.Any], csNamespaces = csNamespaces.asInstanceOf[js.Any], csPackageProviders = csPackageProviders.asInstanceOf[js.Any], directDependency = directDependency.asInstanceOf[js.Any], projectFile = projectFile.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDependency]
    }
    
    @scala.inline
    implicit class ProjectDependencyMutableBuilder[Self <: ProjectDependency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCppHeaders(value: js.Array[String]): Self = StObject.set(x, "cppHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCppHeadersVarargs(value: String*): Self = StObject.set(x, "cppHeaders", js.Array(value :_*))
      
      @scala.inline
      def setCppPackageProviders(value: js.Array[String]): Self = StObject.set(x, "cppPackageProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCppPackageProvidersVarargs(value: String*): Self = StObject.set(x, "cppPackageProviders", js.Array(value :_*))
      
      @scala.inline
      def setCsNamespaces(value: js.Array[String]): Self = StObject.set(x, "csNamespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsNamespacesVarargs(value: String*): Self = StObject.set(x, "csNamespaces", js.Array(value :_*))
      
      @scala.inline
      def setCsPackageProviders(value: js.Array[String]): Self = StObject.set(x, "csPackageProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsPackageProvidersVarargs(value: String*): Self = StObject.set(x, "csPackageProviders", js.Array(value :_*))
      
      @scala.inline
      def setDirectDependency(value: Boolean): Self = StObject.set(x, "directDependency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectFile(value: String): Self = StObject.set(x, "projectFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectGuid(value: String): Self = StObject.set(x, "projectGuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectGuidNull: Self = StObject.set(x, "projectGuid", null)
      
      @scala.inline
      def setProjectLang(value: cpp | cs): Self = StObject.set(x, "projectLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectLangNull: Self = StObject.set(x, "projectLang", null)
      
      @scala.inline
      def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WindowsDependencyConfig extends StObject {
    
    var folder: String = js.native
    
    var nugetPackages: js.Array[NuGetPackageDependency] = js.native
    
    var projects: js.Array[ProjectDependency] = js.native
    
    var solutionFile: js.UndefOr[String | Null] = js.native
    
    var sourceDir: js.UndefOr[String] = js.native
  }
  object WindowsDependencyConfig {
    
    @scala.inline
    def apply(
      folder: String,
      nugetPackages: js.Array[NuGetPackageDependency],
      projects: js.Array[ProjectDependency]
    ): WindowsDependencyConfig = {
      val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], nugetPackages = nugetPackages.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsDependencyConfig]
    }
    
    @scala.inline
    implicit class WindowsDependencyConfigMutableBuilder[Self <: WindowsDependencyConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNugetPackages(value: js.Array[NuGetPackageDependency]): Self = StObject.set(x, "nugetPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNugetPackagesVarargs(value: NuGetPackageDependency*): Self = StObject.set(x, "nugetPackages", js.Array(value :_*))
      
      @scala.inline
      def setProjects(value: js.Array[ProjectDependency]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
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
}
