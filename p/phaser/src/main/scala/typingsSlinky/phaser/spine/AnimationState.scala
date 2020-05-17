package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationState extends js.Object {
  var animationsChanged: Boolean = js.native
  var data: AnimationStateData = js.native
  var events: js.Array[Event] = js.native
  var listeners: js.Array[AnimationStateListener2] = js.native
  var propertyIDs: IntSet = js.native
  var queue: EventQueue = js.native
  var timeScale: Double = js.native
  var trackEntryPool: Pool[TrackEntry] = js.native
  var tracks: js.Array[TrackEntry] = js.native
  def _animationsChanged(): Unit = js.native
  def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): TrackEntry = js.native
  def addAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean, delay: Double): TrackEntry = js.native
  def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): TrackEntry = js.native
  def addListener(listener: AnimationStateListener2): Unit = js.native
  @JSName("apply")
  def apply(skeleton: Skeleton): Boolean = js.native
  def applyMixingFrom(to: TrackEntry, skeleton: Skeleton, blend: MixBlend): Double = js.native
  def applyRotateTimeline(
    timeline: Timeline,
    skeleton: Skeleton,
    time: Double,
    alpha: Double,
    blend: MixBlend,
    timelinesRotation: js.Array[Double],
    i: Double,
    firstFrame: Boolean
  ): Unit = js.native
  def clearListenerNotifications(): Unit = js.native
  def clearListeners(): Unit = js.native
  def clearTrack(trackIndex: Double): Unit = js.native
  def clearTracks(): Unit = js.native
  def computeHold(entry: TrackEntry): Unit = js.native
  def computeNotLast(entry: TrackEntry): Unit = js.native
  def disposeNext(entry: TrackEntry): Unit = js.native
  def expandToIndex(index: Double): TrackEntry = js.native
  def getCurrent(trackIndex: Double): TrackEntry = js.native
  def queueEvents(entry: TrackEntry, animationTime: Double): Unit = js.native
  def removeListener(listener: AnimationStateListener2): Unit = js.native
  def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): TrackEntry = js.native
  def setAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean): TrackEntry = js.native
  def setCurrent(index: Double, current: TrackEntry, interrupt: Boolean): Unit = js.native
  def setEmptyAnimation(trackIndex: Double, mixDuration: Double): TrackEntry = js.native
  def setEmptyAnimations(mixDuration: Double): Unit = js.native
  def trackEntry(trackIndex: Double, animation: Animation, loop: Boolean, last: TrackEntry): TrackEntry = js.native
  def update(delta: Double): Unit = js.native
  def updateMixingFrom(to: TrackEntry, delta: Double): Boolean = js.native
}

