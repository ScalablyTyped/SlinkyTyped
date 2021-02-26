package typingsSlinky.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterMetrics extends StObject {
  
  /** The HDFS metrics. */
  var hdfsMetrics: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterMetrics with TopLevel[js.Any]
  ] = js.native
  
  /** The YARN metrics. */
  var yarnMetrics: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterMetrics with TopLevel[js.Any]
  ] = js.native
}
object ClusterMetrics {
  
  @scala.inline
  def apply(): ClusterMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMetrics]
  }
  
  @scala.inline
  implicit class ClusterMetricsMutableBuilder[Self <: ClusterMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHdfsMetrics(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterMetrics with TopLevel[js.Any]
    ): Self = StObject.set(x, "hdfsMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHdfsMetricsUndefined: Self = StObject.set(x, "hdfsMetrics", js.undefined)
    
    @scala.inline
    def setYarnMetrics(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterMetrics with TopLevel[js.Any]
    ): Self = StObject.set(x, "yarnMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYarnMetricsUndefined: Self = StObject.set(x, "yarnMetrics", js.undefined)
  }
}
