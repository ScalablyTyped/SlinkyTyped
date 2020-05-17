package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown whenever a method gets a {@link TextContent} as an actual argument when the text content cannot be used for that operation. */
@js.native
trait InvalidTextContentException extends Exception {
  /** contains the interface of the text content that caused the exception. */
  var TextContent: XTextContent = js.native
}

object InvalidTextContentException {
  @scala.inline
  def apply(Context: XInterface, Message: String, TextContent: XTextContent): InvalidTextContentException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], TextContent = TextContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidTextContentException]
  }
  @scala.inline
  implicit class InvalidTextContentExceptionOps[Self <: InvalidTextContentException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextContent(value: XTextContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

