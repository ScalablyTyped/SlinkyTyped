package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for how incoming requests to a site should be routed and
  * processed before serving content. The patterns are matched and applied
  * according to a specific [priority
  * order](/docs/hosting/full-config#hosting_priority_order).
  */
@js.native
trait SchemaServingConfig extends js.Object {
  /**
    * How to handle well known App Association files.
    */
  var appAssociation: js.UndefOr[String] = js.native
  /**
    * Defines whether to drop the file extension from uploaded files.
    */
  var cleanUrls: js.UndefOr[Boolean] = js.native
  /**
    * A list of custom response headers that are added to the content if the
    * request URL path matches the glob.
    */
  var headers: js.UndefOr[js.Array[SchemaHeader]] = js.native
  /**
    * A list of globs that will cause the response to redirect to another
    * location.
    */
  var redirects: js.UndefOr[js.Array[SchemaRedirect]] = js.native
  /**
    * A list of rewrites that will act as if the service were given the
    * destination URL.
    */
  var rewrites: js.UndefOr[js.Array[SchemaRewrite]] = js.native
  /**
    * Defines how to handle a trailing slash in the URL path.
    */
  var trailingSlashBehavior: js.UndefOr[String] = js.native
}

object SchemaServingConfig {
  @scala.inline
  def apply(): SchemaServingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServingConfig]
  }
  @scala.inline
  implicit class SchemaServingConfigOps[Self <: SchemaServingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppAssociation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appAssociation")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanUrls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[SchemaHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirects(value: js.Array[SchemaRedirect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirects")(js.undefined)
        ret
    }
    @scala.inline
    def withRewrites(value: js.Array[SchemaRewrite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewrites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrites")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingSlashBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingSlashBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingSlashBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingSlashBehavior")(js.undefined)
        ret
    }
  }
  
}

