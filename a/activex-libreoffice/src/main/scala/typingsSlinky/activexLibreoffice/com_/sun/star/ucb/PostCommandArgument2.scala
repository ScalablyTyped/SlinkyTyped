package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for the command "post".
  * @see XCommandProcessor
  * @see WebDAVDocumentContent
  */
@js.native
trait PostCommandArgument2 extends PostCommandArgument {
  /** The media type (mime type) for the data to post. */
  var MediaType: String = js.native
  /** The URL of the referrer. */
  var Referer: String = js.native
}

object PostCommandArgument2 {
  @scala.inline
  def apply(MediaType: String, Referer: String, Sink: XInterface, Source: XInputStream): PostCommandArgument2 = {
    val __obj = js.Dynamic.literal(MediaType = MediaType.asInstanceOf[js.Any], Referer = Referer.asInstanceOf[js.Any], Sink = Sink.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommandArgument2]
  }
  @scala.inline
  implicit class PostCommandArgument2Ops[Self <: PostCommandArgument2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Referer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

