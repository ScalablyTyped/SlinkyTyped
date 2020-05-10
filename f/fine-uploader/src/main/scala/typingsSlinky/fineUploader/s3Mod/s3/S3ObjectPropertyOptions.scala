package typingsSlinky.fineUploader.s3Mod.s3

import typingsSlinky.fineUploader.coreMod.PromiseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ObjectPropertyOptions extends js.Object {
  /**
    * This value corresponds to a canned ACL
    *
    * @default `'private'`
    */
  var acl: js.UndefOr[String] = js.native
  /**
    * Describes the name of the bucket used to house the file in S3.
    *
    * This is required if the bucket cannot be determined by examining the endpoint (such as if you are using a CDN as an endpoint).
    * Possible values are a string representing the bucket name, or a function.
    *
    * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
    * If the value is a function it may return a `promise` or a `String`
    *
    * @default `(assumes the bucket can be determined by parsing the endpoint string)`
    */
  var bucket: js.UndefOr[String | BucketFunction] = js.native
  /**
    * The hostname of your S3 bucket.
    *
    * This is required if you are using version 4 signatures and sending files through a CDN.
    * Possible values are a string representing the host name, or a function.
    *
    * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
    * If the value is a function it may return a `promise` or a `String`.
    *
    * @default `(uses the request endpoint to determine the hostname)`
    */
  var host: js.UndefOr[String | HostFunction] = js.native
  /**
    * Describes the object key used to identify the file in your S3 bucket.
    *
    * Possible values are 'uuid', 'filename' or a function.
    *
    * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
    * If the value is a function it may return one of a `promise` or a `String`.
    *
    * @default `'uuid'`
    */
  var key: js.UndefOr[String | KeyFunction] = js.native
  /**
    * Set this to true if you would like to use the reduced redundancy storage class for all objects uploaded to S3
    *
    * @default `false`
    */
  var reducedRedundancy: js.UndefOr[Boolean] = js.native
  /**
    * Version 4 signatures only: The S3 region identifier for the target bucket
    *
    * @default `'us-east-1'`
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Set this to true if you would like all uploaded files to be encrypted by AWS
    *
    * @default `false`
    */
  var serverSideEncryption: js.UndefOr[Boolean] = js.native
}

object S3ObjectPropertyOptions {
  @scala.inline
  def apply(): S3ObjectPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ObjectPropertyOptions]
  }
  @scala.inline
  implicit class S3ObjectPropertyOptionsOps[Self <: S3ObjectPropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketFunction1(value: /* id */ Double => PromiseOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBucket(value: String | BucketFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withHostFunction1(value: /* id */ Double => PromiseOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHost(value: String | HostFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFunction1(value: /* id */ Double => PromiseOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKey(value: String | KeyFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withReducedRedundancy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducedRedundancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReducedRedundancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducedRedundancy")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(js.undefined)
        ret
    }
  }
  
}

