package typingsSlinky.pulumiPulumi

import typingsSlinky.pulumiPulumi.archiveMod.AssetMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetMod {
  
  @JSImport("@pulumi/pulumi/asset", "Archive")
  @js.native
  abstract class Archive ()
    extends typingsSlinky.pulumiPulumi.archiveMod.Archive
  /* static members */
  object Archive {
    
    /**
      * Returns true if the given object is an instance of an Archive.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/pulumi/asset", "Archive.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/archive.Archive */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi/asset", "Asset")
  @js.native
  abstract class Asset ()
    extends typingsSlinky.pulumiPulumi.assetAssetMod.Asset
  /* static members */
  object Asset {
    
    /**
      * Returns true if the given object is an instance of an Asset.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/pulumi/asset", "Asset.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi/asset", "AssetArchive")
  @js.native
  class AssetArchive protected ()
    extends typingsSlinky.pulumiPulumi.archiveMod.AssetArchive {
    def this(assets: js.Promise[AssetMap]) = this()
    def this(assets: AssetMap) = this()
  }
  
  @JSImport("@pulumi/pulumi/asset", "FileArchive")
  @js.native
  class FileArchive protected ()
    extends typingsSlinky.pulumiPulumi.archiveMod.FileArchive {
    def this(path: String) = this()
    def this(path: js.Promise[String]) = this()
  }
  
  @JSImport("@pulumi/pulumi/asset", "FileAsset")
  @js.native
  class FileAsset protected ()
    extends typingsSlinky.pulumiPulumi.assetAssetMod.FileAsset {
    def this(path: String) = this()
    def this(path: js.Promise[String]) = this()
  }
  
  @JSImport("@pulumi/pulumi/asset", "RemoteArchive")
  @js.native
  class RemoteArchive protected ()
    extends typingsSlinky.pulumiPulumi.archiveMod.RemoteArchive {
    def this(uri: String) = this()
    def this(uri: js.Promise[String]) = this()
  }
  
  @JSImport("@pulumi/pulumi/asset", "RemoteAsset")
  @js.native
  class RemoteAsset protected ()
    extends typingsSlinky.pulumiPulumi.assetAssetMod.RemoteAsset {
    def this(uri: String) = this()
    def this(uri: js.Promise[String]) = this()
  }
  
  @JSImport("@pulumi/pulumi/asset", "StringAsset")
  @js.native
  class StringAsset protected ()
    extends typingsSlinky.pulumiPulumi.assetAssetMod.StringAsset {
    def this(text: String) = this()
    def this(text: js.Promise[String]) = this()
  }
}
