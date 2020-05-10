package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineDefaults extends js.Object {
  /**
    * A list of parameters specific to a particular cache node type. Each element in the list contains detailed information about one parameter.
    */
  var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.native
  /**
    * Specifies the name of the cache parameter group family to which the engine default parameters apply. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * Contains a list of engine default parameters.
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
}

object EngineDefaults {
  @scala.inline
  def apply(): EngineDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineDefaults]
  }
  @scala.inline
  implicit class EngineDefaultsOps[Self <: EngineDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheNodeTypeSpecificParameters(value: CacheNodeTypeSpecificParametersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeTypeSpecificParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeTypeSpecificParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeTypeSpecificParameters")(js.undefined)
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
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: ParametersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
  }
  
}

