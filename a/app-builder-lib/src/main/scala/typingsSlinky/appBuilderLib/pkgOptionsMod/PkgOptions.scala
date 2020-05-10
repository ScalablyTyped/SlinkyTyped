package typingsSlinky.appBuilderLib.pkgOptionsMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.update
import typingsSlinky.appBuilderLib.appBuilderLibStrings.upgrade
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkgOptions extends TargetSpecificOptions {
  /**
    * Whether can be installed at the root of any volume, including non-system volumes. Otherwise, it cannot be installed at the root of a volume.
    *
    * Corresponds to [enable_anywhere](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowAnywhere: js.UndefOr[Boolean | Null] = js.native
  /**
    * Whether can be installed into the current user’s home directory.
    * A home directory installation is done as the current user (not as root), and it cannot write outside of the home directory.
    * If the product cannot be installed in the user’s home directory and be not completely functional from user’s home directory.
    *
    * Corresponds to [enable_currentUserHome](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowCurrentUserHome: js.UndefOr[Boolean | Null] = js.native
  /**
    * Whether can be installed into the root directory. Should usually be `true` unless the product can be installed only to the user’s home directory.
    *
    * Corresponds to [enable_localSystem](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowRootDirectory: js.UndefOr[Boolean | Null] = js.native
  /**
    * Options for the background image for the installer.
    */
  val background: js.UndefOr[PkgBackgroundOptions | Null] = js.native
  /**
    * The path to the conclusion file. This may be used to customize the text on the final "Summary" page of the installer.
    */
  val conclusion: js.UndefOr[String | Null] = js.native
  /**
    * Require identical bundle identifiers at install path?
    * @default true
    */
  val hasStrictIdentifier: js.UndefOr[Boolean | Null] = js.native
  /**
    * The name of certificate to use when signing. Consider using environment variables [CSC_LINK or CSC_NAME](/code-signing) instead of specifying this option.
    */
  val identity: js.UndefOr[String | Null] = js.native
  /**
    * The install location. [Do not use it](https://stackoverflow.com/questions/12863944/how-do-you-specify-a-default-install-location-to-home-with-pkgbuild) to create per-user package.
    * Mostly never you will need to change this option. `/Applications` would install it as expected into `/Applications` if the local system domain is chosen, or into `$HOME/Applications` if the home installation is chosen.
    * @default /Applications
    */
  val installLocation: js.UndefOr[String | Null] = js.native
  /**
    * Install bundle over previous version if moved by user?
    * @default true
    */
  val isRelocatable: js.UndefOr[Boolean | Null] = js.native
  /**
    * Don't install bundle if newer version on disk?
    * @default true
    */
  val isVersionChecked: js.UndefOr[Boolean | Null] = js.native
  /**
    * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). In addition to `txt, `rtf` and `html` supported (don't forget to use `target="_blank"` for links).
    */
  val license: js.UndefOr[String | Null] = js.native
  /**
    * Specifies how an existing version of the bundle on disk should be handled when the version in
    * the package is installed.
    *
    * If you specify upgrade, the bundle in the package atomi-cally replaces any version on disk;
    * this has the effect of deleting old paths that no longer exist in the new version of
    * the bundle.
    *
    * If you specify update, the bundle in the package overwrites the version on disk, and any files
    * not contained in the package will be left intact; this is appropriate when you are delivering
    * an update-only package.
    *
    * Another effect of update is that the package bundle will not be installed at all if there is
    * not already a version on disk; this allows a package to deliver an update for an app that
    * the user might have deleted.
    *
    * @default upgrade
    */
  val overwriteAction: js.UndefOr[upgrade | update | Null] = js.native
  /**
    * should be not documented, only to experiment
    * @private
    */
  val productbuild: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * The scripts directory, relative to `build` (build resources directory).
    * The scripts can be in any language so long as the files are marked executable and have the appropriate shebang indicating the path to the interpreter.
    * Scripts are required to be executable (`chmod +x file`).
    * @default build/pkg-scripts
    * @see [Scripting in installer packages](http://macinstallers.blogspot.de/2012/07/scripting-in-installer-packages.html).
    */
  val scripts: js.UndefOr[String | Null] = js.native
  /**
    * The path to the welcome file. This may be used to customize the text on the Introduction page of the installer.
    */
  val welcome: js.UndefOr[String | Null] = js.native
}

object PkgOptions {
  @scala.inline
  def apply(): PkgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PkgOptions]
  }
  @scala.inline
  implicit class PkgOptionsOps[Self <: PkgOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAnywhere(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAnywhere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAnywhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAnywhere")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowAnywhereNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAnywhere")(null)
        ret
    }
    @scala.inline
    def withAllowCurrentUserHome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCurrentUserHome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCurrentUserHome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCurrentUserHome")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCurrentUserHomeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCurrentUserHome")(null)
        ret
    }
    @scala.inline
    def withAllowRootDirectory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRootDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRootDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRootDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRootDirectoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRootDirectory")(null)
        ret
    }
    @scala.inline
    def withBackground(value: PkgBackgroundOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(null)
        ret
    }
    @scala.inline
    def withConclusion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConclusion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(js.undefined)
        ret
    }
    @scala.inline
    def withConclusionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(null)
        ret
    }
    @scala.inline
    def withHasStrictIdentifier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStrictIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasStrictIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStrictIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withHasStrictIdentifierNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStrictIdentifier")(null)
        ret
    }
    @scala.inline
    def withIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(null)
        ret
    }
    @scala.inline
    def withInstallLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallLocationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installLocation")(null)
        ret
    }
    @scala.inline
    def withIsRelocatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRelocatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRelocatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRelocatable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRelocatableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRelocatable")(null)
        ret
    }
    @scala.inline
    def withIsVersionChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVersionChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVersionChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVersionChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVersionCheckedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVersionChecked")(null)
        ret
    }
    @scala.inline
    def withLicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(null)
        ret
    }
    @scala.inline
    def withOverwriteAction(value: upgrade | update): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwriteAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteAction")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwriteActionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteAction")(null)
        ret
    }
    @scala.inline
    def withProductbuild(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productbuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductbuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productbuild")(js.undefined)
        ret
    }
    @scala.inline
    def withProductbuildNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productbuild")(null)
        ret
    }
    @scala.inline
    def withScripts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(null)
        ret
    }
    @scala.inline
    def withWelcome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWelcome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcome")(js.undefined)
        ret
    }
    @scala.inline
    def withWelcomeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcome")(null)
        ret
    }
  }
  
}

