package typingsSlinky.npmPackageArg

import typingsSlinky.npmPackageArg.npmPackageArgBooleans.`true`
import typingsSlinky.npmPackageArg.npmPackageArgStrings.alias
import typingsSlinky.npmPackageArg.npmPackageArgStrings.directory
import typingsSlinky.npmPackageArg.npmPackageArgStrings.file
import typingsSlinky.npmPackageArg.npmPackageArgStrings.git
import typingsSlinky.npmPackageArg.npmPackageArgStrings.range
import typingsSlinky.npmPackageArg.npmPackageArgStrings.remote
import typingsSlinky.npmPackageArg.npmPackageArgStrings.tag
import typingsSlinky.npmPackageArg.npmPackageArgStrings.version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-package-arg", JSImport.Namespace)
  @js.native
  def apply(arg: String): Result = js.native
  @JSImport("npm-package-arg", JSImport.Namespace)
  @js.native
  def apply(arg: String, where: String): Result = js.native
  
  @JSImport("npm-package-arg", "Result")
  @js.native
  class Result () extends StObject {
    
    /** A version of name escaped to match the npm scoped packages specification. Mostly used when making requests against a registry. When name is null, escapedName will also be null. */
    var escapedName: String | Null = js.native
    
    /** The version of the specifier to be used to fetch this resource. null for shortcuts to hosted git dependencies as there isn't just one URL to try with them. */
    var fetchSpec: String | Null = js.native
    
    /** If set, this is the specific committish to use with a git dependency. */
    var gitCommittish: js.UndefOr[String] = js.native
    
    /** If set, this is a semver specifier to match against git tags with */
    var gitRange: js.UndefOr[String] = js.native
    
    /** If from === 'hosted' then this will be a hosted-git-info object. This property is not included when serializing the object as JSON. */
    var hosted: js.UndefOr[HostedGit] = js.native
    
    /** If known, the name field expected in the resulting pkg. */
    var name: String | Null = js.native
    
    /** The original un-modified string that was provided. If called as npa.resolve(name, spec) then this will be name + '@' + spec. */
    var raw: String = js.native
    
    /** The specifier part that was parsed out in calls to npa(arg), or the value of spec in calls to `npa.resolve(name, spec). */
    var rawSpec: String = js.native
    
    /** If true this specifier refers to a resource hosted on a registry. This is true for tag, version and range types. */
    var registry: Boolean = js.native
    
    /** The normalized specifier, for saving to package.json files. null for registry dependencies. */
    var saveSpec: String | Null = js.native
    
    /** If a name is something like @org/module then the scope field will be set to @org. If it doesn't have a scoped name, then scope is null. */
    var scope: String | Null = js.native
    
    /**
      * One of the following strings:
      * * git - A git repo
      * * tag - A tagged version, like "foo@latest"
      * * version - A specific version number, like "foo@1.2.3"
      * * range - A version range, like "foo@2.x"
      * * file - A local .tar.gz, .tar or .tgz file.
      * * directory - A local directory.
      * * remote - An http url (presumably to a tgz)
      */
    var `type`: git | tag | version | range | file | directory | remote | alias = js.native
  }
  
  /**
    * Throws if the package name is invalid, a dist-tag is invalid or a URL's protocol is not supported.
    * @param name The name of the module you want to install. For example: foo or @bar/foo.
    * @param spec The specifier indicating where and how you can get this module.
    * Something like: 1.2, ^1.7.17, http://x.com/foo.tgz, git+https://github.com/user/foo, bitbucket:user/foo, file:foo.tar.gz or file:../foo/bar/. If not included then the default is latest.
    * @param where Optionally the path to resolve file paths relative to. Defaults to process.cwd()
    */
  @JSImport("npm-package-arg", "resolve")
  @js.native
  def resolve(name: String, spec: String): FileResult | HostedGitResult | URLResult | AliasResult | RegistryResult = js.native
  @JSImport("npm-package-arg", "resolve")
  @js.native
  def resolve(name: String, spec: String, where: String): FileResult | HostedGitResult | URLResult | AliasResult | RegistryResult = js.native
  
  @js.native
  trait AliasResult extends Result {
    
    @JSName("fetchSpec")
    var fetchSpec_AliasResult: Null = js.native
    
    @JSName("registry")
    var registry_AliasResult: `true` = js.native
    
    @JSName("saveSpec")
    var saveSpec_AliasResult: Null = js.native
    
    var subSpec: Result = js.native
    
    @JSName("type")
    var type_AliasResult: alias = js.native
  }
  
  @js.native
  trait FileResult extends Result {
    
    @JSName("fetchSpec")
    var fetchSpec_FileResult: Null | String = js.native
    
    @JSName("saveSpec")
    var saveSpec_FileResult: String = js.native
    
    @JSName("type")
    var type_FileResult: file | directory = js.native
    
    var where: String = js.native
  }
  
  @js.native
  trait HostedGit extends StObject {
    
    var domain: String = js.native
    
    var project: String = js.native
    
    var `type`: String = js.native
    
    var user: String = js.native
  }
  object HostedGit {
    
    @scala.inline
    def apply(domain: String, project: String, `type`: String, user: String): HostedGit = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedGit]
    }
    
    @scala.inline
    implicit class HostedGitMutableBuilder[Self <: HostedGit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HostedGitResult extends Result {
    
    @JSName("fetchSpec")
    var fetchSpec_HostedGitResult: Null | String = js.native
    
    @JSName("gitCommittish")
    var gitCommittish_HostedGitResult: js.UndefOr[String] = js.native
    
    @JSName("gitRange")
    var gitRange_HostedGitResult: js.UndefOr[String] = js.native
    
    @JSName("hosted")
    var hosted_HostedGitResult: HostedGit = js.native
    
    @JSName("saveSpec")
    var saveSpec_HostedGitResult: String = js.native
    
    @JSName("type")
    var type_HostedGitResult: git = js.native
  }
  
  @js.native
  trait RegistryResult extends Result {
    
    @JSName("fetchSpec")
    var fetchSpec_RegistryResult: String = js.native
    
    @JSName("registry")
    var registry_RegistryResult: `true` = js.native
    
    @JSName("saveSpec")
    var saveSpec_RegistryResult: Null = js.native
    
    @JSName("type")
    var type_RegistryResult: version | range | tag = js.native
  }
  
  @js.native
  trait URLResult extends Result {
    
    @JSName("fetchSpec")
    var fetchSpec_URLResult: String = js.native
    
    @JSName("saveSpec")
    var saveSpec_URLResult: String = js.native
    
    @JSName("type")
    var type_URLResult: git | remote = js.native
  }
}
