package typingsSlinky.domMediacaptureRecord

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var BlobEvent: Instantiable2[
    /* type */ String, 
    /* eventInitDict */ BlobEventInit, 
    typingsSlinky.domMediacaptureRecord.BlobEvent
  ] = js.native
  var MediaRecorder: TypeofMediaRecorder = js.native
  var MediaRecorderErrorEvent: Instantiable2[
    /* type */ String, 
    /* eventInitDict */ MediaRecorderErrorEventInit, 
    typingsSlinky.domMediacaptureRecord.MediaRecorderErrorEvent
  ] = js.native
}

object Window {
  @scala.inline
  def apply(
    BlobEvent: Instantiable2[/* type */ String, /* eventInitDict */ BlobEventInit, BlobEvent],
    MediaRecorder: TypeofMediaRecorder,
    MediaRecorderErrorEvent: Instantiable2[
      /* type */ String, 
      /* eventInitDict */ MediaRecorderErrorEventInit, 
      MediaRecorderErrorEvent
    ]
  ): Window = {
    val __obj = js.Dynamic.literal(BlobEvent = BlobEvent.asInstanceOf[js.Any], MediaRecorder = MediaRecorder.asInstanceOf[js.Any], MediaRecorderErrorEvent = MediaRecorderErrorEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlobEvent(value: Instantiable2[/* type */ String, /* eventInitDict */ BlobEventInit, BlobEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlobEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaRecorder(value: TypeofMediaRecorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaRecorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaRecorderErrorEvent(
      value: Instantiable2[
          /* type */ String, 
          /* eventInitDict */ MediaRecorderErrorEventInit, 
          MediaRecorderErrorEvent
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaRecorderErrorEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

