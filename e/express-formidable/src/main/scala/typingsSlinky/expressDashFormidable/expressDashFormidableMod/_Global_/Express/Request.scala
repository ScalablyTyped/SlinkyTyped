package typingsSlinky.expressDashFormidable.expressDashFormidableMod._Global_.Express

import typingsSlinky.formidable.formidableMod.Fields
import typingsSlinky.formidable.formidableMod.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var fields: js.UndefOr[Fields] = js.undefined
  var files: js.UndefOr[Files] = js.undefined
}

object Request {
  @scala.inline
  def apply(fields: Fields = null, files: Files = null): Request = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

