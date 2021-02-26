package typingsSlinky.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cpuMod {
  
  @JSImport("node-os-utils/lib/cpu", JSImport.Default)
  @js.native
  class default () extends Cpu
  
  @js.native
  trait Cpu extends StObject {
    
    def average(): CpuAverageInfo = js.native
    
    def count(): Double = js.native
    
    def free(): js.Promise[Double] = js.native
    def free(interval: Double): js.Promise[Double] = js.native
    
    def loadavg(): js.Array[Double] = js.native
    
    def loadavgTime(time: String): Double = js.native
    def loadavgTime(time: Double): Double = js.native
    
    def model(): String = js.native
    
    def usage(): js.Promise[Double] = js.native
    def usage(interval: Double): js.Promise[Double] = js.native
  }
  
  @js.native
  trait CpuAverageInfo extends StObject {
    
    var avgIdle: Double = js.native
    
    var avgTotal: Double = js.native
    
    var totalIdle: Double = js.native
    
    var totalTick: Double = js.native
  }
  object CpuAverageInfo {
    
    @scala.inline
    def apply(avgIdle: Double, avgTotal: Double, totalIdle: Double, totalTick: Double): CpuAverageInfo = {
      val __obj = js.Dynamic.literal(avgIdle = avgIdle.asInstanceOf[js.Any], avgTotal = avgTotal.asInstanceOf[js.Any], totalIdle = totalIdle.asInstanceOf[js.Any], totalTick = totalTick.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpuAverageInfo]
    }
    
    @scala.inline
    implicit class CpuAverageInfoMutableBuilder[Self <: CpuAverageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvgIdle(value: Double): Self = StObject.set(x, "avgIdle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvgTotal(value: Double): Self = StObject.set(x, "avgTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalIdle(value: Double): Self = StObject.set(x, "totalIdle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalTick(value: Double): Self = StObject.set(x, "totalTick", value.asInstanceOf[js.Any])
    }
  }
}
