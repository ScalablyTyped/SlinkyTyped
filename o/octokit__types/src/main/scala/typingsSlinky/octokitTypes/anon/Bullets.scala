package typingsSlinky.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bullets extends StObject {
  
  var accounts_url: String = js.native
  
  var bullets: js.Array[String] = js.native
  
  var description: String = js.native
  
  var has_free_trial: Boolean = js.native
  
  var id: Double = js.native
  
  var monthly_price_in_cents: Double = js.native
  
  var name: String = js.native
  
  var number: Double = js.native
  
  var price_model: String = js.native
  
  var state: String = js.native
  
  var unit_name: String = js.native
  
  var url: String = js.native
  
  var yearly_price_in_cents: Double = js.native
}
object Bullets {
  
  @scala.inline
  def apply(
    accounts_url: String,
    bullets: js.Array[String],
    description: String,
    has_free_trial: Boolean,
    id: Double,
    monthly_price_in_cents: Double,
    name: String,
    number: Double,
    price_model: String,
    state: String,
    unit_name: String,
    url: String,
    yearly_price_in_cents: Double
  ): Bullets = {
    val __obj = js.Dynamic.literal(accounts_url = accounts_url.asInstanceOf[js.Any], bullets = bullets.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], has_free_trial = has_free_trial.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], monthly_price_in_cents = monthly_price_in_cents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], price_model = price_model.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], unit_name = unit_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], yearly_price_in_cents = yearly_price_in_cents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bullets]
  }
  
  @scala.inline
  implicit class BulletsMutableBuilder[Self <: Bullets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts_url(value: String): Self = StObject.set(x, "accounts_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBullets(value: js.Array[String]): Self = StObject.set(x, "bullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletsVarargs(value: String*): Self = StObject.set(x, "bullets", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_free_trial(value: Boolean): Self = StObject.set(x, "has_free_trial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthly_price_in_cents(value: Double): Self = StObject.set(x, "monthly_price_in_cents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice_model(value: String): Self = StObject.set(x, "price_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit_name(value: String): Self = StObject.set(x, "unit_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearly_price_in_cents(value: Double): Self = StObject.set(x, "yearly_price_in_cents", value.asInstanceOf[js.Any])
  }
}
