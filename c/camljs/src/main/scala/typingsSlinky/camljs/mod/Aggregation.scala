package typingsSlinky.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.camljs.anon.Count
  - typingsSlinky.camljs.anon.Sum
  - typingsSlinky.camljs.anon.Avg
  - typingsSlinky.camljs.anon.Max
  - typingsSlinky.camljs.anon.Min
  - typingsSlinky.camljs.anon.Stdev
  - typingsSlinky.camljs.anon.Var
*/
trait Aggregation extends StObject
object Aggregation {
  
  @scala.inline
  def Avg(avg: String): typingsSlinky.camljs.anon.Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.camljs.anon.Avg]
  }
  
  @scala.inline
  def Count(count: String): typingsSlinky.camljs.anon.Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.camljs.anon.Count]
  }
  
  @scala.inline
  def Max(max: String): typingsSlinky.camljs.anon.Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.camljs.anon.Max]
  }
  
  @scala.inline
  def Min(min: String): typingsSlinky.camljs.anon.Min = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.camljs.anon.Min]
  }
  
  @scala.inline
  def Stdev(stdev: String): typingsSlinky.camljs.anon.Stdev = {
    val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.camljs.anon.Stdev]
  }
  
  @scala.inline
  def Sum(sum: String): typingsSlinky.camljs.anon.Sum = {
    val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.camljs.anon.Sum]
  }
  
  @scala.inline
  def Var(`var`: String): typingsSlinky.camljs.anon.Var = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.camljs.anon.Var]
  }
}
