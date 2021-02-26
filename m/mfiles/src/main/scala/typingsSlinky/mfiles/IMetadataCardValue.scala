package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardValue extends StObject {
  
  val HasIcon: Boolean = js.native
  
  val ID: String = js.native
  
  val IconURL: String = js.native
  
  def IsDeleted(): Boolean = js.native
  
  def IsHidden(): Boolean = js.native
  
  val IsMultiValue: Boolean = js.native
  
  val Item: Double = js.native
  
  val Name: String = js.native
  
  val State: js.Any = js.native
  
  val Version: Double = js.native
}
object IMetadataCardValue {
  
  @scala.inline
  def apply(
    HasIcon: Boolean,
    ID: String,
    IconURL: String,
    IsDeleted: () => Boolean,
    IsHidden: () => Boolean,
    IsMultiValue: Boolean,
    Item: Double,
    Name: String,
    State: js.Any,
    Version: Double
  ): IMetadataCardValue = {
    val __obj = js.Dynamic.literal(HasIcon = HasIcon.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IconURL = IconURL.asInstanceOf[js.Any], IsDeleted = js.Any.fromFunction0(IsDeleted), IsHidden = js.Any.fromFunction0(IsHidden), IsMultiValue = IsMultiValue.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardValue]
  }
  
  @scala.inline
  implicit class IMetadataCardValueMutableBuilder[Self <: IMetadataCardValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasIcon(value: Boolean): Self = StObject.set(x, "HasIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconURL(value: String): Self = StObject.set(x, "IconURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: () => Boolean): Self = StObject.set(x, "IsDeleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHidden(value: () => Boolean): Self = StObject.set(x, "IsHidden", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMultiValue(value: Boolean): Self = StObject.set(x, "IsMultiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
