package typingsSlinky.relayRuntime.relayFeatureFlagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFlags extends js.Object {
  var ENABLE_CONNECTION_RESOLVERS: Boolean = js.native
  var ENABLE_PARTIAL_RENDERING_DEFAULT: Boolean = js.native
  var ENABLE_VARIABLE_CONNECTION_KEY: Boolean = js.native
  var USE_RECORD_SOURCE_MAP_IMPL: Boolean = js.native
}

object FeatureFlags {
  @scala.inline
  def apply(
    ENABLE_CONNECTION_RESOLVERS: Boolean,
    ENABLE_PARTIAL_RENDERING_DEFAULT: Boolean,
    ENABLE_VARIABLE_CONNECTION_KEY: Boolean,
    USE_RECORD_SOURCE_MAP_IMPL: Boolean
  ): FeatureFlags = {
    val __obj = js.Dynamic.literal(ENABLE_CONNECTION_RESOLVERS = ENABLE_CONNECTION_RESOLVERS.asInstanceOf[js.Any], ENABLE_PARTIAL_RENDERING_DEFAULT = ENABLE_PARTIAL_RENDERING_DEFAULT.asInstanceOf[js.Any], ENABLE_VARIABLE_CONNECTION_KEY = ENABLE_VARIABLE_CONNECTION_KEY.asInstanceOf[js.Any], USE_RECORD_SOURCE_MAP_IMPL = USE_RECORD_SOURCE_MAP_IMPL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFlags]
  }
  @scala.inline
  implicit class FeatureFlagsOps[Self <: FeatureFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withENABLE_CONNECTION_RESOLVERS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENABLE_CONNECTION_RESOLVERS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENABLE_PARTIAL_RENDERING_DEFAULT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENABLE_PARTIAL_RENDERING_DEFAULT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENABLE_VARIABLE_CONNECTION_KEY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENABLE_VARIABLE_CONNECTION_KEY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSE_RECORD_SOURCE_MAP_IMPL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USE_RECORD_SOURCE_MAP_IMPL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

