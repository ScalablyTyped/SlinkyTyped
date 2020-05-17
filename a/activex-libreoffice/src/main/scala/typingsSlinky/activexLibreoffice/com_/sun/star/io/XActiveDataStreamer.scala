package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to read and write the corresponding stream.
  *
  * If you want to allow control from outside, also implement the {@link XActiveDataControl} interface.
  */
@js.native
trait XActiveDataStreamer extends XInterface {
  /** @returns the plugged stream. */
  var Stream: XStream = js.native
  /** @returns the plugged stream. */
  def getStream(): XStream = js.native
  /**
    * plugs the input/output stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for a {@link XConnectable} and connect both.
    */
  def setStream(aStream: XStream): Unit = js.native
}

object XActiveDataStreamer {
  @scala.inline
  def apply(
    Stream: XStream,
    acquire: () => Unit,
    getStream: () => XStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setStream: XStream => Unit
  ): XActiveDataStreamer = {
    val __obj = js.Dynamic.literal(Stream = Stream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStream = js.Any.fromFunction0(getStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStream = js.Any.fromFunction1(setStream))
    __obj.asInstanceOf[XActiveDataStreamer]
  }
  @scala.inline
  implicit class XActiveDataStreamerOps[Self <: XActiveDataStreamer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStream(value: XStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStream(value: () => XStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetStream(value: XStream => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStream")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

