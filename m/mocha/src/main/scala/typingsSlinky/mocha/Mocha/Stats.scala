package typingsSlinky.mocha.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Test statistics
  */
@js.native
trait Stats extends js.Object {
  
  var duration: js.UndefOr[Double] = js.native
  
  var end: js.UndefOr[js.Date] = js.native
  
  var failures: Double = js.native
  
  var passes: Double = js.native
  
  var pending: Double = js.native
  
  var start: js.UndefOr[js.Date] = js.native
  
  var suites: Double = js.native
  
  var tests: Double = js.native
}
object Stats {
  
  @scala.inline
  def apply(failures: Double, passes: Double, pending: Double, suites: Double, tests: Double): Stats = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailures(value: Double): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasses(value: Double): Self = this.set("passes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuites(value: Double): Self = this.set("suites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTests(value: Double): Self = this.set("tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEnd(value: js.Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: js.Date): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
