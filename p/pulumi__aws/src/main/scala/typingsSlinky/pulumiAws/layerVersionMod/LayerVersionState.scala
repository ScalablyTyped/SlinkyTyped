package typingsSlinky.pulumiAws.layerVersionMod

import typingsSlinky.pulumiPulumi.mod.asset.Archive
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerVersionState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer with version.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
    */
  val code: js.UndefOr[Input[Archive]] = js.native
  /**
    * A list of [Runtimes][2] this layer is compatible with. Up to 5 runtimes can be specified.
    */
  val compatibleRuntimes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The date this resource was created.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  /**
    * Description of what your Lambda Layer does.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer without version.
    */
  val layerArn: js.UndefOr[Input[String]] = js.native
  /**
    * A unique name for your Lambda Layer
    */
  val layerName: js.UndefOr[Input[String]] = js.native
  /**
    * License info for your Lambda Layer. See [License Info][3].
    */
  val licenseInfo: js.UndefOr[Input[String]] = js.native
  /**
    * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
    */
  val s3Bucket: js.UndefOr[Input[String]] = js.native
  /**
    * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
    */
  val s3Key: js.UndefOr[Input[String]] = js.native
  /**
    * The object version containing the function's deployment package. Conflicts with `filename`.
    */
  val s3ObjectVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3Key`. The usual way to set this is `${filebase64sha256("file.zip")}` (this provider 0.11.12 or later) or `${base64sha256(file("file.zip"))}` (this provider 0.11.11 and earlier), where "file.zip" is the local filename of the lambda layer source archive.
    */
  val sourceCodeHash: js.UndefOr[Input[String]] = js.native
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * This Lamba Layer version.
    */
  val version: js.UndefOr[Input[String]] = js.native
}

object LayerVersionState {
  @scala.inline
  def apply(): LayerVersionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerVersionState]
  }
  @scala.inline
  implicit class LayerVersionStateOps[Self <: LayerVersionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: Input[Archive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCompatibleRuntimes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleRuntimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibleRuntimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleRuntimes")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerName")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseInfo(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Bucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Key(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Key")(js.undefined)
        ret
    }
    @scala.inline
    def withS3ObjectVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3ObjectVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3ObjectVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3ObjectVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCodeHash(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCodeHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeHash")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCodeSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCodeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

