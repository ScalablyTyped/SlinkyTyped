package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedReflectiveProvider extends js.Object {
  /**
    * A key, usually a `Type<any>`.
    */
  var key: ReflectiveKey = js.native
  /**
    * Indicates if the provider is a multi-provider or a regular provider.
    */
  var multiProvider: Boolean = js.native
  /**
    * Factory function which can return an instance of an object represented by a key.
    */
  var resolvedFactories: js.Array[ResolvedReflectiveFactory] = js.native
}

object ResolvedReflectiveProvider {
  @scala.inline
  def apply(key: ReflectiveKey, multiProvider: Boolean, resolvedFactories: js.Array[ResolvedReflectiveFactory]): ResolvedReflectiveProvider = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], multiProvider = multiProvider.asInstanceOf[js.Any], resolvedFactories = resolvedFactories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedReflectiveProvider]
  }
  @scala.inline
  implicit class ResolvedReflectiveProviderOps[Self <: ResolvedReflectiveProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: ReflectiveKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedFactories(value: js.Array[ResolvedReflectiveFactory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedFactories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

