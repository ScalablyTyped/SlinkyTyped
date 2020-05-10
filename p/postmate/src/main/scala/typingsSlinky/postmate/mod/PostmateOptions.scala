package typingsSlinky.postmate.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to the Postmate constructor
  */
@js.native
trait PostmateOptions extends js.Object {
  /**
    * An Array to add classes to the iFrame. Useful for styling
    */
  var classListArray: js.UndefOr[js.Array[String]] = js.native
  /**
    * An element to append the iFrame to. Default: document.body
    */
  var container: js.UndefOr[HTMLElement | Null] = js.native
  /**
    * An object literal to represent the default values of the child's model
    */
  var model: js.UndefOr[js.Any] = js.native
  /**
    * A URL to load in the iFrame. The origin of this URL will also be used for securing message transport
    */
  var url: String = js.native
}

object PostmateOptions {
  @scala.inline
  def apply(url: String): PostmateOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostmateOptions]
  }
  @scala.inline
  implicit class PostmateOptionsOps[Self <: PostmateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassListArray(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classListArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassListArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classListArray")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
  }
  
}

