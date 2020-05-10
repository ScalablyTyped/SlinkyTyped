package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugHookConfig extends js.Object {
  /**
    * Configuration information for tensor collections.
    */
  var CollectionConfigurations: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CollectionConfigurations] = js.native
  /**
    * Configuration information for the debug hook parameters.
    */
  var HookParameters: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.HookParameters] = js.native
  /**
    * Path to local storage location for tensors. Defaults to /opt/ml/output/tensors/.
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.native
  /**
    * Path to Amazon S3 storage location for tensors.
    */
  var S3OutputPath: S3Uri = js.native
}

object DebugHookConfig {
  @scala.inline
  def apply(S3OutputPath: S3Uri): DebugHookConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugHookConfig]
  }
  @scala.inline
  implicit class DebugHookConfigOps[Self <: DebugHookConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3OutputPath(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OutputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectionConfigurations(value: CollectionConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withHookParameters(value: HookParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HookParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHookParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HookParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalPath(value: DirectoryPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalPath")(js.undefined)
        ret
    }
  }
  
}

