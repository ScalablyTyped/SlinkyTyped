package typingsSlinky.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Score extends StObject {
  
  /**
    *   Loop playback of the score.
    */
  def loop(): Unit = js.native
  
  /**
    *   Stop looping playback of the score. If it is
    *   currently playing, this will go into effect after
    *   the current round of playback completes.
    */
  def noLoop(): Unit = js.native
  
  /**
    *   Pause playback of the score.
    */
  def pause(): Unit = js.native
  
  /**
    *   Set the tempo for all parts in the score
    *   @param BPM Beats Per Minute
    *   @param rampTime Seconds from now
    */
  def setBPM(BPM: Double, rampTime: Double): Unit = js.native
  
  /**
    *   Start playback of the score.
    */
  def start(): Unit = js.native
  
  /**
    *   Stop playback of the score.
    */
  def stop(): Unit = js.native
}
object Score {
  
  @scala.inline
  def apply(
    loop: () => Unit,
    noLoop: () => Unit,
    pause: () => Unit,
    setBPM: (Double, Double) => Unit,
    start: () => Unit,
    stop: () => Unit
  ): Score = {
    val __obj = js.Dynamic.literal(loop = js.Any.fromFunction0(loop), noLoop = js.Any.fromFunction0(noLoop), pause = js.Any.fromFunction0(pause), setBPM = js.Any.fromFunction2(setBPM), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Score]
  }
  
  @scala.inline
  implicit class ScoreMutableBuilder[Self <: Score] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoop(value: () => Unit): Self = StObject.set(x, "loop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNoLoop(value: () => Unit): Self = StObject.set(x, "noLoop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBPM(value: (Double, Double) => Unit): Self = StObject.set(x, "setBPM", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
