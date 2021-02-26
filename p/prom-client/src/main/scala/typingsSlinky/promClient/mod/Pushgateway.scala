package typingsSlinky.promClient.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.promClient.mod.Pushgateway.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prom-client", "Pushgateway")
@js.native
class Pushgateway protected () extends StObject {
  /**
  	 * @param url Complete url to the Pushgateway. If port is needed append url with :port
  	 * @param options Options
  	 * @param registry Registry
  	 */
  def this(url: String) = this()
  def this(url: String, options: js.Any) = this()
  def this(url: String, options: js.UndefOr[scala.Nothing], registry: Registry) = this()
  def this(url: String, options: js.Any, registry: Registry) = this()
  
  /**
  	 * Delete all metrics for jobName
  	 * @param params Push parameters
  	 * @param callback Callback when request is complete
  	 */
  def delete(
    params: Parameters,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error], 
      /* httpResponse */ js.UndefOr[js.Any], 
      /* body */ js.UndefOr[js.Any], 
      Unit
    ]
  ): Unit = js.native
  
  /**
  	 * Overwrite all metric (using PUT to Pushgateway)
  	 * @param params Push parameters
  	 * @param callback Callback when request is complete
  	 */
  def push(
    params: Parameters,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error], 
      /* httpResponse */ js.UndefOr[js.Any], 
      /* body */ js.UndefOr[js.Any], 
      Unit
    ]
  ): Unit = js.native
  
  /**
  	 * Add metric and overwrite old ones
  	 * @param params Push parameters
  	 * @param callback Callback when request is complete
  	 */
  def pushAdd(
    params: Parameters,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error], 
      /* httpResponse */ js.UndefOr[js.Any], 
      /* body */ js.UndefOr[js.Any], 
      Unit
    ]
  ): Unit = js.native
}
object Pushgateway {
  
  @js.native
  trait Parameters extends StObject {
    
    /**
    		 * Label sets used in the url when making a request to the Pushgateway,
    		 */
    var groupings: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
    		 * Jobname that is pushing the metric
    		 */
    var jobName: String = js.native
  }
  object Parameters {
    
    @scala.inline
    def apply(jobName: String): Parameters = {
      val __obj = js.Dynamic.literal(jobName = jobName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parameters]
    }
    
    @scala.inline
    implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupings(value: StringDictionary[String]): Self = StObject.set(x, "groupings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingsUndefined: Self = StObject.set(x, "groupings", js.undefined)
      
      @scala.inline
      def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    }
  }
}
