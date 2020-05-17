package typingsSlinky.cypress.anon

import typingsSlinky.cypress.cypressMod.dateTimeISO
import typingsSlinky.cypress.cypressMod.ms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failures extends js.Object {
  var failures: Double = js.native
  var passes: Double = js.native
  var pending: Double = js.native
  var skipped: Double = js.native
  var suites: Double = js.native
  var tests: Double = js.native
  var wallClockDuration: ms = js.native
  var wallClockEndedAt: dateTimeISO = js.native
  var wallClockStartedAt: dateTimeISO = js.native
}

object Failures {
  @scala.inline
  def apply(
    failures: Double,
    passes: Double,
    pending: Double,
    skipped: Double,
    suites: Double,
    tests: Double,
    wallClockDuration: ms,
    wallClockEndedAt: dateTimeISO,
    wallClockStartedAt: dateTimeISO
  ): Failures = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], wallClockDuration = wallClockDuration.asInstanceOf[js.Any], wallClockEndedAt = wallClockEndedAt.asInstanceOf[js.Any], wallClockStartedAt = wallClockStartedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failures]
  }
  @scala.inline
  implicit class FailuresOps[Self <: Failures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuites(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWallClockDuration(value: ms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallClockDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWallClockEndedAt(value: dateTimeISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallClockEndedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWallClockStartedAt(value: dateTimeISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallClockStartedAt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

