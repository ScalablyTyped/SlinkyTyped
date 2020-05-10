package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeErrorOptions extends js.Object {
  /**
    * An index inside a node's string that should be highlighted as source
    * of error.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Plugin name that created this error. PostCSS will set it automatically.
    */
  var plugin: js.UndefOr[String] = js.native
  /**
    * A word inside a node's string, that should be highlighted as source
    * of error.
    */
  var word: js.UndefOr[String] = js.native
}

object NodeErrorOptions {
  @scala.inline
  def apply(): NodeErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeErrorOptions]
  }
  @scala.inline
  implicit class NodeErrorOptionsOps[Self <: NodeErrorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.undefined)
        ret
    }
    @scala.inline
    def withWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(js.undefined)
        ret
    }
  }
  
}

