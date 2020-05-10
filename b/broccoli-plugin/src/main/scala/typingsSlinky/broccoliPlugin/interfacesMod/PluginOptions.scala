package typingsSlinky.broccoliPlugin.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginOptions extends js.Object {
  /**
    * A descriptive annotation. Useful for debugging, to tell multiple instances of the same plugin apart.
    */
  var annotation: js.UndefOr[String] = js.native
  /**
    * The name of this plugin class. Defaults to this.constructor.name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If true, a cache directory is created automatically and the path is set at cachePath.
    * If false, a cache directory is not created and this.cachePath is undefined. Defaults to true
    */
  var needsCache: js.UndefOr[Boolean] = js.native
  /**
    * If true, the output directory is not automatically emptied between builds.
    */
  var persistentOutput: js.UndefOr[Boolean] = js.native
  /**
    * If true, a change object will be passed to the build method which contains
    * information about which input has changed since the last build. Defaults to false.
    */
  var trackInputChanges: js.UndefOr[Boolean] = js.native
  /**
    * If true, memoization will not be applied and the build method will always be called regardless if the inputNodes have changed. Defaults to false.
    */
  var volatile: js.UndefOr[Boolean] = js.native
}

object PluginOptions {
  @scala.inline
  def apply(): PluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginOptions]
  }
  @scala.inline
  implicit class PluginOptionsOps[Self <: PluginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedsCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedsCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsCache")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackInputChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackInputChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackInputChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackInputChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withVolatile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volatile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolatile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volatile")(js.undefined)
        ret
    }
  }
  
}

