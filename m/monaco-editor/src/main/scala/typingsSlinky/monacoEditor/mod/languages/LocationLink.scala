package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IRange
import typingsSlinky.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationLink extends js.Object {
  /**
    * A range to select where this link originates from.
    */
  var originSelectionRange: js.UndefOr[IRange] = js.native
  /**
    * The full range this link points to.
    */
  var range: IRange = js.native
  /**
    * A range to select this link points to. Must be contained
    * in `LocationLink.range`.
    */
  var targetSelectionRange: js.UndefOr[IRange] = js.native
  /**
    * The target uri this link points to.
    */
  var uri: Uri = js.native
}

object LocationLink {
  @scala.inline
  def apply(range: IRange, uri: Uri): LocationLink = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationLink]
  }
  @scala.inline
  implicit class LocationLinkOps[Self <: LocationLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: IRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginSelectionRange(value: IRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originSelectionRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginSelectionRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originSelectionRange")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSelectionRange(value: IRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelectionRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSelectionRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelectionRange")(js.undefined)
        ret
    }
  }
  
}

