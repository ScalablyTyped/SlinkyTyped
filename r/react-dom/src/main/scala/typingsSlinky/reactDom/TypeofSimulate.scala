package typingsSlinky.reactDom

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.reactDom.testUtilsMod.EventSimulator
import typingsSlinky.reactDom.testUtilsMod.SyntheticEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSimulate extends js.Object {
  val abort: EventSimulator = js.native
  val animationEnd: EventSimulator = js.native
  val animationIteration: EventSimulator = js.native
  val animationStart: EventSimulator = js.native
  val blur: EventSimulator = js.native
  val canPlay: EventSimulator = js.native
  val canPlayThrough: EventSimulator = js.native
  val change: EventSimulator = js.native
  val click: EventSimulator = js.native
  val compositionEnd: EventSimulator = js.native
  val compositionStart: EventSimulator = js.native
  val compositionUpdate: EventSimulator = js.native
  val contextMenu: EventSimulator = js.native
  val copy: EventSimulator = js.native
  val cut: EventSimulator = js.native
  val doubleClick: EventSimulator = js.native
  val drag: EventSimulator = js.native
  val dragEnd: EventSimulator = js.native
  val dragEnter: EventSimulator = js.native
  val dragExit: EventSimulator = js.native
  val dragLeave: EventSimulator = js.native
  val dragOver: EventSimulator = js.native
  val dragStart: EventSimulator = js.native
  val drop: EventSimulator = js.native
  val durationChange: EventSimulator = js.native
  val emptied: EventSimulator = js.native
  val encrypted: EventSimulator = js.native
  val ended: EventSimulator = js.native
  val error: EventSimulator = js.native
  val focus: EventSimulator = js.native
  val input: EventSimulator = js.native
  val invalid: EventSimulator = js.native
  val keyDown: EventSimulator = js.native
  val keyPress: EventSimulator = js.native
  val keyUp: EventSimulator = js.native
  val load: EventSimulator = js.native
  val loadStart: EventSimulator = js.native
  val loadedData: EventSimulator = js.native
  val loadedMetadata: EventSimulator = js.native
  val mouseDown: EventSimulator = js.native
  val mouseEnter: EventSimulator = js.native
  val mouseLeave: EventSimulator = js.native
  val mouseMove: EventSimulator = js.native
  val mouseOut: EventSimulator = js.native
  val mouseOver: EventSimulator = js.native
  val mouseUp: EventSimulator = js.native
  val paste: EventSimulator = js.native
  val pause: EventSimulator = js.native
  val play: EventSimulator = js.native
  val playing: EventSimulator = js.native
  val progress: EventSimulator = js.native
  val rateChange: EventSimulator = js.native
  val scroll: EventSimulator = js.native
  val seeked: EventSimulator = js.native
  val seeking: EventSimulator = js.native
  val select: EventSimulator = js.native
  val stalled: EventSimulator = js.native
  val submit: EventSimulator = js.native
  val suspend: EventSimulator = js.native
  val timeUpdate: EventSimulator = js.native
  val touchCancel: EventSimulator = js.native
  val touchEnd: EventSimulator = js.native
  val touchMove: EventSimulator = js.native
  val touchStart: EventSimulator = js.native
  val transitionEnd: EventSimulator = js.native
  val volumeChange: EventSimulator = js.native
  val waiting: EventSimulator = js.native
  val wheel: EventSimulator = js.native
}

object TypeofSimulate {
  @scala.inline
  def apply(
    abort: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    animationEnd: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    animationIteration: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    animationStart: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    blur: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    canPlay: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    canPlayThrough: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    change: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    click: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    compositionEnd: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    compositionStart: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    compositionUpdate: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    contextMenu: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    copy: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    cut: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    doubleClick: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    drag: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragEnd: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragEnter: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragExit: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragLeave: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragOver: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragStart: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    drop: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    durationChange: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    emptied: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    encrypted: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    ended: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    error: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    focus: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    input: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    invalid: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    keyDown: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    keyPress: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    keyUp: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    load: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    loadStart: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    loadedData: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    loadedMetadata: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseDown: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseEnter: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseLeave: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseMove: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseOut: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseOver: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseUp: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    paste: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    pause: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    play: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    playing: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    progress: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    rateChange: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    scroll: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    seeked: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    seeking: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    select: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    stalled: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    submit: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    suspend: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    timeUpdate: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    touchCancel: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    touchEnd: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    touchMove: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    touchStart: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    transitionEnd: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    volumeChange: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    waiting: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    wheel: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
  ): TypeofSimulate = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionEnd = js.Any.fromFunction2(transitionEnd), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
    __obj.asInstanceOf[TypeofSimulate]
  }
  @scala.inline
  implicit class TypeofSimulateOps[Self <: TypeofSimulate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAnimationEnd(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAnimationIteration(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationIteration")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAnimationStart(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBlur(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCanPlay(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPlay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCanPlayThrough(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPlayThrough")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChange(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClick(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCompositionEnd(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositionEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCompositionStart(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositionStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCompositionUpdate(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositionUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContextMenu(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCopy(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCut(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDoubleClick(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrag(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragEnd(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragEnter(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragExit(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragExit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragLeave(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragOver(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragStart(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrop(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDurationChange(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmptied(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptied")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEncrypted(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEnded(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withError(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFocus(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInput(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInvalid(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKeyDown(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKeyPress(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKeyUp(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoad(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoadStart(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoadedData(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoadedMetadata(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedMetadata")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMouseDown(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMouseEnter(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMouseLeave(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMouseMove(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMouseOut(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMouseOver(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMouseUp(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPaste(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPause(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPlay(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPlaying(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withProgress(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRateChange(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScroll(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSeeked(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSeeking(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeking")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelect(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStalled(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stalled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubmit(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSuspend(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTimeUpdate(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTouchCancel(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchCancel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTouchEnd(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTouchMove(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTouchStart(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTransitionEnd(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVolumeChange(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWaiting(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWheel(
      value: (/* element */ Element | ReactComponentClass[js.Any], /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

