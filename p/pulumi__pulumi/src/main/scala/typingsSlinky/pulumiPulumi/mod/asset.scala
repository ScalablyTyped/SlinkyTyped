package typingsSlinky.pulumiPulumi.mod

import typingsSlinky.pulumiPulumi.archiveMod.AssetMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi", "asset")
@js.native
object asset extends js.Object {
  
  @js.native
  abstract class Archive ()
    extends typingsSlinky.pulumiPulumi.assetMod.Archive
  /* static members */
  @js.native
  object Archive extends js.Object {
    
    /**
      * Returns true if the given object is an instance of an Archive.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/archive.Archive */ Boolean = js.native
  }
  
  @js.native
  abstract class Asset ()
    extends typingsSlinky.pulumiPulumi.assetMod.Asset
  /* static members */
  @js.native
  object Asset extends js.Object {
    
    /**
      * Returns true if the given object is an instance of an Asset.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ Boolean = js.native
  }
  
  @js.native
  class AssetArchive protected ()
    extends typingsSlinky.pulumiPulumi.assetMod.AssetArchive {
    def this(assets: js.Promise[AssetMap]) = this()
    def this(assets: AssetMap) = this()
  }
  
  @js.native
  class FileArchive protected ()
    extends typingsSlinky.pulumiPulumi.assetMod.FileArchive {
    def this(path: String) = this()
    def this(path: js.Promise[String]) = this()
  }
  
  @js.native
  class FileAsset protected ()
    extends typingsSlinky.pulumiPulumi.assetMod.FileAsset {
    def this(path: String) = this()
    def this(path: js.Promise[String]) = this()
  }
  
  @js.native
  class RemoteArchive protected ()
    extends typingsSlinky.pulumiPulumi.assetMod.RemoteArchive {
    def this(uri: String) = this()
    def this(uri: js.Promise[String]) = this()
  }
  
  @js.native
  class RemoteAsset protected ()
    extends typingsSlinky.pulumiPulumi.assetMod.RemoteAsset {
    def this(uri: String) = this()
    def this(uri: js.Promise[String]) = this()
  }
  
  @js.native
  class StringAsset protected ()
    extends typingsSlinky.pulumiPulumi.assetMod.StringAsset {
    def this(text: String) = this()
    def this(text: js.Promise[String]) = this()
  }
}
