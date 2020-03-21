package typingsSlinky.domMediacaptureRecord

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var BlobEvent: Instantiable2[
    /* type */ String, 
    /* eventInitDict */ BlobEventInit, 
    typingsSlinky.domMediacaptureRecord.BlobEvent
  ]
  var MediaRecorder: TypeofMediaRecorder
  var MediaRecorderErrorEvent: Instantiable2[
    /* type */ String, 
    /* eventInitDict */ MediaRecorderErrorEventInit, 
    typingsSlinky.domMediacaptureRecord.MediaRecorderErrorEvent
  ]
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
}

