package typingsSlinky.framesync

import typingsSlinky.framesync.anon.keyinStepIdStep
import typingsSlinky.framesync.anon.keyinStepIdprocessProcess
import typingsSlinky.framesync.anon.keyinStepIdprocessProcessPostRender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait FrameData extends StObject {
    
    var delta: Double = js.native
    
    var timestamp: Double = js.native
  }
  object FrameData {
    
    @scala.inline
    def apply(delta: Double, timestamp: Double): FrameData = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameData]
    }
    
    @scala.inline
    implicit class FrameDataMutableBuilder[Self <: FrameData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type Process = js.Function1[/* data */ FrameData, Unit]
  
  @js.native
  trait Step extends StObject {
    
    def cancel(process: Process): Unit = js.native
    
    def process(frame: FrameData): Unit = js.native
    
    def schedule(process: Process): Unit = js.native
    def schedule(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Unit = js.native
    def schedule(process: Process, keepAlive: Boolean): Unit = js.native
    def schedule(process: Process, keepAlive: Boolean, immediate: Boolean): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.framesync.framesyncStrings.read
    - typingsSlinky.framesync.framesyncStrings.update
    - typingsSlinky.framesync.framesyncStrings.preRender
    - typingsSlinky.framesync.framesyncStrings.render
    - typingsSlinky.framesync.framesyncStrings.postRender
  */
  trait StepId extends StObject
  object StepId {
    
    @scala.inline
    def postRender: typingsSlinky.framesync.framesyncStrings.postRender = "postRender".asInstanceOf[typingsSlinky.framesync.framesyncStrings.postRender]
    
    @scala.inline
    def preRender: typingsSlinky.framesync.framesyncStrings.preRender = "preRender".asInstanceOf[typingsSlinky.framesync.framesyncStrings.preRender]
    
    @scala.inline
    def read: typingsSlinky.framesync.framesyncStrings.read = "read".asInstanceOf[typingsSlinky.framesync.framesyncStrings.read]
    
    @scala.inline
    def render: typingsSlinky.framesync.framesyncStrings.render = "render".asInstanceOf[typingsSlinky.framesync.framesyncStrings.render]
    
    @scala.inline
    def update: typingsSlinky.framesync.framesyncStrings.update = "update".asInstanceOf[typingsSlinky.framesync.framesyncStrings.update]
  }
  
  @js.native
  trait SyncApi extends StObject {
    
    var cancelSync: keyinStepIdprocessProcessPostRender = js.native
    
    var steps: keyinStepIdStep = js.native
    
    var sync: keyinStepIdprocessProcess = js.native
  }
  object SyncApi {
    
    @scala.inline
    def apply(
      cancelSync: keyinStepIdprocessProcessPostRender,
      steps: keyinStepIdStep,
      sync: keyinStepIdprocessProcess
    ): SyncApi = {
      val __obj = js.Dynamic.literal(cancelSync = cancelSync.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncApi]
    }
    
    @scala.inline
    implicit class SyncApiMutableBuilder[Self <: SyncApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelSync(value: keyinStepIdprocessProcessPostRender): Self = StObject.set(x, "cancelSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteps(value: keyinStepIdStep): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSync(value: keyinStepIdprocessProcess): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
}
