package typingsSlinky.phaser.global.spine

import typingsSlinky.phaser.spine.AnimationStateListener2
import typingsSlinky.phaser.spine.Timeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.AnimationState")
@js.native
class AnimationState protected ()
  extends typingsSlinky.phaser.spine.AnimationState {
  def this(data: typingsSlinky.phaser.spine.AnimationStateData) = this()
  /* CompleteClass */
  override var animationsChanged: Boolean = js.native
  /* CompleteClass */
  override var data: typingsSlinky.phaser.spine.AnimationStateData = js.native
  /* CompleteClass */
  override var events: js.Array[typingsSlinky.phaser.spine.Event] = js.native
  /* CompleteClass */
  override var listeners: js.Array[AnimationStateListener2] = js.native
  /* CompleteClass */
  override var propertyIDs: typingsSlinky.phaser.spine.IntSet = js.native
  /* CompleteClass */
  override var queue: typingsSlinky.phaser.spine.EventQueue = js.native
  /* CompleteClass */
  override var timeScale: Double = js.native
  /* CompleteClass */
  override var trackEntryPool: typingsSlinky.phaser.spine.Pool[typingsSlinky.phaser.spine.TrackEntry] = js.native
  /* CompleteClass */
  override var tracks: js.Array[typingsSlinky.phaser.spine.TrackEntry] = js.native
  /* CompleteClass */
  override def _animationsChanged(): Unit = js.native
  /* CompleteClass */
  override def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): typingsSlinky.phaser.spine.TrackEntry = js.native
  /* CompleteClass */
  override def addAnimationWith(trackIndex: Double, animation: typingsSlinky.phaser.spine.Animation, loop: Boolean, delay: Double): typingsSlinky.phaser.spine.TrackEntry = js.native
  /* CompleteClass */
  override def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): typingsSlinky.phaser.spine.TrackEntry = js.native
  /* CompleteClass */
  override def addListener(listener: AnimationStateListener2): Unit = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(skeleton: typingsSlinky.phaser.spine.Skeleton): Boolean = js.native
  /* CompleteClass */
  override def applyMixingFrom(
    to: typingsSlinky.phaser.spine.TrackEntry,
    skeleton: typingsSlinky.phaser.spine.Skeleton,
    blend: typingsSlinky.phaser.spine.MixBlend
  ): Double = js.native
  /* CompleteClass */
  override def applyRotateTimeline(
    timeline: Timeline,
    skeleton: typingsSlinky.phaser.spine.Skeleton,
    time: Double,
    alpha: Double,
    blend: typingsSlinky.phaser.spine.MixBlend,
    timelinesRotation: js.Array[Double],
    i: Double,
    firstFrame: Boolean
  ): Unit = js.native
  /* CompleteClass */
  override def clearListenerNotifications(): Unit = js.native
  /* CompleteClass */
  override def clearListeners(): Unit = js.native
  /* CompleteClass */
  override def clearTrack(trackIndex: Double): Unit = js.native
  /* CompleteClass */
  override def clearTracks(): Unit = js.native
  /* CompleteClass */
  override def computeHold(entry: typingsSlinky.phaser.spine.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def computeNotLast(entry: typingsSlinky.phaser.spine.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def disposeNext(entry: typingsSlinky.phaser.spine.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def expandToIndex(index: Double): typingsSlinky.phaser.spine.TrackEntry = js.native
  /* CompleteClass */
  override def getCurrent(trackIndex: Double): typingsSlinky.phaser.spine.TrackEntry = js.native
  /* CompleteClass */
  override def queueEvents(entry: typingsSlinky.phaser.spine.TrackEntry, animationTime: Double): Unit = js.native
  /* CompleteClass */
  override def removeListener(listener: AnimationStateListener2): Unit = js.native
  /* CompleteClass */
  override def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): typingsSlinky.phaser.spine.TrackEntry = js.native
  /* CompleteClass */
  override def setAnimationWith(trackIndex: Double, animation: typingsSlinky.phaser.spine.Animation, loop: Boolean): typingsSlinky.phaser.spine.TrackEntry = js.native
  /* CompleteClass */
  override def setCurrent(index: Double, current: typingsSlinky.phaser.spine.TrackEntry, interrupt: Boolean): Unit = js.native
  /* CompleteClass */
  override def setEmptyAnimation(trackIndex: Double, mixDuration: Double): typingsSlinky.phaser.spine.TrackEntry = js.native
  /* CompleteClass */
  override def setEmptyAnimations(mixDuration: Double): Unit = js.native
  /* CompleteClass */
  override def trackEntry(
    trackIndex: Double,
    animation: typingsSlinky.phaser.spine.Animation,
    loop: Boolean,
    last: typingsSlinky.phaser.spine.TrackEntry
  ): typingsSlinky.phaser.spine.TrackEntry = js.native
  /* CompleteClass */
  override def update(delta: Double): Unit = js.native
  /* CompleteClass */
  override def updateMixingFrom(to: typingsSlinky.phaser.spine.TrackEntry, delta: Double): Boolean = js.native
}

/* static members */
@JSGlobal("spine.AnimationState")
@js.native
object AnimationState extends js.Object {
  var FIRST: Double = js.native
  var HOLD: Double = js.native
  var HOLD_MIX: Double = js.native
  var NOT_LAST: Double = js.native
  var SUBSEQUENT: Double = js.native
  var emptyAnimation: typingsSlinky.phaser.spine.Animation = js.native
}

