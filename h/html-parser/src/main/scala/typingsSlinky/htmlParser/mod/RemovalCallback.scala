package typingsSlinky.htmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovalCallback extends js.Object {
  var attributes: Callback | js.Array[String] = js.native
  var comments: Callback | Boolean = js.native
  var docTypes: Callback | Boolean = js.native
  var elements: Callback | js.Array[String] = js.native
}

object RemovalCallback {
  @scala.inline
  def apply(
    attributes: Callback | js.Array[String],
    comments: Callback | Boolean,
    docTypes: Callback | Boolean,
    elements: Callback | js.Array[String]
  ): RemovalCallback = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], docTypes = docTypes.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovalCallback]
  }
  @scala.inline
  implicit class RemovalCallbackOps[Self <: RemovalCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributesFunction1(value: /* arg */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttributes(value: Callback | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentsFunction1(value: /* arg */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComments(value: Callback | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocTypesFunction1(value: /* arg */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docTypes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDocTypes(value: Callback | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementsFunction1(value: /* arg */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElements(value: Callback | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

