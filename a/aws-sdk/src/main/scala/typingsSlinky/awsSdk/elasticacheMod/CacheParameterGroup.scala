package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheParameterGroup extends js.Object {
  /**
    * The name of the cache parameter group family that this cache parameter group is compatible with. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The description for this cache parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates whether the parameter group is associated with a Global Datastore
    */
  var IsGlobal: js.UndefOr[Boolean] = js.native
}

object CacheParameterGroup {
  @scala.inline
  def apply(): CacheParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroup]
  }
  @scala.inline
  implicit class CacheParameterGroupOps[Self <: CacheParameterGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheParameterGroupFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroupFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheParameterGroupFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroupFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsGlobal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsGlobal")(js.undefined)
        ret
    }
  }
  
}