object AnimationState {
  @scala.inline
  def apply(
    _animationsChanged: () => Unit,
    addAnimation: (Double, String, Boolean, Double) => TrackEntry,
    addAnimationWith: (Double, Animation, Boolean, Double) => TrackEntry,
    addEmptyAnimation: (Double, Double, Double) => TrackEntry,
    addListener: AnimationStateListener2 => Unit,
    animationsChanged: Boolean,
    apply: Skeleton => Boolean,
    applyMixingFrom: (TrackEntry, Skeleton, MixBlend) => Double,
    applyRotateTimeline: (Timeline, Skeleton, Double, Double, MixBlend, js.Array[Double], Double, Boolean) => Unit,
    clearListenerNotifications: () => Unit,
    clearListeners: () => Unit,
    clearTrack: Double => Unit,
    clearTracks: () => Unit,
    computeHold: TrackEntry => Unit,
    computeNotLast: TrackEntry => Unit,
    data: AnimationStateData,
    disposeNext: TrackEntry => Unit,
    events: js.Array[Event],
    expandToIndex: Double => TrackEntry,
    getCurrent: Double => TrackEntry,
    listeners: js.Array[AnimationStateListener2],
    propertyIDs: IntSet,
    queue: EventQueue,
    queueEvents: (TrackEntry, Double) => Unit,
    removeListener: AnimationStateListener2 => Unit,
    setAnimation: (Double, String, Boolean) => TrackEntry,
    setAnimationWith: (Double, Animation, Boolean) => TrackEntry,
    setCurrent: (Double, TrackEntry, Boolean) => Unit,
    setEmptyAnimation: (Double, Double) => TrackEntry,
    setEmptyAnimations: Double => Unit,
    timeScale: Double,
    trackEntry: (Double, Animation, Boolean, TrackEntry) => TrackEntry,
    trackEntryPool: Pool[TrackEntry],
    tracks: js.Array[TrackEntry],
    update: Double => Unit,
    updateMixingFrom: (TrackEntry, Double) => Boolean
  ): AnimationState = {
    val __obj = js.Dynamic.literal(_animationsChanged = js.Any.fromFunction0(_animationsChanged), addAnimation = js.Any.fromFunction4(addAnimation), addAnimationWith = js.Any.fromFunction4(addAnimationWith), addEmptyAnimation = js.Any.fromFunction3(addEmptyAnimation), addListener = js.Any.fromFunction1(addListener), animationsChanged = animationsChanged.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), applyMixingFrom = js.Any.fromFunction3(applyMixingFrom), applyRotateTimeline = js.Any.fromFunction8(applyRotateTimeline), clearListenerNotifications = js.Any.fromFunction0(clearListenerNotifications), clearListeners = js.Any.fromFunction0(clearListeners), clearTrack = js.Any.fromFunction1(clearTrack), clearTracks = js.Any.fromFunction0(clearTracks), computeHold = js.Any.fromFunction1(computeHold), computeNotLast = js.Any.fromFunction1(computeNotLast), data = data.asInstanceOf[js.Any], disposeNext = js.Any.fromFunction1(disposeNext), events = events.asInstanceOf[js.Any], expandToIndex = js.Any.fromFunction1(expandToIndex), getCurrent = js.Any.fromFunction1(getCurrent), listeners = listeners.asInstanceOf[js.Any], propertyIDs = propertyIDs.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueEvents = js.Any.fromFunction2(queueEvents), removeListener = js.Any.fromFunction1(removeListener), setAnimation = js.Any.fromFunction3(setAnimation), setAnimationWith = js.Any.fromFunction3(setAnimationWith), setCurrent = js.Any.fromFunction3(setCurrent), setEmptyAnimation = js.Any.fromFunction2(setEmptyAnimation), setEmptyAnimations = js.Any.fromFunction1(setEmptyAnimations), timeScale = timeScale.asInstanceOf[js.Any], trackEntry = js.Any.fromFunction4(trackEntry), trackEntryPool = trackEntryPool.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), updateMixingFrom = js.Any.fromFunction2(updateMixingFrom))
    __obj.asInstanceOf[AnimationState]
  }
  @scala.inline
  implicit class AnimationStateOps[Self <: AnimationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_animationsChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_animationsChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddAnimation(value: (Double, String, Boolean, Double) => TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAnimation")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAddAnimationWith(value: (Double, Animation, Boolean, Double) => TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAnimationWith")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAddEmptyAnimation(value: (Double, Double, Double) => TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEmptyAnimation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddListener(value: AnimationStateListener2 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnimationsChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApply(value: Skeleton => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplyMixingFrom(value: (TrackEntry, Skeleton, MixBlend) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMixingFrom")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withApplyRotateTimeline(value: (Timeline, Skeleton, Double, Double, MixBlend, js.Array[Double], Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyRotateTimeline")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withClearListenerNotifications(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearListenerNotifications")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearTrack(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTrack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearTracks(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTracks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeHold(value: TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeHold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComputeNotLast(value: TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeNotLast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withData(value: AnimationStateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisposeNext(value: TrackEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandToIndex(value: Double => TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandToIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCurrent(value: Double => TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListeners(value: js.Array[AnimationStateListener2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyIDs(value: IntSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: EventQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueEvents(value: (TrackEntry, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueEvents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveListener(value: AnimationStateListener2 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAnimation(value: (Double, String, Boolean) => TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetAnimationWith(value: (Double, Animation, Boolean) => TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimationWith")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetCurrent(value: (Double, TrackEntry, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetEmptyAnimation(value: (Double, Double) => TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEmptyAnimation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetEmptyAnimations(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEmptyAnimations")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackEntry(value: (Double, Animation, Boolean, TrackEntry) => TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackEntry")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTrackEntryPool(value: Pool[TrackEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackEntryPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracks(value: js.Array[TrackEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateMixingFrom(value: (TrackEntry, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMixingFrom")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

