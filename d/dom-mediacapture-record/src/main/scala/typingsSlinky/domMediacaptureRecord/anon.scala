package typingsSlinky.domMediacaptureRecord

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait TypeofMediaRecorder
    extends Instantiable1[/* stream */ MediaStream, MediaRecorder]
       with Instantiable2[/* stream */ MediaStream, /* options */ MediaRecorderOptions, MediaRecorder] {
    
    def isTypeSupported(`type`: String): Boolean = js.native
  }
}
