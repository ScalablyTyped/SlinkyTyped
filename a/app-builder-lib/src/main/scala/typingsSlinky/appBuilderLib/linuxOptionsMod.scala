package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.appBuilderLibStrings.bzip2
import typingsSlinky.appBuilderLib.appBuilderLibStrings.gz
import typingsSlinky.appBuilderLib.appBuilderLibStrings.xz
import typingsSlinky.appBuilderLib.coreMod.TargetConfigType
import typingsSlinky.appBuilderLib.coreMod.TargetConfiguration
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linuxOptionsMod {
  
  @js.native
  trait AppImageOptions
    extends CommonLinuxOptions
       with TargetSpecificOptions {
    
    /**
      * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). Only plain text is supported.
      */
    val license: js.UndefOr[String | Null] = js.native
  }
  object AppImageOptions {
    
    @scala.inline
    def apply(): AppImageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppImageOptions]
    }
    
    @scala.inline
    implicit class AppImageOptionsMutableBuilder[Self <: AppImageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseNull: Self = StObject.set(x, "license", null)
      
      @scala.inline
      def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    }
  }
  
  @js.native
  trait CommonLinuxOptions extends StObject {
    
    /**
      * The [application category](https://specifications.freedesktop.org/menu-spec/latest/apa.html#main-category-registry).
      */
    val category: js.UndefOr[String | Null] = js.native
    
    /**
      * As [description](/configuration/configuration#Metadata-description) from application package.json, but allows you to specify different for Linux.
      */
    val description: js.UndefOr[String | Null] = js.native
    
    /**
      * The [Desktop file](https://developer.gnome.org/integration-guide/stable/desktop-files.html.en) entries (name to value).
      */
    val desktop: js.UndefOr[js.Any | Null] = js.native
    
    /**
      * The executable parameters. Pass to executableName
      */
    val executableArgs: js.UndefOr[js.Array[String] | Null] = js.native
    
    /**
      * The mime types in addition to specified in the file associations. Use it if you don't want to register a new mime type, but reuse existing.
      */
    val mimeTypes: js.UndefOr[js.Array[String] | Null] = js.native
    
    /**
      * The [short description](https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-Description).
      */
    val synopsis: js.UndefOr[String | Null] = js.native
  }
  object CommonLinuxOptions {
    
    @scala.inline
    def apply(): CommonLinuxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonLinuxOptions]
    }
    
    @scala.inline
    implicit class CommonLinuxOptionsMutableBuilder[Self <: CommonLinuxOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryNull: Self = StObject.set(x, "category", null)
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDesktop(value: js.Any): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopNull: Self = StObject.set(x, "desktop", null)
      
      @scala.inline
      def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      @scala.inline
      def setExecutableArgs(value: js.Array[String]): Self = StObject.set(x, "executableArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutableArgsNull: Self = StObject.set(x, "executableArgs", null)
      
      @scala.inline
      def setExecutableArgsUndefined: Self = StObject.set(x, "executableArgs", js.undefined)
      
      @scala.inline
      def setExecutableArgsVarargs(value: String*): Self = StObject.set(x, "executableArgs", js.Array(value :_*))
      
      @scala.inline
      def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypesNull: Self = StObject.set(x, "mimeTypes", null)
      
      @scala.inline
      def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      @scala.inline
      def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value :_*))
      
      @scala.inline
      def setSynopsis(value: String): Self = StObject.set(x, "synopsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynopsisNull: Self = StObject.set(x, "synopsis", null)
      
      @scala.inline
      def setSynopsisUndefined: Self = StObject.set(x, "synopsis", js.undefined)
    }
  }
  
  @js.native
  trait DebOptions extends LinuxTargetSpecificOptions {
    
    /**
      * The [Priority](https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-Priority) attribute.
      */
    val priority: js.UndefOr[String | Null] = js.native
  }
  object DebOptions {
    
    @scala.inline
    def apply(): DebOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebOptions]
    }
    
    @scala.inline
    implicit class DebOptionsMutableBuilder[Self <: DebOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityNull: Self = StObject.set(x, "priority", null)
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  @js.native
  trait LinuxConfiguration
    extends PlatformSpecificBuildOptions
       with CommonLinuxOptions {
    
    /**
      * The executable name. Defaults to `productName`.
      * Cannot be specified per target, allowed only in the `linux`.
      */
    val executableName: js.UndefOr[String | Null] = js.native
    
    /**
      * The path to icon set directory or one png file, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory. The icon filename must contain the size (e.g. 32x32.png) of the icon.
      * By default will be generated automatically based on the macOS icns file.
      */
    @JSName("icon")
    val icon_LinuxConfiguration: js.UndefOr[String] = js.native
    
    /**
      * The maintainer. Defaults to [author](/configuration/configuration#Metadata-author).
      */
    val maintainer: js.UndefOr[String | Null] = js.native
    
    /**
      * backward compatibility + to allow specify fpm-only category for all possible fpm targets in one place
      * @private
      */
    val packageCategory: js.UndefOr[String | Null] = js.native
    
    /**
      * Target package type: list of `AppImage`, `snap`, `deb`, `rpm`, `freebsd`, `pacman`, `p5p`, `apk`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
      *
      * electron-builder [docker image](/multi-platform-build#docker) can be used to build Linux targets on any platform.
      *
      * Please [do not put an AppImage into another archive](https://github.com/probonopd/AppImageKit/wiki/Creating-AppImages#common-mistake) like a .zip or .tar.gz.
      * @default AppImage
      */
    @JSName("target")
    val target_LinuxConfiguration: js.UndefOr[TargetConfigType] = js.native
    
    /**
      * The vendor. Defaults to [author](/configuration/configuration#Metadata-author).
      */
    val vendor: js.UndefOr[String | Null] = js.native
  }
  object LinuxConfiguration {
    
    @scala.inline
    def apply(): LinuxConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinuxConfiguration]
    }
    
    @scala.inline
    implicit class LinuxConfigurationMutableBuilder[Self <: LinuxConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutableName(value: String): Self = StObject.set(x, "executableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutableNameNull: Self = StObject.set(x, "executableName", null)
      
      @scala.inline
      def setExecutableNameUndefined: Self = StObject.set(x, "executableName", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMaintainer(value: String): Self = StObject.set(x, "maintainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainerNull: Self = StObject.set(x, "maintainer", null)
      
      @scala.inline
      def setMaintainerUndefined: Self = StObject.set(x, "maintainer", js.undefined)
      
      @scala.inline
      def setPackageCategory(value: String): Self = StObject.set(x, "packageCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageCategoryNull: Self = StObject.set(x, "packageCategory", null)
      
      @scala.inline
      def setPackageCategoryUndefined: Self = StObject.set(x, "packageCategory", js.undefined)
      
      @scala.inline
      def setTarget(value: TargetConfigType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetVarargs(value: (String | TargetConfiguration)*): Self = StObject.set(x, "target", js.Array(value :_*))
      
      @scala.inline
      def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorNull: Self = StObject.set(x, "vendor", null)
      
      @scala.inline
      def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
  
  @js.native
  trait LinuxTargetSpecificOptions
    extends CommonLinuxOptions
       with TargetSpecificOptions {
    
    val afterInstall: js.UndefOr[String | Null] = js.native
    
    val afterRemove: js.UndefOr[String | Null] = js.native
    
    /**
      * The compression type.
      * @default xz
      */
    val compression: js.UndefOr[gz | bzip2 | xz | Null] = js.native
    
    /**
      * Package dependencies.
      */
    val depends: js.UndefOr[js.Array[String] | Null] = js.native
    
    /**
      * *Advanced only* The [fpm](https://github.com/jordansissel/fpm/wiki#usage) options.
      *
      * Example: `["--before-install=build/deb-preinstall.sh", "--after-upgrade=build/deb-postinstall.sh"]`
      */
    val fpm: js.UndefOr[js.Array[String] | Null] = js.native
    
    val icon: js.UndefOr[String] = js.native
    
    val maintainer: js.UndefOr[String | Null] = js.native
    
    /**
      * The package category.
      */
    val packageCategory: js.UndefOr[String | Null] = js.native
    
    val vendor: js.UndefOr[String | Null] = js.native
  }
  object LinuxTargetSpecificOptions {
    
    @scala.inline
    def apply(): LinuxTargetSpecificOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinuxTargetSpecificOptions]
    }
    
    @scala.inline
    implicit class LinuxTargetSpecificOptionsMutableBuilder[Self <: LinuxTargetSpecificOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterInstall(value: String): Self = StObject.set(x, "afterInstall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterInstallNull: Self = StObject.set(x, "afterInstall", null)
      
      @scala.inline
      def setAfterInstallUndefined: Self = StObject.set(x, "afterInstall", js.undefined)
      
      @scala.inline
      def setAfterRemove(value: String): Self = StObject.set(x, "afterRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterRemoveNull: Self = StObject.set(x, "afterRemove", null)
      
      @scala.inline
      def setAfterRemoveUndefined: Self = StObject.set(x, "afterRemove", js.undefined)
      
      @scala.inline
      def setCompression(value: gz | bzip2 | xz): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionNull: Self = StObject.set(x, "compression", null)
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setDepends(value: js.Array[String]): Self = StObject.set(x, "depends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependsNull: Self = StObject.set(x, "depends", null)
      
      @scala.inline
      def setDependsUndefined: Self = StObject.set(x, "depends", js.undefined)
      
      @scala.inline
      def setDependsVarargs(value: String*): Self = StObject.set(x, "depends", js.Array(value :_*))
      
      @scala.inline
      def setFpm(value: js.Array[String]): Self = StObject.set(x, "fpm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFpmNull: Self = StObject.set(x, "fpm", null)
      
      @scala.inline
      def setFpmUndefined: Self = StObject.set(x, "fpm", js.undefined)
      
      @scala.inline
      def setFpmVarargs(value: String*): Self = StObject.set(x, "fpm", js.Array(value :_*))
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMaintainer(value: String): Self = StObject.set(x, "maintainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainerNull: Self = StObject.set(x, "maintainer", null)
      
      @scala.inline
      def setMaintainerUndefined: Self = StObject.set(x, "maintainer", js.undefined)
      
      @scala.inline
      def setPackageCategory(value: String): Self = StObject.set(x, "packageCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageCategoryNull: Self = StObject.set(x, "packageCategory", null)
      
      @scala.inline
      def setPackageCategoryUndefined: Self = StObject.set(x, "packageCategory", js.undefined)
      
      @scala.inline
      def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorNull: Self = StObject.set(x, "vendor", null)
      
      @scala.inline
      def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
}
