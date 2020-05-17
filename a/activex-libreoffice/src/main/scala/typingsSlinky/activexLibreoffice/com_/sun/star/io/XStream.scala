package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers read and write access to the same stream. */
@js.native
trait XStream extends XInterface {
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XInputStream} also closes any {@link XOutputStream} part. */
  val InputStream: XInputStream = js.native
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XOutputStream} also closes the {@link XInputStream} part. */
  val OutputStream: XOutputStream = js.native
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XInputStream} also closes any {@link XOutputStream} part. */
  def getInputStream(): XInputStream = js.native
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XOutputStream} also closes the {@link XInputStream} part. */
  def getOutputStream(): XOutputStream = js.native
}

object XStream {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    OutputStream: XOutputStream,
    acquire: () => Unit,
    getInputStream: () => XInputStream,
    getOutputStream: () => XOutputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStream]
  }
  @scala.inline
  implicit class XStreamOps[Self <: XStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputStream(value: XInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputStream(value: XOutputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetInputStream(value: () => XInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOutputStream(value: () => XOutputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutputStream")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

