package typingsSlinky.electronGet

import typingsSlinky.electronGet.downloaderMod.Downloader
import typingsSlinky.electronGet.electronGetBooleans.`false`
import typingsSlinky.electronGet.typesMod.DownloadOptions
import typingsSlinky.electronGet.typesMod.ElectronPlatformArtifactDetailsWithDefaults
import typingsSlinky.electronGet.typesMod.MirrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @electron/get.@electron/get/dist/cjs/types.Omit<@electron/get.@electron/get/dist/cjs/types.ElectronPlatformArtifactDetails, 'platform' | 'arch'> & {  platform :string | undefined,   arch :string | undefined} */
  @js.native
  trait OmitElectronPlatformArtif extends ElectronPlatformArtifactDetailsWithDefaults {
    
    var arch: js.UndefOr[String] = js.native
    
    var artifactName: String = js.native
    
    var artifactSuffix: js.UndefOr[String] = js.native
    
    var cacheRoot: js.UndefOr[String] = js.native
    
    var downloadOptions: js.UndefOr[DownloadOptions] = js.native
    
    var downloader: js.UndefOr[Downloader[_]] = js.native
    
    var force: js.UndefOr[Boolean] = js.native
    
    var isGeneric: js.UndefOr[`false`] = js.native
    
    var mirrorOptions: js.UndefOr[MirrorOptions] = js.native
    
    var platform: js.UndefOr[String] = js.native
    
    var tempDirectory: js.UndefOr[String] = js.native
    
    var unsafelyDisableChecksums: js.UndefOr[Boolean] = js.native
    
    var version: String = js.native
  }
  object OmitElectronPlatformArtif {
    
    @scala.inline
    def apply(artifactName: String, version: String): OmitElectronPlatformArtif = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitElectronPlatformArtif]
    }
    
    @scala.inline
    implicit class OmitElectronPlatformArtifMutableBuilder[Self <: OmitElectronPlatformArtif] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setArtifactName(value: String): Self = StObject.set(x, "artifactName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactSuffix(value: String): Self = StObject.set(x, "artifactSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactSuffixUndefined: Self = StObject.set(x, "artifactSuffix", js.undefined)
      
      @scala.inline
      def setCacheRoot(value: String): Self = StObject.set(x, "cacheRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheRootUndefined: Self = StObject.set(x, "cacheRoot", js.undefined)
      
      @scala.inline
      def setDownloadOptions(value: DownloadOptions): Self = StObject.set(x, "downloadOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadOptionsUndefined: Self = StObject.set(x, "downloadOptions", js.undefined)
      
      @scala.inline
      def setDownloader(value: Downloader[_]): Self = StObject.set(x, "downloader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloaderUndefined: Self = StObject.set(x, "downloader", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setIsGeneric(value: `false`): Self = StObject.set(x, "isGeneric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGenericUndefined: Self = StObject.set(x, "isGeneric", js.undefined)
      
      @scala.inline
      def setMirrorOptions(value: MirrorOptions): Self = StObject.set(x, "mirrorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorOptionsUndefined: Self = StObject.set(x, "mirrorOptions", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setTempDirectory(value: String): Self = StObject.set(x, "tempDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempDirectoryUndefined: Self = StObject.set(x, "tempDirectory", js.undefined)
      
      @scala.inline
      def setUnsafelyDisableChecksums(value: Boolean): Self = StObject.set(x, "unsafelyDisableChecksums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafelyDisableChecksumsUndefined: Self = StObject.set(x, "unsafelyDisableChecksums", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @electron/get.@electron/get/dist/esm/types.Omit<@electron/get.@electron/get/dist/esm/types.ElectronPlatformArtifactDetails, 'platform' | 'arch'> & {  platform :string | undefined,   arch :string | undefined} */
  @js.native
  trait OmitElectronPlatformArtifArch
    extends typingsSlinky.electronGet.esmTypesMod.ElectronPlatformArtifactDetailsWithDefaults {
    
    var arch: js.UndefOr[String] = js.native
    
    var artifactName: String = js.native
    
    var artifactSuffix: js.UndefOr[String] = js.native
    
    var cacheRoot: js.UndefOr[String] = js.native
    
    var downloadOptions: js.UndefOr[typingsSlinky.electronGet.esmTypesMod.DownloadOptions] = js.native
    
    var downloader: js.UndefOr[typingsSlinky.electronGet.esmDownloaderMod.Downloader[_]] = js.native
    
    var force: js.UndefOr[Boolean] = js.native
    
    var isGeneric: js.UndefOr[`false`] = js.native
    
    var mirrorOptions: js.UndefOr[typingsSlinky.electronGet.esmTypesMod.MirrorOptions] = js.native
    
    var platform: js.UndefOr[String] = js.native
    
    var tempDirectory: js.UndefOr[String] = js.native
    
    var unsafelyDisableChecksums: js.UndefOr[Boolean] = js.native
    
    var version: String = js.native
  }
  object OmitElectronPlatformArtifArch {
    
    @scala.inline
    def apply(artifactName: String, version: String): OmitElectronPlatformArtifArch = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitElectronPlatformArtifArch]
    }
    
    @scala.inline
    implicit class OmitElectronPlatformArtifArchMutableBuilder[Self <: OmitElectronPlatformArtifArch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setArtifactName(value: String): Self = StObject.set(x, "artifactName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactSuffix(value: String): Self = StObject.set(x, "artifactSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactSuffixUndefined: Self = StObject.set(x, "artifactSuffix", js.undefined)
      
      @scala.inline
      def setCacheRoot(value: String): Self = StObject.set(x, "cacheRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheRootUndefined: Self = StObject.set(x, "cacheRoot", js.undefined)
      
      @scala.inline
      def setDownloadOptions(value: typingsSlinky.electronGet.esmTypesMod.DownloadOptions): Self = StObject.set(x, "downloadOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadOptionsUndefined: Self = StObject.set(x, "downloadOptions", js.undefined)
      
      @scala.inline
      def setDownloader(value: typingsSlinky.electronGet.esmDownloaderMod.Downloader[_]): Self = StObject.set(x, "downloader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloaderUndefined: Self = StObject.set(x, "downloader", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setIsGeneric(value: `false`): Self = StObject.set(x, "isGeneric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGenericUndefined: Self = StObject.set(x, "isGeneric", js.undefined)
      
      @scala.inline
      def setMirrorOptions(value: typingsSlinky.electronGet.esmTypesMod.MirrorOptions): Self = StObject.set(x, "mirrorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorOptionsUndefined: Self = StObject.set(x, "mirrorOptions", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setTempDirectory(value: String): Self = StObject.set(x, "tempDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempDirectoryUndefined: Self = StObject.set(x, "tempDirectory", js.undefined)
      
      @scala.inline
      def setUnsafelyDisableChecksums(value: Boolean): Self = StObject.set(x, "unsafelyDisableChecksums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafelyDisableChecksumsUndefined: Self = StObject.set(x, "unsafelyDisableChecksums", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
