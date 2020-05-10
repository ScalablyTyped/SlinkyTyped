package typingsSlinky.googleapis.plusDomainsV1Mod.plusDomainsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAudience extends js.Object {
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The access control list entry.
    */
  var item: js.UndefOr[SchemaPlusDomainsAclentryResource] = js.native
  /**
    * Identifies this resource as an audience. Value:
    * &quot;plus#audience&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The number of people in this circle. This only applies if entity_type is
    * CIRCLE.
    */
  var memberCount: js.UndefOr[Double] = js.native
  /**
    * The circle members&#39; visibility as chosen by the owner of the circle.
    * This only applies for items with &quot;item.type&quot; equals
    * &quot;circle&quot;. Possible values are:   - &quot;public&quot; - Members
    * are visible to the public.  - &quot;limited&quot; - Members are visible
    * to a limited audience.  - &quot;private&quot; - Members are visible to
    * the owner only.
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaAudience {
  @scala.inline
  def apply(): SchemaAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudience]
  }
  @scala.inline
  implicit class SchemaAudienceOps[Self <: SchemaAudience] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: SchemaPlusDomainsAclentryResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberCount")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

