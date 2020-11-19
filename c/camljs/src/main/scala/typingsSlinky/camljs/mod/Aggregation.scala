package typingsSlinky.camljs.mod

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
trait Aggregation extends js.Object
object Aggregation {
  
  @scala.inline
  def Max(max: String): Aggregation = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Var(`var`: String): Aggregation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Count(count: String): Aggregation = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Avg(avg: String): Aggregation = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Sum(sum: String): Aggregation = {
    val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Min(min: String): Aggregation = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Stdev(stdev: String): Aggregation = {
    val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
}
