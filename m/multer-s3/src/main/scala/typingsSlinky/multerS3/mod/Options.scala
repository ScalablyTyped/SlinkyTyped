package typingsSlinky.multerS3.mod

import typingsSlinky.awsSdk.mod.S3
import typingsSlinky.expressServeStaticCore.mod._Global_.Express.Request
import typingsSlinky.multer.mod._Global_.Express.Multer.File
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var acl: js.UndefOr[
    (js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[String], Unit], 
      Unit
    ]) | String
  ] = js.native
  var bucket: (js.Function3[
    /* req */ Request, 
    /* file */ File, 
    /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[String], Unit], 
    Unit
  ]) | String = js.native
  var cacheControl: js.UndefOr[
    (js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[String], Unit], 
      Unit
    ]) | String
  ] = js.native
  var contentType: js.UndefOr[
    js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function3[
        /* error */ js.Any, 
        /* mime */ js.UndefOr[String], 
        /* stream */ js.UndefOr[ReadableStream], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  var key: js.UndefOr[
    js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* key */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.native
  var metadata: js.UndefOr[
    js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* metadata */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.native
  var s3: S3 = js.native
  var serverSideEncryption: js.UndefOr[
    (js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* serverSideEncryption */ js.UndefOr[String], Unit], 
      Unit
    ]) | String
  ] = js.native
}

object Options {
  @scala.inline
  def apply(
    bucket: (js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[String], Unit], 
      Unit
    ]) | String,
    s3: S3
  ): Options = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketFunction3(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBucket(
      value: (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3(value: S3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAclFunction3(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAcl(
      value: (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
    ): Self = {
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
    def withCacheControlFunction3(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCacheControl(
      value: (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function3[
          /* error */ js.Any, 
          /* mime */ js.UndefOr[String], 
          /* stream */ js.UndefOr[ReadableStream], 
          Unit
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* key */ js.UndefOr[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* metadata */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideEncryptionFunction3(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* serverSideEncryption */ js.UndefOr[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withServerSideEncryption(
      value: (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* serverSideEncryption */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
    ): Self = {
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

