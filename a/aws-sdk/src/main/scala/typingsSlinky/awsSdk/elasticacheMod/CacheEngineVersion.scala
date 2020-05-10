package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheEngineVersion extends js.Object {
  /**
    * The description of the cache engine.
    */
  var CacheEngineDescription: js.UndefOr[String] = js.native
  /**
    * The description of the cache engine version.
    */
  var CacheEngineVersionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the cache parameter group family associated with this cache engine. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The name of the cache engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The version number of the cache engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
}

object CacheEngineVersion {
  @scala.inline
  def apply(): CacheEngineVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheEngineVersion]
  }
  @scala.inline
  implicit class CacheEngineVersionOps[Self <: CacheEngineVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheEngineDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheEngineDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheEngineDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheEngineDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheEngineVersionDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheEngineVersionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheEngineVersionDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheEngineVersionDescription")(js.undefined)
        ret
    }
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
    def withEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
  }
  
}

