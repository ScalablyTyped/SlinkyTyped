package typingsSlinky.fastq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait queue extends js.Object {
  var concurrency: Double = js.native
  def drain(): js.Any = js.native
  def empty(): Unit = js.native
  def idle(): Boolean = js.native
  def kill(): js.Any = js.native
  def killAndDrain(): js.Any = js.native
  def length(): Double = js.native
  def pause(): js.Any = js.native
  def push(task: js.Any, done: done): Unit = js.native
  def resume(): js.Any = js.native
  def saturated(): Unit = js.native
  def unshift(task: js.Any, done: done): Unit = js.native
}

object queue {
  @scala.inline
  def apply(
    concurrency: Double,
    drain: () => js.Any,
    empty: () => Unit,
    idle: () => Boolean,
    kill: () => js.Any,
    killAndDrain: () => js.Any,
    length: () => Double,
    pause: () => js.Any,
    push: (js.Any, done) => Unit,
    resume: () => js.Any,
    saturated: () => Unit,
    unshift: (js.Any, done) => Unit
  ): queue = {
    val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any], drain = js.Any.fromFunction0(drain), empty = js.Any.fromFunction0(empty), idle = js.Any.fromFunction0(idle), kill = js.Any.fromFunction0(kill), killAndDrain = js.Any.fromFunction0(killAndDrain), length = js.Any.fromFunction0(length), pause = js.Any.fromFunction0(pause), push = js.Any.fromFunction2(push), resume = js.Any.fromFunction0(resume), saturated = js.Any.fromFunction0(saturated), unshift = js.Any.fromFunction2(unshift))
    __obj.asInstanceOf[queue]
  }
  @scala.inline
  implicit class queueOps[Self <: queue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrain(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drain")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmpty(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIdle(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKill(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKillAndDrain(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killAndDrain")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPause(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: (js.Any, done) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResume(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSaturated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnshift(value: (js.Any, done) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

