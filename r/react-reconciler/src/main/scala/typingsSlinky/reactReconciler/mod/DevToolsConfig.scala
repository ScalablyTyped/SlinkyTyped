package typingsSlinky.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevToolsConfig[Instance, TextInstance] extends js.Object {
  var bundleType: BundleType = js.native
  // Note: this actually *does* depend on Fiber internal fields.
  // Used by "inspect clicked DOM element" in React DevTools.
  var findFiberByHostInstance: js.UndefOr[js.Function1[/* instance */ Instance | TextInstance, Fiber]] = js.native
  // Used by RN in-app inspector.
  // This API is unfortunately RN-specific.
  // TODO: Change it to accept Fiber instead and type it properly.
  var getInspectorDataForViewTag: js.UndefOr[js.Function1[/* tag */ Double, js.Object]] = js.native
  var rendererPackageName: String = js.native
  var version: String = js.native
}

object DevToolsConfig {
  @scala.inline
  def apply[Instance, TextInstance](bundleType: BundleType, rendererPackageName: String, version: String): DevToolsConfig[Instance, TextInstance] = {
    val __obj = js.Dynamic.literal(bundleType = bundleType.asInstanceOf[js.Any], rendererPackageName = rendererPackageName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevToolsConfig[Instance, TextInstance]]
  }
  @scala.inline
  implicit class DevToolsConfigOps[Self[instance, textinstance] <: DevToolsConfig[instance, textinstance], Instance, TextInstance] (val x: Self[Instance, TextInstance]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Instance, TextInstance] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Instance, TextInstance]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Instance, TextInstance]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Instance, TextInstance]) with Other]
    @scala.inline
    def withBundleType(value: BundleType): Self[Instance, TextInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendererPackageName(value: String): Self[Instance, TextInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self[Instance, TextInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindFiberByHostInstance(value: /* instance */ Instance | TextInstance => Fiber): Self[Instance, TextInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findFiberByHostInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFindFiberByHostInstance: Self[Instance, TextInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findFiberByHostInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInspectorDataForViewTag(value: /* tag */ Double => js.Object): Self[Instance, TextInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInspectorDataForViewTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetInspectorDataForViewTag: Self[Instance, TextInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInspectorDataForViewTag")(js.undefined)
        ret
    }
  }
  
}

