package typingsSlinky.hostedGitInfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hosted-git-info", JSImport.Namespace)
  @js.native
  class ^ protected () extends GitHost {
    def this(`type`: Hosts, user: String, auth: js.UndefOr[scala.Nothing], project: String) = this()
    def this(`type`: Hosts, user: String, auth: String, project: String) = this()
    def this(`type`: Hosts, user: String, auth: js.UndefOr[scala.Nothing], project: String, committish: String) = this()
    def this(`type`: Hosts, user: String, auth: String, project: String, committish: String) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: js.UndefOr[scala.Nothing],
      project: String,
      committish: js.UndefOr[scala.Nothing],
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: js.UndefOr[scala.Nothing],
      project: String,
      committish: String,
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: js.UndefOr[scala.Nothing],
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: String,
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: js.UndefOr[scala.Nothing],
      project: String,
      committish: js.UndefOr[scala.Nothing],
      defaultRepresentation: js.UndefOr[scala.Nothing],
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: js.UndefOr[scala.Nothing],
      project: String,
      committish: js.UndefOr[scala.Nothing],
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: js.UndefOr[scala.Nothing],
      project: String,
      committish: String,
      defaultRepresentation: js.UndefOr[scala.Nothing],
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: js.UndefOr[scala.Nothing],
      project: String,
      committish: String,
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: js.UndefOr[scala.Nothing],
      defaultRepresentation: js.UndefOr[scala.Nothing],
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: js.UndefOr[scala.Nothing],
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: String,
      defaultRepresentation: js.UndefOr[scala.Nothing],
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: String,
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
  }
  
  @JSImport("hosted-git-info", "fromUrl")
  @js.native
  def fromUrl(gitUrl: String): js.UndefOr[GitHost] = js.native
  @JSImport("hosted-git-info", "fromUrl")
  @js.native
  def fromUrl(gitUrl: String, opts: Options): js.UndefOr[GitHost] = js.native
  
  @js.native
  trait FillOptions extends Options {
    
    var auth: js.UndefOr[String] = js.native
    
    var committish: js.UndefOr[String] = js.native
    
    var fragment: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var treepath: js.UndefOr[String] = js.native
  }
  object FillOptions {
    
    @scala.inline
    def apply(): FillOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FillOptions]
    }
    
    @scala.inline
    implicit class FillOptionsMutableBuilder[Self <: FillOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setCommittish(value: String): Self = StObject.set(x, "committish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommittishUndefined: Self = StObject.set(x, "committish", js.undefined)
      
      @scala.inline
      def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setTreepath(value: String): Self = StObject.set(x, "treepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreepathUndefined: Self = StObject.set(x, "treepath", js.undefined)
    }
  }
  
  @js.native
  trait GitHost extends StObject {
    
    var default: js.UndefOr[String] = js.native
    
    var auth: js.UndefOr[String] = js.native
    
    def browse(): String = js.native
    def browse(opts: FillOptions): String = js.native
    def browse(path: String): String = js.native
    def browse(path: String, fragment: String): String = js.native
    def browse(path: String, fragment: String, opts: FillOptions): String = js.native
    def browse(path: String, opts: FillOptions): String = js.native
    
    var browsefiletemplate: String = js.native
    
    var browsetemplate: String = js.native
    
    def bugs(): String = js.native
    def bugs(opts: FillOptions): String = js.native
    
    var bugstemplate: String = js.native
    
    var committish: js.UndefOr[String] = js.native
    
    def docs(): String = js.native
    def docs(opts: FillOptions): String = js.native
    
    var docstemplate: String = js.native
    
    var domain: String = js.native
    
    def file(path: String): String = js.native
    def file(path: String, opts: FillOptions): String = js.native
    
    var filetemplate: String = js.native
    
    def getDefaultRepresentation(): js.UndefOr[Representation] = js.native
    
    def git(): String = js.native
    def git(opts: FillOptions): String = js.native
    
    var gittemplate: js.UndefOr[String] = js.native
    
    def hash(): String = js.native
    
    def hashformat(fragment: String): String = js.native
    
    def https(): String = js.native
    def https(opts: FillOptions): String = js.native
    
    var httpstemplate: String = js.native
    
    var opts: Options = js.native
    
    def path(): String = js.native
    def path(opts: FillOptions): String = js.native
    
    var pathmatch: js.RegExp = js.native
    
    var pathtemplate: String = js.native
    
    var project: String = js.native
    
    var protocols: js.Array[String] = js.native
    
    var protocols_re: js.RegExp = js.native
    
    def shortcut(): String = js.native
    def shortcut(opts: FillOptions): String = js.native
    
    var shortcuttemplate: String = js.native
    
    def ssh(): String = js.native
    def ssh(opts: FillOptions): String = js.native
    
    // Templates
    var sshtemplate: String = js.native
    
    def sshurl(): String = js.native
    def sshurl(opts: FillOptions): String = js.native
    
    var sshurltemplate: String = js.native
    
    def tarball(): String = js.native
    def tarball(opts: FillOptions): String = js.native
    
    var tarballtemplate: String = js.native
    
    def toString(opts: FillOptions): String = js.native
    
    var treepath: js.UndefOr[String] = js.native
    
    var `type`: Hosts = js.native
    
    var user: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.github
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.bitbucket
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.gitlab
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.gist
  */
  trait Hosts extends StObject
  object Hosts {
    
    @scala.inline
    def bitbucket: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.bitbucket = "bitbucket".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.bitbucket]
    
    @scala.inline
    def gist: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.gist = "gist".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.gist]
    
    @scala.inline
    def github: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.github = "github".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.github]
    
    @scala.inline
    def gitlab: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.gitlab = "gitlab".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.gitlab]
  }
  
  @js.native
  trait Options extends StObject {
    
    var noCommittish: js.UndefOr[Boolean] = js.native
    
    var noGitPlus: js.UndefOr[Boolean] = js.native
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
      def setNoCommittish(value: Boolean): Self = StObject.set(x, "noCommittish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCommittishUndefined: Self = StObject.set(x, "noCommittish", js.undefined)
      
      @scala.inline
      def setNoGitPlus(value: Boolean): Self = StObject.set(x, "noGitPlus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoGitPlusUndefined: Self = StObject.set(x, "noGitPlus", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.hash
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.ssh
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.sshurl
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.browse
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.docs
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.bugs
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.https
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.git
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.shortcut
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.path
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.tarball
    - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.file
  */
  trait Representation extends StObject
  object Representation {
    
    @scala.inline
    def browse: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.browse = "browse".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.browse]
    
    @scala.inline
    def bugs: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.bugs = "bugs".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.bugs]
    
    @scala.inline
    def docs: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.docs = "docs".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.docs]
    
    @scala.inline
    def file: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.file = "file".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.file]
    
    @scala.inline
    def git: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.git = "git".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.git]
    
    @scala.inline
    def hash: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.hash = "hash".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.hash]
    
    @scala.inline
    def https: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.https = "https".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.https]
    
    @scala.inline
    def path: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.path = "path".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.path]
    
    @scala.inline
    def shortcut: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.shortcut = "shortcut".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.shortcut]
    
    @scala.inline
    def ssh: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.ssh = "ssh".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.ssh]
    
    @scala.inline
    def sshurl: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.sshurl = "sshurl".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.sshurl]
    
    @scala.inline
    def tarball: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.tarball = "tarball".asInstanceOf[typingsSlinky.hostedGitInfo.hostedGitInfoStrings.tarball]
  }
}
