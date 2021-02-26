package typingsSlinky.mtaH5Analysis

import typingsSlinky.mtaH5Analysis.mtaH5AnalysisNumbers.`0`
import typingsSlinky.mtaH5Analysis.mtaH5AnalysisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoReport extends StObject {
    
    // 如果开启自定义事件，此项目为必填，否则不填
    var autoReport: js.UndefOr[`0` | `1`] = js.native
    
    // 必填，统计用的appid
    var cid: js.UndefOr[String] = js.native
    
    // 是否开启性能监控
    var ignoreParams: js.UndefOr[String] = js.native
    
    // url参数是否进入url统计
    var performanceMonitor: js.UndefOr[`0` | `1`] = js.native
    
    // 是否开启自动上报(1:init完成则上报一次,0:使用pgv方法才上报)
    var senseHash: js.UndefOr[`0` | `1`] = js.native
    
    // hash锚点是否进入url统计
    var senseQuery: js.UndefOr[`0` | `1`] = js.native
    
    var sid: String = js.native
  }
  object AutoReport {
    
    @scala.inline
    def apply(sid: String): AutoReport = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoReport]
    }
    
    @scala.inline
    implicit class AutoReportMutableBuilder[Self <: AutoReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoReport(value: `0` | `1`): Self = StObject.set(x, "autoReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoReportUndefined: Self = StObject.set(x, "autoReport", js.undefined)
      
      @scala.inline
      def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      @scala.inline
      def setIgnoreParams(value: String): Self = StObject.set(x, "ignoreParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreParamsUndefined: Self = StObject.set(x, "ignoreParams", js.undefined)
      
      @scala.inline
      def setPerformanceMonitor(value: `0` | `1`): Self = StObject.set(x, "performanceMonitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceMonitorUndefined: Self = StObject.set(x, "performanceMonitor", js.undefined)
      
      @scala.inline
      def setSenseHash(value: `0` | `1`): Self = StObject.set(x, "senseHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenseHashUndefined: Self = StObject.set(x, "senseHash", js.undefined)
      
      @scala.inline
      def setSenseQuery(value: `0` | `1`): Self = StObject.set(x, "senseQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenseQueryUndefined: Self = StObject.set(x, "senseQuery", js.undefined)
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
}
