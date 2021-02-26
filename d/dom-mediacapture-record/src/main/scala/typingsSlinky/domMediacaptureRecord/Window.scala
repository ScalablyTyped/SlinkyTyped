package typingsSlinky.domMediacaptureRecord

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.mediastream.MediaStream
import typingsSlinky.domMediacaptureRecord.anon.TypeofMediaRecorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var BlobEvent: Instantiable2[
    /* type */ String, 
    /* eventInitDict */ BlobEventInit, 
    typingsSlinky.domMediacaptureRecord.BlobEvent
  ] = js.native
  
  var MediaRecorder: TypeofMediaRecorder with (Instantiable2[
    /* stream */ MediaStream, 
    /* options */ js.UndefOr[MediaRecorderOptions], 
    typingsSlinky.domMediacaptureRecord.MediaRecorder
  ]) = js.native
  
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
    MediaRecorder: TypeofMediaRecorder with (Instantiable2[
      /* stream */ MediaStream, 
      /* options */ js.UndefOr[MediaRecorderOptions], 
      MediaRecorder
    ]),
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
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobEvent(value: Instantiable2[/* type */ String, /* eventInitDict */ BlobEventInit, BlobEvent]): Self = StObject.set(x, "BlobEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaRecorder(
      value: TypeofMediaRecorder with (Instantiable2[
          /* stream */ MediaStream, 
          /* options */ js.UndefOr[MediaRecorderOptions], 
          MediaRecorder
        ])
    ): Self = StObject.set(x, "MediaRecorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaRecorderErrorEvent(
      value: Instantiable2[
          /* type */ String, 
          /* eventInitDict */ MediaRecorderErrorEventInit, 
          MediaRecorderErrorEvent
        ]
    ): Self = StObject.set(x, "MediaRecorderErrorEvent", value.asInstanceOf[js.Any])
  }
}
