package typingsSlinky.electronPackager

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.asar.mod.CreateOptions
import typingsSlinky.electronNotarize.mod.NotarizeCredentials
import typingsSlinky.electronNotarize.mod.TransporterOptions
import typingsSlinky.electronPackager.electronPackagerBooleans.`false`
import typingsSlinky.electronPackager.electronPackagerBooleans.`true`
import typingsSlinky.electronPackager.electronPackagerStrings.all
import typingsSlinky.electronPackager.electronPackagerStrings.asInvoker
import typingsSlinky.electronPackager.electronPackagerStrings.highestAvailable
import typingsSlinky.electronPackager.electronPackagerStrings.requireAdministrator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Bundles Electron-based application source code with a renamed/customized Electron executable and
    * its supporting files into folders ready for distribution.
    *
    * Briefly, this function:
    * - finds or downloads the correct release of Electron
    * - uses that version of Electron to create a app in `<out>/<appname>-<platform>-<arch>`
    *
    * Short example:
    *
    * ```javascript
    * const packager = require('electron-packager')
    *
    * async function bundleElectronApp(options) {
    *   const appPaths = await packager(options)
    *   console.log(`Electron app bundles created:\n${appPaths.join("\n")}`)
    * }
    * ```
    *
    * @param opts - Options to configure packaging.
    *
    * @returns A Promise containing the paths to the newly created application bundles.
    */
  @JSImport("electron-packager", JSImport.Namespace)
  @js.native
  def apply(opts: Options): js.Promise[js.Array[String]] = js.native
  
  type ArchOption = TargetArch | all
  
  /**
    * A function that is called on the completion of a packaging stage.
    *
    * By default, the functions are called in parallel (via
    * [`Promise.all`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise/all)).
    * If you need the functions called serially, there is a utility function provided. Please note that
    * **callback-style functions are not supported by `serialHooks`.** For example:
    *
    * ```javascript
    * const packager = require('electron-packager')
    * const { serialHooks } = require('electron-packager/src/hooks')
    *
    * packager({
    *   // ...
    *   afterCopy: [serialHooks([
    *     (buildPath, electronVersion, platform, arch) => {
    *       return new Promise((resolve, reject) => {
    *         setTimeout(() => {
    *           console.log('first function')
    *           resolve()
    *         }, 1000)
    *       })
    *     },
    *     (buildPath, electronVersion, platform, arch) => {
    *       console.log('second function')
    *     }
    *   ])],
    *   // ...
    * })
    * ```
    */
  type HookFunction = /**
    * @param buildPath - For [[afterExtract]], the path to the temporary folder where the prebuilt
    * Electron binary has been extracted to. For [[afterCopy]] and [[afterPrune]], the path to the
    * folder where the Electron app has been copied to.
    * @param electronVersion - the version of Electron that is being bundled with the application.
    * @param platform - The target platform you are packaging for.
    * @param arch - The target architecture you are packaging for.
    * @param callback - Must be called once you have completed your actions.
    */
  js.Function5[
    /* buildPath */ String, 
    /* electronVersion */ String, 
    /* platform */ TargetArch, 
    /* arch */ TargetArch, 
    /* callback */ js.Function0[Unit], 
    Unit
  ]
  
  /**
    * A predicate function that, given an absolute file `path`, returns `true` if the file should be
    * ignored, or `false` if the file should be kept. *This does not use any of the default ignored
    * files/directories listed for the [[ignore]] option.*
    */
  type IgnoreFunction = js.Function1[/* path */ String, Boolean]
  
  /**
    * Defines URL protocol schemes to be used on macOS.
    */
  @js.native
  trait MacOSProtocol extends StObject {
    
    /**
      * The descriptive name. Maps to the `CFBundleURLName` metadata property.
      */
    var name: String = js.native
    
    /**
      * One or more protocol schemes associated with the app. For example, specifying `myapp`
      * would cause URLs such as `myapp://path` to be opened with the app. Maps to the
      * `CFBundleURLSchemes` metadata property.
      */
    var schemes: js.Array[String] = js.native
  }
  object MacOSProtocol {
    
    @scala.inline
    def apply(name: String, schemes: js.Array[String]): MacOSProtocol = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacOSProtocol]
    }
    
    @scala.inline
    implicit class MacOSProtocolMutableBuilder[Self <: MacOSProtocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value :_*))
    }
  }
  
  /**
    * Architectures that have been supported by the official Electron prebuilt binaries, past
    * and present.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.electronPackager.electronPackagerStrings.ia32
    - typingsSlinky.electronPackager.electronPackagerStrings.x64
    - typingsSlinky.electronPackager.electronPackagerStrings.armv7l
    - typingsSlinky.electronPackager.electronPackagerStrings.arm64
    - typingsSlinky.electronPackager.electronPackagerStrings.mips64el
  */
  trait OfficialArch extends StObject
  object OfficialArch {
    
    @scala.inline
    def arm64: typingsSlinky.electronPackager.electronPackagerStrings.arm64 = "arm64".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.arm64]
    
    @scala.inline
    def armv7l: typingsSlinky.electronPackager.electronPackagerStrings.armv7l = "armv7l".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.armv7l]
    
    @scala.inline
    def ia32: typingsSlinky.electronPackager.electronPackagerStrings.ia32 = "ia32".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.ia32]
    
    @scala.inline
    def mips64el: typingsSlinky.electronPackager.electronPackagerStrings.mips64el = "mips64el".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.mips64el]
    
    @scala.inline
    def x64: typingsSlinky.electronPackager.electronPackagerStrings.x64 = "x64".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.x64]
  }
  
  /**
    * Platforms that have been supported by the official Electron prebuilt binaries, past and present.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.electronPackager.electronPackagerStrings.linux
    - typingsSlinky.electronPackager.electronPackagerStrings.win32
    - typingsSlinky.electronPackager.electronPackagerStrings.darwin
    - typingsSlinky.electronPackager.electronPackagerStrings.mas
  */
  trait OfficialPlatform extends StObject
  object OfficialPlatform {
    
    @scala.inline
    def darwin: typingsSlinky.electronPackager.electronPackagerStrings.darwin = "darwin".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.darwin]
    
    @scala.inline
    def linux: typingsSlinky.electronPackager.electronPackagerStrings.linux = "linux".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.linux]
    
    @scala.inline
    def mas: typingsSlinky.electronPackager.electronPackagerStrings.mas = "mas".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.mas]
    
    @scala.inline
    def win32: typingsSlinky.electronPackager.electronPackagerStrings.win32 = "win32".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.win32]
  }
  
  /** Options passed to the `packager()` function. */
  @js.native
  trait Options extends StObject {
    
    /**
      * Functions to be called after your app directory has been copied to a temporary directory.
      *
      * **Note**: `afterCopy` will not be called if the [[prebuiltAsar]] option is set.
      */
    var afterCopy: js.UndefOr[js.Array[HookFunction]] = js.native
    
    /** Functions to be called after the prebuilt Electron binary has been extracted to a temporary directory. */
    var afterExtract: js.UndefOr[js.Array[HookFunction]] = js.native
    
    /**
      * Functions to be called after Node module pruning has been applied to the application.
      *
      * **Note**: None of these functions will be called if the [[prune]] option is `false` or
      * the [[prebuiltAsar]] option is set.
      */
    var afterPrune: js.UndefOr[js.Array[HookFunction]] = js.native
    
    /** When `true`, sets both [[arch]] and [[platform]] to `all`. */
    var all: js.UndefOr[Boolean] = js.native
    
    /*
      * The bundle identifier to use in the application's `Info.plist`.
      *
      * @category macOS
      */
    var appBundleId: js.UndefOr[String] = js.native
    
    /**
      * The application category type, as shown in the Finder via *View → Arrange by Application
      * Category* when viewing the Applications directory.
      *
      * For example, `app-category-type=public.app-category.developer-tools` will set the
      * application category to *Developer Tools*.
      *
      * Valid values are listed in [Apple's documentation](https://developer.apple.com/library/ios/documentation/General/Reference/InfoPlistKeyReference/Articles/LaunchServicesKeys.html#//apple_ref/doc/uid/TP40009250-SW8).
      *
      * @category macOS
      */
    var appCategoryType: js.UndefOr[String] = js.native
    
    /**
      * The human-readable copyright line for the app. Maps to the `LegalCopyright` metadata
      * property on Windows, and `NSHumanReadableCopyright` on macOS.
      */
    var appCopyright: js.UndefOr[String] = js.native
    
    /**
      * The release version of the application.
      *
      * By default the `version` property in the `package.json` is used, but it can be overridden
      * with this argument. If neither are provided, the version of Electron will be used. Maps
      * to the `ProductVersion` metadata property on Windows, and `CFBundleShortVersionString`
      * on macOS.
      */
    var appVersion: js.UndefOr[String] = js.native
    
    /**
      * The target system architecture(s) to build for.
      *
      * Not required if the [[all]] option is set. If `arch` is set to `all`, all supported
      * architectures for the target platforms specified by [[platform]] will be built.
      * Arbitrary combinations of individual architectures are also supported via a comma-delimited
      * string or array of strings. The non-`all` values correspond to the architecture names used
      * by [Electron releases](https://github.com/electron/electron/releases). This value
      * is not restricted to the official set if [[download|`download.mirrorOptions`]] is set.
      *
      * Defaults to the arch of the host computer running Electron Packager.
      *
      * Arch values for the official prebuilt Electron binaries:
      * - `ia32`
      * - `x64`
      * - `armv7l`
      * - `arm64` _(Linux: Electron 1.8.0 and above; Windows: 6.0.8 and above; macOS: 11.0.0-beta.1 and above)_
      * - `mips64el` _(Electron 1.8.2-beta.5 to 1.8.8)_
      */
    var arch: js.UndefOr[ArchOption | js.Array[ArchOption]] = js.native
    
    /**
      * Whether to package the application's source code into an archive, using [Electron's
      * archive format](https://github.com/electron/asar). Reasons why you may want to enable
      * this feature are described in [an application packaging tutorial in Electron's
      * documentation](https://electronjs.org/docs/tutorial/application-packaging/). When the value
      * is `true`, it passes the default configuration to the `asar` module. The configuration
      * values can be customized when the value is an `Object`. Supported sub-options include, but
      * are not limited to:
      * - `ordering` (*string*): A path to an ordering file for packing files. An explanation can be
      *   found on the [Atom issue tracker](https://github.com/atom/atom/issues/10163).
      * - `unpack` (*string*): A [glob expression](https://github.com/isaacs/minimatch#features),
      *   when specified, unpacks the file with matching names to the `app.asar.unpacked` directory.
      * - `unpackDir` (*string*): Unpacks the dir to the `app.asar.unpacked` directory whose names
      *   exactly or pattern match this string. The `asar.unpackDir` is relative to [[dir]].
      *
      * Defaults to `false`.
      *
      * Some examples:
      *
      * - `asar.unpackDir = 'sub_dir'` will unpack the directory `/<dir>/sub_dir`
      * - `asar.unpackDir = path.join('**', '{sub_dir1/sub_sub_dir,sub_dir2}', '*')` will unpack the directories `/<dir>/sub_dir1/sub_sub_dir` and `/<dir>/sub_dir2`, but it will not include their subdirectories.
      * - `asar.unpackDir = path.join('**', '{sub_dir1/sub_sub_dir,sub_dir2}', '**')` will unpack the subdirectories of the directories `/<dir>/sub_dir1/sub_sub_dir` and `/<dir>/sub_dir2`.
      * - `asar.unpackDir = path.join('**', '{sub_dir1/sub_sub_dir,sub_dir2}', '**', '*')` will unpack the directories `/<dir>/sub_dir1/sub_sub_dir` and `/<dir>/sub_dir2` and their subdirectories.
      *
      * **Note:** `asar` will have no effect if the [[prebuiltAsar]] option is set.
      */
    var asar: js.UndefOr[Boolean | CreateOptions] = js.native
    
    /**
      * The build version of the application. Defaults to the value of the [[appVersion]] option.
      * Maps to the `FileVersion` metadata property on Windows, and `CFBundleVersion` on macOS.
      */
    var buildVersion: js.UndefOr[String] = js.native
    
    /**
      * Forces support for Mojave (macOS 10.14) dark mode in your packaged app. This sets the
      * `NSRequiresAquaSystemAppearance` key to `false` in your app's `Info.plist`.  For more information,
      * see the [Electron documentation](https://www.electronjs.org/docs/tutorial/mojave-dark-mode-guide)
      * and the [Apple developer documentation](https://developer.apple.com/documentation/appkit/nsappearancecustomization/choosing_a_specific_appearance_for_your_app).
      *
      * @category macOS
      */
    var darwinDarkModeSupport: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether symlinks should be dereferenced during the copying of the application source.
      * Defaults to `true`.
      *
      * **Note:** `derefSymlinks` will have no effect if the [[prebuiltAsar]] option is set.
      */
    var derefSymlinks: js.UndefOr[Boolean] = js.native
    
    /** The source directory. */
    var dir: String = js.native
    
    /**
      * If present, passes custom options to [`@electron/get`](https://npm.im/@electron/get). See
      * the module for option descriptions, proxy support, and defaults. Supported parameters
      * include, but are not limited to:
      * - `cacheRoot` (*string*): The directory where prebuilt, pre-packaged Electron downloads are cached.
      * - `mirrorOptions` (*Object*): Options to override the default Electron download location.
      * - `rejectUnauthorized` (*boolean* - default: `true`): Whether SSL certificates are required to be
      *   valid when downloading Electron.
      *
      * **Note:** `download` sub-options will have no effect if the [[electronZipDir]] option is set.
      */
    var download: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElectronDownloadOptions */ js.Any
      ] = js.native
    
    /**
      * The Electron version with which the app is built (without the leading 'v') - for example,
      * [`1.4.13`](https://github.com/electron/electron/releases/tag/v1.4.13). See [Electron
      * releases](https://github.com/electron/electron/releases) for valid versions. If omitted, it
      * will use the version of the nearest local installation of `electron`,
      * `electron-prebuilt-compile`, or `electron-prebuilt`, defined in `package.json` in either
      * `devDependencies` or `dependencies`.
      */
    var electronVersion: js.UndefOr[String] = js.native
    
    /**
      * The local path to a directory containing Electron ZIP files for Electron Packager to unzip, instead
      * of downloading them. The ZIP filenames should be in the same format as the ones downloaded from the
      * [Electron releases](https://github.com/electron/electron/releases) site.
      *
      * **Note:** Setting this option prevents the [[download]] sub-options from being used, as
      * the functionality gets skipped over.
      */
    var electronZipDir: js.UndefOr[String] = js.native
    
    /**
      * The name of the executable file, sans file extension. Defaults to the value for the [[name]]
      * option. For `darwin` or `mas` target platforms, this does not affect the name of the
      * `.app` folder - this will use the [[name]] option instead.
      */
    var executableName: js.UndefOr[String] = js.native
    
    /**
      * When the value is a string, specifies the filename of a `plist` file. Its contents are merged
      * into the app's `Info.plist`.
      * When the value is an `Object`, it specifies an already-parsed `plist` data structure that is
      * merged into the app's `Info.plist`.
      *
      * Entries from `extendInfo` override entries in the base `Info.plist` file supplied by
      * `electron`, `electron-prebuilt-compile`, or `electron-prebuilt`, but are overridden by other
      * options such as [[appVersion]] or [[appBundleId]].
      *
      * @category macOS
      */
    var extendInfo: js.UndefOr[String | StringDictionary[js.Any]] = js.native
    
    // eslint-disable-line @typescript-eslint/no-explicit-any
    /**
      * One or more files to be copied directly into the app's `Contents/Resources` directory for
      * macOS target platforms, and the `resources` directory for other target platforms.
      */
    var extraResource: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * The bundle identifier to use in the application helper's `Info.plist`.
      *
      * @category macOS
      */
    var helperBundleId: js.UndefOr[String] = js.native
    
    /**
      * The local path to the icon file, if the target platform supports setting embedding an icon.
      *
      * Currently you must look for conversion tools in order to supply an icon in the format required by the platform:
      *
      * - macOS: `.icns`
      * - Windows: `.ico` ([See the readme](https://github.com/electron/electron-packager#building-windows-apps-from-non-windows-platforms) for details on non-Windows platforms)
      * - Linux: this option is not supported, as the dock/window list icon is set via
      *   [the `icon` option in the `BrowserWindow` constructor](https://electronjs.org/docs/api/browser-window/#new-browserwindowoptions).
      *   *Please note that you need to use a PNG, and not the macOS or Windows icon formats, in order for it
      *   to show up in the dock/window list.* Setting the icon in the file manager is not currently supported.
      *
      * If the file extension is omitted, it is auto-completed to the correct extension based on the
      * platform, including when [[platform|`platform: 'all'`]] is in effect.
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * One or more additional [regular expression](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions)
      * patterns which specify which files to ignore when copying files to create the app bundle(s). The
      * regular expressions are matched against the absolute path of a given file/directory to be copied.
      *
      * **Please note that [glob patterns](https://en.wikipedia.org/wiki/Glob_%28programming%29) will not work.**
      *
      * The following paths are always ignored (*when you aren't using an [[IgnoreFunction]]*):
      *
      * - the directory specified by the [[out]] option
      * - the temporary directory used to build the Electron app
      * - `node_modules/.bin`
      * - `node_modules/electron`
      * - `node_modules/electron-prebuilt`
      * - `node_modules/electron-prebuilt-compile`
      * - `.git`
      * - files and folders ending in `.o` and `.obj`
      *
      * **Note**: Node modules specified in `devDependencies` are ignored by default, via the
      * [[prune]] option.
      *
      * **Note:** `ignore` will have no effect if the [[prebuiltAsar]] option is set.
      */
    var ignore: js.UndefOr[js.RegExp | js.Array[js.RegExp] | IgnoreFunction] = js.native
    
    /**
      * Ignores [system junk files](https://github.com/sindresorhus/junk) when copying the Electron app,
      * regardless of the [[ignore]] option.
      *
      * **Note:** `junk` will have no effect if the [[prebuiltAsar]] option is set.
      */
    var junk: js.UndefOr[Boolean] = js.native
    
    /**
      * The application name. If omitted, it will use the `productName` or `name` value from the
      * nearest `package.json`.
      *
      * **Regardless of source, characters in the Electron app name which are not allowed in all target
      * platforms' filenames (e.g., `/`), will be replaced by hyphens (`-`).**
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * If present, notarizes macOS target apps when the host platform is macOS and XCode is installed.
      * See [`electron-notarize`](https://github.com/electron/electron-notarize#method-notarizeopts-promisevoid)
      * for option descriptions, such as how to use `appleIdPassword` safely or obtain an API key.
      *
      * **Requires the [[osxSign]] option to be set.**
      *
      * @category macOS
      */
    var osxNotarize: js.UndefOr[OsxNotarizeOptions] = js.native
    
    /**
      * If present, signs macOS target apps when the host platform is macOS and XCode is installed.
      * When the value is `true`, pass default configuration to the signing module. See
      * [electron-osx-sign](https://npm.im/electron-osx-sign#opts---options) for sub-option descriptions and
      * their defaults. Options include, but are not limited to:
      * - `identity` (*string*): The identity used when signing the package via `codesign`.
      * - `entitlements` (*string*): The path to the 'parent' entitlements.
      * - `entitlements-inherit` (*string*): The path to the 'child' entitlements.
      *
      * @category macOS
      */
    var osxSign: js.UndefOr[`true` | OsxSignOptions] = js.native
    
    /**
      * The base directory where the finished package(s) are created.
      *
      * Defaults to the current working directory.
      */
    var out: js.UndefOr[String] = js.native
    
    /**
      * Whether to replace an already existing output directory for a given platform (`true`) or
      * skip recreating it (`false`). Defaults to `false`.
      */
    var overwrite: js.UndefOr[Boolean] = js.native
    
    /**
      * The target platform(s) to build for.
      *
      * Not required if the [[all]] option is set. If `platform` is set to `all`, all officially
      * supported target platforms for the target architectures specified by the [[arch]] option
      * will be built. Arbitrary combinations of individual platforms are also supported via a
      * comma-delimited string or array of strings.
      *
      * The official non-`all` values correspond to the platform names used by [Electron
      * releases](https://github.com/electron/electron/releases). This value is not restricted to
      * the official set if [[download|`download.mirrorOptions]] is set.
      *
      * Defaults to the platform of the host computer running Electron Packager.
      *
      * Platform values for the official prebuilt Electron binaries:
      * - `darwin` (macOS)
      * - `linux`
      * - `mas` (macOS, specifically for submitting to the Mac App Store)
      * - `win32`
      */
    var platform: js.UndefOr[PlatformOption | js.Array[PlatformOption]] = js.native
    
    /**
      * The path to a prebuilt ASAR file.
      *
      * **Note:** Setting this option prevents the following options from being used, as the functionality
      * gets skipped over:
      *
      * - [[asar]]
      * - [[afterCopy]]
      * - [[afterPrune]]
      * - [[derefSymlinks]]
      * - [[ignore]]
      * - [[junk]]
      * - [[prune]]
      */
    var prebuiltAsar: js.UndefOr[String] = js.native
    
    /**
      * The URL protocol schemes associated with the Electron app.
      *
      * @category macOS
      */
    var protocols: js.UndefOr[js.Array[MacOSProtocol]] = js.native
    
    /**
      * Walks the `node_modules` dependency tree to remove all of the packages specified in the
      * `devDependencies` section of `package.json` from the outputted Electron app.
      *
      * Defaults to `true`.
      *
      * **Note:** `prune` will have no effect if the [[prebuiltAsar]] option is set.
      */
    var prune: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, disables printing informational and warning messages to the console when
      * packaging the application. This does not disable errors.
      *
      * Defaults to `false`.
      */
    var quiet: js.UndefOr[Boolean] = js.native
    
    /**
      * The base directory to use as a temporary directory. Set to `false` to disable use of a
      * temporary directory. Defaults to the system's temporary directory.
      */
    var tmpdir: js.UndefOr[String | `false`] = js.native
    
    /**
      * Human-readable descriptions of how the Electron app uses certain macOS features. These are displayed
      * in the App Store. A non-exhaustive list of available properties:
      *
      * * `Camera` - required for media access API usage in macOS Catalina
      * * `Microphone` - required for media access API usage in macOS Catalina
      *
      * Valid properties are the [Cocoa keys for MacOS](https://developer.apple.com/library/archive/documentation/General/Reference/InfoPlistKeyReference/Articles/CocoaKeys.html)
      * of the pattern `NS(.*)UsageDescription`, where the captured group is the key to use.
      *
      * Example:
      *
      * ```javascript
      * {
      *   usageDescription: {
      *     Camera: 'Needed for video calls',
      *     Microphone: 'Needed for voice calls'
      *   }
      * }
      * ```
      *
      * @category macOS
      */
    var usageDescription: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Application metadata to embed into the Windows executable.
      * @category Windows
      */
    var win32metadata: js.UndefOr[Win32MetadataOptions] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(dir: String): Options = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterCopy(value: js.Array[HookFunction]): Self = StObject.set(x, "afterCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterCopyUndefined: Self = StObject.set(x, "afterCopy", js.undefined)
      
      @scala.inline
      def setAfterCopyVarargs(value: HookFunction*): Self = StObject.set(x, "afterCopy", js.Array(value :_*))
      
      @scala.inline
      def setAfterExtract(value: js.Array[HookFunction]): Self = StObject.set(x, "afterExtract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterExtractUndefined: Self = StObject.set(x, "afterExtract", js.undefined)
      
      @scala.inline
      def setAfterExtractVarargs(value: HookFunction*): Self = StObject.set(x, "afterExtract", js.Array(value :_*))
      
      @scala.inline
      def setAfterPrune(value: js.Array[HookFunction]): Self = StObject.set(x, "afterPrune", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterPruneUndefined: Self = StObject.set(x, "afterPrune", js.undefined)
      
      @scala.inline
      def setAfterPruneVarargs(value: HookFunction*): Self = StObject.set(x, "afterPrune", js.Array(value :_*))
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setAppBundleId(value: String): Self = StObject.set(x, "appBundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppBundleIdUndefined: Self = StObject.set(x, "appBundleId", js.undefined)
      
      @scala.inline
      def setAppCategoryType(value: String): Self = StObject.set(x, "appCategoryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppCategoryTypeUndefined: Self = StObject.set(x, "appCategoryType", js.undefined)
      
      @scala.inline
      def setAppCopyright(value: String): Self = StObject.set(x, "appCopyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppCopyrightUndefined: Self = StObject.set(x, "appCopyright", js.undefined)
      
      @scala.inline
      def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
      
      @scala.inline
      def setArch(value: ArchOption | js.Array[ArchOption]): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setArchVarargs(value: ArchOption*): Self = StObject.set(x, "arch", js.Array(value :_*))
      
      @scala.inline
      def setAsar(value: Boolean | CreateOptions): Self = StObject.set(x, "asar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsarUndefined: Self = StObject.set(x, "asar", js.undefined)
      
      @scala.inline
      def setBuildVersion(value: String): Self = StObject.set(x, "buildVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildVersionUndefined: Self = StObject.set(x, "buildVersion", js.undefined)
      
      @scala.inline
      def setDarwinDarkModeSupport(value: Boolean): Self = StObject.set(x, "darwinDarkModeSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarwinDarkModeSupportUndefined: Self = StObject.set(x, "darwinDarkModeSupport", js.undefined)
      
      @scala.inline
      def setDerefSymlinks(value: Boolean): Self = StObject.set(x, "derefSymlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDerefSymlinksUndefined: Self = StObject.set(x, "derefSymlinks", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownload(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElectronDownloadOptions */ js.Any
      ): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setElectronVersion(value: String): Self = StObject.set(x, "electronVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronVersionUndefined: Self = StObject.set(x, "electronVersion", js.undefined)
      
      @scala.inline
      def setElectronZipDir(value: String): Self = StObject.set(x, "electronZipDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronZipDirUndefined: Self = StObject.set(x, "electronZipDir", js.undefined)
      
      @scala.inline
      def setExecutableName(value: String): Self = StObject.set(x, "executableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutableNameUndefined: Self = StObject.set(x, "executableName", js.undefined)
      
      @scala.inline
      def setExtendInfo(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "extendInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendInfoUndefined: Self = StObject.set(x, "extendInfo", js.undefined)
      
      @scala.inline
      def setExtraResource(value: String | js.Array[String]): Self = StObject.set(x, "extraResource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraResourceUndefined: Self = StObject.set(x, "extraResource", js.undefined)
      
      @scala.inline
      def setExtraResourceVarargs(value: String*): Self = StObject.set(x, "extraResource", js.Array(value :_*))
      
      @scala.inline
      def setHelperBundleId(value: String): Self = StObject.set(x, "helperBundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperBundleIdUndefined: Self = StObject.set(x, "helperBundleId", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.RegExp | js.Array[js.RegExp] | IgnoreFunction): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFunction1(value: /* path */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIgnoreRegExp(value: js.RegExp): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: js.RegExp*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setJunk(value: Boolean): Self = StObject.set(x, "junk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJunkUndefined: Self = StObject.set(x, "junk", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOsxNotarize(value: OsxNotarizeOptions): Self = StObject.set(x, "osxNotarize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsxNotarizeUndefined: Self = StObject.set(x, "osxNotarize", js.undefined)
      
      @scala.inline
      def setOsxSign(value: `true` | OsxSignOptions): Self = StObject.set(x, "osxSign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsxSignUndefined: Self = StObject.set(x, "osxSign", js.undefined)
      
      @scala.inline
      def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setPlatform(value: PlatformOption | js.Array[PlatformOption]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setPlatformVarargs(value: PlatformOption*): Self = StObject.set(x, "platform", js.Array(value :_*))
      
      @scala.inline
      def setPrebuiltAsar(value: String): Self = StObject.set(x, "prebuiltAsar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrebuiltAsarUndefined: Self = StObject.set(x, "prebuiltAsar", js.undefined)
      
      @scala.inline
      def setProtocols(value: js.Array[MacOSProtocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      @scala.inline
      def setProtocolsVarargs(value: MacOSProtocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
      
      @scala.inline
      def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setTmpdir(value: String | `false`): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpdirUndefined: Self = StObject.set(x, "tmpdir", js.undefined)
      
      @scala.inline
      def setUsageDescription(value: StringDictionary[String]): Self = StObject.set(x, "usageDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageDescriptionUndefined: Self = StObject.set(x, "usageDescription", js.undefined)
      
      @scala.inline
      def setWin32metadata(value: Win32MetadataOptions): Self = StObject.set(x, "win32metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWin32metadataUndefined: Self = StObject.set(x, "win32metadata", js.undefined)
    }
  }
  
  /**
    * See the documentation for [`electron-notarize`](https://npm.im/electron-notarize#method-notarizeopts-promisevoid)
    * for details.
    */
  type OsxNotarizeOptions = NotarizeCredentials with TransporterOptions
  
  /** See the documentation for [`electron-osx-sign`](https://npm.im/electron-osx-sign#opts) for details. */
  /* Inlined std.Omit<electron-osx-sign.electron-osx-sign.SignOptions, 'app' | 'binaries' | 'platform' | 'version'> */
  @js.native
  trait OsxSignOptions extends StObject {
    
    var entitlements: js.UndefOr[String] = js.native
    
    var `entitlements-inherit`: js.UndefOr[String] = js.native
    
    var `entitlements-loginhelper`: js.UndefOr[String] = js.native
    
    var `gatekeeper-assess`: js.UndefOr[Boolean] = js.native
    
    var hardenedRuntime: js.UndefOr[Boolean] = js.native
    
    var identity: js.UndefOr[String] = js.native
    
    var `identity-validation`: js.UndefOr[Boolean] = js.native
    
    var ignore: js.UndefOr[String] = js.native
    
    var keychain: js.UndefOr[String] = js.native
    
    var `pre-auto-entitlements`: js.UndefOr[Boolean] = js.native
    
    var `pre-embed-provisioning-profile`: js.UndefOr[Boolean] = js.native
    
    var `provisioning-profile`: js.UndefOr[String] = js.native
    
    var requirements: js.UndefOr[String] = js.native
    
    var `signature-size`: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object OsxSignOptions {
    
    @scala.inline
    def apply(): OsxSignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OsxSignOptions]
    }
    
    @scala.inline
    implicit class OsxSignOptionsMutableBuilder[Self <: OsxSignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntitlements(value: String): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEntitlements-inherit`(value: String): Self = StObject.set(x, "entitlements-inherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEntitlements-inheritUndefined`: Self = StObject.set(x, "entitlements-inherit", js.undefined)
      
      @scala.inline
      def `setEntitlements-loginhelper`(value: String): Self = StObject.set(x, "entitlements-loginhelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEntitlements-loginhelperUndefined`: Self = StObject.set(x, "entitlements-loginhelper", js.undefined)
      
      @scala.inline
      def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
      
      @scala.inline
      def `setGatekeeper-assess`(value: Boolean): Self = StObject.set(x, "gatekeeper-assess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGatekeeper-assessUndefined`: Self = StObject.set(x, "gatekeeper-assess", js.undefined)
      
      @scala.inline
      def setHardenedRuntime(value: Boolean): Self = StObject.set(x, "hardenedRuntime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardenedRuntimeUndefined: Self = StObject.set(x, "hardenedRuntime", js.undefined)
      
      @scala.inline
      def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIdentity-validation`(value: Boolean): Self = StObject.set(x, "identity-validation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIdentity-validationUndefined`: Self = StObject.set(x, "identity-validation", js.undefined)
      
      @scala.inline
      def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      @scala.inline
      def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setKeychain(value: String): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeychainUndefined: Self = StObject.set(x, "keychain", js.undefined)
      
      @scala.inline
      def `setPre-auto-entitlements`(value: Boolean): Self = StObject.set(x, "pre-auto-entitlements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPre-auto-entitlementsUndefined`: Self = StObject.set(x, "pre-auto-entitlements", js.undefined)
      
      @scala.inline
      def `setPre-embed-provisioning-profile`(value: Boolean): Self = StObject.set(x, "pre-embed-provisioning-profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPre-embed-provisioning-profileUndefined`: Self = StObject.set(x, "pre-embed-provisioning-profile", js.undefined)
      
      @scala.inline
      def `setProvisioning-profile`(value: String): Self = StObject.set(x, "provisioning-profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setProvisioning-profileUndefined`: Self = StObject.set(x, "provisioning-profile", js.undefined)
      
      @scala.inline
      def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
      
      @scala.inline
      def `setSignature-size`(value: Double): Self = StObject.set(x, "signature-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSignature-sizeUndefined`: Self = StObject.set(x, "signature-size", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type PlatformOption = TargetPlatform | all
  
  type TargetArch = OfficialArch | String
  
  type TargetPlatform = OfficialPlatform | String
  
  /**
    * A collection of application metadata to embed into the Windows executable.
    *
    * For more information, read the [`rcedit` Node module documentation](https://github.com/electron/node-rcedit#docs).
    */
  @js.native
  trait Win32MetadataOptions extends StObject {
    
    /** Defaults to the `author` name from the nearest `package.json`. */
    var CompanyName: js.UndefOr[String] = js.native
    
    /** Defaults to either `productName` or `name` from the nearest `package.json`. */
    var FileDescription: js.UndefOr[String] = js.native
    
    /** Defaults to either `productName` or `name` from the nearest `package.json`. */
    var InternalName: js.UndefOr[String] = js.native
    
    /** Defaults to the renamed Electron `.exe` file. */
    var OriginalFilename: js.UndefOr[String] = js.native
    
    /** Defaults to either `productName` or `name` from the nearest `package.json`. */
    var ProductName: js.UndefOr[String] = js.native
    
    /**
      * Path to a local manifest file.
      *
      * See [MSDN](https://msdn.microsoft.com/en-us/library/windows/desktop/aa374191.aspx) for more details.
      */
    var `application-manifest`: js.UndefOr[String] = js.native
    
    /** See [MSDN](https://msdn.microsoft.com/en-us/library/6ad1fshk.aspx#Anchor_9) for details. */
    var `requested-execution-level`: js.UndefOr[asInvoker | highestAvailable | requireAdministrator] = js.native
  }
  object Win32MetadataOptions {
    
    @scala.inline
    def apply(): Win32MetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Win32MetadataOptions]
    }
    
    @scala.inline
    implicit class Win32MetadataOptionsMutableBuilder[Self <: Win32MetadataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setApplication-manifest`(value: String): Self = StObject.set(x, "application-manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-manifestUndefined`: Self = StObject.set(x, "application-manifest", js.undefined)
      
      @scala.inline
      def setCompanyName(value: String): Self = StObject.set(x, "CompanyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyNameUndefined: Self = StObject.set(x, "CompanyName", js.undefined)
      
      @scala.inline
      def setFileDescription(value: String): Self = StObject.set(x, "FileDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileDescriptionUndefined: Self = StObject.set(x, "FileDescription", js.undefined)
      
      @scala.inline
      def setInternalName(value: String): Self = StObject.set(x, "InternalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalNameUndefined: Self = StObject.set(x, "InternalName", js.undefined)
      
      @scala.inline
      def setOriginalFilename(value: String): Self = StObject.set(x, "OriginalFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalFilenameUndefined: Self = StObject.set(x, "OriginalFilename", js.undefined)
      
      @scala.inline
      def setProductName(value: String): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
      
      @scala.inline
      def `setRequested-execution-level`(value: asInvoker | highestAvailable | requireAdministrator): Self = StObject.set(x, "requested-execution-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRequested-execution-levelUndefined`: Self = StObject.set(x, "requested-execution-level", js.undefined)
    }
  }
}
