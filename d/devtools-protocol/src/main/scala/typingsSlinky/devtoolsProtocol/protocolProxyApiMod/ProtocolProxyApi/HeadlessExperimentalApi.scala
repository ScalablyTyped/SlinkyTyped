package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.needsBeginFramesChanged
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeadlessExperimental.NeedsBeginFramesChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadlessExperimentalApi extends StObject {
  
  /**
    * Sends a BeginFrame to the target and returns when the frame was completed. Optionally captures a
    * screenshot from the resulting frame. Requires that the target was created with enabled
    * BeginFrameControl. Designed for use with --run-all-compositor-stages-before-draw, see also
    * https://goo.gl/3zHXhB for more background.
    */
  def beginFrame(params: BeginFrameRequest): js.Promise[BeginFrameResponse] = js.native
  
  /**
    * Disables headless events for the target.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables headless events for the target.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Issued when the target starts or stops needing BeginFrames.
    * Deprecated. Issue beginFrame unconditionally instead and use result from
    * beginFrame to detect whether the frames were suppressed.
    */
  @JSName("on")
  def on_needsBeginFramesChanged(
    event: needsBeginFramesChanged,
    listener: js.Function1[/* params */ NeedsBeginFramesChangedEvent, Unit]
  ): Unit = js.native
}
object HeadlessExperimentalApi {
  
  @scala.inline
  def apply(
    beginFrame: BeginFrameRequest => js.Promise[BeginFrameResponse],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    on: (needsBeginFramesChanged, js.Function1[/* params */ NeedsBeginFramesChangedEvent, Unit]) => Unit
  ): HeadlessExperimentalApi = {
    val __obj = js.Dynamic.literal(beginFrame = js.Any.fromFunction1(beginFrame), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[HeadlessExperimentalApi]
  }
  
  @scala.inline
  implicit class HeadlessExperimentalApiMutableBuilder[Self <: HeadlessExperimentalApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginFrame(value: BeginFrameRequest => js.Promise[BeginFrameResponse]): Self = StObject.set(x, "beginFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(
      value: (needsBeginFramesChanged, js.Function1[/* params */ NeedsBeginFramesChangedEvent, Unit]) => Unit
    ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
