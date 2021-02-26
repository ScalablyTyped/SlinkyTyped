package typingsSlinky.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BqmlTrainingRunTrainingOptions extends StObject {
  
  var earlyStop: js.UndefOr[Boolean] = js.native
  
  var l1Reg: js.UndefOr[Double] = js.native
  
  var l2Reg: js.UndefOr[Double] = js.native
  
  var learnRate: js.UndefOr[Double] = js.native
  
  var learnRateStrategy: js.UndefOr[String] = js.native
  
  var lineSearchInitLearnRate: js.UndefOr[Double] = js.native
  
  var maxIteration: js.UndefOr[String] = js.native
  
  var minRelProgress: js.UndefOr[Double] = js.native
  
  var warmStart: js.UndefOr[Boolean] = js.native
}
object BqmlTrainingRunTrainingOptions {
  
  @scala.inline
  def apply(): BqmlTrainingRunTrainingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlTrainingRunTrainingOptions]
  }
  
  @scala.inline
  implicit class BqmlTrainingRunTrainingOptionsMutableBuilder[Self <: BqmlTrainingRunTrainingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEarlyStop(value: Boolean): Self = StObject.set(x, "earlyStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlyStopUndefined: Self = StObject.set(x, "earlyStop", js.undefined)
    
    @scala.inline
    def setL1Reg(value: Double): Self = StObject.set(x, "l1Reg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL1RegUndefined: Self = StObject.set(x, "l1Reg", js.undefined)
    
    @scala.inline
    def setL2Reg(value: Double): Self = StObject.set(x, "l2Reg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL2RegUndefined: Self = StObject.set(x, "l2Reg", js.undefined)
    
    @scala.inline
    def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnRateStrategy(value: String): Self = StObject.set(x, "learnRateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnRateStrategyUndefined: Self = StObject.set(x, "learnRateStrategy", js.undefined)
    
    @scala.inline
    def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    @scala.inline
    def setLineSearchInitLearnRate(value: Double): Self = StObject.set(x, "lineSearchInitLearnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSearchInitLearnRateUndefined: Self = StObject.set(x, "lineSearchInitLearnRate", js.undefined)
    
    @scala.inline
    def setMaxIteration(value: String): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterationUndefined: Self = StObject.set(x, "maxIteration", js.undefined)
    
    @scala.inline
    def setMinRelProgress(value: Double): Self = StObject.set(x, "minRelProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRelProgressUndefined: Self = StObject.set(x, "minRelProgress", js.undefined)
    
    @scala.inline
    def setWarmStart(value: Boolean): Self = StObject.set(x, "warmStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmStartUndefined: Self = StObject.set(x, "warmStart", js.undefined)
  }
}
