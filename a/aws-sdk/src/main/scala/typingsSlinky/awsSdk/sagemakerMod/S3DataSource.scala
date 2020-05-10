package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3DataSource extends js.Object {
  /**
    * A list of one or more attribute names to use that are found in a specified augmented manifest file.
    */
  var AttributeNames: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AttributeNames] = js.native
  /**
    * If you want Amazon SageMaker to replicate the entire dataset on each ML compute instance that is launched for model training, specify FullyReplicated.  If you want Amazon SageMaker to replicate a subset of data on each ML compute instance that is launched for model training, specify ShardedByS3Key. If there are n ML compute instances launched for a training job, each instance gets approximately 1/n of the number of S3 objects. In this case, model training on each machine uses only the subset of training data.  Don't choose more ML compute instances for training than available S3 objects. If you do, some nodes won't get any data and you will pay for nodes that aren't getting any training data. This applies in both File and Pipe modes. Keep this in mind when developing algorithms.  In distributed training, where you use multiple ML compute EC2 instances, you might choose ShardedByS3Key. If the algorithm requires copying training data to the ML storage volume (when TrainingInputMode is set to File), this copies 1/n of the number of objects. 
    */
  var S3DataDistributionType: js.UndefOr[S3DataDistribution] = js.native
  /**
    * If you choose S3Prefix, S3Uri identifies a key name prefix. Amazon SageMaker uses all objects that match the specified key name prefix for model training.  If you choose ManifestFile, S3Uri identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to use for model training.  If you choose AugmentedManifestFile, S3Uri identifies an object that is an augmented manifest file in JSON lines format. This file contains the data you want to use for model training. AugmentedManifestFile can only be used if the Channel's input mode is Pipe.
    */
  var S3DataType: typingsSlinky.awsSdk.sagemakerMod.S3DataType = js.native
  /**
    * Depending on the value specified for the S3DataType, identifies either a key name prefix or a manifest. For example:     A key name prefix might look like this: s3://bucketname/exampleprefix.     A manifest might look like this: s3://bucketname/example.manifest   The manifest is an S3 object which is a JSON file with the following format:   The preceding JSON matches the following s3Uris:   [ {"prefix": "s3://customer_bucket/some/prefix/"},   "relative/path/to/custdata-1",   "relative/path/custdata-2",   ...   "relative/path/custdata-N"   ]   The preceding JSON matches the following s3Uris:   s3://customer_bucket/some/prefix/relative/path/to/custdata-1   s3://customer_bucket/some/prefix/relative/path/custdata-2   ...   s3://customer_bucket/some/prefix/relative/path/custdata-N  The complete set of s3uris in this manifest is the input data for the channel for this datasource. The object that each s3uris points to must be readable by the IAM role that Amazon SageMaker uses to perform tasks on your behalf.   
    */
  var S3Uri: typingsSlinky.awsSdk.sagemakerMod.S3Uri = js.native
}

object S3DataSource {
  @scala.inline
  def apply(S3DataType: S3DataType, S3Uri: S3Uri): S3DataSource = {
    val __obj = js.Dynamic.literal(S3DataType = S3DataType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataSource]
  }
  @scala.inline
  implicit class S3DataSourceOps[Self <: S3DataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3DataType(value: S3DataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Uri(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeNames(value: AttributeNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DataDistributionType(value: S3DataDistribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataDistributionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DataDistributionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataDistributionType")(js.undefined)
        ret
    }
  }
  
}

