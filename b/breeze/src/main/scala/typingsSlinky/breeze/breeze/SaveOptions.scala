package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveOptions extends js.Object {
  var allowConcurrentSaves: Boolean = js.native
  var dataService: DataService = js.native
  var resourceName: String = js.native
  var tag: js.Object = js.native
  def setAsDefault(): SaveOptions = js.native
  def using(config: SaveOptionsConfiguration): SaveOptions = js.native
}

object SaveOptions {
  @scala.inline
  def apply(
    allowConcurrentSaves: Boolean,
    dataService: DataService,
    resourceName: String,
    setAsDefault: () => SaveOptions,
    tag: js.Object,
    using: SaveOptionsConfiguration => SaveOptions
  ): SaveOptions = {
    val __obj = js.Dynamic.literal(allowConcurrentSaves = allowConcurrentSaves.asInstanceOf[js.Any], dataService = dataService.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], setAsDefault = js.Any.fromFunction0(setAsDefault), tag = tag.asInstanceOf[js.Any], using = js.Any.fromFunction1(using))
    __obj.asInstanceOf[SaveOptions]
  }
  @scala.inline
  implicit class SaveOptionsOps[Self <: SaveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowConcurrentSaves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowConcurrentSaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataService(value: DataService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAsDefault(value: () => SaveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTag(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsing(value: SaveOptionsConfiguration => SaveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

