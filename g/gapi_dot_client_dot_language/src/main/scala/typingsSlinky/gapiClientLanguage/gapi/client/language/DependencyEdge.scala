package typingsSlinky.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyEdge extends js.Object {
  /**
    * Represents the head of this token in the dependency tree.
    * This is the index of the token which has an arc going to this token.
    * The index is the position of the token in the array of tokens returned
    * by the API method. If this token is a root token, then the
    * `head_token_index` is its own index.
    */
  var headTokenIndex: js.UndefOr[Double] = js.native
  /** The parse label for the token. */
  var label: js.UndefOr[String] = js.native
}

object DependencyEdge {
  @scala.inline
  def apply(): DependencyEdge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DependencyEdge]
  }
  @scala.inline
  implicit class DependencyEdgeOps[Self <: DependencyEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeadTokenIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headTokenIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadTokenIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headTokenIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

